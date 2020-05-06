package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;


public class Deck{
	
	public List<Card> cards;	
	public List<Card> firstPlayerHand;
	public List<Card> secondPlayerHand;
	public List<Card> firstTrick;
	public List<Card> secondTrick;
	
	public Deck(){
		
		 cards = new ArrayList<Card>(24);
	}
	
	private static final Random gen = new Random();

	public void resetDeck() {
		
		for(int i = 0; i < 4; i++ ) {
			for(int j = 0; j < 6; j++) {
		
				cards.add(new Card(i , j));
			}
		}
		
		//Collections.shuffle(cards);
	
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