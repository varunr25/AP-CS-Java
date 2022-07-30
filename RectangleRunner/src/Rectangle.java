//	Rectangle.java
/*	- The rectangle class contains two int properties (data value): a default and a non default constructor method,
  	  an overridden toString() method, area(), perimeter(), and diagonal() method.

	- NOTE: Properties (data) is always private. Property statements are declarations unless they are constants.
	- NOTE: Unassigned int variables will be set to zero.
		- Doubles are set to 0.0 & Booleans are set to false.
		
	- You can have 1+ constructor methods, but only one can be used at a time.
	- Constructor Methods must be public, otherwise you can't use them.
	- Constructor Methods must have the same name as the class. 
		- Rules of overloading methods apply here. 
	- Constructor Methods initialize data. 
*/
public class Rectangle 
{
		private int length, width;
		
		public Rectangle()			//Default constructor (parentheses are blank)
		{
			length = 1;		width = 1;			
		}
		
		public Rectangle (int length, int width)
		{
			if ((length > 0 ) && (width > 0))
			{
				this.length = length;
				this.width = width;
			}
			else
			{
				this.length = 1;
				this.width = 1;
			}
		}
				
		public String toString()	
		{
			return "L = " + length + ", W = " + width;
		}

		public int area()
		{
			return (this.length * this.width);
		}
		
		public int perimeter()
		{
			return ((2 * this.length) + (2 * this.width));
		}
		
		public double diagonal()
		{
			return Math.sqrt((Math.pow(length, 2) + Math.pow(width, 2)));
		}
}