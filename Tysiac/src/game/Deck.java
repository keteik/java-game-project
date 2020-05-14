package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck{
	
	public ArrayList<Card> cards;	
	public ArrayList<Card> firstPlayerHand;
	public ArrayList<Card> secondPlayerHand;
	public ArrayList<Card> firstTrick;
	public ArrayList<Card> secondTrick;
	
	public Deck(){
		
		 cards = new ArrayList<Card>(24);
	}
	

	public void resetDeck() {
		
		for(int i = 0; i < 4; i++ ) {
			for(int j = 0; j < 6; j++) {
		
				cards.add(new Card(i , j));
			}
		}
		
		Collections.shuffle(cards);
	
	}
	
	public void dealCards() {
		
		firstPlayerHand = new ArrayList<Card>(10);
		secondPlayerHand = new ArrayList<Card>(10);
		firstTrick = new ArrayList<Card>(2);
		secondTrick = new ArrayList<Card>(2);
		
		for(int i = 0; i < 24; i++) {
			
			if(i < 10) {
				firstPlayerHand.add(cards.get(i));
			}
			
			else if(i < 20) {
				secondPlayerHand.add(cards.get(i));

			}
			
			else if(i < 22){
				firstTrick.add(cards.get(i));
			}
			
			else {
				secondTrick.add(cards.get(i));
			}
			
		}
		
	}

}
