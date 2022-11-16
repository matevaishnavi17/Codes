import java.util.Objects;

public class Student {
	int id;
	String name;
	public Student(int i, String string) {
		// TODO Auto-generated constructor stub
		id=i;
		name=string;
	}
	public String getName() {
		return this.name;
	}
	
	public void setName(String s) {
		this.name=s;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int i) {
		this.id=i;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass()!= obj.getClass())
			return false;
		
		Student other=(Student)obj;
		return Objects.equals(name, other.name);	
	}
	@Override
	public String toString() {
		return "Student [id=" +id+ ", name=" +name+ "]";
	}
}
