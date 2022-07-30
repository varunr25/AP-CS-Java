// 	Varun Rajesh - 9/14/20
/* 	RectanglesWAP
	- Write a program (WAP) that will generate 10 random rectangle length and width values in the range of 
	  50 to  100.
	- It should print out the length, width, perimeter, and area for each rectangle.
*/

import java.util.Random;
public class RectanglesWAPShort {

	public static void main(String[] args) 
	{
		int length; int width; int perimeter; int area; int i;
		Random R = new Random();
	
		for (i = 1; i < 11; i++)
		{
			System.out.println("Rectangle " + i + ": Length, Width, Perimeter, and Area.");
			length = R.nextInt(51) + 50;
			width = R.nextInt(51) + 50;
			perimeter = (2 * length) + (2 * width);
			area = length * width;
			
			System.out.println();
			System.out.println("Length = " + length);
			System.out.println("Width = " + width);
			System.out.println("Perimeter = " + perimeter);
			System.out.println("Area = " + area);
			
			System.out.println("-----------------------");
		}	
	}
		//End of program
}
