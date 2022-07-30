//HashInt
/*
  	This class is a simple int wrapper class.
  	
  	A HashInt object is HashInt type and it is Object type as well.
  	Object is the parent class and HashInt is the child class
  	in this scenario. 
  	
  	The original Object.equals() method:
  	boolean java.lang.Object.equals(Object arg0)
  	
  	Constructor Methods
  	Auto-generated default constructor:  If you do not write
  	any constructor methods, Java will auto-generate one for the class. 
  	
  	The default constructor is one that has no parameters (one only).
  	A non-default constructor is one that has data parameters (many).
  	A copy constructor is one that has the class type as a parameter (one). 
  	
  	implements Comparable results initially in thie error:
  	The type HashInt must implement the inherited abstract method Comparable.compareTo(Object)
*/
					 //extends Object

public class HashInt implements Comparable
{
	private int x;
	
	public HashInt()		//default constructor
	{
		x = 0;
	}
	
	public HashInt(int x)	//non-default constructor
	{
		this.x = x;
	}
	
	public HashInt(HashInt other)	//copy constructor
	{
		this.x = other.x;
	}
								//We can invoke the original this way

	//Override toString() 		//super.toString() + ": " + this.x;
	public String toString()
	{
		String toString = "" + this.x;
		return toString;
	}
	
	//Override equals(Object)			//main(): A.equals(B)
	public boolean equals(Object obj)
	{
		HashInt other = (HashInt) obj;	//must cast obj as this class.
		
		if (this.x == other.x)
			return true;
		return false;
	}
	
	//Implement the Comparable interface.
	//Implement compareTo(Object)
	public int compareTo(Object obj)	//main(): A.compareTo(B)
	{
		HashInt other = (HashInt) obj;
		
		if (this.x > other.x)
			return 1;
		
		if (this.x < other.x)
			return -1;
		
		return 0;
	}
	
	//Accessor (Set and Get) methods
	//Get methods should return a copy of the data value.
	public int getX() 
	{
		return x;
	}
	
	//Before writing setX(), HashInt is immutable.
	//After writing setX(), HashInt becomes mutable.
	
	//Set method, even though it is not really a good idea.
	//Generally, Set methods return the old value.
	//Sets the x property to the parameter value, returns the old x value.
	public int setX(int x)
	{
		int oldX = this.x;
		this.x = x;
		return oldX;
	}
	
	
	//Any other methods go here. (Class specific methods.)
	//increment(), decrement(), yada-yada-yada
}
