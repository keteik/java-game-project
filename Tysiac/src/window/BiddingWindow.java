package window;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;

public class BiddingWindow extends JFrame {

	private JPanel contentPane;
	JButton points100 = new JButton("100");
	JButton points110 = new JButton("110");
	JButton points120 = new JButton("120");
	JButton points130 = new JButton("130");
	JButton points140 = new JButton("140");
	JButton points150 = new JButton("150");
	JButton points160 = new JButton("160");
	JButton points170 = new JButton("170");
	JButton points180 = new JButton("180");
	JButton points190 = new JButton("190");
	JButton points200 = new JButton("200");
	JButton points210 = new JButton("210");
	JButton pas = new JButton("PAS");


	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public BiddingWindow() {
		setTitle("Licytacja");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(85, 107, 47));
		panel.setBounds(0, 0, 435, 341);
		contentPane.add(panel);
		
		points100.setBackground(new Color(154, 205, 50));
		points100.setForeground(new Color(85, 107, 47));
		points100.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 30));
		
		points180.setForeground(new Color(85, 107, 47));
		points180.setBackground(new Color(154, 205, 50));
		points180.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 30));
		
		points140.setForeground(new Color(85, 107, 47));
		points140.setBackground(new Color(154, 205, 50));
		points140.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 30));
		
		points110.setForeground(new Color(85, 107, 47));
		points110.setBackground(new Color(154, 205, 50));
		points110.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 30));
		
		points120.setForeground(new Color(85, 107, 47));
		points120.setBackground(new Color(154, 205, 50));
		points120.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 30));
		
		points130.setForeground(new Color(85, 107, 47));
		points130.setBackground(new Color(154, 205, 50));
		points130.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 30));
		
		points150.setForeground(new Color(85, 107, 47));
		points150.setBackground(new Color(154, 205, 50));
		points150.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 30));
		
		points160.setForeground(new Color(85, 107, 47));
		points160.setBackground(new Color(154, 205, 50));
		points160.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 30));
		
		points170.setForeground(new Color(85, 107, 47));
		points170.setBackground(new Color(154, 205, 50));
		points170.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 30));
		
		points190.setForeground(new Color(85, 107, 47));
		points190.setBackground(new Color(154, 205, 50));
		points190.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 30));
		
		points200.setForeground(new Color(85, 107, 47));
		points200.setBackground(new Color(154, 205, 50));
		points200.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 30));
		
		points210.setForeground(new Color(85, 107, 47));
		points210.setBackground(new Color(154, 205, 50));
		points210.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 30));
		
		pas.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 30));
		pas.setForeground(new Color(85, 107, 47));
		pas.setBackground(new Color(154, 205, 50));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
							.addComponent(points140, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
							.addComponent(points100, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
						.addComponent(points180, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(points110, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(points120, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(points130, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(points150, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(points160, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(points170, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(points190, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(points200, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(points210, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(178, Short.MAX_VALUE)
					.addComponent(pas, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					.addGap(167))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(points100, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addComponent(points110, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addComponent(points120, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addComponent(points130, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(points140, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addComponent(points150, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addComponent(points170, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addComponent(points160, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(points210, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addComponent(points200, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addComponent(points190, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addComponent(points180, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pas, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addGap(5))
		);
		panel.setLayout(gl_panel);
	}

}
