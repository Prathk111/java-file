public class A {
	void input()
	{
		System.out.println("Enter the name: ");
		
	}

}
class B extends A
{
 	void show()
 	{
 		System.out.println("Pratham");
 	}
}
class C extends A
{
	void Disp()
	{
		System.out.println("Soham");
	}
}
class Demo
{
	public static void main(String[] args)
	{
		B r=new B();
		C r2=new C();
		
		r.input(); r.show();
		r2.input(); r2.Disp();
	}
}