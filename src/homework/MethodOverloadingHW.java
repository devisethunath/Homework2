package homework;


public class MethodOverloadingHW {


	//Area of Rectangle

	public static double area(double l,double w)
	{
		double a= l*w;
		return a;
	}


	//Area of Circle
	public static double area(double r)
	{
		double ca=3.14*r*r;
		return ca;

	}


	//Equality of Strings

	public static boolean equal(String s1,String s2)
	{
		boolean ans= (s1.equals(s2));

		return ans;


	}

	//Equality of integers

	public static boolean equal(int i1,int i2)
	{
		boolean ans1=(i1==i2);
		return ans1;
	}


	public static void main(String[] args) {

		//Area of Rectangle

		double len=2.8;
		double wid=3.7;
		double result =area(len,wid);

		System.out.println("\nArea of Rectangle with length and width  (" +len +", "+ wid +") is " +result);

		//Area of Circle

		double rad=5.8;
		double result1=area(rad);

		System.out.println("\nArea of the circle with radius "+rad +" is "+result1);

		//Equality of strings

		String string1="test";
		String string2="java";

		boolean result2=equal(string1,string2);
		System.out.println("\nAre the strings same : "+result2);

		//Equality of integers

		int int1=12;
		int int2=12;

		boolean result3=equal(int1,int2);
		System.out.print("\nAre the integers Equal : "+result3);

	}

}



