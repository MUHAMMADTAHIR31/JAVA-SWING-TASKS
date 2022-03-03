import javax.swing.*;
import java.awt.*;
 class My_Frame
  {
	public static void main(String arg[])
	{
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(0,0,1300,700);
		
		ImageIcon icon=new ImageIcon("logo1.png");
		frame.setIconImage(icon.getImage());
		
		Container c=frame.getContentPane();
		
		JLabel label1=new JLabel("Name");
		JLabel label2=new JLabel("Father");
		JLabel label3=new JLabel("Class");
		JLabel label4=new JLabel("D.O.B");
		JLabel label5=new JLabel("Work");
		JLabel label6=new JLabel("By : Mohammad Tahir 18CS31");
		JLabel image=new JLabel(icon);
		 Font f=new Font("Arial",Font.BOLD,17);
	     label6.setFont(f);
		 
		c.add(label1);c.add(label2);c.add(label3);
		c.add(label4);c.add(label5);c.add(label6);
		c.add(image);
		
		JTextField text1=new JTextField();
		JTextField text2=new JTextField();
		JTextField text3=new JTextField();
		JTextField text4=new JTextField();
		JTextField text5=new JTextField();
		
		c.add(text1);c.add(text2);
		c.add(text3);c.add(text4);c.add(text5);
		
		frame.setLayout(null);
		
		
		label1.setBounds(100,100,75,30);  text1.setBounds(200,100,100,35);
		label2.setBounds(100,200,75,30) ; text2.setBounds(200,200,100,35);
		label3.setBounds(100,300,75,30);  text3.setBounds(200,300,100,35);
		label4.setBounds(100,400,75,30);  text4.setBounds(200,400,100,35);
		label5.setBounds(100,500,75,30);  text5.setBounds(200,500,100,35);
        label6.setBounds(600,500,250,70);
		
		image.setBounds(600,50,icon.getIconWidth(),icon.getIconHeight());
	
	}  
  }
