//HashIntTester
public class HashIntTester 
{
	public static void main(String[] args) 
	{
		HashInt A = new HashInt();		//HashInt.HashInt()	
		System.out.println("A = " + A.toString());
		
		HashInt B = new HashInt(5);		//HashInt.HashInt(int x)	
		System.out.println("B = " + B.toString());
		
		HashInt C = new HashInt(B);		//HashInt.HashInt (HashInt other)
		System.out.println("C = " + C.toString());

		if (A.equals(B))
		{
			System.out.println("A is equal to B.");
		}
		else
		{
			System.out.println("A is NOT equal to B.");
		}
		System.out.println();
		
		Rectangle R1 = new Rectangle (5,6);
		Rectangle R2 = new Rectangle (R1);
		
		WholeNumber W1 = new WholeNumber();
		WholeNumber W2 = new WholeNumber();

		System.out.println("W1 = " + W1.toString());
		
		if (W1.equals(W2))
		{
			System.out.println("W1 equals W2");
		}
		else
		{
			System.out.println("W1 does not equal W2");
		}

		HashInt HW = new WholeNumber();
	}
}