//	Search Runner 
import java.lang.Math;
public class searchRunner 
{
	public static void main(String[] args) 
	{
		search A = new search(5);				
		
		System.out.println("Initial array: ");
		int i;
		for (i = 0; i < 5; i++)
		{
			System.out.print(A.get(i) + " ");
		}
		System.out.println();
		System.out.println();

		A.loadRandom(100);
				
		A.set(3, 6);	//Dummy value to test contain method
		
		System.out.println("Updated array, now with random integers: ");
		for (i = 0; i < 5; i++)
		{
			System.out.print(A.get(i) + " ");
		}
		System.out.println();
		System.out.println();
				
		if (A.contains(6))	//Contain method test
		{
			System.out.print("6 was found within the array at position ");
			System.out.print(A.find(6) + ".");	//Position method test		
		}
		else
		{
			System.out.println("6 was NOT found within the array.");
		}			
	}
}