package game;

public class Rules {
	
	public static boolean firstCardIsGreater;
	//private static String Pikes = "Pikes";
	
	@SuppressWarnings("unlikely-arg-type")
	public static boolean compareCards(Card firstCard, Card secondCard) {
		
		firstCardIsGreater = false;
		
		 
		switch(firstCard.getColor()) {
			case "Pikes":{
				switch(firstCard.getRank()) {
					case "9":{
						if(secondCard.showCard().equals("Leaves_9")) {
							
							firstCardIsGreater = true;
							break;
						}
						
						else if(secondCard.showCard().equals("Diamonds_9")) {
							
							firstCardIsGreater = true;
							break;
						}
						
						else if(secondCard.showCard().equals("Hearts_9")) {
							
							firstCardIsGreater = true;
							break;
						}
						
						else if(secondCard.showCard().equals("Pikes_Jack")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Leaves_Jack")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Diamonds_Jack")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Hearts_Jack")) {
							
							firstCardIsGreater = false;
							break;
						}					
						
						else if(secondCard.showCard().equals("Pikes_Queen")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Leaves_Queen")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Diamonds_Queen")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Hearts_Queen")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Pikes_King")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Leaves_King")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Diamonds_King")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Hearts_King")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Pikes_10")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Leaves_10")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Diamonds_10")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Hearts_10")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Pikes_Ace")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Leaves_Ace")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Diamonds_Ace")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Hearts_Ace")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						break;
					}
					
					case "Jack":{
						if(secondCard.showCard().equals("Pikes_9")) {
							
							firstCardIsGreater = true;
							break;
						}
						
						else if(secondCard.showCard().equals("Leaves_9")) {
							
							firstCardIsGreater = true;
							break;
						}
						
						else if(secondCard.showCard().equals("Diamonds_9")) {
							
							firstCardIsGreater = true;
							break;
						}
						
						else if(secondCard.showCard().equals("Hearts_9")) {
							
							firstCardIsGreater = true;
							break;
						}
						
						
						else if(secondCard.showCard().equals("Leaves_Jack")) {
							
							firstCardIsGreater = true;
							break;
						}
						
						else if(secondCard.showCard().equals("Diamonds_Jack")) {
							
							firstCardIsGreater = true;
							break;
						}
						
						else if(secondCard.showCard().equals("Hearts_Jack")) {
							
							firstCardIsGreater = true;
							break;
						}					
						
						else if(secondCard.showCard().equals("Pikes_Queen")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Leaves_Queen")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Diamonds_Queen")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Hearts_Queen")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Pikes_King")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Leaves_King")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Diamonds_King")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Hearts_King")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Pikes_10")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Leaves_10")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Diamonds_10")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Hearts_10")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Pikes_Ace")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Leaves_Ace")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Diamonds_Ace")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						else if(secondCard.showCard().equals("Hearts_Ace")) {
							
							firstCardIsGreater = false;
							break;
						}
						
						break;
					}
					
					
			}
		
		
		}
		
		}
		return firstCardIsGreater;

	}
	
}
