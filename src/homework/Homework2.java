package homework;

import java.util.Arrays;

public class Homework2 {

	//Method to check even or odd 

	public static boolean check(int n)
	{
		int remainder=n%2;


		boolean value= (remainder==0);
		return value;

	}

	//Method to check palindrome

	public static boolean verify(String s)

	{
		String reverse="";
		int length=s.length();

		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
		}
		boolean ans=s.toLowerCase().equals(reverse.toLowerCase());

		return ans;
	}


	//Array

	public static int array(int a[])

	{
		int len=a.length;
		//System.out.println(len);

		Arrays.sort(a);
		int res=a[len-1];
		return res;


	}


	public static void main(String[] args) {


		//Even Or Odd

		int num=100;
		boolean result=check(num);

		if  (result==true)

		{System.out.println("The result is "+ result+" : The number is Even ");}


		else

		{System.out.println("The result is "+ result+" : The number is Odd");}


		//Palindrome

		String name="Java";
		boolean result1=verify(name);
		if (result1==true)
		{System.out.println(result1+" : The string is a Palindrome!");}



		else
		{System.out.println(result1+" : The string is not a Palindrome!");}




		//Array

		int arr[]= {1,2,9,11,5,6};
		int result2=array(arr);
		System.out.println("Largest number in the array is: "+result2);



	}

}


