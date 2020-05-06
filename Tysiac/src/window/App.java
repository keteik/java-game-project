package window;

import java.io.IOException;

import game.Deck;
import game.Rules;

public class App extends Rules{
	
	public static void main(String[] args) throws IOException {
		Deck deck = new Deck();
		
		deck.resetDeck();
		deck.dealCards();
		
		//System.out.println(deck.firstPlayerHand.get(0).showCard());
		//System.out.println(deck.firstPlayerHand.get(3).showCard());

		
		int a = 1;
		int b = 6;
		
		
		if(compareCards(deck.firstPlayerHand.get(a), deck.firstPlayerHand.get(b))) {
			System.out.println("karta '" +deck.firstPlayerHand.get(a).showCard() +"'" +" wieksza od karty '" 
								+deck.firstPlayerHand.get(b).showCard() +"'");
		}
		else {
			System.out.println("karta '" +deck.firstPlayerHand.get(a).showCard() +"'" +" mniejsza od karty '" 
					+deck.firstPlayerHand.get(b).showCard() +"'");
		}
			



	}

}
