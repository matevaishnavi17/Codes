
import java.applet.Applet;
import java.awt.Button;
//import java.awt.Event;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

	@SuppressWarnings("serial")
public class AppletDemo  extends Applet implements ActionListener{
	
	
		Button button1, button2;
		TextField t1;
		public void init() {
			
			button1 = new Button("Click");
			add(button1);
			button1.addActionListener(this);

			button2 = new Button("Clear");
			add(button2);
			button2.addActionListener(this);
			t1 =new TextField(15);
			add(t1);
			//t1.addActionListener(this);
		}

		

		

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//String str = e.getActionCommand();
			//t1.setText("Hello World");
			if (e.getSource() == button1) {
				t1.setText("Hello World");
			}
			else {
					t1.setText(" ");
				}
		}
			//logic 2
			/*public boolean action(Event e, Object o) {
				if(e.target.equals(button1)) 
					t1.setText("Hello");
				if(e.target.equals(button2))
					t1.setText("");
				return false;
				
				
			}*/
			
		

		public static void main(String []args) {
			
		}
			
		
	}

