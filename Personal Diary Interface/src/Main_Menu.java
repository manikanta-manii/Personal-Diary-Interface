import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Main_Menu  {
	
	  private static JFrame frame;
	  private static JLabel label1;
	  private static JLabel label2;
	  private static JButton Diary_button;
	  private static JButton Safe_button;
	  private static JButton Sticky_Button;
	  private static JButton Additional_Button;
	  private static ImageIcon image;
	  
Main_Menu() {
		
		
		frame=new JFrame();
		frame.setLayout(null);
		frame.setTitle("MAIN MENU OF PERSONAL DIARY");
		frame.getContentPane().setBackground(new Color(2,169,184));
		frame.setVisible(true);
		frame.setSize(570, 500);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		ForLabel();
		
	}
	static void ForLabel()
	{
		label1=new JLabel();
		label1.setText("MAIN - MENU");
		label1.setBounds(200, 0, 2000,100);
		label1.setFont(new Font("Verdana", Font.PLAIN, 30));
		label1.setForeground(new Color(0,0,139));
		frame.add(label1);
		
	    ForJButton();
		
	}
	static void ForJButton()
	{
		Diary_button=new JButton("MY DIARY");
		Safe_button=new JButton("PRIVATE SAFE");
		Sticky_Button=new JButton("STICKY NOTE");
		Additional_Button=new JButton("QUIT");
		
		Diary_button.setFocusable(false);
		Safe_button.setFocusable(false);
		Sticky_Button.setFocusable(false);
		Additional_Button.setFocusable(false);
		
		Diary_button.setBounds(75, 150, 200, 100);
		Safe_button.setBounds(75, 300, 200, 100);
		Sticky_Button.setBounds(300, 150, 200, 100);
		Additional_Button.setBounds(300, 300, 200, 100);
		
		Diary_button.setBackground(new Color(0xD8D78F));
		Safe_button.setBackground(new Color(0xD8D78F));
		Sticky_Button.setBackground(new Color(0xD8D78F));
		Additional_Button.setBackground(new Color(0xD8D78F));
		
		Safe_button.addActionListener(e->{
			ClassName cn=new ClassName();
		//new Cryptography();
		});
		Diary_button.addActionListener(e->{
			Diary.main(null);
			
		});
		Sticky_Button.addActionListener(e->{
			Sticky_note.main(null);
		//new Cryptography();
		});
		Additional_Button.addActionListener(e->{
			JOptionPane quit_message=new JOptionPane();
	           int check=quit_message.showConfirmDialog(null, "Want to go Home Page ?\n", "BACK TO HOME ", 0, 0);
			if(check==JOptionPane.OK_OPTION)
				frame.dispose();
		//new Cryptography();
		});
		
		
		frame.add(Diary_button);
		frame.add(Safe_button);
		frame.add(Sticky_Button);
		frame.add(Additional_Button);
		
	}
}
	
	