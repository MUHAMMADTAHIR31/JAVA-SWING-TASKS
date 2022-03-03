import javax.swing.*;
import java.awt.*;
  class Frame_new
  {
    public static void main(String arg[])
	{
	  JFrame frame=new JFrame();
	  
	  frame.setVisible(true);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setBounds(100,200,1000,500);
	  frame.setTitle("My Frame");
	  
	  
	  Container c=frame.getContentPane();
	  c.setLayout(null);
	  c.setBackground(Color.RED);
	  
	  JLabel Label=new JLabel();
	  JTextField text=new JTextField();
	  Label.setBounds(50,200,50,50);
	  text.setBounds(100,200,50,50);
	  Label.setText(" Frame ");
	  c.add(Label);
	  c.add(text);
      
	
	}
  }