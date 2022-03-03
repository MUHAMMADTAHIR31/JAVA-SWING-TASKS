import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Frame_Foam ///Work In Progress
{
	static Container c;
	static JTextField name_tf;
	static JTextField mobile_tf;
	static JComboBox day;
	static JComboBox month;
	static JComboBox year;
	static JCheckBox term;
	static JTextArea output;
	static JTextArea add_t;
	static JRadioButton male;
	static JRadioButton female;
	static JButton submit;
	static ButtonGroup gender;
	
   public static void main(String arg[]){
      JFrame frame=new JFrame("Registion Foam");
	  frame.setVisible(true);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setBounds(50,50,750,500);
	  
	  
	  c=frame.getContentPane();
	  c.setLayout(null);
	  
	  JLabel name_label=new JLabel("Name");
	  name_label.setBounds(50,50,60,30);
	  c.add(name_label);
	  
	  JLabel mobile_label=new JLabel("Mobile");
	  mobile_label.setBounds(50,100,60,30);
	  c.add(mobile_label);
	  
	  JLabel dob_label=new JLabel("DOB");
	  dob_label.setBounds(50,150,60,30);
	  c.add(dob_label);
	  
	  JLabel gender_label=new JLabel("Gender");
	  gender_label.setBounds(50,200,60,30);
	  c.add(gender_label);
	  
	  JLabel add_label=new JLabel("Address");
	  add_label.setBounds(50,250,60,30);
	  c.add(add_label);
	  
	  name_tf=new JTextField();
	  name_tf.setBounds(150,50,100,25);
	  c.add(name_tf);
	  
	  mobile_tf=new JTextField();
	  mobile_tf.setBounds(150,100,100,25);
	  c.add(mobile_tf);
	  
	  String[] day_arr=new String[31];
	  
	  for(int i=1; i<=31; i++)
	    {
		 day_arr[i-1]=Integer.toString(i);
		}
		day=new JComboBox(day_arr);
		day.setBounds(150,150,50,25);
		c.add(day);
		
	  String[] month_arr={"Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};
		
		month=new JComboBox(month_arr);
		month.setBounds(220,150,100,25);
		c.add(month);
		
	   String[] year_arr=new String[70];
	  for(int i=1951; i<=2020; i++)
	    {
		 year_arr[i-1951]=Integer.toString(i);
		}
		year=new JComboBox(year_arr);
		year.setBounds(340,150,100,25);
		c.add(year);
		
		male=new JRadioButton("Male");
		male.setBounds(150,200,80,30);
		c.add(male);
		
		female=new JRadioButton("Female");
		female.setBounds(250,200,80,30);
		c.add(female);
		
	    gender=new ButtonGroup();
		gender.add(male);
		gender.add(female);
		
		add_t=new JTextArea();
		add_t.setBounds(150,250,300,50);
		c.add(add_t);
		
		term=new JCheckBox("I accept all Terms and Condition");
		term.setBounds(50,320,250,25);
		c.add(term);
		
		submit=new JButton("Submit");
		submit.setBounds(100,355,80,40);
		c.add(submit);
		
		output=new JTextArea();
		output.setBounds(530,10,280,260);
		c.add(output);
		
		ImageIcon icon=new ImageIcon("dev.jpeg");
       
		JLabel image=new JLabel(icon);
		image.setBounds(500,250,icon.getIconWidth(),icon.getIconHeight());
		c.add(image); 
		
		c.setBackground(Color.orange);
		
		Font f=new Font("Arial",Font.BOLD,17);
		output.setFont(f);
		
		submit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				submit_action(event);
			}
		});// new object
		
   }//public class
   
   public static void submit_action(ActionEvent event )
   {
	if(term.isSelected()==true)
	{
		
		String name=name_tf.getText();
		String mobile=mobile_tf.getText();
		String day_name=(String)day.getSelectedItem();
		String month_name=(String)month.getSelectedItem();
		String year_name=(String)year.getSelectedItem();
		String gen="Male";
		if(female.isSelected()==true)
			gen="Female";
		String address=add_t.getText();
		
		output.setText("Name "+name+"\nMobile "+mobile+"\nD.O.B"+day_name+" "+month_name+" "+year_name+
		"\nGender "+gender+"\nAddress  "+address);
		
	}
	else
	{
		output.setText("Please Accept Terms And Condition");
	}
   }
}