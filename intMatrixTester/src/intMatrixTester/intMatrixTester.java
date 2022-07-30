package intMatrixTester;

/*	intMatrixTester
	- Uses the class "intMatrix".
*/
public class intMatrixTester 
{
	public static void main(String[] args) 
	{
		intMatrix theGrid = new intMatrix (4, 5);

		System.out.println("The Grid:");
		System.out.println(theGrid);
		int []L;

		L = theGrid.extractRow(2);
		System.out.print("\nRow 2: ");
		printList(L);

		L = theGrid.extractCol(3);
		System.out.print("\nColumn 3: ");
		printList(L);

		L = theGrid.extractColSection(3, 1, 3);
		System.out.print("\nSection of Column 3: ");
		if (L == null)
			System.out.println("Invalid Parameters.");
		else
			printList(L);

		L = theGrid.evenList();
		System.out.print("\nEven List: ");
		printList(L);

		L = theGrid.matrixToArray();
		System.out.print("\nMatrix → Array: ");
		printList(L);

		L = theGrid.removedRowList(3);
		System.out.print("\nRemoved Row 3 from the Matrix, List Form: ");
		printList(L);

		int [][]A;
		A = theGrid.removedRowMatrix(3);
		System.out.println("\nRemoved Row 3 from the Matrix, Matrix Form: ");
		printGrid(A);

		A = theGrid.reverseAllValues();
		System.out.println("\nThe Matrix, but it's reversed:  ");
		printGrid(A);

		A = theGrid.minorMatrix(1, 2);
		System.out.println("\nThe Matrix, but Row 1 and Column 2 are GONE: ");
		printGrid(A);

		L = theGrid.neighbors(0, 0);
		System.out.print("\nNeighboring Elements at [0][0]: ");
		printList(L);

	}

	private static void printList (int[] L)
	{
		for (int x: L)
			System.out.print(x + " ");
		System.out.println();
	}
	
	private static void printGrid (int[][] M)
	{
		for (int [] row: M)			//for each row
		{
			for (int x: row)		//for each element in the row
				System.out.print(x + " ");
			System.out.println();
		}
	}
}