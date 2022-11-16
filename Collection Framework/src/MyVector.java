import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
public class MyVector {
	
	public static void main(String[] args) {
		Vector v1=new Vector();
		ArrayList a1=new ArrayList();
		LinkedList l1=new LinkedList();
		String s="Vaishnavi"; //literals
		String s1=new String("Veda");//Object of String
		String s2=new String("Hritik");
		v1.add(s1);
		v1.add(s2);
		v1.add(s);
		//System.out.println("List of String objects:"+v1);//[Veda,Hritik,Vaishnavi]
		//System.out.println(v1.contains(s2));//true
		//System.out.println(v1);//[Veda,Hritik,Vaishnavi]
		Vector v2=new Vector();
		Student ss1=new Student(1,"Vaishnavi");
		Student ss2=new Student(2,"Hritik");
		Student ss3=new Student(3,"Hritik");
		Student ss4=new Student(4,"Hritik");
		v2.add(ss4);
		v2.add(ss3);
		v2.add(ss2);
		v2.add(ss1);
		v2.add(s2);
		System.out.println("List of Student objects:"+v2);
		System.out.println(v2.contains(ss2));//true
		
	}
}
