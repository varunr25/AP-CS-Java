/*  MatrixExamples
    - Illustrates standard techniques using a matrix of integers. 
*/
public class MatrixExamples 
{
    public static void main(String[] args)
        {
            int [][] M = new int [4][5];
            
            int i, j;
            
            //These are all twenty location row/col pairs.
            System.out.println("The Grid Locations: Row Standard Order");
            for (i = 0; i < M.length; i++)
            {
                for (j = 0; j < M[0].length; j++)
                    System.out.print("(" + i + ", " + j + ")   ");
                System.out.println();
            }
            System.out.println("******************************************");
            System.out.println();
            
            //load the matrix with some numbers.
            for (i = 0; i < M.length; i++)
                for (j = 0; j < M[0].length; j++)
                    M[i][j] = -1 * ((int)(Math.random() * 10) + 50);
            
            System.out.println("The Grid: Row Standard Order");
            printGrid(M);
            System.out.println();
            
            System.out.println("The Grid: Column Order");
            printColumns(M);
            System.out.println();
            
            System.out.println("Print double rows");
            printDoubleRows(M);
            System.out.println();
            
            System.out.println("Print opposite direction rows");
            printOppositeRows(M);
            System.out.println();
    
            int sum = summation(M);
            System.out.println("Summation: " + sum);
            
            double average;
            int total = M.length * M[0].length;  //The matrix length * width
            
            average = (double) sum / total;
            System.out.println("Average: " + average);
            
            int n = count(M, 55);
            System.out.println("Found N in the matrix " + n + " times.");

            // Linear search which located the last occurance or x.
            int x = 55; int pI, pJ;
            pI = pJ = -1;

            boolean found = false;

            for (i = 0; i < M.length; i++)
            {
                for (j = 0; j < M[0].length; j++)
                {
                    if (M[i][j] == x)
                    {
                        found = true;
                        pI = i;
                        pJ = j;
                    }
                }
            }

            if (found)
            {
                System.out.println(x + " was found at postion (" + pI + ", " + pJ + ").");
            }
            else
            {
                System.out.println(x + " was not found within the array.");
            }

            int h = highestValue(M);
            System.out.println("Highest Value: " + h);

        }//end of main

       /*   Highest Algorithm
            - Starting with a value from the list,
              store that value as the highest value found so far.
            - Search through the entire list, if a higher value 
              is found, store that value as the highest value found so far.
            - The highest value in the list is the last value stored.
	    */
	public static int highestValue(int[][] M)
	{
		int i, j;
		int H;
		
		//<missing line>
		//H = M[0][0];
		//H = M[1][1];
		H = 0;
		
		for (i = 0; i < M.length; i++)
			for (j = 0; j < M[0].length; j++)
				if (M[i][j] > H)
					H = M[i][j];
		
		return H;
	}
	
	//  Returns the sum of all values in matrix M.
	public static int summation(int[][] M)
	{
		int sum = 0;
		int i, j;
		for (i = 0; i < M.length; i++)
			for (j = 0; j < M[0].length; j++)
				sum += M[i][j];
		return sum;
	}
	
	//  Count the number of x values in matrix M.
	public static int count(int[][]M, int x)
	{
		int c = 0;
		int i, j;
		for (i = 0; i < M.length; i++)
			for (j = 0; j < M[0].length; j++)
				if (M[i][j] == x)
					c++;
		
		return c;
	}
	
	//  Prints the matrix grid.
	public static void printGrid(int[][] M)
	{
		int i, j;
		for (i = 0; i < M.length; i++)
		{
			for (j = 0; j < M[0].length; j++)
				System.out.print(M[i][j] + " ");
			System.out.println();
		}		
	}
    
    //  Prints the columns of the matrix.
	public static void printColumns(int[][] M)
	{
		int i, j;
		for (j = 0; j < M[0].length; j++)
		{
			for (i = 0; i < M.length; i++)
				System.out.print(M[i][j] + " ");
			System.out.println();
		}		
	}

    // Prints the rows, but twice.
	public static void printDoubleRows(int[][] M)
	{
		int i, j;
		for (i = 0; i < M.length; i++)
		{
			for (j = 0; j < M[0].length; j++)
				System.out.print(M[i][j] + " ");
			
			for (j = M[0].length-1; j >= 0; j--)
				System.out.print(M[i][j] + " ");
					
			System.out.println();
		}		
	}
    
    // Prints the rows, but opposite.
	public static void printOppositeRows(int[][] M)
	{
		int i, j;
		for (i = 0; i < M.length; i++)
		{
			if (i % 2 == 0)
				for (j = 0; j < M[0].length; j++)
					System.out.print(M[i][j] + " ");
			else
				for (j = M[0].length-1; j >= 0; j--)
					System.out.print(M[i][j] + " ");
			System.out.println();
		}		
    }
}