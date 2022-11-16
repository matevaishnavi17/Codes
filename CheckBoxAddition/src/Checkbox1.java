import java.applet.Applet;
import java.awt.*;
import java.awt.Event;

public class Checkbox1 extends Applet{
	
	Checkbox c1;
	Checkbox c2;
	Checkbox c3;
	Checkbox c4;
	TextField t1;
	int sum;
	
	public void init() {
		
		c1=new Checkbox("1");
		c2=new Checkbox("2");
		c3=new Checkbox("3");
		c4=new Checkbox("4");
		t1=new TextField(10);
		
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		
		add(t1);
		
	}
	public boolean action(Event e,Object o) {
		
		int sum =0;
		
		if (c1.getState()) {
			
			sum +=1;
			
		}
		if (c2.getState()==true) {
			
			sum +=2;
			
		}
		if (c3.getState()==true) {
			
			sum +=3;
			
		}
		if (c4.getState()==true) {
			
			sum +=4;
			
		}
		//if (e.target.equals(b1)) {	
			String str =String.valueOf(sum);
			t1.setText(str);
			
		
		
		return false;
	}
	
	
	

}

