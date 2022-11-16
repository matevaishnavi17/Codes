package intefaceProgram;


public class ShowCar implements Car {

	
	public static void main(String[] args) {
		
		ShowCar showCar = new ShowCar();//instance of Class
		showCar.m1();//called class method
		
		ShowCar.MyInteface(new Car() {//inteface method
		@Override
		public void m1()
		{
			System.out.println("Inteface Method m1()");
		}
	});
		
		
	}

	public static void MyInteface(Car c) {
		c.m1();
	}
	

	public void m1() {
		//TODO Auto-generated method stub
		System.out.println("Class Method m1()");
	}

}
