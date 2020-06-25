package window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import network.Client;
import network.Server;

public class BiddingAction {
	
	public void  bidServer(final Server server, final BiddingWindow bidWindow, final GameWindow gameWindow){
		bidWindow.points100.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	

				server.serverWriteInt(100);
				bidWindow.setVisible(false);	
				gameWindow.frmTysiac.setVisible(false);

			}
		});
		
		bidWindow.points110.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	

				server.serverWriteInt(110);
				bidWindow.setVisible(false);	
				gameWindow.frmTysiac.setVisible(false);

			}
		});
		
		bidWindow.points120.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	

				server.serverWriteInt(120);
				bidWindow.setVisible(false);	
				gameWindow.frmTysiac.setVisible(false);

			}
		});
		
		bidWindow.points130.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	

				server.serverWriteInt(130);
				bidWindow.setVisible(false);	
				gameWindow.frmTysiac.setVisible(false);

			}
		});
		
		bidWindow.points140.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	

				server.serverWriteInt(140);
				bidWindow.setVisible(false);	
				gameWindow.frmTysiac.setVisible(false);

			}
		});
		
		bidWindow.points150.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	

				server.serverWriteInt(150);
				bidWindow.setVisible(false);	
				gameWindow.frmTysiac.setVisible(false);

			}
		});
		
		bidWindow.points160.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	

				server.serverWriteInt(160);
				bidWindow.setVisible(false);	
				gameWindow.frmTysiac.setVisible(false);

			}
		});
		
		bidWindow.points170.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	

				server.serverWriteInt(170);
				bidWindow.setVisible(false);	
				gameWindow.frmTysiac.setVisible(false);

			}
		});
		
		bidWindow.points180.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	

				server.serverWriteInt(180);
				bidWindow.setVisible(false);	
				gameWindow.frmTysiac.setVisible(false);

			}
		});
		
		bidWindow.points190.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	

				server.serverWriteInt(190);
				bidWindow.setVisible(false);	
				gameWindow.frmTysiac.setVisible(false);

			}
		});
		
		bidWindow.points200.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	

				server.serverWriteInt(200);
				bidWindow.setVisible(false);	
				gameWindow.frmTysiac.setVisible(false);

			}
		});
		
		bidWindow.points210.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	

				server.serverWriteInt(210);
				bidWindow.setVisible(false);	
				gameWindow.frmTysiac.setVisible(false);

			}
		});
		
		bidWindow.pas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	

				server.serverWriteInt(0);
				bidWindow.setVisible(false);	
				gameWindow.frmTysiac.setVisible(false);

			}
		});
				
	}
	
	public void  bidClient(final Client client, final BiddingWindow bidWindow, final GameWindow gameWindow, int score){
		
		if(score == 210) {
			bidWindow.points100.setVisible(false);
			bidWindow.points110.setVisible(false);
			bidWindow.points120.setVisible(false);
			bidWindow.points130.setVisible(false);
			bidWindow.points140.setVisible(false);
			bidWindow.points150.setVisible(false);
			bidWindow.points160.setVisible(false);
			bidWindow.points170.setVisible(false);
			bidWindow.points180.setVisible(false);
			bidWindow.points190.setVisible(false);
			bidWindow.points200.setVisible(false);

		}
		else if(score == 200) {
			bidWindow.points100.setVisible(false);
			bidWindow.points110.setVisible(false);
			bidWindow.points120.setVisible(false);
			bidWindow.points130.setVisible(false);
			bidWindow.points140.setVisible(false);
			bidWindow.points150.setVisible(false);
			bidWindow.points160.setVisible(false);
			bidWindow.points170.setVisible(false);
			bidWindow.points180.setVisible(false);
			bidWindow.points190.setVisible(false);
		}
		else if(score == 190) {
			bidWindow.points100.setVisible(false);
			bidWindow.points110.setVisible(false);
			bidWindow.points120.setVisible(false);
			bidWindow.points130.setVisible(false);
			bidWindow.points140.setVisible(false);
			bidWindow.points150.setVisible(false);
			bidWindow.points160.setVisible(false);
			bidWindow.points170.setVisible(false);
			bidWindow.points180.setVisible(false);
		}
		else if(score == 180) {
			bidWindow.points100.setVisible(false);
			bidWindow.points110.setVisible(false);
			bidWindow.points120.setVisible(false);
			bidWindow.points130.setVisible(false);
			bidWindow.points140.setVisible(false);
			bidWindow.points150.setVisible(false);
			bidWindow.points160.setVisible(false);
			bidWindow.points170.setVisible(false);
		}
		else if(score == 170) {
			bidWindow.points100.setVisible(false);
			bidWindow.points110.setVisible(false);
			bidWindow.points120.setVisible(false);
			bidWindow.points130.setVisible(false);
			bidWindow.points140.setVisible(false);
			bidWindow.points150.setVisible(false);
			bidWindow.points160.setVisible(false);
		}
		else if(score == 160) {
			bidWindow.points100.setVisible(false);
			bidWindow.points110.setVisible(false);
			bidWindow.points120.setVisible(false);
			bidWindow.points130.setVisible(false);
			bidWindow.points140.setVisible(false);
			bidWindow.points150.setVisible(false);
		}
		else if(score == 150) {
			bidWindow.points100.setVisible(false);
			bidWindow.points110.setVisible(false);
			bidWindow.points120.setVisible(false);
			bidWindow.points130.setVisible(false);
			bidWindow.points140.setVisible(false);
		}
		else if(score == 140) {
			bidWindow.points100.setVisible(false);
			bidWindow.points110.setVisible(false);
			bidWindow.points120.setVisible(false);
			bidWindow.points130.setVisible(false);

		}
		else if(score == 130) {
			bidWindow.points100.setVisible(false);
			bidWindow.points110.setVisible(false);
			bidWindow.points120.setVisible(false);
		}
		else if(score == 120) {
			bidWindow.points100.setVisible(false);
			bidWindow.points110.setVisible(false);
			bidWindow.points120.setVisible(false);
		}
		else if(score == 110) {
			bidWindow.points100.setVisible(false);
			bidWindow.points110.setVisible(false);
		}
		else if(score == 100) {
			bidWindow.points100.setVisible(false);
		}
		
		bidWindow.points100.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	

				client.clientWriteInt(100);
				bidWindow.setVisible(false);	
				gameWindow.frmTysiac.setVisible(false);
			}
		});
		
		bidWindow.points110.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	

				client.clientWriteInt(110);
				bidWindow.setVisible(false);	
				gameWindow.frmTysiac.setVisible(false);
			}
		});
		
		bidWindow.points120.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	

				client.clientWriteInt(120);
				bidWindow.setVisible(false);	
				gameWindow.frmTysiac.setVisible(false);
			}
		});
		
		bidWindow.points130.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	

				client.clientWriteInt(130);
				bidWindow.setVisible(false);	
				gameWindow.frmTysiac.setVisible(false);
			}
		});
		
		bidWindow.points140.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	

				client.clientWriteInt(140);
				bidWindow.setVisible(false);	
				gameWindow.frmTysiac.setVisible(false);
			}
		});
		
		bidWindow.points150.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	

				client.clientWriteInt(150);
				bidWindow.setVisible(false);	
				gameWindow.frmTysiac.setVisible(false);
			}
		});
		
		bidWindow.points160.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	

				client.clientWriteInt(160);
				bidWindow.setVisible(false);	
				gameWindow.frmTysiac.setVisible(false);
			}
		});
		
		bidWindow.points170.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	

				client.clientWriteInt(170);
				bidWindow.setVisible(false);	
				gameWindow.frmTysiac.setVisible(false);
			}
		});
		
		bidWindow.points180.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	

				client.clientWriteInt(180);
				bidWindow.setVisible(false);	
				gameWindow.frmTysiac.setVisible(false);
			}
		});
		
		bidWindow.points190.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	

				client.clientWriteInt(190);
				bidWindow.setVisible(false);	
				gameWindow.frmTysiac.setVisible(false);
			}
		});
		
		bidWindow.points200.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	

				client.clientWriteInt(200);
				bidWindow.setVisible(false);	
				gameWindow.frmTysiac.setVisible(false);
			}
		});
		
		bidWindow.points210.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	

				client.clientWriteInt(210);
				bidWindow.setVisible(false);	
				gameWindow.frmTysiac.setVisible(false);
			}
		});
		
		bidWindow.pas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	

				client.clientWriteInt(0);
				bidWindow.setVisible(false);	
				gameWindow.frmTysiac.setVisible(false);
			}
		});
				
	}
	
	public int getServerBid(final Client client) {
		int score;
		score = client.clientReadInt();
		return score;
	}
	
	public int getClientBid(final Server server) {
		int score;
		score = server.serverReadInt();
		return score;
	}

}
