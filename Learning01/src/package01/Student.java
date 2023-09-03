package package01;

public class Student {

	int age;
	int rollNo;
	public static void main(String[] args) {
		Student s= new Student();
		s.age = 22;
		s.rollNo = 12789;
		System.out.println("Student Age is :"+s.age);
		System.out.println("Student Roll No. is :"+s.rollNo);
		s.display1();
		s.display2();
	}
	
	public static void display1()
	{
		System.out.println("Welcome to all of you");
	}
	
	public static void display2()
	{
		System.out.println("Automation is very easy");
	}
}

