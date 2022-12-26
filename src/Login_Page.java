import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login_Page {

	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JButton fbutton;

	private static JFrame frame;
	private static JPanel panel;
	private static JOptionPane message;
	
	
	Login_Page()
	{
		panel =new JPanel();
		panel.setLayout(null);
		
		frame=new JFrame();
		
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    frame.setLocationRelativeTo(null);
	    frame.setResizable(false);
	    frame.setTitle("Login System");
	    frame.add(panel);
	    userLabel=new JLabel("USER ID :");
	    userLabel.setBounds(10, 20, 80, 30);
	    panel.add(userLabel);
	    
	    userText=new JTextField(2);
	    userText.setBounds(100, 20, 165, 25);
	    panel.add(userText);
	    
	    passwordLabel=new JLabel("PASSWORD :");
	    passwordLabel.setBounds(10, 50, 80, 25);
	    panel.add(passwordLabel);
	    
	    passwordText=new JPasswordField();
	    passwordText.setBounds(100, 50, 165, 25);
	    panel.add(passwordText);
	    
	    button =new JButton("Log In");
	    button.setBounds(100,80,80,25);
	    button.setFocusable(false);
	    button.addActionListener( e->{String user=userText.getText();
		String password=passwordText.getText();
		if(user.equals("Mani")&& password.equals("1234"))
		{
			
			
			message=new JOptionPane();
			message.showMessageDialog(null, "LOGIN SUCCESSFULL", "", JOptionPane.INFORMATION_MESSAGE);
			frame.dispose();
			Main_Menu welcomePage=new Main_Menu();
			
		}
		else if(user.equals("")&& password.equals(""))
		{
		
			message.showMessageDialog(null, "Null Entry ", "", JOptionPane.WARNING_MESSAGE);
			
			
		}
		
		else
		{   message.showMessageDialog(null, "Login Failed \nTry Again","", JOptionPane.OK_OPTION);
		    userText.setText("");
		    passwordText.setText("");
			
		}});
	    panel.add(button);
	    
	    fbutton =new JButton("RESET");
	    fbutton.setBounds(180,80,80,25);
	    fbutton.setFocusable(false);
	    fbutton.addActionListener( e->{
		test();} );
	    
	    panel.add(fbutton);
	   
	    frame.setVisible(true);
	    
	}
	
	void test()
	{  userText.setText("");
	   passwordText.setText("");
	
		
	}



}
		
		
