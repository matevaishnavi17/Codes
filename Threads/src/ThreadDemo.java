/*
 * Thread is superclass of ThreadDemo 
 * And Object class is superclass of Thread
 * but ideally the immediate superclass can be inherite coz multiple inheritance is not allowed
 * so we can't inhertit object class so Thread is the superclass of this class*/

public class ThreadDemo extends Thread {
	public void run() {
		System.out.println("i am in run() method");
	}
	
	public ThreadDemo() {
		
	}
	
	public static void main(String[] args) {
		ThreadDemo td=new ThreadDemo();
		td.start();//it will call the run() method and then class will behave as thread
		td.run();//this is will call run() method directly but the class will not behave as thread
	}
}
