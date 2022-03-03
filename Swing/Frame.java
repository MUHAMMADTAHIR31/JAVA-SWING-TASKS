import javax.swing.*;
import java.awt.*;
class Frame
   {
	 public static void main(String arg[])
	{
		JFrame frame=new JFrame();
		
		frame.setVisible(true); //Show
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Close 
		
		frame.setBounds(100,100,1000,500);//
		
		frame.setTitle("My Frame");//Label
		
		ImageIcon icon=new ImageIcon("logo.jpg");
		frame.setIconImage(icon.getImage());
		
		frame.setResizable(false);
		
		Container c = frame.getContentPane();
		c.setBackground(Color.RED);
	
	}//public 
	} //class 