
import java.applet.*;
import java.awt.*;
//import javax.swing.*;

public class JavaAppletDemo extends Applet {
	/*public void paint(Graphics g) {
		g.setColor(Color.red);
		g.drawString("Hello", 50, 50);
	}*/
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Button b1,b2;
	TextField t1;
	public void init() {
		t1= new TextField("Type Here",15);
		t1.getText();
		b1 =new Button("Click");//b1 becomes the object 
		b2 =new Button("Clear");
		
		add(b1);// component type
		add(b2);// component type
		add(t1);// component type
		
	}
}
