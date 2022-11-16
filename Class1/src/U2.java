
public class U2 {
	 static User u;
	 int a;
		public U2() {
			
		}
		public static void main(String[] s) {
			User u12,u13;;
			User u1 =new User();
			System.out.println("Height:"+u1.height);
			System.out.println(u);//output =null
			u12=new User();
			System.out.println(u12);//output=memory allocation i.e User@5acf9800
			u13=u12;
			System.out.println(u13);//output=memory allocation i.e User@5acf9800
		}
}
