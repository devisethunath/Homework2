package homework;

	
	import java.util.Arrays;
	import java.util.Scanner;

	public class HarryPotter {

		public static void main(String[] args) {

			int First_Movie_Year=2001;
			int Eighth_Movie_Year=2011;

			int average_years;
			int average_months;


			//1: How many years elapsed between first and last movie

			int Difference= Eighth_Movie_Year-First_Movie_Year;
			average_years= Difference/8;
			average_months=Difference%8;

			System.out.println("\nQuestion:1");

			System.out.println("\nHow many years elapsed between first and last movie of Harry Potter? " + Difference );

			//2: Calculate using formula and print answer in years and months.

			System.out.println("\nQuestion:2");

			System.out.println("\nApprox years for a movie release is " +average_years+" and "+ average_months+" months ");


			//3: Get a number as input from user and print the name of the movie.

			// Using Scanner for Getting Input from User
			Scanner input = new Scanner(System.in);

			System.out.println("\nQuestion:3");
			System.out.println("\nEnter the year of movie release : ");




			int Movie_Year = input.nextInt();	

			switch (Movie_Year){
			case 2001: 
				System.out.println(" The Movie Nmae is Harry Potter and the Philosopher's Stone ");
				break;
			case 2002: 
				System.out.println(" The Movie Nmae is Harry Potter and the Chamber of Secrets  ");
			case 2004:
				System.out.println(" The Movie Nmae is Harry Potter and the Prisoner of Azkaban  ");
				break;
			case 2005:
				System.out.println(" The Movie Nmae is Harry Potter and the Goblet of Fire  ");
				break;
			case 2007:
				System.out.println(" The Movie Nmae is Harry Potter and the Order of the Phoenix  ");
				break;
			case 2009:
				System.out.println(" The Movie Nmae is Harry Potter and the Half-Blood Prince  ");
				break;
			case 2010:
				System.out.println(" Harry Potter and the Deathly Hallows – Part 1 ");
				break;
			case 2011:
				System.out.println(" Harry Potter and the Deathly Hallows – Part 2 ");
				break;
			default:
				System.out.println(" The year is invalid ");}


			//4:  If user enters input as 1, print ”First movie”,  8, print “Last movie”. For anything else, print “Not First or Last movie”

			// Using Scanner for Getting Input from User

			System.out.println("\nQuestion:4");
			Scanner input1 = new Scanner(System.in);
			System.out.println("Enter a number  : ");
			int Number_Input=input1.nextInt();


			if(Number_Input==1)
				System.out.println(" First Movie ");
			else if (Number_Input==8)
				System.out.println(" Last Movie ");
			else
				System.out.println("Not First or Last movie");


			//5:  Keep getting input from user and print the name of the movie till the user enters an invalid input.

			System.out.println("\nQuestion:5");

			// Using Scanner for Getting Input from User




			boolean value;

			do
			{
				Scanner input2 = new Scanner(System.in);
				System.out.println("\nEnter the year of movie release : ");
				int Movie_Year2 = input2.nextInt();




				value =( Movie_Year2==2001 )||( Movie_Year2==2002 )||( Movie_Year2==2004 )||( Movie_Year2==2005 )||( Movie_Year2==2007 )||( Movie_Year2==2009)||( Movie_Year2==2010 )||( Movie_Year2==2011 );

				if( value ==true)

					switch (Movie_Year2){
					case 2001: 
						System.out.println(" The Movie Nmae is Harry Potter and the Philosopher's Stone ");
						break;
					case 2002: 
						System.out.println(" The Movie Nmae is Harry Potter and the Chamber of Secrets  ");
						break;
					case 2004:
						System.out.println(" The Movie Nmae is Harry Potter and the Prisoner of Azkaban  ");
						break;
					case 2005:
						System.out.println(" The Movie Nmae is Harry Potter and the Goblet of Fire  ");
						break;
					case 2007:
						System.out.println(" The Movie Nmae is Harry Potter and the Order of the Phoenix  ");
						break;
					case 2009:
						System.out.println(" The Movie Nmae is Harry Potter and the Half-Blood Prince  ");
						break;
					case 2010:
						System.out.println(" Harry Potter and the Deathly Hallows – Part 1 ");
						break;
					case 2011:
						System.out.println(" Harry Potter and the Deathly Hallows – Part 2 ");
						break;}

				else

				{System.out.println(" The year is invalid ");
				break;}}


			while ( value == true);


			System.out.println();

			//6:  Create a single for loop to print all the data in the format [Movie Number, Movie name, Year Of Release]

			System.out.println("\nQuestion:6");

			int movieno[]    =     { 1,2,3,4,5,6,7,8};

			String Mov_name[]= { "                    Harry Potter and the Philosopher's Stone      ",
					"                    Harry Potter and the Chamber of Secrets       ",
					"                    Harry Potter and the Prisoner of Azkaban      ",
					"                    Harry Potter and the Goblet of Fire           ",
					"                    Harry Potter and the Order of the Phoenix     ",
					"                    Harry Potter and the Half-Blood Prince        ",
					"                    Harry Potter and the Deathly Hallows – Part 1 ",
			"                    Harry Potter and the Deathly Hallows – Part 2 "};

			int mov_year[]= {2001,2002,2004,2005,2007,2009,2010,2011};

			//int index=Arrays.binarySearch(Mov_name," Harry Potter and the Goblet of Fire           ");

			System.out.println("\nMovie Number         Movie Name                                    Movie Year");
			for(int i=0; i<movieno.length;i++)
			{
				System.out.print(movieno[i]);
				System.out.print(Mov_name[i]);
				System.out.print( mov_year[i]);


				System.out.println();}




			/*7:  Keep getting input from user  for 5 times. Store all the inputs given by the user in an array. 
		          Loop through the array using For Each loop and print all the movie names entered by the user. */

			System.out.println("\nQuestion:7");

			String array1[]=new String[5];

			for(int counter=0;counter<5;counter++)

				// Using Scanner for Getting Input from User
			{Scanner input3 = new Scanner(System.in);

			System.out.println("\nEnter the movie name : ");
			String Movie_Name = input3.nextLine();

			array1[counter]= Movie_Name;

			}
			input.close();
			input1.close();

			System.out.println("\nList of movies");
			for (String strTemp: array1)
			{System.out.println("\n"+ strTemp);

			}
			System.out.println("\nHappy Learning");
		}}





