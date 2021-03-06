package window;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import game.Card;
import game.Deck;
import game.Rules;
import network.Client;
import network.Server;

public class App extends CardIcon{
	
	static int firstPlayerScore = 0;
	static int secondPlayerScore = 0;
	static int bid;
	
	static Server server = null;
	static Client client = null;
	final static Deck deck = new Deck();
	Rules rules = new Rules();
	ImagePath path = new ImagePath();
	final static TrickAction trickAction = new TrickAction();
	final static GameWindow firstPlayerWindow = new GameWindow();
	final static GameWindow secondPlayerWindow = new GameWindow();
	final static BiddingWindow firstPlayerBiddingWindow = new BiddingWindow();
	final static BiddingWindow secondPlayerBiddingWindow = new BiddingWindow();
	static boolean trick = false;
	static int counter = 0;
	static boolean firstPlayerWin = false; 
	
	public static ArrayList<Card> firstPlayerWinCards = new ArrayList<Card>(10);
	public static ArrayList<Card> secondPlayerWinCards = new ArrayList<Card>(10);


	
	
	protected void finalize() throws IOException{
			client.closeConnection();
			server.closeConnection();
		  }
	
	public void takeTrick() {
		firstPlayerWindow.firstCard.setEnabled(false);
		firstPlayerWindow.secondCard.setEnabled(false);
		firstPlayerWindow.thirdCard.setEnabled(false);
		firstPlayerWindow.fourthCard.setEnabled(false);
		firstPlayerWindow.fifthCard.setEnabled(false);
		firstPlayerWindow.sixthCard.setEnabled(false);
		firstPlayerWindow.seventhCard.setEnabled(false);
		firstPlayerWindow.eighthCard.setEnabled(false);
		firstPlayerWindow.ninthCard.setEnabled(false);
		firstPlayerWindow.tenthCard.setEnabled(false);
		
		secondPlayerWindow.firstCard.setEnabled(false);
		secondPlayerWindow.secondCard.setEnabled(false);
		secondPlayerWindow.thirdCard.setEnabled(false);
		secondPlayerWindow.fourthCard.setEnabled(false);
		secondPlayerWindow.fifthCard.setEnabled(false);
		secondPlayerWindow.sixthCard.setEnabled(false);
		secondPlayerWindow.seventhCard.setEnabled(false);
		secondPlayerWindow.eighthCard.setEnabled(false);
		secondPlayerWindow.ninthCard.setEnabled(false);
		secondPlayerWindow.tenthCard.setEnabled(false);
				
		firstPlayerWindow.firstTrickButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trickAction.getTrick(firstPlayerWindow, secondPlayerWindow, "first_trick", 
										deck.firstPlayerHand, deck.firstTrick);

			}
		});

		
		firstPlayerWindow.secondTrickButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trickAction.getTrick(firstPlayerWindow, secondPlayerWindow, "second_trick",
										deck.firstPlayerHand, deck.secondTrick);				
			}
		});
		
		secondPlayerWindow.firstTrickButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trickAction.getTrick(secondPlayerWindow, firstPlayerWindow, "first_trick",
										deck.secondPlayerHand, deck.firstTrick);
			}
		});
		
		secondPlayerWindow.secondTrickButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trickAction.getTrick(secondPlayerWindow, firstPlayerWindow, "second_trick",
										deck.secondPlayerHand, deck.secondTrick);
			}
		});
		
		
		
	}

	
	public static void main(String[] args) throws IOException {
		
		final App app = new App();
		
		deck.resetDeck();
		deck.dealCards();
			
		
		Thread serverThread = new Thread(new Runnable(){
			@Override
			public void run() {
				
				server = new Server(5000);
				final BiddingAction biddingAction = new BiddingAction();
				final DealingAction dealingAction = new DealingAction();

				setPlayerCardIcon(firstPlayerWindow, deck.firstPlayerHand);
				setTrickCardIcon(firstPlayerWindow, deck.firstTrick, deck.secondTrick);
				
				firstPlayerWindow.frmTysiac.setTitle("Player 1");
				firstPlayerWindow.frmTysiac.setVisible(true);
				firstPlayerWindow.frmTysiac.setEnabled(false);
				
				firstPlayerBiddingWindow.setTitle("Player 1 binding");
				firstPlayerBiddingWindow.setVisible(true);
				
				biddingAction.bidServer(server, firstPlayerBiddingWindow, firstPlayerWindow);
				int tmp = biddingAction.getClientBid(server);
				if(tmp > bid )
					bid = tmp;
								
				firstPlayerWindow.frmTysiac.setVisible(true);
				firstPlayerWindow.frmTysiac.setEnabled(true);

				app.takeTrick();												
				dealingAction.giveCardServer(firstPlayerWindow, server, deck.firstPlayerHand, trick);
				firstPlayerWin = dealingAction.checkFirstPlayerWin(server);
				server.serverWriteString("start");
				
				while(!deck.firstPlayerHand.isEmpty()) {
					if(firstPlayerWin) {
						firstPlayerWindow.frmTysiac.setVisible(true);
						dealingAction.giveCardServer(firstPlayerWindow, server, deck.firstPlayerHand, trick);
						firstPlayerWin = dealingAction.checkFirstPlayerWin(server);	
						
					}
					else {
						dealingAction.showCardsServer(firstPlayerWindow, server, deck.firstPlayerHand, 
														deck.secondPlayerHand, firstPlayerWinCards, 
														secondPlayerWinCards);
					}			
				}				
			}	
		});
		serverThread.start();
		
		
		Thread clientThread = new Thread(new Runnable(){
			@Override
			public void run() {
				
				final App app = new App();
				final DealingAction dealingAction = new DealingAction();
				final BiddingAction biddingAction = new BiddingAction();
				String state;
				client = new Client(2, "127.0.0.1", 5000);
			
				secondPlayerWindow.frmTysiac.setTitle("Player 2");
				secondPlayerBiddingWindow.setTitle("Player 2 binding");

				setPlayerCardIcon(secondPlayerWindow, deck.secondPlayerHand);
				setTrickCardIcon(secondPlayerWindow, deck.firstTrick, deck.secondTrick);				
				
				bid = biddingAction.getServerBid(client);
				if(bid == 0) {
					app.takeTrick();
					secondPlayerWindow.frmTysiac.setEnabled(true);
					secondPlayerWindow.frmTysiac.setVisible(true);
				}
				else {
					secondPlayerWindow.frmTysiac.setVisible(true);
					secondPlayerWindow.frmTysiac.setEnabled(false);		
					secondPlayerBiddingWindow.setEnabled(true);
					secondPlayerBiddingWindow.setVisible(true);
					biddingAction.bidClient(client, secondPlayerBiddingWindow, secondPlayerWindow, bid);
				}
				dealingAction.showCardsClient(secondPlayerWindow, client, deck.secondPlayerHand, 
												deck.firstPlayerHand, secondPlayerWinCards, 
												firstPlayerWinCards);
								
				state = client.clientReadString();
				while(!deck.secondPlayerHand.isEmpty()) {	
					secondPlayerScore = dealingAction.getPoints(secondPlayerWinCards);
					System.out.println(secondPlayerScore);
					if(!firstPlayerWin) {
						secondPlayerWindow.frmTysiac.setVisible(true);
						dealingAction.giveCardClient(secondPlayerWindow, client, deck.secondPlayerHand, 														trick);
						firstPlayerWin = dealingAction.checkSecondPlayerWin(client);
						}
					else
						dealingAction.showCardsClient(secondPlayerWindow, client, deck.secondPlayerHand, 
								deck.firstPlayerHand,secondPlayerWinCards, firstPlayerWinCards);
					if(deck.secondPlayerHand.isEmpty()) {
						secondPlayerScore = dealingAction.getPoints(secondPlayerWinCards);
						System.out.println(secondPlayerScore);
					}
											
				}				
			}
		});
		clientThread.start();
	}
}
