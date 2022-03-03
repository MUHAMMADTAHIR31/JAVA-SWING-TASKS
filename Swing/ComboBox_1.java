import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
  class ComboBox_1
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
	   
	   String arr[]={"A","B","C","D","E"};
	   JComboBox c2=new JComboBox(arr);
	   c2.setBounds(100,200,100,50);
	   
	   c2.setEditable(true);
	   c2.setSelectedIndex(2);
	   c2.setSelectedItem("E");
	   c2.addItem("W");
	    c2.removeItem("D");
	   c.revalidate();
	   c.add(cb);
	   c.add(c2);
	   
	}
  }