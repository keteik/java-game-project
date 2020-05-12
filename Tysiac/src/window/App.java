package window;

import java.io.IOException;

import game.Deck;
import game.Rules;

public class App{
	
	public static void main(String[] args) throws IOException {
		Deck deck = new Deck();
		Rules rules = new Rules();
		
		deck.resetDeck();
		deck.dealCards();
		
		//////////////////////
		//testing game rules//
		
		rules.atut = "Leaves";
		rules.firstColor = "Pikes";

		int a = 6;
		int b = 4;
		

		if(rules.compareCards(deck.firstPlayerHand.get(a), deck.firstPlayerHand.get(b))) {
			
			System.out.println("karta '" +deck.firstPlayerHand.get(a).showCard() +"'" +" wieksza od karty '" 
								+deck.firstPlayerHand.get(b).showCard() +"'");
		}
		
		else {
			
			System.out.println("karta '" +deck.firstPlayerHand.get(a).showCard() +"'" +" mniejsza od karty '" 
					+deck.firstPlayerHand.get(b).showCard() +"'");
		}
		

	}

}
