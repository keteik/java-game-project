package game;

public class Rules extends RankPriority{
	
	public boolean firstCardIsGreater;
	public String firstColor = "";
	public String atut = "";
	
	//private static String Pikes = "Pikes";
	
	@SuppressWarnings("unlikely-arg-type")
	public boolean compareCards(Card firstCard, Card secondCard) {
		
		firstCardIsGreater = false;
		
		if(atut.equals("")) {
			
			if(firstCard.getColor().equals(firstColor) && !(secondCard.getColor().equals(firstColor))){
				
				firstCardIsGreater = true;
				return firstCardIsGreater;
			}
						
			else if(!firstCard.getColor().equals(firstColor) && (secondCard.getColor().equals(firstColor))) {
				
				firstCardIsGreater = false;
				return firstCardIsGreater;
			}
			
			else if(firstCard.getColor().equals(firstColor) && (secondCard.getColor().equals(firstColor))) {
				
				firstCardIsGreater = getPriority(firstCard.rank, secondCard.rank);
				return firstCardIsGreater;
			}
			
			else if(!firstCard.getColor().equals(firstColor) && !(secondCard.getColor().equals(firstColor))) {
				
				if(firstCard.rank.equals(secondCard.rank)) {
					
					firstCardIsGreater = true;
					return firstCardIsGreater;
				}
				
				else {
					
					firstCardIsGreater = getPriority(firstCard.rank, secondCard.rank);
					return firstCardIsGreater;
				}
			}
		}
		
		else {
			
			if(firstCard.getColor().equals(atut) && !(secondCard.getColor().equals(atut))){
				
				firstCardIsGreater = true;
				return firstCardIsGreater;
			}
						
			else if(!firstCard.getColor().equals(atut) && (secondCard.getColor().equals(atut))) {
				
				firstCardIsGreater = false;
				return firstCardIsGreater;
			}
			
			else if(firstCard.getColor().equals(atut) && (secondCard.getColor().equals(atut))) {
				
				firstCardIsGreater = getPriority(firstCard.rank, secondCard.rank);
				return firstCardIsGreater;
			}
			
			else if(!firstCard.getColor().equals(atut) && !(secondCard.getColor().equals(atut))) {
				
				if(firstCard.rank.equals(secondCard.rank)) {
					
					firstCardIsGreater = true;
					return firstCardIsGreater;
				}
				
				else {
					
					firstCardIsGreater = getPriority(firstCard.rank, secondCard.rank);
					return firstCardIsGreater;
				}
			}
			
		}
		
		return firstCardIsGreater;

	}
	
}
