public class BankAccount {
	int ac_no;
	String name,type;
	float amount;
	void details(int n, String nm, String t, float a)
	{
		ac_no=n;
		name=nm;
		type=t;
		amount=a;
	}
	void show()
	{
		System.out.println(ac_no+" "+name+" "+type+" "+amount);
	}
	void deposit(float a)
	{
		amount+=a;
		System.out.println("Deposit amount:"+a);
	}
	void withdraw(float a)
	{
		if(amount<a)
			System.out.println("Insufficient balabce");
		else
			amount-=a;
		System.out.println("Withdraw amount:"+a);
	}
	void checkbalance()
	{
		System.out.println("Balance is:"+amount);
	}
	
}
class test{
	public static void main(String[] args)
	{
		BankAccount b=new BankAccount();
		b.details(123456,"Pratham","Saving",10000);
		b.show();
		b.deposit(30000);
		b.checkbalance();
		b.withdraw(5000);
		b.checkbalance();
	}
}