//	Rectangle.java
/*	- 
 	
*/
public class Rectangle extends Rectangle
{
		private int length, width;
		
		public Rectangle()			//Default constructor (parentheses are blank)
		{
			this.length = 1;		
			this.width = 1;			
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
				
		public Rectangle(Rectangle other) 
		{
			this.length = other.length;		
			this.width = other.length;	
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