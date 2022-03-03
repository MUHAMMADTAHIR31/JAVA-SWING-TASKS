import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
  class Button_Work
  {
	public static void main(String arg[])
	{
	   JFrame frame=new JFrame();
		frame.setVisible(true);	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("MY Frame");
		frame.setBounds(100,50,700,600);
		
		Container c=frame.getContentPane();
		c.setLayout(null);
		
		ImageIcon icon=new ImageIcon("logo.jpg");
		
		Font f=new Font("Arial",Font.PLAIN,25);
		
		Cursor cur=new Cursor(Cursor.HAND_CURSOR);
		
		JButton btn=new JButton();
		
		btn.setBounds(100,200,100,40);
		btn.setText("Click");
		btn.setCursor(cur);
		//btn.setBackground(Color.RED);
		//btn.setForeground(Color.YELLOW);
		
		
		c.add(btn);
	    btn.setFont(f);
		
	}  
  }
