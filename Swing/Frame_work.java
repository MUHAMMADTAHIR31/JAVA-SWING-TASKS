import javax.swing.*;
import java.awt.*;
class Frame_work
 {
      public static void main(String arg[])
    {
	  JFrame frame=new JFrame();
	  
	  frame.setVisible(true);
	  frame.setBounds(0,0,2000,1000);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setTitle("Thug Life ");
	  
	  ImageIcon icon=new ImageIcon("logo.jpg");
	  frame.setIconImage(icon.getImage());
	  
	  Container c=frame.getContentPane();
	  c.setLayout(null);
	  
	  JLabel label=new JLabel(icon);
	  JLabel label2=new JLabel("Father Name ");
	  JLabel label3=new JLabel("Class ");
	   
	   JPasswordField text=new JPasswordField();
	   JPasswordField text2=new JPasswordField();
	   JPasswordField text3=new JPasswordField();
	 
	 
	 //label.setBounds(0,0,icon.getIconWidth(),icon.getIconHeight());
	  //label.setBounds(100,100,100,50);
	  
	  label.setBounds(100,50,730,750);
	  text.setBounds(100,100,100,50);
	  
	  label2.setBounds(300,50,80,75);
	  text2.setBounds(300,100,100,50);
	  
	  label3.setBounds(500,50,80,75);
	  text3.setBounds(500,100,100,50);
	 
	  
	 // Font f=new Font("Arial",Font.PLAIN,30);
	  
	  //label.setFont(f);
	  //label2.setFont(f);
	  //label3.setFont(f);
	  
	  c.add(label);
	  c.add(label2);
	  c.add(label3);
	  
	  c.add(text);
	  c.add(text2);
	  c.add(text3);
	 
	  
	}
 }