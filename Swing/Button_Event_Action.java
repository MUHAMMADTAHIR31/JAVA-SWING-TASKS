import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyFrame extends JFrame implements ActionListener
{
	JButton btn=new JButton("BLACK");
	JButton btn2=new JButton("BLUE");
	JButton btn3=new JButton("RED");
	
	Container c;
	
	MyFrame(){
		
		c=this.getContentPane();
		c.setLayout(null);
		
		btn.setBounds(100,20,100,50);
		btn2.setBounds(300,20,100,50);
		btn3.setBounds(500,20,100,50);
		
		c.add(btn);
		c.add(btn2);
		c.add(btn3);
		
		btn.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btn)
			//c.setBackground(Color.BLACK);
		
		if(e.getSource()==btn2)
			c.setBackground(Color.BLUE);
		
		if(e.getSource()==btn3)
			c.setBackground(Color.RED);
	} 
}
class Button_Event_Action
{
	public static void main(String arg[])
	{
		MyFrame frame=new MyFrame();
		
		frame.setBounds(50,10,700,500);
		frame.setVisible(true);
		frame.setTitle("My Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
