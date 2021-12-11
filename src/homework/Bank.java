package homework;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {

		//Scanner for UserInput

		Scanner myObj= new Scanner(System.in);
		System.out.println("Enter Deposit amount :   ");
		Double userInput= myObj.nextDouble();


		//Create Object
		Account obj=new Account();


		double deposit=obj.deposit(userInput);

		double bal1=obj.accountBalance(deposit);

		System.out.println("\nAccount balance after deposit is   "+bal1+" $");

		//Withdrawing money


		Scanner myObj1= new Scanner(System.in);
		System.out.println("\nEnter Withdrawal  Amount:   ");
		Double userInput1= myObj1.nextDouble();

		boolean status=obj.withdraw(userInput1);

		if (status==false)

		{
			System.out.println("Balance is insufficient to withdraw the requested amount");
		}

		//Close Inputs
		myObj.close();
		myObj1.close();

	}}

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

		boolean value=(balance>=wit);

		if (value==true)
		{balance= balance-wit;

		System.out.println("Current balance after withdrawal is  "+balance+" $");}

		return value;


	}

}
