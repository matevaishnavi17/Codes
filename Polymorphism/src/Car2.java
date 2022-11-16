

public class Car2 extends Car1 {
	public void add() {
		
	}
	public void add(int a) {
		
	}
	
	public void add(int a, double b) {
		
	}
	
	public void add( int a,String m) {
		
	}
	
	public void m1() {
		System.out.println("I am in m1() of Car2");
	}
	
	public static void main(String [] args) {
		Car2 c2= new Car2();
		c2.m1();
		Car1 c1 = new Car1();
		c1.m1();
		Car1 c3 =new Car2();
		c3.m1();
		Car1 c4 =new Car1();
		c4.b1();
	}
}


