package constructors;
//which displays the default values
public class Student3 {
	int id = 45;
	String name ="KRISHIKA";
	public Student3(int id, String name) {
		System.out.println(id+" "+name);
		
	}
	public Student3() {
		// TODO Auto-generated constructor stub
	}
	//method to display the value of id and name
	void display() {
		System.out.println(id+" "+name);
	}
	void display(int id, String name) {
		System.out.println(id+" "+name);
	}
public static void main(String... args) {
	//creating objects
	Student3 s1=new Student3(),s2=new Student3(77,"NITHIN");
	
	//Student3 s2=new Student3(77,"NITHIN");
	s1.display();
	s1.display(23,"KUMARESAN");
	

	}

}
