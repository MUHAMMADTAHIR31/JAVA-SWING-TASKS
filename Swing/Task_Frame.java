import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
  class MyFrame extends JFrame implements ActionListener
  {
	JButton Save=new JButton("Save");  
	JButton Search=new JButton("Search");  
	JButton Exit=new JButton("Exit");  
	
	JLabel Name=new JLabel("Name");
	JLabel Father=new JLabel("Father Name");
	JLabel Caste=new JLabel("Caste");
	JLabel Roll=new JLabel("Roll Number");
	JLabel Work=new JLabel("Work");
	
	
    JTextField name=new JTextField();
    JTextField father=new JTextField();
    JTextField caste=new JTextField();
    JTextField roll=new JTextField();
    JTextField work=new JTextField();
	
	Font f=new Font("Arial",Font.PLAIN,17);
	
	ImageIcon icon=new ImageIcon("logo.jpg");
	
	Cursor cur=new Cursor(Cursor.HAND_CURSOR);
	
	Cursor cur1=new Cursor(Cursor.WAIT_CURSOR);
	
	JLabel image=new JLabel(icon);

	Container c;
	
	MyFrame()
	{
		c=this.getContentPane();
		c.setLayout(null);
		
		Name.setBounds(100,40,80,50);
		name.setBounds(100,80,80,50);
		
	    Father.setBounds(250,40,100,50);
		father.setBounds(250,80,80,50);
		
		Caste.setBounds(100,120,80,50);
		caste.setBounds(100,170,80,50);
		
		Roll.setBounds(250,120,100,50);
		roll.setBounds(250,170,80,50);
		
		Work.setBounds(100,230,80,50);
		work.setBounds(150,230,80,50);
		
		image.setBounds(500,100,icon.getIconWidth(),icon.getIconHeight());
		
		Exit.setBounds(100,500,80,50);
		Save.setBounds(200,500,80,50);
		Search.setBounds(300,500,80,50);
		
		c.add(Name);c.add(name);
		c.add(Father);c.add(father);
		c.add(caste);c.add(Caste);
		c.add(Work);c.add(work);
		c.add(Roll);c.add(roll);
		c.add(image);
		
		Name.setFont(f);
		name.setFont(f);
		
		Father.setFont(f);
		father.setFont(f);
		
		roll.setFont(f);
		Roll.setFont(f);
		
		Caste.setFont(f);
		caste.setFont(f);
		
		work.setFont(f);
		Work.setFont(f);
		
		c.add(Exit);
		Exit.setCursor(cur);
		
		c.add(Search);
		Search.setCursor(cur);
		
		c.add(Save);
		Save.setCursor(cur);
		
		
		Exit.addActionListener(this);
		Save.addActionListener(this);
		Search.addActionListener(this);
	
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==Exit)
			System.exit(0);
		if(e.getSource()==Search)
			Search.setCursor(cur1);
			c.setBackground(Color.RED);
		if(e.getSource()==Save)
			JOptionPane.showMessageDialog(c,"Thanks");
	}
  }
  class Task_Frame
  {
	public static void main(String arg[])
	{
		MyFrame frame=new MyFrame();
		
		frame.setVisible(true);
		frame.setTitle("My Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(0,0,1200,700);
		
	}  
  }