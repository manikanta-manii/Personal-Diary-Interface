

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class About {
	public static void main(String[] args) {
		show1();
	}
	public static void show1() {
		JFrame frame = new JFrame("About        --Manikanta p");
		//frame.getContentPane().setForeground(new Color(102, 205, 170));
		frame.getContentPane().setBackground(new Color(204, 255, 255));
		frame.setBounds(100,100,870,638);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Created by MANIKANTA P");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(25, 33, 623, 110);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("4C, 1NH20CS125");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(35, 153, 623, 110);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("19CSE48, MINI PROJECT in JAVA");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(25, 284, 623, 110);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("karna8722@gmail.com, 9019785436");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3.setBounds(25, 404, 623, 110);
		frame.getContentPane().add(lblNewLabel_3);
		frame.setVisible(true);
	}

}