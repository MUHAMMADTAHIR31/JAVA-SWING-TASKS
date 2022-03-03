import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener
    {
	 
	 ImageIcon icon=new ImageIcon("logo.jpg");
	 
	 JLabel well=new JLabel("Life Cycle Thugs Group");
	 
	 JLabel pic=new JLabel(icon);
	 
	 JLabel Name=new JLabel("User Name");
	 JLabel Password=new JLabel("Password");
	 
	 JTextField user=new JTextField();
	 JPasswordField pass=new JPasswordField();
	 
	 JButton login=new JButton("Login");
	 
	 Container c;
  
  	 Font f=new Font("Arial",Font.PLAIN,18);
  	 Font f1=new Font("Arial",Font.BOLD,24);
	 
	 Cursor cur=new Cursor(Cursor.HAND_CURSOR);

	 
	MyFrame()
	{
		c=this.getContentPane();
		c.setLayout(null);
		
		well.setBounds(40,0,450,150);
		pic.setBounds(400,20,icon.getIconWidth(),icon.getIconHeight());
		
		Name.setBounds(50,110,100,50);
		user.setBounds(150,110,100,40);
		
		Password.setBounds(50,200,100,50);
		pass.setBounds(150,200,100,40);
		
		login.setBounds(100,300,100,50);
		
		c.add(pic);
		
		c.add(well);
		well.setFont(f1);
		
		c.add(Name);
		Name.setFont(f);
		
		c.add(user);
		user.setFont(f);
		
		c.add(pass);
		pass.setFont(f);
		
		c.add(Password);
		Password.setFont(f);
		
		c.add(login);
		login.setCursor(cur);
		login.setFont(f);
		
		login.addActionListener(this);
	
	}//Constructor
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==login)
		{
			String username=user.getText();
			String pasword=pass.getText();
			
			if(username.equals("Tahir") && pasword.equals("123"))
			{
				JOptionPane.showMessageDialog(c,"Welll Come");
				c.setBackground(Color.BLACK);
			}//if
			else
			{
			  JOptionPane.showMessageDialog(c,"Wrong UserName or Password");
			  c.setBackground(Color.BLUE);
			}//else
	
		}//button if
		
	}//ActionEvent
	
 }//extends class
 
 class Button_Form
 {
	public static void main(String arg[])
	{
		
		MyFrame frame=new MyFrame();
		frame.setBounds(100,50,1100,800);
		frame.setVisible(true);
		frame.setTitle("Serve Humanity");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}//public
 }//main class