import javax.lang.model.util.ElementScanner14;

public class RecursiveFunctions {

	public static void main(String[] args)
	{
		printNumbers(5);

		int y = factorial(4);
		System.out.println("factorial(4): " + y);

	}
	
	public static void printNumbers (int n)
	{
		System.out.print(n);
		if (n > 1)
		{
			printNumbers(n-1);
		}
		System.out.print(n);
	}

	public static int factorial(int n)
	{
		int factorial = n * factorial(n-1);
		if (n > 0)
		{
			return factorial;
		}
		return 1;
	}

	public static int Zebra (int a, int b)
	{
		if (b > 0)
		{
			return a + Zebra(a+1, b-1);
		}
		else
		{
			return 2*a;
		}
	}

	public static int R(int n)
	{
		if (n <= 10)
		{
			return n*2;
		}
		else
		{
			return R(R(n/3));
		}
	}

	public static int P2(int a, int b)
	{
		System.out.println();
		if (a <= 5)
		{
			return a;
		}
		else if (a % 2 == 0)
		{
			return P2(P2(a-1, b-1), b);
		}
		else
		{
			return a + P2(P2(a-5, b-5), b);
		}
	}
}
