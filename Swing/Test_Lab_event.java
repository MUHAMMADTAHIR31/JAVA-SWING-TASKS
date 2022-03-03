import java.awt.event.*;
import java.awt.*;
  class Test_Lab_event implements WindowsListener
  {
	Frame f = new Frame();
    Test_Lab_event()
	{
		f.addWindowListener(this)
		f.setVisible(true);
	}
      	
  }
