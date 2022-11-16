import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Addition extends Applet implements ActionListener {
	Button b1;
	TextField t1,t2,t3;
	Label l1,l2;
	int x,y,z;
	
	public void init() {
		 //b1 =new Button();
		add(t1=new TextField());
		add(l1=new Label("+"));
		add(t2=new TextField());
		add(l2=new Label("="));
		add(t3=new TextField());
		add(b1=new Button("Add"));
		b1.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			x=Integer.parseInt(t1.getText());
			y=Integer.parseInt(t2.getText());
			z=x+y;
			t3.setText(String.valueOf(z));
		}
	}
	

}
