package LoopExamples;

//LoopExamples
/*
  - Illustrates the Java loop structures.
  - The for-loop is generally used for specific number sequences and number of loop iterations.
  - We use the for-loop generally for non-conditional looping.
  - The while-loop and the do-while-loop are generally used for conditional looping.
*/
import java.util.Random;
public class LoopExamples 
{
	public static void main(String[] args) 
	{
		/*
		  for-loop syntax
		  
		  for (<initialization>;  <condition>; <incrementation>)
		  {
		  	<body>
		  }
		*/
		
		Random R = new Random();
		int i;
		
		System.out.println("for-loop: ");
		for (i = 1; i <= 5; i++)				//Hashim Standard for-loop #1 (1 TO 5)
		{
			System.out.print(i + " ");
		}
		System.out.println();	
		
		/*
		  while-loop syntax
		  
		  <initialization>;
		  while(<condition>)
		  {
		  	<body>
		    <incrementation>
		  }
		*/

		System.out.println("while-loop: ");
		i = 1;
		while (i <= 5)				
		{
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
				
		System.out.println("while-loop with conditional looping: ");
		i = 1;
		while (i <= 5)				
		{
			System.out.print(i + " ");
			i = R.nextInt(7);
		}
		System.out.println();
			
		System.out.println("for-loop: ");
		for (i = 0; i < 5; i++)				//Hashim Standard for-loop #2  (0 TO 4)
		{
			System.out.print(i + " ");
		}
		System.out.println();
				
		//Franklin can count by twos and tie his shoes.
		System.out.println("for-loop count by twos: ");
		for (i = 1; i <= 5; i+=2)				
		{
			System.out.print(i + " ");
		}
		System.out.println();	
				
		/*
		  	Assignment Operators  (Accumulator Operators)
		  
		  	= is a simple assignment which operates right-to-left.
		  	x = y;  //both will be assigned the value in y. 
		  	
		  	+=  is an accumulation of additions.
		  	
		  	+=, -=, *=, /= (/=), %=  are all accumulator operators.
		  	
		  	x = x + 1;		
		  	x += 1;
		  	i++;
		  	++i;
		  
		*/
	}
}