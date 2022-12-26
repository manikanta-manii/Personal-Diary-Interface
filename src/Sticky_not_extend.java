import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Sticky_not_extend {
	private static JTextField textField;
	private static final JTextField textField_1 = new JTextField();
	public static int y=0;
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("STICKY NOTE");
		
		frame.getContentPane().setForeground(new Color(102, 205, 170));
		frame.getContentPane().setBackground(new Color(255, 255, 0));
		frame.setBounds(100,100,455,483);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setLocation(y,0);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textArea.setBackground(new Color(255, 215, 0));
		textArea.setBounds(10, 44, 421, 392);
		textArea.setLineWrap(true);
		frame.getContentPane().add(textArea);
		
		JButton button = new JButton("+");
		button.setBackground(new Color(210, 180, 140));
		button.setFocusable(false);
		button.setFont(new Font("Tahoma", Font.BOLD, 21));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setLocation(y+=200, 0);
				Sticky_note.main(args);
			}
		});
		button.setBounds(334, 12, 85, 21);
		frame.getContentPane().add(button);
		frame.setVisible(true);
		

	}
}
