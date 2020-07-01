package window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Path;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import game.Card;
import game.Rules;
import network.Client;
import network.Server;

public class DealingAction {
	
	public ImagePath path = new ImagePath();

	
	int first = 0;
	int second = 1;
	int third = 2;
	int fourth = 3;
	int fifth = 4;
	int sixth = 5;
	int seventh = 6;
	int eighth = 7;
	int ninth = 8;
	int tenth = 9;

	Rules rules = new Rules();
	boolean firstCardGreater = true;
	
	public void subCounter(int n) {
		if(n == 0) {
			second -= 1; 
			third -= 1;
			fourth -= 1;
			fifth -= 1;
			sixth -= 1;
			seventh -= 1;
			eighth -= 1;
			ninth -= 1;
			tenth -= 1;

		}
		else if(n == 1) {
			third -= 1;
			fourth -= 1;
			fifth -= 1;
			sixth -= 1;
			seventh -= 1;
			eighth -= 1;
			ninth -= 1;
			tenth -= 1;
		}
		else if(n == 2) {
			fourth -= 1;
			fifth -= 1;
			sixth -= 1;
			seventh -= 1;
			eighth -= 1;
			ninth -= 1;
			tenth -= 1;
		}
		else if(n == 3) {
			fifth -= 1;
			sixth -= 1;
			seventh -= 1;
			eighth -= 1;
			ninth -= 1;
			tenth -= 1;
		}
		else if(n == 4) {
			sixth -= 1;
			seventh -= 1;
			eighth -= 1;
			ninth -= 1;
			tenth -= 1;
		}
		else if(n == 5) {
			seventh -= 1;
			eighth -= 1;
			ninth -= 1;
			tenth -= 1;
		}
		else if(n == 6) {
			eighth -= 1;
			ninth -= 1;
			tenth -= 1;
		}
		else if(n == 7) {
			ninth -= 1;
			tenth -= 1;
		}
		else if(n == 8) {
			tenth -= 1;
		}

	}
	
	public int getPoints(final ArrayList<Card> firstPlayerWinCards) {
		int i;
		int points = 0;
		
		for(i = 0; i< firstPlayerWinCards.size(); i++) {
			if(firstPlayerWinCards.get(i).showCard().equals("Pikes_Ace") ||
				 firstPlayerWinCards.get(i).showCard().equals("Diamonds_Ace") ||
				 firstPlayerWinCards.get(i).showCard().equals("Hearts_Ace") ||
				 firstPlayerWinCards.get(i).showCard().equals("Leaves_Ace"))
				{
					points += 11;
				}
			else if(firstPlayerWinCards.get(i).showCard().equals("Pikes_King") ||
				 firstPlayerWinCards.get(i).showCard().equals("Diamonds_King") ||
				 firstPlayerWinCards.get(i).showCard().equals("Hearts_King") ||
				 firstPlayerWinCards.get(i).showCard().equals("Leaves_King"))
				{
					points += 4;
				}
			else if(firstPlayerWinCards.get(i).showCard().equals("Pikes_Queen") ||
					 firstPlayerWinCards.get(i).showCard().equals("Diamonds_Queen") ||
					 firstPlayerWinCards.get(i).showCard().equals("Hearts_Queen") ||
					 firstPlayerWinCards.get(i).showCard().equals("Leaves_Queen"))
					{
						points += 3;
					}
			else if(firstPlayerWinCards.get(i).showCard().equals("Pikes_Jack") ||
					 firstPlayerWinCards.get(i).showCard().equals("Diamonds_Jack") ||
					 firstPlayerWinCards.get(i).showCard().equals("Hearts_Jack") ||
					 firstPlayerWinCards.get(i).showCard().equals("Leaves_Jack"))
					{
						points += 2;
					}
			else if(firstPlayerWinCards.get(i).showCard().equals("Pikes_10") ||
					 firstPlayerWinCards.get(i).showCard().equals("Diamonds_10") ||
					 firstPlayerWinCards.get(i).showCard().equals("Hearts_10") ||
					 firstPlayerWinCards.get(i).showCard().equals("Leaves_10"))
					{
						points += 10;
					}
			else if(firstPlayerWinCards.get(i).showCard().equals("Pikes_9") ||
					 firstPlayerWinCards.get(i).showCard().equals("Diamonds_9") ||
					 firstPlayerWinCards.get(i).showCard().equals("Hearts_9") ||
					 firstPlayerWinCards.get(i).showCard().equals("Leaves_9"))
					{
						points += 0;
					}
		}
		return points;
		
	}
	
	public void giveCardServer(final GameWindow window, final Server server, 
							final ArrayList<Card> cards, final boolean trick) {
			
		window.firstCard.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						server.serverWriteString(cards.get(first).showCard());
						window.firstCard.setVisible(false);
						window.firstCard.setEnabled(false);
						window.frmTysiac.setVisible(false);
						subCounter(0);
						

			}
		});
		
		window.secondCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					server.serverWriteString(cards.get(second).showCard());
					window.secondCard.setVisible(false);
					window.secondCard.setEnabled(false);
					window.frmTysiac.setVisible(false);
					subCounter(1);				

		}
	});
		
		window.thirdCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					server.serverWriteString(cards.get(third).showCard());
					window.thirdCard.setVisible(false);
					window.thirdCard.setEnabled(false);
					window.frmTysiac.setVisible(false);
					subCounter(2);

		}
	});
		
		window.fourthCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					server.serverWriteString(cards.get(fourth).showCard());
					window.fourthCard.setVisible(false);
					window.fourthCard.setEnabled(false);
					window.frmTysiac.setVisible(false);
					subCounter(3);

		}
	});
		
		window.fifthCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					server.serverWriteString(cards.get(fifth).showCard());
					window.fifthCard.setVisible(false);
					window.fifthCard.setEnabled(false);
					window.frmTysiac.setVisible(false);
					subCounter(4);

		}
	});
		
		window.sixthCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					server.serverWriteString(cards.get(sixth).showCard());
					window.sixthCard.setVisible(false);
					window.sixthCard.setEnabled(false);
					window.frmTysiac.setVisible(false);
					subCounter(5); 

		}
	});
		
		window.seventhCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					server.serverWriteString(cards.get(seventh).showCard());
					window.seventhCard.setVisible(false);
					window.seventhCard.setEnabled(false);
					window.frmTysiac.setVisible(false);
					subCounter(6);

		}
	});
		
		window.eighthCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					server.serverWriteString(cards.get(eighth).showCard());
					window.eighthCard.setVisible(false);
					window.eighthCard.setEnabled(false);
					window.frmTysiac.setVisible(false);
					subCounter(7);

		}
	});
		
		window.ninthCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					server.serverWriteString(cards.get(ninth).showCard());
					window.ninthCard.setVisible(false);
					window.ninthCard.setEnabled(false);
					window.frmTysiac.setVisible(false);
					subCounter(8); 

		}
	});
		
		window.tenthCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					server.serverWriteString(cards.get(tenth).showCard());
					window.tenthCard.setVisible(false);
					window.tenthCard.setEnabled(false);
					window.frmTysiac.setVisible(false);
					subCounter(9);

		}
	});
		
	}
	
	public void giveCardClient(final GameWindow window, final Client client, 
			final ArrayList<Card> cards, final boolean trick) {
		
		window.firstCard.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				client.clientWriteString(cards.get(first).showCard());
				window.firstCard.setVisible(false);
				window.firstCard.setEnabled(false);
				window.frmTysiac.setVisible(false);
				subCounter(0);
		
			}
		});
		
		window.secondCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					client.clientWriteString(cards.get(second).showCard());
					window.secondCard.setVisible(false);
					window.secondCard.setEnabled(false);
					window.frmTysiac.setVisible(false);
					subCounter(1);

			
				}
			});
		
		window.thirdCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					client.clientWriteString(cards.get(third).showCard());
					window.thirdCard.setVisible(false);
					window.thirdCard.setEnabled(false);
					window.frmTysiac.setVisible(false);
					subCounter(2);

			
				}
			});
		
		window.fourthCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					client.clientWriteString(cards.get(fourth).showCard());
					window.fourthCard.setVisible(false);
					window.fourthCard.setEnabled(false);
					window.frmTysiac.setVisible(false);
					subCounter(3);

			
				}
			});
		
		window.fifthCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					client.clientWriteString(cards.get(fifth).showCard());
					window.fifthCard.setVisible(false);
					window.fifthCard.setEnabled(false);
					window.frmTysiac.setVisible(false);
					subCounter(4);

			
				}
			});
		
		window.sixthCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					client.clientWriteString(cards.get(sixth).showCard());
					window.sixthCard.setVisible(false);
					window.sixthCard.setEnabled(false);
					window.frmTysiac.setVisible(false);
					subCounter(5);

			
				}
			});
		
		window.seventhCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					client.clientWriteString(cards.get(seventh).showCard());
					window.seventhCard.setVisible(false);
					window.seventhCard.setEnabled(false);
					window.frmTysiac.setVisible(false);
					subCounter(6);

			
				}
			});
		
		window.eighthCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					client.clientWriteString(cards.get(eighth).showCard());
					window.eighthCard.setVisible(false);
					window.eighthCard.setEnabled(false);
					window.frmTysiac.setVisible(false);
					subCounter(7);

			
				}
			});
		
		window.ninthCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					client.clientWriteString(cards.get(ninth).showCard());
					window.ninthCard.setVisible(false);
					window.ninthCard.setEnabled(false);
					window.frmTysiac.setVisible(false);
					subCounter(8);

			
				}
			});
		
		window.tenthCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					client.clientWriteString(cards.get(tenth).showCard());
					window.tenthCard.setVisible(false);
					window.tenthCard.setEnabled(false);
					window.frmTysiac.setVisible(false);
					subCounter(9);

			
				}
			});

	}
	
	public void showCardsServer(final GameWindow window, final Server server, 
						final ArrayList<Card> pCards, final ArrayList<Card> oCards, 
						final ArrayList<Card> firstPlayerWinCards, final ArrayList<Card> secondPlayerWinCards) {
			
		
			final String card;
			card = server.serverReadString();
			window.frmTysiac.setEnabled(true);
			window.frmTysiac.setVisible(true);
			
			window.firstCard.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {				
					int i;					
					for(i = 0; i < oCards.size(); i++) {
						if(oCards.get(i).showCard().equals(card)) {
							firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(first));
							if(firstCardGreater) {
								firstPlayerWinCards.add(oCards.get(i));
								firstPlayerWinCards.add(pCards.get(first));
								server.serverWriteString("firstPlayerWin");
								window.frmTysiac.setVisible(false);
							}					
							else {
								secondPlayerWinCards.add(oCards.get(i));
								secondPlayerWinCards.add(pCards.get(first));
								server.serverWriteString("secondPlayerWin");			
							}
							oCards.remove(i);
							pCards.remove(first);
							subCounter(0);
						}					
					}	
					window.firstCard.setVisible(false);
				}
			
			});
			
			window.secondCard.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {				
					int i;					
					for(i = 0; i < oCards.size(); i++) {
						if(oCards.get(i).showCard().equals(card)) {
							firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(second));
							
							if(firstCardGreater) {
								firstPlayerWinCards.add(oCards.get(i));
								firstPlayerWinCards.add(pCards.get(second));
								server.serverWriteString("firstPlayerWin");
								window.frmTysiac.setVisible(false);
							}					
							else {
								secondPlayerWinCards.add(oCards.get(i));
								secondPlayerWinCards.add(pCards.get(second));
								server.serverWriteString("secondPlayerWin");			
							}
							oCards.remove(i);
							pCards.remove(second);
							subCounter(1);
						}					
					}	
					window.secondCard.setVisible(false);

				}
			});
			
			window.thirdCard.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {				
					int i;					
					for(i = 0; i < oCards.size(); i++) {
						if(oCards.get(i).showCard().equals(card)) {
							firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(third));
							if(firstCardGreater) {
								firstPlayerWinCards.add(oCards.get(i));
								firstPlayerWinCards.add(pCards.get(third));
								server.serverWriteString("firstPlayerWin");
								window.frmTysiac.setVisible(false);
							}					
							else {
								secondPlayerWinCards.add(oCards.get(i));
								secondPlayerWinCards.add(pCards.get(third));
								server.serverWriteString("secondPlayerWin");			
							}
							oCards.remove(i);
							pCards.remove(third);
							subCounter(2);
						}					
					}	
					window.thirdCard.setVisible(false);

				}
			});
			
			window.fourthCard.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {				
					int i;					
					for(i = 0; i < oCards.size(); i++) {
						if(oCards.get(i).showCard().equals(card)) {
							firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(fourth));
							if(firstCardGreater) {
								firstPlayerWinCards.add(oCards.get(i));
								firstPlayerWinCards.add(pCards.get(fourth));
								server.serverWriteString("firstPlayerWin");
								window.frmTysiac.setVisible(false);
							}					
							else {
								secondPlayerWinCards.add(oCards.get(i));
								secondPlayerWinCards.add(pCards.get(fourth));
								server.serverWriteString("secondPlayerWin");			
							}
							oCards.remove(i);
							pCards.remove(fourth);
							subCounter(3);
						}					
					}	
					window.fourthCard.setVisible(false);

				}
			});
			
			window.fifthCard.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {				
					int i;					
					for(i = 0; i < oCards.size(); i++) {
						if(oCards.get(i).showCard().equals(card)) {
							firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(fifth));
							if(firstCardGreater) {
								firstPlayerWinCards.add(oCards.get(i));
								firstPlayerWinCards.add(pCards.get(fifth));
								server.serverWriteString("firstPlayerWin");
								window.frmTysiac.setVisible(false);
							}					
							else {
								secondPlayerWinCards.add(oCards.get(i));
								secondPlayerWinCards.add(pCards.get(fifth));
								server.serverWriteString("secondPlayerWin");			
							}
							oCards.remove(i);
							pCards.remove(fifth);
							subCounter(4);
						}					
					}	
					window.fifthCard.setVisible(false);

				}
			});
			
			window.sixthCard.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {				
					int i;					
					for(i = 0; i < oCards.size(); i++) {
						if(oCards.get(i).showCard().equals(card)) {
							firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(sixth));
							if(firstCardGreater) {
								firstPlayerWinCards.add(oCards.get(i));
								firstPlayerWinCards.add(pCards.get(sixth));
								server.serverWriteString("firstPlayerWin");
								window.frmTysiac.setVisible(false);
							}					
							else {
								secondPlayerWinCards.add(oCards.get(i));
								secondPlayerWinCards.add(pCards.get(sixth));
								server.serverWriteString("secondPlayerWin");			
							}
							oCards.remove(i);
							pCards.remove(sixth);
							subCounter(5);
						}					
					}	
					window.sixthCard.setVisible(false);

				}
			});
			
			window.seventhCard.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {				
					int i;					
					for(i = 0; i < oCards.size(); i++) {
						if(oCards.get(i).showCard().equals(card)) {
							firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(seventh));
							if(firstCardGreater) {
								firstPlayerWinCards.add(oCards.get(i));
								firstPlayerWinCards.add(pCards.get(seventh));
								server.serverWriteString("firstPlayerWin");
								window.frmTysiac.setVisible(false);
							}					
							else {
								secondPlayerWinCards.add(oCards.get(i));
								secondPlayerWinCards.add(pCards.get(seventh));
								server.serverWriteString("secondPlayerWin");			
							}
							oCards.remove(i);
							pCards.remove(seventh);
							subCounter(6);
						}						
					}	
					window.seventhCard.setVisible(false);

				}
			});
			
			window.eighthCard.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {				
					int i;					
					for(i = 0; i < oCards.size(); i++) {
						if(oCards.get(i).showCard().equals(card)) {
							firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(eighth));
							if(firstCardGreater) {
								firstPlayerWinCards.add(oCards.get(i));
								firstPlayerWinCards.add(pCards.get(eighth));
								server.serverWriteString("firstPlayerWin");
								window.frmTysiac.setVisible(false);
							}					
							else {
								secondPlayerWinCards.add(oCards.get(i));
								secondPlayerWinCards.add(pCards.get(eighth));
								server.serverWriteString("secondPlayerWin");			
							}
							oCards.remove(i);
							pCards.remove(eighth);
							subCounter(7);
						}					
					}	
					window.eighthCard.setVisible(false);

				}
			});
			
			window.ninthCard.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {				
					int i;					
					for(i = 0; i < oCards.size(); i++) {
						firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(ninth));
						if(firstCardGreater) {
							firstPlayerWinCards.add(oCards.get(i));
							firstPlayerWinCards.add(pCards.get(ninth));
							server.serverWriteString("firstPlayerWin");
							window.frmTysiac.setVisible(false);
						}					
						else {
							secondPlayerWinCards.add(oCards.get(i));
							secondPlayerWinCards.add(pCards.get(ninth));
							server.serverWriteString("secondPlayerWin");			
						}
						oCards.remove(i);
						pCards.remove(ninth);
						subCounter(8);
					}															
					
					window.ninthCard.setVisible(false);

				}
			});
			
			window.tenthCard.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {				
					int i;					
					for(i = 0; i < oCards.size(); i++) {
						if(oCards.get(i).showCard().equals(card)) {
							firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(tenth));
							if(firstCardGreater) {
								firstPlayerWinCards.add(oCards.get(i));
								firstPlayerWinCards.add(pCards.get(tenth));
								server.serverWriteString("firstPlayerWin");
								window.frmTysiac.setVisible(false);
							}					
							else {
								secondPlayerWinCards.add(oCards.get(i));
								secondPlayerWinCards.add(pCards.get(tenth));
								server.serverWriteString("secondPlayerWin");			
							}
							oCards.remove(i);
							pCards.remove(tenth);
							subCounter(9);
						}					
					}	
					window.tenthCard.setVisible(false);

				}
			});
	}
	
	public void showCardsClient(final GameWindow window, final Client client, 
			final ArrayList<Card> pCards, final ArrayList<Card> oCards, 
			final ArrayList<Card> firstPlayerWinCards, final ArrayList<Card> secondPlayerWinCards) {
		
		final String card;		
		card = client.clientReadString();
		
		int j;
		for(j = 0; j < oCards.size(); j++) {
			if(oCards.get(j).showCard().equals(card)) { 
				window.secondPlayerPlayingCard.setIcon(new ImageIcon(
														ImagePath.path +oCards.get(j).showCard() +".jpg"));
				window.secondPlayerPlayingCard.setVisible(true);
				System.out.println(oCards.get(j).showCard());
			}
		}

		window.frmTysiac.setEnabled(true);
		window.frmTysiac.setVisible(true);

		window.firstCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int i;
				for(i = 0; i < oCards.size(); i++) {
					if(oCards.get(i).showCard().equals(card)) {
						firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(first));
						if(firstCardGreater) {
							firstPlayerWinCards.add(oCards.get(i));
							firstPlayerWinCards.add(pCards.get(first));
							client.clientWriteString("firstPlayerWin");
							window.frmTysiac.setVisible(false);
						}

						else {
							secondPlayerWinCards.add(oCards.get(i));
							secondPlayerWinCards.add(pCards.get(first));
							client.clientWriteString("secondPlayerWin");
						}
						oCards.remove(i);
						pCards.remove(first);
						subCounter(0);
					}					
				}	
				window.firstCard.setVisible(false);

			}
		});
		
		window.secondCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i;
				for(i = 0; i < oCards.size(); i++) {
					if(oCards.get(i).showCard().equals(card)) {
						firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(second));
						if(firstCardGreater) {
							firstPlayerWinCards.add(oCards.get(i));
							firstPlayerWinCards.add(pCards.get(second));
							client.clientWriteString("firstPlayerWin");
							window.frmTysiac.setVisible(false);
						}

						else {
							secondPlayerWinCards.add(oCards.get(i));
							secondPlayerWinCards.add(pCards.get(second));
							client.clientWriteString("secondPlayerWin");
						}
						oCards.remove(i);
						pCards.remove(second);
						subCounter(1);
							
					}					
				}		
				window.secondCard.setVisible(false);

			}
		});
		
		window.thirdCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i;
				for(i = 0; i < oCards.size(); i++) {
					if(oCards.get(i).showCard().equals(card)) {
						firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(third));
						if(firstCardGreater) {
							firstPlayerWinCards.add(oCards.get(i));
							firstPlayerWinCards.add(pCards.get(third));
							client.clientWriteString("firstPlayerWin");
							window.frmTysiac.setVisible(false);
						}

						else {
							secondPlayerWinCards.add(oCards.get(i));
							secondPlayerWinCards.add(pCards.get(third));
							client.clientWriteString("secondPlayerWin");
						}
						oCards.remove(i);
						pCards.remove(third);
						subCounter(2);
					}					
				}		
				window.thirdCard.setVisible(false);

			}
		});
		
		window.fourthCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i;
				for(i = 0; i < oCards.size(); i++) {
					if(oCards.get(i).showCard().equals(card)) {
						firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(fourth));
						if(firstCardGreater) {
							firstPlayerWinCards.add(oCards.get(i));
							firstPlayerWinCards.add(pCards.get(fourth));
							client.clientWriteString("firstPlayerWin");
							window.frmTysiac.setVisible(false);
						}

						else {
							secondPlayerWinCards.add(oCards.get(i));
							secondPlayerWinCards.add(pCards.get(fourth));
							client.clientWriteString("secondPlayerWin");
						}
						oCards.remove(i);
						pCards.remove(fourth);
						subCounter(3);
					}					
				}	
				window.fourthCard.setVisible(false);

			}
		});
		
		window.fifthCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i;
				for(i = 0; i < oCards.size(); i++) {
					if(oCards.get(i).showCard().equals(card)) {
						firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(fifth));
						if(firstCardGreater) {
							firstPlayerWinCards.add(oCards.get(i));
							firstPlayerWinCards.add(pCards.get(fifth));
							client.clientWriteString("firstPlayerWin");
							window.frmTysiac.setVisible(false);
						}

						else {
							secondPlayerWinCards.add(oCards.get(i));
							secondPlayerWinCards.add(pCards.get(fifth));
							client.clientWriteString("secondPlayerWin");
						}
						oCards.remove(i);
						pCards.remove(fifth);
						subCounter(4);
					}					
				}		
				window.fifthCard.setVisible(false);

			}
		});
		
		window.sixthCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i;
				for(i = 0; i < oCards.size(); i++) {
					if(oCards.get(i).showCard().equals(card)) {
						firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(sixth));
						if(firstCardGreater) {
							firstPlayerWinCards.add(oCards.get(i));
							firstPlayerWinCards.add(pCards.get(sixth));
							client.clientWriteString("firstPlayerWin");
							window.frmTysiac.setVisible(false);
						}

						else {
							secondPlayerWinCards.add(oCards.get(i));
							secondPlayerWinCards.add(pCards.get(sixth));
							client.clientWriteString("secondPlayerWin");
						}
						oCards.remove(i);
						pCards.remove(sixth);
						subCounter(5);
					}					
				}		
				window.sixthCard.setVisible(false);

			}
		});
		
		window.seventhCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i;
				for(i = 0; i < oCards.size(); i++) {
					if(oCards.get(i).showCard().equals(card)) {
						firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(seventh));
						if(firstCardGreater) {
							firstPlayerWinCards.add(oCards.get(i));
							firstPlayerWinCards.add(pCards.get(seventh));
							client.clientWriteString("firstPlayerWin");
							window.frmTysiac.setVisible(false);
						}

						else {
							secondPlayerWinCards.add(oCards.get(i));
							secondPlayerWinCards.add(pCards.get(seventh));
							client.clientWriteString("secondPlayerWin");
						}
						oCards.remove(i);
						pCards.remove(seventh);
						subCounter(6);
					}					
				}	
				window.seventhCard.setVisible(false);

			}
		});
		
		window.eighthCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i;
				for(i = 0; i < oCards.size(); i++) {
					if(oCards.get(i).showCard().equals(card)) {
						firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(eighth));
						if(firstCardGreater) {
							firstPlayerWinCards.add(oCards.get(i));
							firstPlayerWinCards.add(pCards.get(eighth));
							client.clientWriteString("firstPlayerWin");
							window.frmTysiac.setVisible(false);
						}

						else {
							secondPlayerWinCards.add(oCards.get(i));
							secondPlayerWinCards.add(pCards.get(eighth));
							client.clientWriteString("secondPlayerWin");
						}
						oCards.remove(i);
						pCards.remove(eighth);
						subCounter(7);
					}					
				}		
				window.eighthCard.setVisible(false);

			}
		});
		
		window.ninthCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i;
				for(i = 0; i < oCards.size(); i++) {
					if(oCards.get(i).showCard().equals(card)) {
						firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(ninth));
						if(firstCardGreater) {
							firstPlayerWinCards.add(oCards.get(i));
							firstPlayerWinCards.add(pCards.get(ninth));
							client.clientWriteString("firstPlayerWin");
							window.frmTysiac.setVisible(false);
						}

						else {
							secondPlayerWinCards.add(oCards.get(i));
							secondPlayerWinCards.add(pCards.get(ninth));
							client.clientWriteString("secondPlayerWin");
						}
						oCards.remove(i);
						pCards.remove(ninth);
						subCounter(8);
					}					
				}		
				window.ninthCard.setVisible(false);

			}
		});
		
		window.tenthCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i;
				for(i = 0; i < oCards.size(); i++) {
					if(oCards.get(i).showCard().equals(card)) {
						firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(tenth));
						if(firstCardGreater) {
							firstPlayerWinCards.add(oCards.get(i));
							firstPlayerWinCards.add(pCards.get(tenth));
							client.clientWriteString("firstPlayerWin");
							window.frmTysiac.setVisible(false);
						}

						else {
							secondPlayerWinCards.add(oCards.get(i));
							secondPlayerWinCards.add(pCards.get(tenth));
							client.clientWriteString("secondPlayerWin");
						}
						oCards.remove(i);
						pCards.remove(tenth);
						subCounter(10);
					}					
				}		
				window.tenthCard.setVisible(false);

			}
		});
		
	}
	
	public boolean checkFirstPlayerWin(Server server) {
		boolean flag = false;
		String winner = server.serverReadString();
		System.out.println(winner);
		if(winner.equals("firstPlayerWin"))
			flag = true;
		else if(winner.equals("secondPlayerWin"))
			flag = false;
		else
			System.out.println("Error winner");
		return flag;
	}
	
	public boolean checkSecondPlayerWin(Client client) {
		boolean flag = false;
		String winner = client.clientReadString();
		System.out.println(winner);
		if(winner.equals("firstPlayerWin"))
			flag = true;
		else if(winner.equals("secondPlayerWin"))
			flag = false;
		else
			System.out.println("Error winner");
		return flag;
	}

}
