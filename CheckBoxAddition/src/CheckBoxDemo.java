
import java.applet.*;
import java.awt.*;

public class CheckBoxDemo extends Applet {
	
	TextField t;
	Checkbox c1,c2,c3,c4;
	//Label l1;
	int sum;
	public void init() {
		add(c1=new Checkbox("1"));
		add(c2=new Checkbox("2"));
		add(c3=new Checkbox("3"));
		add(c4=new Checkbox("4"));
		
		TextField t1=new TextField(10);
		add(t1);
	}
	
	public boolean action(Event e, Object o) {
		int sum=0;
		if(c1.getState()) {
			sum=sum+1;
		}	
		if(c2.getState()==true) {
			sum=sum+2;
		}	
		if(c3.getState()==true) {
			sum=sum+3;
		}	
		if(c4.getState()==true) {
			sum=sum+4;
		}
			
		t.setText(String.valueOf(sum));
		
		return false;
		
	}
	
}