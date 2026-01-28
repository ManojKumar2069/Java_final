class BankAccount
{
	String account_H;
	double balance;
	BankAccount(String a,double b)
	{
		account_H=a;
		balance=b;
	}
	public void deposit(BankAccount r,double amount)
	{
		if(amount<=balance)
		{
			balance-=amount;
			r.balance+=amount;
			System.out.println("Transaction Sucessfull");
		}
		else
		{
			System.out.println("Tanscaction Failed");
			System.out.println("ERROR:Insufficent Funds");
		}
	}
	public void display()
	{
		System.out.println("The Account Holder "+account_H);
		System.out.println("The balance is "+balance);
	}
}
public class pg13 {
	public static void main(String arg[])
	{
		BankAccount b1=new BankAccount("Manoj",10000);
		BankAccount b2=new BankAccount("Kumar",10);
		System.out.println("Before tranfer");
		b1.display();
		b2.display();
		b1.deposit(b2,500);
		System.out.println("After tranfer");
		b1.display();
		b2.display();
		b1.deposit(b2, 10000);
	}
}
