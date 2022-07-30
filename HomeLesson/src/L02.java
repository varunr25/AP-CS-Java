import java.util.Scanner;
public class L02 
{
	static L00_General obj_General;
	public static void main(String[] args) 
	{
		obj_General = new L00_General();

		//problem1();
		//problem2();
		//problem3();
		//problem4();
		
	}
	
	public static void problem1 ()	
	{
		//Swap two numbers
		
		int a = obj_General.getUserInput("Input Value A");
		int b = obj_General.getUserInput("Input Value B");
		
		int swap;
		swap = a;
		a = b;
		b = swap;
		obj_General.giveOutput("New A", a);
		obj_General.giveOutput("New B", b);		
	}
	
	public static void problem2 ()	
	{
		/*
		Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
		Input a number: 8
		Expected Output :
		8 x 1 = 8
		8 x 2 = 16
		8 x 3 = 24
		...
		8 x 10 = 80 
		*/
		
		int iInput = obj_General.getUserInput("Input a Value");
		int i;
		for (i = 1; i < 11; i++)
		{
			System.out.println(iInput + " x " + i + " = " + (iInput * i));
		}		
	}
	
	public static void problem3 ()
	{
		/*
		 Write a Java program to compare two numbers. Go to the editor
		Input Data:
		Input first integer: 25
		Input second integer: 39
		Expected Output
		
		25 != 39                                                                          
		25 < 39                                                                           
		25 <= 39
		 * */
		
		int iInput1 = obj_General.getUserInput("Input Value #1");
		int iInput2 = obj_General.getUserInput("Input Value #2");
		
		if (iInput1 < iInput2)
		{
			obj_General.giveOutput(iInput1 + " != " + iInput2);
			obj_General.giveOutput(iInput1 + " < " + iInput2);
			obj_General.giveOutput(iInput1 + " <= " + iInput2);
		}
		
		if (iInput1 == iInput2)
		{
			obj_General.giveOutput(iInput1 + " = " + iInput2);
		}
		
		if (iInput1 > iInput2)
		{
			obj_General.giveOutput(iInput1 + " != " + iInput2);
			obj_General.giveOutput(iInput1 + " > " + iInput2);
			obj_General.giveOutput(iInput1 + " >= " + iInput2);
		}
		
	}

	public static void problem4 ()
	{
		/*
		 Write a Java program and compute the sum of the digits of an integer. Go to the editor
		Input Data:
		Input an integer: 25
		Expected Output
		
		The sum of the digits is: 7
		*/
		
		int iInput = obj_General.getUserInput("Input Value");
		String s = String.valueOf(iInput);
		obj_General.giveOutput(s);
		int iLength = s.length();
		obj_General.giveOutput("Length", iLength);
		
		
		int i, iSum;
		iSum = 0;
		for (i = 0; i < iLength; i++)
		{
			char cNumber = s.charAt(i);
			
			iSum = iSum + (Character.getNumericValue(cNumber));
		}
		
		obj_General.giveOutput("Sum of Digits", iSum);
	}	
}