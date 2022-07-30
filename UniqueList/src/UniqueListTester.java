//Unique List Tester
public class UniqueListTester 
{
	public static void main(String[] args) 
	{
		UniqueList theList = new UniqueList(20); 

		System.out.println("The List: " + theList.toString());
		System.out.println("List Capacity: " + theList.capacity());
		System.out.println("List Size: " + theList.size());
		
		System.out.println();

		theList.add(17);	theList.add(8);		theList.add(9);		theList.add(17);
		theList.add(45);	theList.add(7);		theList.add(88);	theList.add(95);
		
		System.out.println("NEW List: " + theList.toString());
		System.out.println("NEW List Size: " + theList.size());

		theList.isUnique(15);
		System.out.println(theList.isUnique(15));

		int [] theOddPositionedList;	//do not need to create a new array, just the reference
		theOddPositionedList = theList.oddPositioned();
									
		System.out.println("theOddPositionedList");
		for (int x: theOddPositionedList)
		{
			System.out.print(x + " ");
		}
		System.out.println();
		
		int [] theEvenPositionedList;
		theEvenPositionedList = theList.evenPostitioned();

		System.out.println("theEvenPositionedList");
		for (int x: theEvenPositionedList)
		{
			System.out.print(x + " ");
		}
		System.out.println();
	}
}