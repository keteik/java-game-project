package window;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import game.Deck;
import game.Rules;

public class App extends CardIcon{
	
	public static void main(String[] args) throws IOException {
		final Deck deck = new Deck();
		Rules rules = new Rules();
		ImagePath path = new ImagePath();
		final TrickAction trickAction = new TrickAction();
		final GameWindow firstPlayerWindow = new GameWindow();
		final GameWindow secondPlayerWindow = new GameWindow();
		final BindingWindow firstPlayerBingingWindow = new BindingWindow();
		final BindingWindow secondPlayerBingingWindow = new BindingWindow();

		firstPlayerWindow.frmTysiac.setVisible(true);
		secondPlayerWindow.frmTysiac.setVisible(true);
		firstPlayerWindow.frmTysiac.setEnabled(false);
		secondPlayerWindow.frmTysiac.setEnabled(false);
		
		firstPlayerBingingWindow.setTitle("Player 1 binding");
		secondPlayerBingingWindow.setTitle("Player 2 binding");

		firstPlayerBingingWindow.setVisible(true);
		secondPlayerBingingWindow.setVisible(true);



		deck.resetDeck();
		deck.dealCards();
				
		//firstPlayerWindow.frmTysiac.setVisible(true);
		firstPlayerWindow.frmTysiac.setTitle("Player 1");
		setPlayerCardIcon(firstPlayerWindow, deck.firstPlayerHand);
		setTrickCardIcon(firstPlayerWindow, deck.firstTrick, deck.secondTrick);

		
		//secondPlayerWindow.frmTysiac.setVisible(true);
		secondPlayerWindow.frmTysiac.setTitle("Player 2");
		setPlayerCardIcon(secondPlayerWindow, deck.secondPlayerHand);
		setTrickCardIcon(secondPlayerWindow, deck.firstTrick, deck.secondTrick);
				
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

}
