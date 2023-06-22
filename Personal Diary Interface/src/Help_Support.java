

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class Help_Support {
	public static void main(String[] args) {
		show1();
	}
	public static void show1() {
JFrame frame = new JFrame("STICKY NOTE");
		
		frame.getContentPane().setForeground(new Color(102, 205, 170));
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.setBounds(100,100,895,766);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 10, 849, 56);
		frame.getContentPane().add(lblNewLabel);
		frame.setResizable(false);
		frame.setVisible(true);

	}
}