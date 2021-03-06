package window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.JTextField;

public class GameWindow {

	JFrame frmTysiac;
	
	JButton firstCard;
	JButton secondCard;
	JButton thirdCard;
	JButton fourthCard;
	JButton fifthCard;
	JButton sixthCard;
	JButton seventhCard;
	JButton eighthCard;
	JButton ninthCard;
	JButton tenthCard;
		
	JButton firstTrickButton;
	JLabel firstTrickRightCard;
	JLabel firstTrickLeftCard;
	
	JButton secondTrickButton;
	JLabel secondTrickRightCard;
	JLabel secondTrickLeftCard;
	
	JLabel currentColor;
	
	JLabel firstPlayerPlayingCard;
	JLabel secondPlayerPlayingCard;
	
	ImagePath path = new ImagePath();
	JButton firstCardTrick;
	JButton secondCardTrick;
	JButton thirdCardTrick;
	JButton fourthCardTrick;
	JButton fifthCardTrick;
	JButton sixthCardTrick;
	JButton seventhCardTrick;
	JButton eighthCardTrick;
	JButton ninthCardTrick;
	JButton tenthCardTrick;

	
	


	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameWindow window = new GameWindow();
					window.frmTysiac.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public GameWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTysiac = new JFrame();
		frmTysiac.setTitle("Tysiac");
		frmTysiac.getContentPane().setBackground(Color.WHITE);
		frmTysiac.setIconImage(Toolkit.getDefaultToolkit().getImage(path.path +"sample.jpg"));
		frmTysiac.setBounds(100, 100, 1000, 650);
		frmTysiac.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel playerCardsPanel = new JPanel();
		playerCardsPanel.setBackground(new Color(0, 128, 0));
		frmTysiac.getContentPane().add(playerCardsPanel, BorderLayout.SOUTH);
		
		firstCard = new JButton("");
		
		 secondCard = new JButton("");
		
		 thirdCard = new JButton("");
		
		 fourthCard = new JButton("");
		
		 fifthCard = new JButton("");
		
		 sixthCard = new JButton("");
		
		 seventhCard = new JButton("");
		
		 eighthCard = new JButton("");
		
		 ninthCard = new JButton("");
		
		 tenthCard = new JButton("");
		 
		 ninthCardTrick = new JButton("");
		 ninthCardTrick.setIcon(new ImageIcon("C:\\Users\\krzysztof\\Desktop\\Karty\\9.png"));
		 
		 tenthCardTrick = new JButton("");
		 tenthCardTrick.setIcon(new ImageIcon("C:\\Users\\krzysztof\\Desktop\\Karty\\10.png"));
		 
		 eighthCardTrick = new JButton("");
		 eighthCardTrick.setIcon(new ImageIcon("C:\\Users\\krzysztof\\Desktop\\Karty\\8.png"));
		 
		 seventhCardTrick = new JButton("");
		 seventhCardTrick.setIcon(new ImageIcon("C:\\Users\\krzysztof\\Desktop\\Karty\\7.png"));
		 
		 sixthCardTrick = new JButton("");
		 sixthCardTrick.setIcon(new ImageIcon("C:\\Users\\krzysztof\\Desktop\\Karty\\6.png"));
		 
		 fifthCardTrick = new JButton("");
		 fifthCardTrick.setIcon(new ImageIcon("C:\\Users\\krzysztof\\Desktop\\Karty\\5.png"));
		 
		 fourthCardTrick = new JButton("");
		 fourthCardTrick.setIcon(new ImageIcon("C:\\Users\\krzysztof\\Desktop\\Karty\\4.png"));
		 
		 thirdCardTrick = new JButton("");
		 thirdCardTrick.setIcon(new ImageIcon("C:\\Users\\krzysztof\\Desktop\\Karty\\3.png"));
		 
		 secondCardTrick = new JButton("");
		 secondCardTrick.setIcon(new ImageIcon(path.path +"2.png"));
		 
		 firstCardTrick = new JButton("");
		 firstCardTrick.setIcon(new ImageIcon("C:\\Users\\krzysztof\\Desktop\\Karty\\1.png"));
		 
		 GroupLayout gl_playerCardsPanel = new GroupLayout(playerCardsPanel);
		 gl_playerCardsPanel.setHorizontalGroup(
		 	gl_playerCardsPanel.createParallelGroup(Alignment.LEADING)
		 		.addGroup(gl_playerCardsPanel.createSequentialGroup()
		 			.addGap(58)
		 			.addComponent(firstCard, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
		 			.addPreferredGap(ComponentPlacement.RELATED)
		 			.addComponent(secondCard, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
		 			.addPreferredGap(ComponentPlacement.RELATED)
		 			.addComponent(thirdCard, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
		 			.addPreferredGap(ComponentPlacement.RELATED)
		 			.addComponent(fourthCard, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
		 			.addPreferredGap(ComponentPlacement.RELATED)
		 			.addComponent(fifthCard, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
		 			.addPreferredGap(ComponentPlacement.RELATED)
		 			.addComponent(sixthCard, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
		 			.addPreferredGap(ComponentPlacement.RELATED)
		 			.addComponent(seventhCard, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
		 			.addPreferredGap(ComponentPlacement.RELATED)
		 			.addComponent(eighthCard, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
		 			.addPreferredGap(ComponentPlacement.RELATED)
		 			.addComponent(ninthCard, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
		 			.addPreferredGap(ComponentPlacement.RELATED)
		 			.addComponent(tenthCard, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
		 			.addContainerGap(72, Short.MAX_VALUE))
		 		.addGroup(Alignment.TRAILING, gl_playerCardsPanel.createSequentialGroup()
		 			.addContainerGap(86, Short.MAX_VALUE)
		 			.addComponent(firstCardTrick, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
		 			.addGap(70)
		 			.addComponent(secondCardTrick, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
		 			.addGap(65)
		 			.addComponent(thirdCardTrick, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
		 			.addGap(66)
		 			.addComponent(fourthCardTrick, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
		 			.addGap(66)
		 			.addComponent(fifthCardTrick, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
		 			.addGap(62)
		 			.addComponent(sixthCardTrick, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
		 			.addGap(70)
		 			.addComponent(seventhCardTrick, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
		 			.addGap(65)
		 			.addComponent(eighthCardTrick, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
		 			.addGap(66)
		 			.addComponent(ninthCardTrick, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
		 			.addGap(67)
		 			.addComponent(tenthCardTrick, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
		 			.addGap(101))
		 );
		 gl_playerCardsPanel.setVerticalGroup(
		 	gl_playerCardsPanel.createParallelGroup(Alignment.TRAILING)
		 		.addGroup(gl_playerCardsPanel.createSequentialGroup()
		 			.addGroup(gl_playerCardsPanel.createParallelGroup(Alignment.LEADING)
		 				.addComponent(fifthCard, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
		 				.addComponent(sixthCard, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
		 				.addComponent(seventhCard, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
		 				.addComponent(eighthCard, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
		 				.addComponent(ninthCard, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
		 				.addComponent(tenthCard, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
		 				.addComponent(fourthCard, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
		 				.addComponent(thirdCard, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
		 				.addComponent(secondCard, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
		 				.addComponent(firstCard, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
		 			.addGap(2)
		 			.addGroup(gl_playerCardsPanel.createParallelGroup(Alignment.BASELINE)
		 				.addComponent(ninthCardTrick, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
		 				.addComponent(tenthCardTrick, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
		 				.addComponent(eighthCardTrick, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
		 				.addComponent(seventhCardTrick, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
		 				.addComponent(sixthCardTrick, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
		 				.addComponent(fifthCardTrick, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
		 				.addComponent(fourthCardTrick, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
		 				.addComponent(thirdCardTrick, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
		 				.addComponent(secondCardTrick, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
		 				.addComponent(firstCardTrick, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
		 );
		playerCardsPanel.setLayout(gl_playerCardsPanel);
		
		JPanel firstTrickPanel = new JPanel();
		firstTrickPanel.setBackground(new Color(0, 128, 0));
		frmTysiac.getContentPane().add(firstTrickPanel, BorderLayout.WEST);
		
		firstTrickButton = new JButton("");
		
		firstTrickButton.setIcon(new ImageIcon(path.path +"Cardback.png"));
		
		firstTrickRightCard = new JLabel("");
		firstTrickRightCard.setVisible(false);
		
		firstTrickLeftCard = new JLabel("");
		firstTrickLeftCard.setVisible(false);
		GroupLayout gl_firstTrickPanel = new GroupLayout(firstTrickPanel);
		gl_firstTrickPanel.setHorizontalGroup(
			gl_firstTrickPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_firstTrickPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_firstTrickPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_firstTrickPanel.createSequentialGroup()
							.addComponent(firstTrickLeftCard, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
							.addComponent(firstTrickRightCard, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(Alignment.LEADING, gl_firstTrickPanel.createSequentialGroup()
							.addGap(56)
							.addComponent(firstTrickButton, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addGap(64))))
		);
		gl_firstTrickPanel.setVerticalGroup(
			gl_firstTrickPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_firstTrickPanel.createSequentialGroup()
					.addGap(105)
					.addComponent(firstTrickButton, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
					.addGroup(gl_firstTrickPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(firstTrickLeftCard, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
						.addComponent(firstTrickRightCard, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
					.addGap(54))
		);
		firstTrickPanel.setLayout(gl_firstTrickPanel);
		
		JPanel secondTrickPanel = new JPanel();
		secondTrickPanel.setBackground(new Color(0, 128, 0));
		frmTysiac.getContentPane().add(secondTrickPanel, BorderLayout.EAST);
		
		secondTrickButton = new JButton("");
		secondTrickButton.setIcon(new ImageIcon(path.path +"Cardback.png"));
		
		secondTrickRightCard = new JLabel("");
		secondTrickRightCard.setVisible(false);
		
		secondTrickLeftCard = new JLabel("");
		secondTrickLeftCard.setVisible(false);
		GroupLayout gl_secondTrickPanel = new GroupLayout(secondTrickPanel);
		gl_secondTrickPanel.setHorizontalGroup(
			gl_secondTrickPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_secondTrickPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_secondTrickPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_secondTrickPanel.createSequentialGroup()
							.addComponent(secondTrickLeftCard, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
							.addComponent(secondTrickRightCard, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_secondTrickPanel.createSequentialGroup()
							.addGap(60)
							.addComponent(secondTrickButton, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addGap(69))))
		);
		gl_secondTrickPanel.setVerticalGroup(
			gl_secondTrickPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_secondTrickPanel.createSequentialGroup()
					.addGap(106)
					.addComponent(secondTrickButton, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_secondTrickPanel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(secondTrickRightCard, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
						.addComponent(secondTrickLeftCard, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
					.addGap(60))
		);
		secondTrickPanel.setLayout(gl_secondTrickPanel);
		
		JPanel infoPanel = new JPanel();
		infoPanel.setBackground(new Color(0, 128, 0));
		frmTysiac.getContentPane().add(infoPanel, BorderLayout.NORTH);
		
		currentColor = new JLabel("");
		GroupLayout gl_infoPanel = new GroupLayout(infoPanel);
		gl_infoPanel.setHorizontalGroup(
			gl_infoPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_infoPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(currentColor, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(934, Short.MAX_VALUE))
		);
		gl_infoPanel.setVerticalGroup(
			gl_infoPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_infoPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(currentColor, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(15, Short.MAX_VALUE))
		);
		infoPanel.setLayout(gl_infoPanel);
		
		JPanel playingCardsPanel = new JPanel();
		playingCardsPanel.setBackground(new Color(0, 128, 0));
		frmTysiac.getContentPane().add(playingCardsPanel, BorderLayout.CENTER);
		
		secondPlayerPlayingCard = new JLabel("");
		
		firstPlayerPlayingCard = new JLabel("");
		GroupLayout gl_playingCardsPanel = new GroupLayout(playingCardsPanel);
		gl_playingCardsPanel.setHorizontalGroup(
			gl_playingCardsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_playingCardsPanel.createSequentialGroup()
					.addGap(59)
					.addGroup(gl_playingCardsPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(secondPlayerPlayingCard, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_playingCardsPanel.createSequentialGroup()
							.addGap(55)
							.addComponent(firstPlayerPlayingCard, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(331, Short.MAX_VALUE))
		);
		gl_playingCardsPanel.setVerticalGroup(
			gl_playingCardsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_playingCardsPanel.createSequentialGroup()
					.addGap(97)
					.addComponent(secondPlayerPlayingCard, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(firstPlayerPlayingCard, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(72, Short.MAX_VALUE))
		);
		playingCardsPanel.setLayout(gl_playingCardsPanel);
	}
}
