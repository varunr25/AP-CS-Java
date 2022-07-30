/*	Arithmetic Examples
 		-Illustrates the arithmetic operators: +, -, *, /, %, (), =
 		-Illustrates the primitive data types: "int" and "double"
 			-Doubles can have a decimal (ex: 2.7) but can also be integers (ex: 3)
 */

public class ArithmeticExamples 
{
	public static void main (String[] args)
	{
		int x, y;		//Declaration of integers X and Y
		double a, b;	//Declaration of doubles A and B
		
		x = 2;
		y = x + 5;		//Math assignments work from right to left
		
		System.out.println("x = " + x);	//Prints out the value of X
		System.out.println("Y = " + y);	//Prints out the value of Y
		

		
		a = 5; 					//Equivalent to 5.0
		b = a + 3.5;			//Equivalent to 8.5
		
		System.out.println("A = " + a);		//Prints out the value of A
		System.out.println("B = " + b);		//Prints out the value of B
		System.out.println("------------");
		
		x = (int) a;		//Turns A into an integer. X = 5
		System.out.println("Y = " + x);
		
		y = (int) (b + 0.5);	//Rounds B to the nearest positive integer. Y = 9
		System.out.println(b + " rounded to an integer is " + y);
		
		System.out.println("------------");

		x = 4; y = 6;
		a = 4; b = 6;
		
		System.out.println(a + " + " + b + " = " + (a + b));	//Adds
		System.out.println(a + " - " + b + " = " + (a - b));	//Subtracts
		System.out.println(a + " * " + b + " = " + (a * b));	//Multiplies
		System.out.println(a + " / " + b + " = " + (a / b));	//Divides
		System.out.println(a + " % " + b + " = " + (a % b));	//Modulus
		
		
		System.out.println("------------");

		System.out.println(x + " + " + y + " = " + (x + y));	//Adds
		System.out.println(x + " - " + y + " = " + (x - y));	//Subtracts
		System.out.println(x + " * " + y + " = " + (x * y));	//Multiplies
		System.out.println(x + " / " + y + " = " + (x / y));	//Divides
		System.out.println(x + " % " + y + " = " + (x % y));	//Modulus
		System.out.println(x + " / " + y + " = " + (x / y) + "R" + (x % y));
		
		System.out.println("------------");
		x = 100; y = 6;
		System.out.println(x + " / " + y + " = " + (x / y) + "R" + (x % y));

		/*
		 	% is the modulus operator. It returns the remainder of integer division.
		 		5 % 6 = 5		6 % 6 = 0		7 % 6 = 1		8 % 6 - 2
				9 % 6 = 3		11 % 6 = 5		10 % 6 = 4		12 % 6 = 0
		 		
		 		
		 		"x % 2 = 0" when x is even.		"x % 2 = 1" when x is odd.
		 		"x % 5 = 0" when x is divisible by 5.
		 		
		*/
		
	}
	
}
