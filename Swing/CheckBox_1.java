import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
  class CheckBox_1
  {
    public static void main(String arg[])
	{
	   JFrame frame=new JFrame("My Frame");
	   
	   frame.setVisible(true);
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.setBounds(50,50,800,500);
	   
	   Container c=frame.getContentPane();
	   c.setLayout(null);
	   
	   JCheckBox cb=new JCheckBox("Ok");
	   cb.setBounds(50,100,100,100);
	   
	   Font f=new Font("Arial",Font.PLAIN,17);
	   cb.setFont(f);
	   
	   //cb.setSelected(true);
	   cb.setEnabled(false);
	   c.add(cb);
	   
	}
  }