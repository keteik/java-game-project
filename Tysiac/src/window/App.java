package window;

import java.awt.EventQueue;
import java.io.IOException;

import game.Deck;
import game.Rules;

public class App{
	
	public static void main(String[] args) throws IOException {
		Deck deck = new Deck();
		Rules rules = new Rules();
		
		deck.resetDeck();
		deck.dealCards();
		
		
		GameWindow firstPlayerWindow = new GameWindow();
		firstPlayerWindow.frmTysiac.setVisible(true);
		firstPlayerWindow.frmTysiac.setTitle("Player 1");
		
		GameWindow secondPlayerWindow = new GameWindow();
		secondPlayerWindow.frmTysiac.setVisible(true);
		secondPlayerWindow.frmTysiac.setTitle("Player 2");

		

	}

}
