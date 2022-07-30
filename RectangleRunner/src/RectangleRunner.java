//	RectangleRunner
/*	- Creates rectangles using the rectangles class.	*/

import java.util.Random;
public class RectangleRunner 
{
	public static void main(String[] args) 
	{
		Random R = new Random();  //Random is the name of the class.	Random()is the default constructor.
		
		System.out.println("R = " + R.toString());	//R = java.util.Random@2f92e0f4
		
		Rectangle A = new Rectangle();		
		System.out.println("A = " + A.toString()); //A = Rectangle@5305068a		//Now shows A = L = 1, W = 1
		
		Rectangle B = new Rectangle();		
		System.out.println("B = " + B.toString());
	
		Rectangle C = new Rectangle(5, 7);
		System.out.println("C = " + C.toString());
		
		int y; double x;
		
		//Prints the areas.
		y = A.area();
		System.out.println("A.area = " + y);
		
		y = B.area();
		System.out.println("B.area = " + y);
	
		y = C.area();
		System.out.println("C.area = " + y);
		
		System.out.println();
		System.out.println("-------------");
		System.out.println();
		
		//Prints the perimeters.
		y = A.perimeter();
		System.out.println("A.perimeter = " + y);
		
		y = B.perimeter();
		System.out.println("B.perimeter = " + y);
	
		y = C.perimeter();
		System.out.println("C.perimeter = " + y);
		
		System.out.println();
		System.out.println("-------------");
		System.out.println();
		
		//Prints the diagonals.
		x = A.diagonal();
		System.out.println("A.diagonal = " + x);
		
		x = B.diagonal();
		System.out.println("B.diagonal = " + x);
	
		x = C.diagonal();
		System.out.println("C.diagonal = " + x);		
	}
}