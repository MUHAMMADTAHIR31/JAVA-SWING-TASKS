import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class MyFrame extends JFrame implements ActionListener
 {
	JButton about=new JButton("About");
	JButton Exit=new JButton("Exit");
	
	ImageIcon icon=new ImageIcon("dev.jpeg");
	JLabel icon_pic=new JLabel(icon);

    JLabel num1=new JLabel("NUM 1");
    JLabel num2=new JLabel("NUM 2");
	
	JTextField num1_tf=new JTextField();
	JTextField num2_tf=new JTextField();
	
	JLabel ans=new JLabel("Anwser");
	JTextField ans_tf=new JTextField();
	
	JLabel msg=new JLabel("Msg");

	JButton add=new JButton("Addition");
	JButton sub=new JButton("Subtract");
	JButton mult=new JButton("Multiply");
	JButton divi=new JButton("Divid");
	
	Container c;
	
	MyFrame()
	{
		c=this.getContentPane();
		c.setLayout(null);
		
		num1.setBounds(50,50,70,25);
		c.add(num1);
		num2.setBounds(50,90,70,25);
		c.add(num2);
		
		num1_tf.setBounds(130,50,100,25);
		c.add(num1_tf);
		num2_tf.setBounds(130,90,100,25);
		c.add(num2_tf);
		
		add.setBounds(20,130,90,35);
		c.add(add);
		sub.setBounds(110,130,90,35);
		c.add(sub);
		mult.setBounds(200,130,90,35);
		c.add(mult);
		divi.setBounds(290,130,90,35);
		c.add(divi);
		
		ans.setBounds(50,180,70,35);
		c.add(ans);
		ans_tf.setBounds(120,180,90,25);
	    c.add(ans_tf);
		
		msg.setBounds(50,215,300,25);
		c.add(msg);
		
		about.setBounds(70,300,90,40);
		c.add(about);
		
		Exit.setBounds(150,300,90,40);
		c.add(Exit);
		
		icon_pic.setBounds(450,30,500,600);
		c.add(icon_pic);
		
		add.addActionListener(this);
		sub.addActionListener(this);
		divi.addActionListener(this);
		mult.addActionListener(this);
		
		about.addActionListener(this);
		Exit.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ex)
	{
		String s1=num1_tf.getText();
		String s2=num2_tf.getText();
		
		float n1=0;
		float n2=0;
		
		float an=0;
		
		String ans_t;
		
		if(ex.getSource()==add)
		{
		try{
			n1=Float.parseFloat(s1);
			n2=Float.parseFloat(s2);
		}catch (Exception e)
		{
		  msg.setText("Please Enter Valid Number");	
		}//Exception
			
		an=n1+n2;
		ans_t=Float.toString(an);
	    
		ans_tf.setText(ans_t);
		}//add if
		
		if(ex.getSource()==sub)
		{
		try{
			n1=Float.parseFloat(s1);
			n2=Float.parseFloat(s2);
		}catch (Exception e)
		{
		  msg.setText("Please Enter Valid Number");	
		}//Exception
			
		an=n1-n2;
		ans_t=Float.toString(an);
	    
		ans_tf.setText(ans_t);
		}//sub if
		
			if(ex.getSource()==mult)
		{
		try{
			n1=Float.parseFloat(s1);
			n2=Float.parseFloat(s2);
		}catch (Exception e)
		{
		  msg.setText("Please Enter Valid Number");	
		}//Exception
		
		an=n1*n2;
		ans_t=Float.toString(an);
	    
		ans_tf.setText(ans_t);
		}//mult if

	    if(ex.getSource()==divi)
		{
		try{
			n1=Float.parseFloat(s1);
			n2=Float.parseFloat(s2);
		}catch (Exception e)
		{
		  msg.setText("Please Enter Valid Number");	
		}//Exception
		
    	an=n1/n2;
		ans_t=Float.toString(an);
	    
		ans_tf.setText(ans_t);
		}//divi if	
		if(ex.getSource()==about)
			JOptionPane.showMessageDialog(c,"Muhammad Tahir"+"\n"+"!8CS31"+"\n"+"Life Cycle Thugs");
		
		if(ex.getSource()==Exit)
		System.exit(0);
	}
	
 } 
 class Calc
 {
	public static void  main(String arg[])
	{
		MyFrame frame=new MyFrame();
		frame.show();
		frame.setTitle("Simple Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(50,50,900,600);
	} 
 }