/*	ifExamples
 * 	- Illustrates the if-statement, logical operators, boolean operators, and the boolean data type
 * */

package ifExamples;
import java.util.Random;
public class ifExamples 
{
	public static void main(String[] args) 
	{
		int x;
	
		Random R = new Random();
		
		x = R.nextInt() % 100;			//Range = -100 < x < 100
		
			
		if (x < 0)
			System.out.println(); 		//What report could go here?
		
		if (x > 0)
			System.out.println(); 		//What report could go here?
		
		if (x == 0)
			System.out.println(); 		//What report could go here?
		
		if (x != 0)
			System.out.println(); 		//What report could go here?
		
		
		//Logical operators:  ==, !=, <, >, <=, >=
		/*
		  	Logically opposite
		  	== , !=
		  	<, >=
		  	>, <=
		  	
		  	The else for one will be the other. 
		*/
		
		if (x >= 1)					
			if (x <= 10)
				System.out.println(x + " is from 1 to 10.");    //x >= 1 and also x <= 10
		
		//We can also write that as a boolean AND statement.
		
		if ((x >= 1) && (x <= 10))								//Don't forget the outer ()
				System.out.println(x + " is from 1 to 10.");    //x >= 1 and also x <= 10
		
		//The nested if (top) can have two else statements.
		//The boolean AND (bottom) can only have one else.
		
		//Let's look at the nested if first.
		//Note, the else goes with the nearest if, as long as it's not associated with another else.
		//So, there is no else-else possibility.
		if (x >= 1)					
			if (x <= 10)
				System.out.println(x + " is from 1 to 10.");    //x >= 1 and also x <= 10 (This is the range we wanted.)
			else
				System.out.println(x + " is not <= 10, but it is >= 1");	//Too big
		else
			System.out.println(x + " is not >= 1");							//Too small
		
		//We choose a nested-if structure when we need more detail.
		
		
		//Let's look at the boolean if-statement now.
		if ((x >= 1) && (x <= 10))								
			System.out.println(x + " is from 1 to 10.");   		 //x >= 1 and also x <= 10	(In Range)
		else	
			System.out.println(x + " is NOT from 1 to 10.");    //NOT (x >= 1 and also x <= 10) (Not in Range)
																//but I don't know why.
		
		
		/*
	 		What does NOT in range mean?
	 		In Range:       ((x >= 1) && (x <= 10))
	 		Not In Range:  !((x >= 1) && (x <= 10))
	 		
	 		The NOT operator, !, is a unary operator. It works on one expression, not with two.
	 		AND, &&, and OR, || are binary operators. They work on two expressions.
	 		We use boolean operators with logical conditions or boolean data types only.
	 		
	 		!((x >= 1) && (x <= 10))			//What is an easier way to code this logic?
	 		
	 		We can simplify this expression using DeMorgan's law.
	 		DeMorgan's law, in this case, is the negation of a conjunction (AND) is 
	 		logically equivalent to the disjunction (OR) of the negations of the original statements.  
	 		
	 		!((x >= 1) && (x <= 10))				//Not AND
	 		!(x >= 1)  || !(x <= 10)				//OR of the negations
	 		  x < 1    ||  x > 10 					//OR of logical equivalents to the negations	
		 */


			//We need to create boolean variables using the boolean data type.

		boolean P, Q;
		P = true; Q = false;
		
		//!(x >= 1) && (x <= 10)
		P = (x >= 1); Q = (x <= 10);
		
		if (P && Q)								
			System.out.println(x + " is from 1 to 10.");    	//x >= 1 and also x <= 10	(In Range)
		else
			System.out.println(x + " is NOT from 1 to 10.");    //NOT (x >= 1 and also x <= 10) (Not in Range)
																//but I don't know why.
		boolean A, B;
		A = (x < 1); 
		B = (x > 10);
		
		if (A || B)
			System.out.println(x + " is out of range.");
		
		/*	if-statement structures
		 	
		 	if (condition)
		 	{
		 		<statement(s)>;
		 	}
		*/		
		
				////////////////
		
		/*	if-else structures
	 	
	 	if (condition)
	 	{
	 		<statement(s) when condition is true>;
	 	}
	 	else
	 	{
	 		<statement(s) when condition is false>;
	 	}
	 		 	
	 	
	 	*/
	
		if (x > 90)
			System.out.println("Grade: A");
		else if(x > 80)
			System.out.println("Grade: B");
		else if(x > 70)
			System.out.println("Grade: C");
		else
			System.out.println("Oh no!");
	
	
	}
}
