import java.util.HashSet;

public class MyHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs1=new HashSet();
		
		String s1=new String("Vaishnavi");
		String s2=new String("Hritik");
		hs1.add(s1);
		hs1.add(s2);
		//System.out.println(hs1);
		
		HashSet hs2=new HashSet();
		
		Student ss1=new Student(1,"Vaishnavi");
		Student ss2=new Student(2,"Vaishnavi");
		Student ss3=new Student(3,"Vaishnavi");
		Student ss4=new Student(4,"Vaishnavi");
		Student ss5=new Student(5,"Vaishnavi");
		Student ss6=new Student(6,"Vaishnavi");
		
		hs2.add(ss6);
		hs2.add(ss5);
		hs2.add(ss4);
		hs2.add(ss3);
		
		System.out.println(hs2);
	}

}
