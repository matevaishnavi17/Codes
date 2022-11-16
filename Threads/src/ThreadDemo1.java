
public class ThreadDemo1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("i am in run() method");
	}
	
	public static void main(String [] args) {
		Thread t=new Thread(new ThreadDemo1());//object of class that implements Inteface Runnable as 
												//It has parameter type constructor Thread(Runnable obj)
												//we have pass the obj of inteface to Thread class
		t.start();							
		
	}
	

}
