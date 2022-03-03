import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
  
 class ComboBox_2
 {
	static Container c;
    static JFrame frame;
    static JLabel msg;
    static JButton bt;
	static JComboBox c1;
	
	public static void main(String arg[])
	{
		frame=new JFrame("My Combo");
		frame.setVisible(true);
		frame.setBounds(50,50,900,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c=frame.getContentPane();
		c.setLayout(null);
		
		String arr[]={"A","B","C","D"};
		
		c1=new JComboBox(arr);
		c1.setBounds(100,200,100,50);
		c1.setEditable(true);
		c.add(c1);
		
		JCheckBox ch=new JCheckBox("Yes");
		ch.setBounds(250,200,50,50);
		c.add(ch);
		
		JRadioButton r1=new JRadioButton("Male");
		JRadioButton r2=new JRadioButton("FeMale");
		r1.setBounds(100,300,100,50);
		r2.setBounds(250,300,100,50);
		c.add(r1);
		c.add(r2);
		
		ButtonGroup r=new ButtonGroup();
		r.add(r1);
		r.add(r2);
		
		bt=new JButton("OK");
		bt.setBounds(180,100,80,60);
		c.add(bt);
		
		bt.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{
		  btEvent(e);
		}	
		});
		
		msg=new JLabel("Msg");
		msg.setBounds(100,380,70,50);
		c.add(msg);		
	} 
	/*static void btEvent(ActionEvent e)
	{
		msg.setText(Integer.toString(c1.getSelectedIndex()));	
	}*/
	
	static void  btEvent(ActionEvent e)
	{
		String item=(String)c1.getSelectedItem();
		msg.setText(item);
	} 
 }