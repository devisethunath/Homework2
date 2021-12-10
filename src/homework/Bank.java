package homework;

public class Bank {

	public static void main(String[] args) {


		Account obj=new Account();//Create Object


		//Depositing money


		double deposit=obj.deposit(10000);

		double bal1=obj.accountBalance(deposit);

		System.out.println("Account balance after deposit is   "+bal1+" $");

		//Withdrawing money

		boolean status=obj.withdraw(3000);

		if (status==false)

		{
			System.out.println("balance is in sufficient to withdraw the requested amount");
		}
	}

}

class Account {


	double acct_no,balance;
	String name;

	Account()
	{
		acct_no=0;
		name= "";
		balance=0;

	}
	double accountBalance(double b)
	{
		balance=balance+b;
		return balance;
	}

	double deposit(double d)
	{
		double dep=d;
		return dep;
	}

	boolean  withdraw(double w)
	{
		double wit=w;

		boolean value=(balance>wit);

		if (value==true)
		{balance= balance-wit;

		System.out.println("Current balance after withdrawal is  "+balance+" $");}

		return value;


	}

}
