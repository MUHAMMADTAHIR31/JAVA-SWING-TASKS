import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
  class MyFrame extends JFrame implements ActionListener
  {
     JButton black=new JButton("BLACK");
     JButton red=new JButton("RED");
     JButton blue=new JButton("BLUE");
	 
	 JCheckBox c1=new JCheckBox("Yes");
	 JCheckBox c2=new JCheckBox("No");
	 
	 ButtonGroup check=new ButtonGroup();
	 
	 Font f=new Font("Arial",Font.PLAIN,17);
	 
	 Cursor car=new Cursor(Cursor.HAND_CURSOR);
	 
	 Container c;
	 
	MyFrame()
	{
		
		c=this.getContentPane();
		c.setLayout(null);
		
		black.setBounds(100,200,100,50);
		red.setBounds(200,200,100,50);
		blue.setBounds(300,200,100,50);
		
		c1.setBounds(100,250,50,50);
		c2.setBounds(150,250,50,50);
		
		check.add(c1);
		check.add(c2);
		
		c.add(black);
		c.add(red);
		c.add(blue);
		c.add(c1);
		c.add(c2);
		
		black.addActionListener(this);
		blue.addActionListener(this);
		red.addActionListener(this);
		
		
	} 
	 public void actionPerformed(ActionEvent e)
	    {
		  if(e.getSource()==black)
		    {
     		 c.setBackground(Color.BLACK);	
			}
		   if(e.getSource()==red)
		    {
     		 c.setBackground(Color.RED);	
			}
		  if(e.getSource()==blue)
		    {
     		 c.setBackground(Color.BLUE);	
		    } 
	   	}
    }
	class CheckBox
	{
		public static void main(String arg[])
		{
			MyFrame frame=new  MyFrame();
			frame.setVisible(true);
			frame.setBounds(50,50,900,400);
			frame.setTitle("Changer");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
	}