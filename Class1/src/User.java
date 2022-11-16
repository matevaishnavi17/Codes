

public class User {
	
	final int height=5;//Initialization and declaration
	int age;//declaration
	
	public User() { //Constructor
		age=2;
		U2 u2 =new U2();
		System.out.println("Memory address of U2:"+ u2);//memory address
		u2.a=10;
		System.out.println("Value of variable in Constructor: "+ u2.a);
		
	}
	public void drive(int a) {
		System.out.println("Hello "+ a);
	}
	
	public static void main(String [] s) {
		User u =new User();
		u.drive(15);
		System.out.println(u.height);
		System.out.println(u.age);
		//MarutiCar mc = new MarutiCar();
		//InnovaCar ic = new InnovaCar();
	}
}

