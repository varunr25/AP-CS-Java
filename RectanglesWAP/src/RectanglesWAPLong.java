//								Varun Rajesh - 9/14/20
/*	RectanglesWAP
 	- Write a program (WAP) that will generate 10 random rectangle length and width values in the range of 50 to 
 	  100.
 	- It should print out the length, width, perimeter, and area for each rectangle.
 */
import java.util.Random;
public class RectanglesWAPLong
{
	public static void main (String[] args)
	{
		Random R = new Random();
		
		//Rectangle #1
		int oneL = R.nextInt(51) + 50;
		int oneW = R.nextInt(51) + 50;
		
		int onePerimeter = (2 * oneL) + (2 * oneW);
		int oneArea = oneL * oneW;
		
		System.out.println("Rectangle 1: Length, Width, Perimeter, and Area.");
		System.out.println();
		System.out.println("Length = " + oneL);
		System.out.println("Width = " + oneW);
		System.out.println("Perimeter = " + onePerimeter);
		System.out.println("Area = " + oneArea);
		
		System.out.println("-----------------------");
		
		//Rectangle #2
		int twoL = R.nextInt(51) + 50;
		int twoW = R.nextInt(51) + 50;
		
		int twoPerimeter = (2 * twoL) + (2 * twoW);
		int twoArea = twoL * twoW;
		
		System.out.println("Rectangle 2: Length, Width, Perimeter, and Area.");
		System.out.println();
		System.out.println("Length = " + twoL);
		System.out.println("Width = " + twoW);
		System.out.println("Perimeter = " + twoPerimeter);
		System.out.println("Area = " + twoArea);
		
		System.out.println("-----------------------");

		//Rectangle #3
		int threeL = R.nextInt(51) + 50;
		int threeW = R.nextInt(51) + 50;
		
		int threePerimeter = (2 * threeL) + (2 * threeW);
		int threeArea = threeL * threeW;
		
		System.out.println("Rectangle 3: Length, Width, Perimeter, and Area");
		System.out.println();
		System.out.println("Length = " + threeL);
		System.out.println("Width = " + threeW);
		System.out.println("Perimeter = " + threePerimeter);
		System.out.println("Area = " + threeArea);

		System.out.println("-----------------------");

		//Rectangle #4
		int fourL = R.nextInt(51) + 50;
		int fourW = R.nextInt(51) + 50;
		
		int fourPerimeter = (2 * fourL) + (2 * fourW);
		int fourArea = fourL * fourW;
		
		System.out.println("Rectangle 4: Length, Width, Perimeter, and Area");
		System.out.println();
		System.out.println("Length = " + fourL);
		System.out.println("Width = " + fourW);
		System.out.println("Perimeter = " + fourPerimeter);
		System.out.println("Area = " + fourArea);

		System.out.println("-----------------------");

		//Rectangle #5
		int fiveL = R.nextInt(51) + 50;
		int fiveW = R.nextInt(51) + 50;
		
		int fivePerimeter = (2 * fiveL) + (2 * fiveW);
		int fiveArea = fiveL * fiveW;
		
		System.out.println("Rectangle 5: Length, Width, Perimeter, and Area");
		System.out.println();
		System.out.println("Length = " + fiveL);
		System.out.println("Width = " + fiveW);
		System.out.println("Perimeter = " + fivePerimeter);
		System.out.println("Area = " + fiveArea);

		System.out.println("-----------------------");
		
		//Rectangle #6
		int sixL = R.nextInt(51) + 50;
		int sixW = R.nextInt(51) + 50;
		
		int sixPerimeter = (2 * sixL) + (2 * sixW);
		int sixArea = sixL * sixW;
		
		System.out.println("Rectangle 6: Length, Width, Perimeter, and Area");
		System.out.println();
		System.out.println("Length = " + sixL);
		System.out.println("Width = " + sixW);
		System.out.println("Perimeter = " + sixPerimeter);
		System.out.println("Area = " + sixArea);

		System.out.println("-----------------------");
		
		//Rectangle #7
		int sevenL = R.nextInt(51) + 50;
		int sevenW = R.nextInt(51) + 50;
		
		int sevenPerimeter = (2 * sevenL) + (2 * sevenW);
		int sevenArea = sevenL * sevenW;
		
		System.out.println("Rectangle 7: Length, Width, Perimeter, and Area");
		System.out.println();
		System.out.println("Length = " + sevenL);
		System.out.println("Width = " + sevenW);
		System.out.println("Perimeter = " + sevenPerimeter);
		System.out.println("Area = " + sevenArea);

		System.out.println("-----------------------");
		
		//Rectangle #8
		int eightL = R.nextInt(51) + 50;
		int eightW = R.nextInt(51) + 50;
		
		int eightPerimeter = (2 * eightL) + (2 * eightW);
		int eightArea = eightL * eightW;
		
		System.out.println("Rectangle 8: Length, Width, Perimeter, and Area");
		System.out.println();
		System.out.println("Length = " + eightL);
		System.out.println("Width = " + eightW);
		System.out.println("Perimeter = " + eightPerimeter);
		System.out.println("Area = " + eightArea);

		System.out.println("-----------------------");

		//Rectangle #9
		int nineL = R.nextInt(51) + 50;
		int nineW = R.nextInt(51) + 50;
		
		int ninePerimeter = (2 * nineL) + (2 * nineW);
		int nineArea = nineL * nineW;
		
		System.out.println("Rectangle 9: Length, Width, Perimeter, and Area");
		System.out.println();
		System.out.println("Length = " + nineL);
		System.out.println("Width = " + nineW);
		System.out.println("Perimeter = " + ninePerimeter);
		System.out.println("Area = " + nineArea);

		System.out.println("-----------------------");

		//Rectangle #10
		int tenL = R.nextInt(51) + 50;
		int tenW = R.nextInt(51) + 50;
		
		int tenPerimeter = (2 * tenL) + (2 * tenW);
		int tenArea = tenL * tenW;
		
		System.out.println("Rectangle 10: Length, Width, Perimeter, and Area");
		System.out.println();
		System.out.println("Length = " + tenL);
		System.out.println("Width = " + tenW);
		System.out.println("Perimeter = " + tenPerimeter);
		System.out.println("Area = " + tenArea);

		System.out.println("-----------------------");

		//End of Program
	}
}