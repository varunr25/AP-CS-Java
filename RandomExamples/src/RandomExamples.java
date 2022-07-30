//	RandomExamples
/*
	- Illustrates the Random class, which is used to generate random numbers.
	- It is a pseudo random number generator.
	- Also, this program illustrates the creation and usage of an object.
	- Creating an object is called instantiation. To access an object we need a way to find it in memory. 
	- Java uses references to locate object.
	- A reference R points to an object from the Random class: R ---> RandomClassObject
*/

import java.util.Random;
public class RandomExamples
{

	public static void main(String[] args)
{
		int x = 0;
		Random R = new Random(); 				//R refers to a new object.

												//Random() is a constructor method.

	System.out.println("R = " + R); 			//R = java.util.Random@7a81197d
	
	x = R.nextInt(); 							//int java.util.Random.nextInt()
	System.out.println("x = " + x); 			//MIN_VALUE <= x <= MAX_VALUE
	
	//-2147483648 <= x <= 2147483647
	//-2147483648 <= x < 2147483648
	
	//Example: 4-bit system.
	//Unsigned int, we have 16 values, 2^4 = 16.
	//Signed int, we need some to be negative. If the number starts with 1, it's negative.
	//0000, 0001, 0010, 0011, 0100, 0101, 0110, 0111, 1000, 1001, 1010, 1011, 1100, 1101, 1110, 1111
	// 0,    1,    2,    3,    4,     5,    6,    7,   -8,   -7,   -6, -  5,   -4,   -3,  -2,   -1
	//32-bit system: 2^32 = 4294967296
	//2^32 / 2 = 2,147,483,648
	
	int y;
	x = 100;
	y = R.nextInt(x); //returns int in range 0 <= y < x
	System.out.println("y = R.nextInt(x) = " + y);
	int i;
	for (i = 0; i < 100000; i++) //0 <= y < 100, only
	{
		y = R.nextInt(x);
		//System.out.print(y + " ");
	if (y >= 100)
		System.out.println("OH NO!");
	}

	System.out.println("Done");
	System.out.println("-----------------------------");
	System.out.println();
	
	int z, n;
	z = n = 0;
	for (i = 0; i < 100000; i++) 					//Evenly distributed? Yeah.
	{
		y = R.nextInt(2); 							//0 <= y < 2, so 0 or 1
	if (y == 0)
		z++;
	else
		n++;
	}
	
	System.out.println("Zeros: " + z);
	System.out.println("Ones: " + n);
	
	double a;
	a = R.nextDouble(); 							//double java.util.Random.nextDouble()
													//0 <= a < 1.0
													//Fractional value only, maybe zero.
	
	System.out.println("a = R.nextDouble() = " + a);
	a = ((int)(a * 1000)) / 1000.0;
	System.out.println("a " + a);
	
	/*
		R.nextInt() -2147483648 <= n < 2147483648
		R.nextInt(x) 0 <= n < x
		R.nextDouble() 0.0 <= n < 1.0
	*/
	
	//We need to generate random values in certain ranges.

	//0 To 9
	n = R.nextInt(10);
	
	//1 To 10
	n = R.nextInt(10) + 1;
	
	//10 To 19
	n = R.nextInt(10) + 10;
	
	//10 To 20
	n = R.nextInt(11) + 10;
	
	//10.0 To 19.999 or 10.0 <= a < 20.0
	a = R.nextInt(10) + 10 + R.nextDouble();
	
	n = R.nextInt(11) + 10; //10.0 to 20.0
	a = n;
	
	if (n < 20)
		a = a + R.nextDouble();

		//-10 < n < 10
	n = R.nextInt() % 10;
	//-10 <= n <= 10
	n = R.nextInt() % 11;
	
	}
}