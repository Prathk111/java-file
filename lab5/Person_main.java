abstract class Person{
	int marks=90,salary=9000000;
	abstract void  person(int pid,String pname);
}
class Student extends Person{
	
	void person(int pid, String pname) {
		System.out.println("Student Id: "+pid+"\nStudent Name: "+pname);
		marks();
	}
	void marks() {
		System.out.println("Student total Marks :"+super.marks+"\n");
	}
}
class Emp extends Person{

	
	void person(int pid, String pname) {
		System.out.println("Employee Id: "+pid+"\nEmployee Name: "+pname);
		salary();
	}
	void salary() {
		System.out.println("Employee Salary:"+ super.salary+"\n");
	}
}
class Person_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj =new Emp();
		obj.person(1,"Pratham");
		
		obj=new Student();
		obj.person(2,"Soham");
	}
}