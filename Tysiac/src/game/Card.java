package game;

public class Card {
	public final String color;
	public final String rank;
	
	private final String[] colors =  {
		"Pikes", 
		"Leaves", 
		"Diamonds",
		"Hearts"
	};
	
	private final String[] ranks = {
		"9",
		"Jack",
		"Queen",
		"King",
		"10",
		"Ace"		
	};
	
	Card(int i, int j){
		this.color = colors[i];
		this.rank = ranks[j];
	}
		
	public String showCard() {
		return color + "_" + rank;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getRank() {
		return rank;
	}
}
