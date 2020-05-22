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

public class BindingWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public BindingWindow() {
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
		
		JButton btnNewButton = new JButton("100");
		btnNewButton.setBackground(new Color(154, 205, 50));
		btnNewButton.setForeground(new Color(85, 107, 47));
		btnNewButton.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 30));
		
		JButton btnNewButton_1 = new JButton("180");
		btnNewButton_1.setForeground(new Color(85, 107, 47));
		btnNewButton_1.setBackground(new Color(154, 205, 50));
		btnNewButton_1.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 30));
		
		JButton btnNewButton_2 = new JButton("140");
		btnNewButton_2.setForeground(new Color(85, 107, 47));
		btnNewButton_2.setBackground(new Color(154, 205, 50));
		btnNewButton_2.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 30));
		
		JButton btnNewButton_3 = new JButton("110");
		btnNewButton_3.setForeground(new Color(85, 107, 47));
		btnNewButton_3.setBackground(new Color(154, 205, 50));
		btnNewButton_3.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 30));
		
		JButton btnNewButton_4 = new JButton("120");
		btnNewButton_4.setForeground(new Color(85, 107, 47));
		btnNewButton_4.setBackground(new Color(154, 205, 50));
		btnNewButton_4.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 30));
		
		JButton btnNewButton_5 = new JButton("130");
		btnNewButton_5.setForeground(new Color(85, 107, 47));
		btnNewButton_5.setBackground(new Color(154, 205, 50));
		btnNewButton_5.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 30));
		
		JButton btnNewButton_6 = new JButton("150");
		btnNewButton_6.setForeground(new Color(85, 107, 47));
		btnNewButton_6.setBackground(new Color(154, 205, 50));
		btnNewButton_6.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 30));
		
		JButton btnNewButton_7 = new JButton("160");
		btnNewButton_7.setForeground(new Color(85, 107, 47));
		btnNewButton_7.setBackground(new Color(154, 205, 50));
		btnNewButton_7.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 30));
		
		JButton btnNewButton_8 = new JButton("170");
		btnNewButton_8.setForeground(new Color(85, 107, 47));
		btnNewButton_8.setBackground(new Color(154, 205, 50));
		btnNewButton_8.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 30));
		
		JButton btnNewButton_9 = new JButton("190");
		btnNewButton_9.setForeground(new Color(85, 107, 47));
		btnNewButton_9.setBackground(new Color(154, 205, 50));
		btnNewButton_9.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 30));
		
		JButton btnNewButton_10 = new JButton("200");
		btnNewButton_10.setForeground(new Color(85, 107, 47));
		btnNewButton_10.setBackground(new Color(154, 205, 50));
		btnNewButton_10.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 30));
		
		JButton btnNewButton_11 = new JButton("210");
		btnNewButton_11.setForeground(new Color(85, 107, 47));
		btnNewButton_11.setBackground(new Color(154, 205, 50));
		btnNewButton_11.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 30));
		
		JButton btnNewButton_12 = new JButton("PAS");
		btnNewButton_12.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 30));
		btnNewButton_12.setForeground(new Color(85, 107, 47));
		btnNewButton_12.setBackground(new Color(154, 205, 50));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
							.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnNewButton_5, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(btnNewButton_6, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnNewButton_7, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnNewButton_8, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnNewButton_9, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_10, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(btnNewButton_11, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(178, Short.MAX_VALUE)
					.addComponent(btnNewButton_12, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					.addGap(167))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_5, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_6, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_8, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_7, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_11, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_10, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_9, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_12, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addGap(5))
		);
		panel.setLayout(gl_panel);
	}

}
