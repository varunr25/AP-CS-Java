//Array Examples
/*
 	- Illustrates the (java) Array data type.
 	- An Array is (basically) a halfway point between a primitive type and a class.
 */
import java.util.Random;
public class ArrayExamples {

	public static void main(String[] args) 
	{
		int[] A = new int[5];	//This creates the array, but doesn't store any numbers in the array.

		Random R = new Random(); 
		System.out.println("A = " + A);		//A = [I@372f7a8d
		
		//The array type does not have an overridden toString().
		//DON'T FORGET THE SUBi

		int[] B = new int[5];
		System.out.println("B = " + B);		///B = [I@2f92e0f4
		
		double[] C = new double[5];
		System.out.println("C = " + C);		//C = [D@28a418fc
		
		double[] D = new double[5];
		System.out.println("D = " + D);		//D = [D@5305068a
		
		System.out.println();
		System.out.println("--------");
		
		//The long way, shown below, is NOT recommended.
		A[0] = 2;	A[1] = 4;	A[2] = 6;	A[3] = 8; 	A[4] = 10;
		
		//We construct algorithms to systematically process data.
		//NOTE: Arrays have a length property, which means no ()

		int i;		
		System.out.print("A = ");			
		for (i = 0; i < A.length; i++)			//printList
		{
			System.out.print(A[i] + " ");
		}
		System.out.println();
		
		System.out.print("B = ");				//loadOddSequence
		for (i = 0; i < B.length; i++)		
		{
			B[i] = 2 * i + 1;
			B[0] = 0;	//Special case for #0, if you need one.
			System.out.print(B[i] + " ");
		}
		System.out.println();
		
		System.out.print("C = ");				//printList
		for (i = 0; i < C.length; i++)
		{
			C[i] = R.nextDouble();
		}
		
		for (double x: C)	//For each element in the list, one at a time, in order.
		{
			x = C[i];
			System.out.print(truncateThousandths(x) + " ");
		}
		
		System.out.println();
				
		//Sum of all values in array A.
		int sum = 0; 
		for(int x: A)		//Summation
		{
			sum += x;		
		}
		System.out.println("Sum of A = " + sum);
	
		double average;
		average = (double) sum / A.length;
		
		System.out.println("Average of A = " + average);		
	}//end of main

	public static double truncateThousandths(double v)
	{
		return ((int) (v * 1000) / 1000.0); 
	}

}//end of program