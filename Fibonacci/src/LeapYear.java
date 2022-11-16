import java.applet.Applet;
import java.awt.Button;
import java.awt.Event;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYear extends Applet  {
	TextField t1,t2;
	Button b;
	int year = 1900;
    boolean leap = false;
	public void init() {
		
		add(t1=new TextField(10));
		add(b=new Button("Result"));
		add(t2=new TextField(10));

	   
		
	}
	public boolean action(Event e,Object o) {
		
		String str=t1.getText();
		Integer num=Integer.valueOf(str);
		String res;
		
			if(e.target.equals(b)) {

			     if(num%4==0)
			        t2.setText("Leap Year");
			      else
			       t2.setText("Not Leap Year");
		}
			return false;
	}
	
		
 }
	  
	

