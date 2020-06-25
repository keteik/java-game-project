package window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import game.Card;

public class TrickAction  extends ImagePath{
	
	int validTrickCard = 0;

	
	
	public void getTrick(final GameWindow playerWindow, GameWindow opponentWindow, String trick, 
							final ArrayList<Card> cards, final ArrayList<Card> trickCards) {
		
		if(trick.equals("first_trick")) {
			
			playerWindow.firstTrickLeftCard.setVisible(true);
			playerWindow.firstTrickRightCard.setVisible(true);
			playerWindow.firstTrickButton.setVisible(false);
			playerWindow.secondTrickButton.setVisible(false);
			opponentWindow.firstTrickButton.setVisible(false);
			opponentWindow.secondTrickButton.setVisible(false);
			
			JOptionPane.showMessageDialog(playerWindow.frmTysiac, "Wybierz 2 karty które chcesz oddaæ.", 
					"Musik", JOptionPane.PLAIN_MESSAGE);
			
			playerWindow.firstCardTrick.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(validTrickCard == 0 || validTrickCard == 1) {
											
						cards.remove(0);
						cards.add(0, trickCards.get(validTrickCard));
						playerWindow.firstCard.setIcon(new ImageIcon(path +cards.get(0).showCard() + ".jpg"));
						if(validTrickCard == 0)
							playerWindow.firstTrickLeftCard.setVisible(false);
						else {
							playerWindow.firstTrickRightCard.setVisible(false);
							JOptionPane.showMessageDialog(playerWindow.frmTysiac, "Wybierz karte aby zaczac rozgrywke.", 
									"Zaczynamy!", JOptionPane.PLAIN_MESSAGE);
						}

						validTrickCard += 1;
					}
				}
			});
			
			playerWindow.secondCardTrick.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(validTrickCard == 0 || validTrickCard == 1) {
											
						cards.remove(1);
						cards.add(1, trickCards.get(validTrickCard));
						playerWindow.secondCard.setIcon(new ImageIcon(path +cards.get(1).showCard() + ".jpg"));
						if(validTrickCard == 0)
							playerWindow.firstTrickLeftCard.setVisible(false);
						else {
							playerWindow.firstTrickRightCard.setVisible(false);
							JOptionPane.showMessageDialog(playerWindow.frmTysiac, "Wybierz karte aby zaczac rozgrywke.", 
									"Zaczynamy!", JOptionPane.PLAIN_MESSAGE);
						}
						validTrickCard += 1;
					}
				}
			});
			
			playerWindow.thirdCardTrick.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(validTrickCard == 0 || validTrickCard == 1) {
											
						cards.remove(2);
						cards.add(2, trickCards.get(validTrickCard));
						playerWindow.thirdCard.setIcon(new ImageIcon(path +cards.get(2).showCard() + ".jpg"));
						if(validTrickCard == 0)
							playerWindow.firstTrickLeftCard.setVisible(false);
						else {
							playerWindow.firstTrickRightCard.setVisible(false);
							JOptionPane.showMessageDialog(playerWindow.frmTysiac, "Wybierz karte aby zaczac rozgrywke.", 
									"Zaczynamy!", JOptionPane.PLAIN_MESSAGE);
						}
						validTrickCard += 1;
					}
				}
			});
			
			playerWindow.fourthCardTrick.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(validTrickCard == 0 || validTrickCard == 1) {
											
						cards.remove(3);
						cards.add(3, trickCards.get(validTrickCard));
						playerWindow.fourthCard.setIcon(new ImageIcon(path +cards.get(3).showCard() + ".jpg"));
						if(validTrickCard == 0)
							playerWindow.firstTrickLeftCard.setVisible(false);
						else {
							playerWindow.firstTrickRightCard.setVisible(false);
							JOptionPane.showMessageDialog(playerWindow.frmTysiac, "Wybierz karte aby zaczac rozgrywke.", 
									"Zaczynamy!", JOptionPane.PLAIN_MESSAGE);
						}
						validTrickCard += 1;
					}
				}
			});
			
			playerWindow.fifthCardTrick.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(validTrickCard == 0 || validTrickCard == 1) {
											
						cards.remove(4);
						cards.add(4, trickCards.get(validTrickCard));
						playerWindow.fifthCard.setIcon(new ImageIcon(path +cards.get(4).showCard() + ".jpg"));
						if(validTrickCard == 0)
							playerWindow.firstTrickLeftCard.setVisible(false);
						else {
							playerWindow.firstTrickRightCard.setVisible(false);
							JOptionPane.showMessageDialog(playerWindow.frmTysiac, "Wybierz karte aby zaczac rozgrywke.", 
									"Zaczynamy!", JOptionPane.PLAIN_MESSAGE);
						}
						validTrickCard += 1;
					}
				}
			});
			
			playerWindow.sixthCardTrick.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(validTrickCard == 0 || validTrickCard == 1) {
											
						cards.remove(5);
						cards.add(5, trickCards.get(validTrickCard));
						playerWindow.sixthCard.setIcon(new ImageIcon(path +cards.get(5).showCard() + ".jpg"));
						if(validTrickCard == 0)
							playerWindow.firstTrickLeftCard.setVisible(false);
						else {
							playerWindow.firstTrickRightCard.setVisible(false);
							JOptionPane.showMessageDialog(playerWindow.frmTysiac, "Wybierz karte aby zaczac rozgrywke.", 
									"Zaczynamy!", JOptionPane.PLAIN_MESSAGE);
						}
						validTrickCard += 1;
					}
				}
			});
			
			playerWindow.seventhCardTrick.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(validTrickCard == 0 || validTrickCard == 1) {
											
						cards.remove(6);
						cards.add(6, trickCards.get(validTrickCard));
						playerWindow.seventhCard.setIcon(new ImageIcon(path +cards.get(6).showCard() + ".jpg"));
						if(validTrickCard == 0)
							playerWindow.firstTrickLeftCard.setVisible(false);
						else {
							playerWindow.firstTrickRightCard.setVisible(false);
							JOptionPane.showMessageDialog(playerWindow.frmTysiac, "Wybierz karte aby zaczac rozgrywke.", 
									"Zaczynamy!", JOptionPane.PLAIN_MESSAGE);
						}
						validTrickCard += 1;
					}
				}
			});
			
			playerWindow.eighthCardTrick.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(validTrickCard == 0 || validTrickCard == 1) {
											
						cards.remove(7);
						cards.add(7, trickCards.get(validTrickCard));
						playerWindow.eighthCard.setIcon(new ImageIcon(path +cards.get(7).showCard() + ".jpg"));
						if(validTrickCard == 0)
							playerWindow.firstTrickLeftCard.setVisible(false);
						else {
							playerWindow.firstTrickRightCard.setVisible(false);
							JOptionPane.showMessageDialog(playerWindow.frmTysiac, "Wybierz karte aby zaczac rozgrywke.", 
									"Zaczynamy!", JOptionPane.PLAIN_MESSAGE);
						}
						validTrickCard += 1;
					}
				}
			});
			
			playerWindow.ninthCardTrick.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(validTrickCard == 0 || validTrickCard == 1) {
											
						cards.remove(8);
						cards.add(8, trickCards.get(validTrickCard));
						playerWindow.ninthCard.setIcon(new ImageIcon(path +cards.get(8).showCard() + ".jpg"));
						if(validTrickCard == 0)
							playerWindow.firstTrickLeftCard.setVisible(false);
						else {
							playerWindow.firstTrickRightCard.setVisible(false);
							JOptionPane.showMessageDialog(playerWindow.frmTysiac, "Wybierz karte aby zaczac rozgrywke.", 
									"Zaczynamy!", JOptionPane.PLAIN_MESSAGE);
						}
						validTrickCard += 1;
					}
				}
			});
			
			playerWindow.tenthCardTrick.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(validTrickCard == 0 || validTrickCard == 1) {
											
						cards.remove(9);
						cards.add(9, trickCards.get(validTrickCard));
						playerWindow.tenthCard.setIcon(new ImageIcon(path +cards.get(9).showCard() + ".jpg"));
						if(validTrickCard == 0)
							playerWindow.firstTrickLeftCard.setVisible(false);
						else {
							playerWindow.firstTrickRightCard.setVisible(false);
							JOptionPane.showMessageDialog(playerWindow.frmTysiac, "Wybierz karte aby zaczac rozgrywke.", 
									"Zaczynamy!", JOptionPane.PLAIN_MESSAGE);
						}
						validTrickCard += 1;
					}
				}
			});
			
			
		}
		
		else if(trick.equals("second_trick")) {
			playerWindow.secondTrickLeftCard.setVisible(true);
			playerWindow.secondTrickRightCard.setVisible(true);
			playerWindow.secondTrickButton.setVisible(false);
			playerWindow.firstTrickButton.setVisible(false);
			opponentWindow.firstTrickButton.setVisible(false);
			opponentWindow.secondTrickButton.setVisible(false);
			
			JOptionPane.showMessageDialog(playerWindow.frmTysiac, "Wybierz 2 karty które chcesz oddaæ.", 
					"Musik", JOptionPane.PLAIN_MESSAGE);
			
			playerWindow.firstCardTrick.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(validTrickCard == 0 || validTrickCard == 1) {
											
						cards.remove(0);
						cards.add(0, trickCards.get(validTrickCard));
						playerWindow.firstCard.setIcon(new ImageIcon(path +cards.get(0).showCard() + ".jpg"));
						if(validTrickCard == 0)
							playerWindow.secondTrickLeftCard.setVisible(false);
						else {
							playerWindow.secondTrickRightCard.setVisible(false);
							JOptionPane.showMessageDialog(playerWindow.frmTysiac, "Wybierz karte aby zaczac rozgrywke.", 
									"Zaczynamy!", JOptionPane.PLAIN_MESSAGE);
						}

						validTrickCard += 1;
					}
				}
			});
			
			playerWindow.secondCardTrick.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(validTrickCard == 0 || validTrickCard == 1) {
											
						cards.remove(1);
						cards.add(1, trickCards.get(validTrickCard));
						playerWindow.secondCard.setIcon(new ImageIcon(path +cards.get(1).showCard() + ".jpg"));
						if(validTrickCard == 0)
							playerWindow.secondTrickLeftCard.setVisible(false);
						else {
							playerWindow.secondTrickRightCard.setVisible(false);
							JOptionPane.showMessageDialog(playerWindow.frmTysiac, "Wybierz karte aby zaczac rozgrywke.", 
									"Zaczynamy!", JOptionPane.PLAIN_MESSAGE);
						}
						validTrickCard += 1;
					}
				}
			});
			
			playerWindow.thirdCardTrick.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(validTrickCard == 0 || validTrickCard == 1) {
											
						cards.remove(2);
						cards.add(2, trickCards.get(validTrickCard));
						playerWindow.thirdCard.setIcon(new ImageIcon(path +cards.get(2).showCard() + ".jpg"));
						if(validTrickCard == 0)
							playerWindow.secondTrickLeftCard.setVisible(false);
						else {
							playerWindow.secondTrickRightCard.setVisible(false);
							JOptionPane.showMessageDialog(playerWindow.frmTysiac, "Wybierz karte aby zaczac rozgrywke.", 
									"Zaczynamy!", JOptionPane.PLAIN_MESSAGE);
						}
						validTrickCard += 1;
					}
				}
			});
			
			playerWindow.fourthCardTrick.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(validTrickCard == 0 || validTrickCard == 1) {
											
						cards.remove(3);
						cards.add(3, trickCards.get(validTrickCard));
						playerWindow.fourthCard.setIcon(new ImageIcon(path +cards.get(3).showCard() + ".jpg"));
						if(validTrickCard == 0)
							playerWindow.secondTrickLeftCard.setVisible(false);
						else {
							playerWindow.secondTrickRightCard.setVisible(false);
							JOptionPane.showMessageDialog(playerWindow.frmTysiac, "Wybierz karte aby zaczac rozgrywke.", 
									"Zaczynamy!", JOptionPane.PLAIN_MESSAGE);
						}
						validTrickCard += 1;
					}
				}
			});
			
			playerWindow.fifthCardTrick.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(validTrickCard == 0 || validTrickCard == 1) {
											
						cards.remove(4);
						cards.add(4, trickCards.get(validTrickCard));
						playerWindow.fifthCard.setIcon(new ImageIcon(path +cards.get(4).showCard() + ".jpg"));
						if(validTrickCard == 0)
							playerWindow.secondTrickLeftCard.setVisible(false);
						else {
							playerWindow.secondTrickRightCard.setVisible(false);
							JOptionPane.showMessageDialog(playerWindow.frmTysiac, "Wybierz karte aby zaczac rozgrywke.", 
									"Zaczynamy!", JOptionPane.PLAIN_MESSAGE);
						}
						validTrickCard += 1;
					}
				}
			});
			
			playerWindow.sixthCardTrick.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(validTrickCard == 0 || validTrickCard == 1) {
											
						cards.remove(5);
						cards.add(5, trickCards.get(validTrickCard));
						playerWindow.sixthCard.setIcon(new ImageIcon(path +cards.get(5).showCard() + ".jpg"));
						if(validTrickCard == 0)
							playerWindow.secondTrickLeftCard.setVisible(false);
						else {
							playerWindow.secondTrickRightCard.setVisible(false);
							JOptionPane.showMessageDialog(playerWindow.frmTysiac, "Wybierz karte aby zaczac rozgrywke.", 
									"Zaczynamy!", JOptionPane.PLAIN_MESSAGE);
						}
						validTrickCard += 1;
					}
				}
			});
			
			playerWindow.seventhCardTrick.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(validTrickCard == 0 || validTrickCard == 1) {
											
						cards.remove(6);
						cards.add(6, trickCards.get(validTrickCard));
						playerWindow.seventhCard.setIcon(new ImageIcon(path +cards.get(6).showCard() + ".jpg"));
						if(validTrickCard == 0)
							playerWindow.secondTrickLeftCard.setVisible(false);
						else {
							playerWindow.secondTrickRightCard.setVisible(false);
							JOptionPane.showMessageDialog(playerWindow.frmTysiac, "Wybierz karte aby zaczac rozgrywke.", 
									"Zaczynamy!", JOptionPane.PLAIN_MESSAGE);
						}
						validTrickCard += 1;
					}
				}
			});
			
			playerWindow.eighthCardTrick.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(validTrickCard == 0 || validTrickCard == 1) {
											
						cards.remove(7);
						cards.add(7, trickCards.get(validTrickCard));
						playerWindow.eighthCard.setIcon(new ImageIcon(path +cards.get(7).showCard() + ".jpg"));
						if(validTrickCard == 0)
							playerWindow.secondTrickLeftCard.setVisible(false);
						else {
							playerWindow.secondTrickRightCard.setVisible(false);
							JOptionPane.showMessageDialog(playerWindow.frmTysiac, "Wybierz karte aby zaczac rozgrywke.", 
									"Zaczynamy!", JOptionPane.PLAIN_MESSAGE);
						}
						validTrickCard += 1;
					}
				}
			});
			
			playerWindow.ninthCardTrick.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(validTrickCard == 0 || validTrickCard == 1) {
											
						cards.remove(8);
						cards.add(8, trickCards.get(validTrickCard));
						playerWindow.ninthCard.setIcon(new ImageIcon(path +cards.get(8).showCard() + ".jpg"));
						if(validTrickCard == 0)
							playerWindow.secondTrickLeftCard.setVisible(false);
						else {
							playerWindow.secondTrickRightCard.setVisible(false);
							JOptionPane.showMessageDialog(playerWindow.frmTysiac, "Wybierz karte aby zaczac rozgrywke.", 
									"Zaczynamy!", JOptionPane.PLAIN_MESSAGE);
						}
						validTrickCard += 1;
					}
				}
			});
			
			playerWindow.tenthCardTrick.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(validTrickCard == 0 || validTrickCard == 1) {
											
						cards.remove(9);
						cards.add(9, trickCards.get(validTrickCard));
						playerWindow.tenthCard.setIcon(new ImageIcon(path +cards.get(9).showCard() + ".jpg"));
						if(validTrickCard == 0)
							playerWindow.secondTrickLeftCard.setVisible(false);
						else {
							playerWindow.secondTrickRightCard.setVisible(false);
							JOptionPane.showMessageDialog(playerWindow.frmTysiac, "Wybierz karte aby zaczac rozgrywke.", 
									"Zaczynamy!", JOptionPane.PLAIN_MESSAGE);
						}
						validTrickCard += 1;
					}
				}
			});
		
		}			
		
	}
}
