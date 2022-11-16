
public class Car1 {
	protected void b1() {
		System.out.println("Method b1");
	}
	public void m1() {
		System.out.println("I am in m1() of Car1");
	}
	
	public void m2() {
		System.out.println("I am in m2() of Car1");
	}
	
	public void m3() {
		System.out.println("I am in m3() of Car1");
	}
	
public static void main(String [] args) {
	Car1 c1= new Car1();
	c1.b1();
}
}
