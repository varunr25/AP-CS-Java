/*	IntegerDoubleExamples
	- Illustrates the Integer and Double wrapper classes.
	- Called wrapper classes because they are intended to wrap around otherwise primitive
	  data types, specifically int and double.
	- AutoBoxing is not allowed in AP Computer Science.
	- Integer doesn't have a default constructor method.
	- Integer is derived from Object.
	- Integer implements the Comparable interface. 

	- The keyword static when applied to a property or method means that it can be accessed through
	  the class name without first creating an object of that class.
*/
public class IntegerDoubleExamples 
{
	public static void main(String[] args) 
	{
		Integer A = new Integer(5);	//constructor method
		
		int x = A.intValue();	//Accessor Get method.	Integer doesn't have a Set method.
		
		System.out.println("x = " + x);

		int max = Integer.MAX_VALUE;	//int MAX_VALUE = 2147483647
		int min = Integer.MIN_VALUE;	//int MIN_VALUE = -2147483648

		System.out.println("Min: " + min);
		System.out.println("Max: " + max);

		Integer B = new Integer (A.intValue());	//B is a copy of A.

		B = A; 	//B is now an alias for A (known as a shallow copy)
		
		/*	 Integer Wrapper Class
		
			  - Integer(int)						constructor method
			  - int intValue()						Get method
			  - Integer.MIN_VALUE					minimum value constant
			  - Integer.MAX_VALUE					maximum value constant						
			  - boolean equals(Object)				inherited from Object
			  - String toString()				
			  - int compareTo(Object)				gained from implementing Comparable	
			  - 
			  **Understand Autoboxing	
			  Necessary to use the equals() method with an Integer object rather than using ==.			
		*/
		
		if (A.equals(B))
		{
			System.out.println(A + " is equal to " + B);
			System.out.println("A contains the same int value as B.");
		}
		else	//(!(A.equals(B))) = "is not equal"
		{
			System.out.println(A + " is NOT equal to " + B);
		}

		if (A.compareTo(B) == 0)
		{
			System.out.println(A + " contains the same int value as" + B + ".");
		}
		else
			System.out.println(A + " is NOT the same as " + B + ".");

		if (A.compareTo(B) < 0) 	//A smaller than b
		{
			System.out.println(A + " contains an int value smaller than " + B + ".");
		}

		if (A.compareTo(B) > 0)		//A greater than B
		{
			System.out.println(A + " contains an int value greater than " + B + ".");
		}

		Integer mod = IntegerModulus(A, B);
		System.out.println(A + " modulus " + B + " is " + mod + ".");

		Integer Larger = Larger(A, B);
		System.out.println(Larger + " is the larger value or they are equal.");

		//Double average = Average(A, B, C);

		Integer Large = Larger(A, B);
		System.out.println("The larger value is " + Large);
	}

	public static Integer IntegerModulus(Integer A, Integer B)
	{
		/*
			Calculation and return a new value, as an Integer.
			Returns A modulus B as an Integer.
		*/

		int a, b;				//unwrap the Integer parameters
		a = A.intValue();
		b = B.intValue();
		
		int m;					//do the math
		m = a % b;
		return new Integer(m);	//wrap the answer back up
	}

	public static Integer Larger(Integer A, Integer B)
	{
		/*
			Process the input values and return one of the other.
			Creating aliasing, but Integer is immutable.
			Returns the Integer object that is larger than the other.
		*/
		if (A.compareTo(B) > 0)		//if (A.intValue() > B.intValue())
		{
			return A;
		}
		return B;
	}

	public static Double Average(Integer A, Integer B, Integer C)
	{
	/*
		Calculation and return a new value as a Double
		Returns the average of the three Integer parameters and returns a new Double as a result
	*/
	double avg = (A.intValue() + B.intValue() + C.intValue()) / 3.0;
	
	return new Double(avg);
	}
}
