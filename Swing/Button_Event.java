import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
  
  class MyFrame extends JFrame
 {
	JButton btn=new JButton("Button 1");
	JButton btn2=new JButton("Button 2");
	JButton btn3=new JButton("Button 3");
	JButton btn4=new JButton("Button 4");
	JButton btn5=new JButton("Button 5");
	JButton btn6=new JButton("Button 6");
	
    Container c;
	 
	MyFrame()
	{
		c=this.getContentPane();
		c.setLayout(null);
		
		btn.setBounds(100,10,100,40);
		btn2.setBounds(100,100,100,40);
		btn3.setBounds(100,200,100,40);
		btn4.setBounds(100,300,100,40);
		btn5.setBounds(100,400,100,40);
		btn6.setBounds(100,500,100,40);
		
		c.add(btn);
		c.add(btn2);
		c.add(btn3);
		c.add(btn4);
		c.add(btn5);
		c.add(btn6);
	}
	
  }
   class Lab_10_1{
	  
	public static void main(String arg[])
	{
	   MyFrame frame=new MyFrame();
	   frame.setVisible(true);
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.setSize(600,600);
	   frame.setLocationRelativeTo(null);
	}  
  }  