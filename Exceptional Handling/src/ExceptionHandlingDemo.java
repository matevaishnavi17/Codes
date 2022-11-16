
public class ExceptionHandlingDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Exception");
		try {
			Integer i=new Integer("a");
		}
		catch(Exception e) {
			System.out.println("Exception handled"); 
		}
		
	}

}
