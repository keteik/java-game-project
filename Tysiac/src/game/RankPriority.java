package game;

	
public class RankPriority {
	
	public static boolean getPriority(String firstRank, String secondRank){
		
		if(firstRank.equals("9"))
			return false;
		else if(firstRank.equals("Jack") && !secondRank.equals("9"))
			return false;
		else if(firstRank.equals("Jack") && secondRank.equals("9"))
			return true;		
		else if(firstRank.equals("Queen") && !secondRank.equals("Jack") && !secondRank.equals("9"))
			return false;
		else if(firstRank.equals("Queen") && (secondRank.equals("Jack") || secondRank.equals("9")))
			return true;		
		else if(firstRank.equals("King") && !secondRank.equals("Ace") && !secondRank.equals("10"))
			return true;
		else if(firstRank.equals("King") && (secondRank.equals("Ace")) || secondRank.equals("10"))
			return false;		
		else if(firstRank.equals("10") && !secondRank.equals("Ace"))
			return true;
		else if (firstRank.equals("10") && secondRank.equals("Ace"))
			return false;		
		else if(firstRank.equals("Ace"))
			return true;
		
		return false;
		
	}
}
