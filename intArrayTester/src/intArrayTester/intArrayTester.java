//intArray Tester
package intArrayTester;
public class intArrayTester 
{
	public static void main(String[] args) 
	{
		intArray A = new intArray(5);				
		System.out.println("A: " + A);	
		
		System.out.println("All array elements are zero.");
		int i;
		for (i = 0; i < 5; i++)
		{
			System.out.print(A.get(i) + " ");
		}
		System.out.println();
		System.out.println();
		
		int x, y;		
		x = A.set(0, 5);
		y = A.get(0);
		
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
		System.out.println();
		
		x = A.set(0, 12);
		y = A.get(0);
		
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
		System.out.println();
		
		System.out.println("The element at position 0 is now 12.");
		for (i = 0; i < 5; i++)
		{
			System.out.print(A.get(i) + " ");
		}
		System.out.println();
		System.out.println();
		
		A.loadRandom(100);
		
		System.out.println("The list now has random integers.");
		for (i = 0; i < 5; i++)
		{
			System.out.print(A.get(i) + " ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("A.average: " + A.average());
		System.out.println("----------");
		A.set(3, 59);
		for (i = 0; i < 5; i++)
		{
			System.out.print(A.get(i) + " ");
		}
		
	}//end of main

public static double truncateThousandths(double v)
{
	return ((int) (v * 1000 + 0.5) / 1000.0); 
}
}//end of class