//IntegerArrayTester
public class IntegerArrayTester 
{
	public static void main(String[] args) 
	{
		IntegerArray Arr = new IntegerArray(15);	
		IntegerArray Yar = new IntegerArray(10);
		
		Arr.loadRandom(100);
		Yar.loadRandom(1000);

		System.out.println("Arr: " + Arr);
		System.out.println("Yar: " + Yar);

		DoubleArray Dub = new DoubleArray(10);

		System.out.println("Dub: " + Dub.toString());

	}
}