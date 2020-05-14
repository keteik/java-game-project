package window;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import game.Card;

public class CardIcon extends ImagePath{
	
	//ImagePath path;

	public static void setPlayerCardIcon(GameWindow window, ArrayList<Card> cards) {
		window.firstCard.setIcon(new ImageIcon(path +cards.get(0).showCard() + ".jpg"));
		window.secondCard.setIcon(new ImageIcon(path +cards.get(1).showCard() + ".jpg"));
		window.thirdCard.setIcon(new ImageIcon(path +cards.get(2).showCard() + ".jpg"));
		window.fourthCard.setIcon(new ImageIcon(path +cards.get(3).showCard() + ".jpg"));
		window.fifthCard.setIcon(new ImageIcon(path +cards.get(4).showCard() + ".jpg"));
		window.sixthCard.setIcon(new ImageIcon(path +cards.get(5).showCard() + ".jpg"));
		window.seventhCard.setIcon(new ImageIcon(path +cards.get(6).showCard() + ".jpg"));
		window.eighthCard.setIcon(new ImageIcon(path +cards.get(7).showCard() + ".jpg"));
		window.ninthCard.setIcon(new ImageIcon(path +cards.get(8).showCard() + ".jpg"));
		window.tenthCard.setIcon(new ImageIcon(path +cards.get(9).showCard() + ".jpg"));
		
	}
	
	public static void setTrickCardIcon(GameWindow window, ArrayList<Card> firstTrickCards, ArrayList<Card> secondTrickCard) {
		window.firstTrickLeftCard.setIcon(new ImageIcon(path +firstTrickCards.get(0).showCard() + ".jpg"));
		window.firstTrickRightCard.setIcon(new ImageIcon(path +firstTrickCards.get(1).showCard() + ".jpg"));
		
		window.secondTrickLeftCard.setIcon(new ImageIcon(path +secondTrickCard.get(0).showCard() + ".jpg"));
		window.secondTrickRightCard.setIcon(new ImageIcon(path +secondTrickCard.get(1).showCard() + ".jpg"));

	}
}
