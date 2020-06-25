package window;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import game.Card;
import game.Rules;
import network.Client;
import network.Server;

public class DealingAction {
	
	Rules rules = new Rules();
	boolean firstCardGreater = true;
	
	public void giveCardServer(final GameWindow window, final Server server, 
							final ArrayList<Card> cards, final boolean trick) {
			
		window.firstCard.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						server.serverWriteString(cards.get(0).showCard());
						window.firstCard.setVisible(false);
						window.frmTysiac.setVisible(false);

			}
		});
		
		window.secondCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					server.serverWriteString(cards.get(1).showCard());
					window.secondCard.setVisible(false);
					window.frmTysiac.setVisible(false);

		}
	});
		
		window.thirdCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					server.serverWriteString(cards.get(2).showCard());
					window.thirdCard.setVisible(false);
					window.frmTysiac.setVisible(false);

		}
	});
		
		window.fourthCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					server.serverWriteString(cards.get(3).showCard());
					window.fourthCard.setVisible(false);
					window.frmTysiac.setVisible(false);

		}
	});
		
		window.fifthCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					server.serverWriteString(cards.get(4).showCard());
					window.fifthCard.setVisible(false);
					window.frmTysiac.setVisible(false);

		}
	});
		
		window.sixthCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					server.serverWriteString(cards.get(5).showCard());
					window.sixthCard.setVisible(false);
					window.frmTysiac.setVisible(false);

		}
	});
		
		window.seventhCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					server.serverWriteString(cards.get(6).showCard());
					window.seventhCard.setVisible(false);
					window.frmTysiac.setVisible(false);

		}
	});
		
		window.eighthCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					server.serverWriteString(cards.get(7).showCard());
					window.eighthCard.setVisible(false);
					window.frmTysiac.setVisible(false);

		}
	});
		
		window.ninthCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					server.serverWriteString(cards.get(8).showCard());
					window.ninthCard.setVisible(false);
					window.frmTysiac.setVisible(false);

		}
	});
		
		window.tenthCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					server.serverWriteString(cards.get(9).showCard());
					window.tenthCard.setVisible(false);
					window.frmTysiac.setVisible(false);

		}
	});
		
	}
	
	public void giveCardClient(final GameWindow window, final Client client, 
			final ArrayList<Card> cards, final boolean trick) {
		
		window.firstCard.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				client.clientWriteString(cards.get(0).showCard());
				window.firstCard.setVisible(false);
				window.frmTysiac.setVisible(false);
		
			}
		});
		
		window.secondCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					client.clientWriteString(cards.get(1).showCard());
					window.secondCard.setVisible(false);
					window.frmTysiac.setVisible(false);
			
				}
			});
		
		window.thirdCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					client.clientWriteString(cards.get(2).showCard());
					window.thirdCard.setVisible(false);
					window.frmTysiac.setVisible(false);
			
				}
			});
		
		window.fourthCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					client.clientWriteString(cards.get(3).showCard());
					window.fourthCard.setVisible(false);
					window.frmTysiac.setVisible(false);
			
				}
			});
		
		window.fifthCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					client.clientWriteString(cards.get(4).showCard());
					window.fifthCard.setVisible(false);
					window.frmTysiac.setVisible(false);
			
				}
			});
		
		window.sixthCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					client.clientWriteString(cards.get(5).showCard());
					window.sixthCard.setVisible(false);
					window.frmTysiac.setVisible(false);
			
				}
			});
		
		window.seventhCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					client.clientWriteString(cards.get(6).showCard());
					window.seventhCard.setVisible(false);
					window.frmTysiac.setVisible(false);
			
				}
			});
		
		window.eighthCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					client.clientWriteString(cards.get(7).showCard());
					window.eighthCard.setVisible(false);
					window.frmTysiac.setVisible(false);
			
				}
			});
		
		window.ninthCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					client.clientWriteString(cards.get(8).showCard());
					window.ninthCard.setVisible(false);
					window.frmTysiac.setVisible(false);
			
				}
			});
		
		window.tenthCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					client.clientWriteString(cards.get(9).showCard());
					window.tenthCard.setVisible(false);
					window.frmTysiac.setVisible(false);
			
				}
			});

	}
	
	public void showCardsServer(final GameWindow window, final Server server, 
			final ArrayList<Card> pCards, final ArrayList<Card> oCards) {
			final String card;
			card = server.serverReadString();
			window.frmTysiac.setEnabled(true);
			window.frmTysiac.setVisible(true);
			
			window.firstCard.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {				
					int i;					
					for(i = 0; i < oCards.size(); i++) {
						if(oCards.get(i).showCard().equals(card)) {
							firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(0));
							oCards.remove(i);
							if(firstCardGreater) {
								server.serverWriteString("firstPlayerWin");
								window.frmTysiac.setVisible(false);
							}					
							else {
								server.serverWriteString("secondPlayerWin");			
							}
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
							firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(1));
							oCards.remove(i);
							if(firstCardGreater) {
								server.serverWriteString("firstPlayerWin");
								window.frmTysiac.setVisible(false);
							}					
							else {
								server.serverWriteString("secondPlayerWin");			
							}
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
							firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(2));
							oCards.remove(i);
							if(firstCardGreater) {
								server.serverWriteString("firstPlayerWin");
								window.frmTysiac.setVisible(false);
							}					
							else {
								server.serverWriteString("secondPlayerWin");			
							}
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
							firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(3));
							oCards.remove(i);
							if(firstCardGreater) {
								server.serverWriteString("firstPlayerWin");
								window.frmTysiac.setVisible(false);
							}					
							else {
								server.serverWriteString("secondPlayerWin");			
							}
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
							firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(4));
							oCards.remove(i);
							if(firstCardGreater) {
								server.serverWriteString("firstPlayerWin");
								window.frmTysiac.setVisible(false);
							}					
							else {
								server.serverWriteString("secondPlayerWin");			
							}
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
							firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(5));
							oCards.remove(i);
							if(firstCardGreater) {
								server.serverWriteString("firstPlayerWin");
								window.frmTysiac.setVisible(false);
							}					
							else {
								server.serverWriteString("secondPlayerWin");			
							}
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
							firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(6));
							oCards.remove(i);
							if(firstCardGreater) {
								server.serverWriteString("firstPlayerWin");
								window.frmTysiac.setVisible(false);
							}					
							else {
								server.serverWriteString("secondPlayerWin");			
							}
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
							firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(7));
							oCards.remove(i);
							if(firstCardGreater) {
								server.serverWriteString("firstPlayerWin");
								window.frmTysiac.setVisible(false);
							}					
							else {
								server.serverWriteString("secondPlayerWin");			
							}
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
							firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(8));
							oCards.remove(i);
							if(firstCardGreater) {
								server.serverWriteString("firstPlayerWin");
								window.frmTysiac.setVisible(false);
							}					
							else {
								server.serverWriteString("secondPlayerWin");			
							}
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
							firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(9));
							oCards.remove(i);
							if(firstCardGreater) {
								server.serverWriteString("firstPlayerWin");
								window.frmTysiac.setVisible(false);
							}					
							else {
								server.serverWriteString("secondPlayerWin");			
							}
						}					
					}	
					window.tenthCard.setVisible(false);

				}
			});
	}
	
	public void showCardsClient(final GameWindow window, final Client client, 
							final ArrayList<Card> pCards, final ArrayList<Card> oCards) {
		final String card;
		card = client.clientReadString();
		window.frmTysiac.setEnabled(true);
		window.frmTysiac.setVisible(true);

		window.firstCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i;
				for(i = 0; i < oCards.size(); i++) {
					if(oCards.get(i).showCard().equals(card)) {
						firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(0));
						oCards.remove(i);
						if(firstCardGreater) {
							client.clientWriteString("firstPlayerWin");
							window.frmTysiac.setVisible(false);
						}

						else {
							client.clientWriteString("secondPlayerWin");
						}
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
						firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(1));
						oCards.remove(i);
						if(firstCardGreater) {
							client.clientWriteString("firstPlayerWin");
							window.frmTysiac.setVisible(false);
						}

						else {
							client.clientWriteString("secondPlayerWin");
						}
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
						firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(2));
						oCards.remove(i);
						if(firstCardGreater) {
							client.clientWriteString("firstPlayerWin");
							window.frmTysiac.setVisible(false);
						}

						else {
							client.clientWriteString("secondPlayerWin");
						}
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
						firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(3));
						oCards.remove(i);
						if(firstCardGreater) {
							client.clientWriteString("firstPlayerWin");
							window.frmTysiac.setVisible(false);
						}

						else {
							client.clientWriteString("secondPlayerWin");
						}
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
						firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(4));
						oCards.remove(i);
						if(firstCardGreater) {
							client.clientWriteString("firstPlayerWin");
							window.frmTysiac.setVisible(false);
						}

						else {
							client.clientWriteString("secondPlayerWin");
						}
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
						firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(5));
						oCards.remove(i);
						if(firstCardGreater) {
							client.clientWriteString("firstPlayerWin");
							window.frmTysiac.setVisible(false);
						}

						else {
							client.clientWriteString("secondPlayerWin");
						}
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
						firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(6));
						oCards.remove(i);
						if(firstCardGreater) {
							client.clientWriteString("firstPlayerWin");
							window.frmTysiac.setVisible(false);
						}

						else {
							client.clientWriteString("secondPlayerWin");
						}
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
						firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(7));
						oCards.remove(i);
						if(firstCardGreater) {
							client.clientWriteString("firstPlayerWin");
							window.frmTysiac.setVisible(false);
						}

						else {
							client.clientWriteString("secondPlayerWin");
						}
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
						firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(8));
						oCards.remove(i);
						if(firstCardGreater) {
							client.clientWriteString("firstPlayerWin");
							window.frmTysiac.setVisible(false);
						}

						else {
							client.clientWriteString("secondPlayerWin");
						}
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
						firstCardGreater = rules.compareCards(oCards.get(i), pCards.get(9));
						oCards.remove(i);
						if(firstCardGreater) {
							client.clientWriteString("firstPlayerWin");
							window.frmTysiac.setVisible(false);
						}

						else {
							client.clientWriteString("secondPlayerWin");
						}
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
		return flag;
	}

}
