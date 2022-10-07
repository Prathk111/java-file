abstract class Bank{
	abstract void interest(int money);
}
class Sbi extends Bank{
	int interest=7;

	
	void interest(int money) {
		int totalMoney=money;
		System.out.println("Money:"+totalMoney);
		money=interest*money/100;
		System.out.println("Interest:"+interest);
		System.out.println("Money(with interest):"+(totalMoney+money)+"\n");
	}
}
class Axis extends Bank{
	int interest=9;
	
	void interest(int money) {
		int totalMoney=money;
		System.out.println("Money:"+totalMoney);
		money=interest*money/100;
		System.out.println("Interest:"+interest);
		System.out.println("Money(with interest):"+(totalMoney+money)+"\n");
	}
}
class Icici extends Bank{
	int interest=8;
	@Override
	void interest(int money) {
		int totalMoney=money;
		System.out.println("Money:"+totalMoney);
		money=interest*money/100;
		System.out.println("Interest:"+interest);
		System.out.println("Money(with interest):"+(totalMoney+money)+"\n");
	}
}
public class Main_Bank {
	public static void main(String[] args) { //main method 
		
		Bank obj=new Sbi();
		obj.interest(100000);
		
		obj=new Axis();
		obj.interest(500000);
		
		obj=new Icici();
		obj.interest(100);
	}
}