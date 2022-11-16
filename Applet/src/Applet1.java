import java.applet.*;
import java.awt.*;
public class Applet1 extends Applet implements Runnable {
	
	static TextField t1,t2;
	Thread th1,th2;
	
	public void init() {
		add(t1=new TextField(10));
		add(t2=new TextField(10));
		 th1=new Thread(new Applet1());
		 th2=new Thread(new Applet1());
		 
			 th1.start();
		
		
			 th2.start();
		 
		 
	}
	
	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		
		int i=0,j=0;
		
		while(true) {
			//System.out.println(i);
			
			Applet1.t1.setText(String.valueOf(i));
			if(i==20)
				i=0;
			else
				i++;
			
			
		}
		
		
		/*while(true) {
			
			Applet1.t2.setText(String.valueOf(j));
			if(j==20)
				j=0;
			else
				j++;
			
		}*/
		
		
	}
}
