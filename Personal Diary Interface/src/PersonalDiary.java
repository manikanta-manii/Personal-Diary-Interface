import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PersonalDiary implements ActionListener {
	
	  private static JFrame frame;
	  private static JLabel label1;
	  private static JButton Login_button;
	  private static JButton Help_button;
	  private static JButton About_button;
	  private static JButton Quit_button;
	  private static ImageIcon image;
	  private static JOptionPane quit_message;
	public static void main(String[] args) {
		
		
		frame=new JFrame();
		frame.getContentPane().setLayout(null);
		frame.setTitle("HOME PAGE OF PERSONAL DIARY");
		frame.getContentPane().setBackground(new Color(2,169,184));
		frame.setVisible(true);
		frame.setSize(669, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		ForLabel();
		
	}
	static void ForLabel()
	{
		label1=new JLabel();
		label1.setText("WELCOME TO PERSONAL DIARY");
		label1.setBounds(68, 10, 2000,100);
		label1.setFont(new Font("Verdana", Font.PLAIN, 30));
		label1.setForeground(new Color(0,0,139));
		frame.getContentPane().add(label1);
		ForJButton();
		
	}
	static void ForJButton()
	{
		Login_button=new JButton("SIGN IN");
		Help_button=new JButton("HELP AND SUPPORT");
		About_button=new JButton("ABOUT");
		Quit_button=new JButton("QUIT");
		
		Login_button.setFocusable(false);
		Help_button.setFocusable(false);
		About_button.setFocusable(false);
		Quit_button.setFocusable(false);
		
		Login_button.setBounds(75, 150, 200, 100);
		Help_button.setBounds(75, 300, 200, 100);
		About_button.setBounds(359, 150, 200, 100);
		Quit_button.setBounds(359, 300, 200, 100);
		
		Login_button.setBackground(new Color(0xD8D78F));
		Help_button.setBackground(new Color(0xD8D78F));
		About_button.setBackground(new Color(0xD8D78F));
		Quit_button.setBackground(new Color(0xD8D78F));
		
		frame.getContentPane().add(Login_button);
		frame.getContentPane().add(Help_button);
		frame.getContentPane().add(About_button);
		frame.getContentPane().add(Quit_button);
		
		Login_button.addActionListener((ActionListener) new PersonalDiary());
		Quit_button.addActionListener((ActionListener) new PersonalDiary());
		About_button.addActionListener((ActionListener) new PersonalDiary());
		Help_button.addActionListener((ActionListener) new PersonalDiary());
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==Login_button)
		{
		    //frame.dispose();
		    Login_Page launch=new Login_Page();
			
		}
		if(e.getSource()==Quit_button)
		{   quit_message=new JOptionPane();
           int check=quit_message.showConfirmDialog(null, "Are You Sure ?", "Exit From Application", 0, 0);
		if(check==JOptionPane.OK_OPTION)
			frame.dispose();
		else{}
		
		}
		if(e.getSource()==About_button)
		{
			About.main(null);
		}
		if(e.getSource()==Help_button)
		{
			try {

    			if ((new File("C:\\Users\\Honna Mani\\Desktop\\help.txt")).exists()) {

    				Process p = Runtime
    				   .getRuntime()
    				   .exec("rundll32 url.dll,FileProtocolHandler C:\\Users\\Honna Mani\\Desktop\\help.txt");
    				p.waitFor();
    					
    			} else {

    				System.out.println("File is not exists");

    			}

    			//System.out.println("Done");

    	  	  } catch (Exception ex) {
    			ex.printStackTrace();
    		  }
			
		}
		
		
		
		
	}

}
