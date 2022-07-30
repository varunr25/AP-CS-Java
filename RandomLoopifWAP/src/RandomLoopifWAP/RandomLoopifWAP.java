//RandomLoopIfWAP
/*
  	WAP that will generate 100 random int values in the range
  	of -20 to +20.  Count how many of those values are even, odd
  	and divisible by 5.  Print out the three result, labeled and
  	then print out the highest of the three results.
*/

package RandomLoopifWAP;
import java.util.Random;
public class RandomLoopifWAP 
{
	public static void main(String[] args) 
	{
		Random R = new Random();
				
		int x = R.nextInt(21);
						
		int c; 		int even = 0; 		int odd = 0; 		int divisible = 0;
		
		for (c = 0; c <= 100; c++)
		{
			x = R.nextInt(21);
			if (x % 2 ==0)
			{
				even++;
			}
			
			if (x % 2 == 1)
			{
				odd++;
			}
			
			if (x % 5 == 0)
			{
				divisible++;
			}
		}
			
		
		System.out.println("Even: " + even);
		System.out.println("Odd: " + odd);
		System.out.println("Divisible: " + divisible);
		System.out.println();
		
		int highest = even;
		
		if (divisible > highest)
		{
			highest = divisible;
		}
		if (odd > highest)
		{
			highest = odd;
		}
		
		System.out.println("Highest Count: " + highest);
	}

}
