package intMatrixTester;

public class intMatrix 
{
    private int [][] M;         //NOTE: Never return M

    public intMatrix(int numberOfRows, int numberOfCols)
    {
        M = new int[numberOfRows][numberOfCols];
        initialize();
    }

    public void initialize()
    {
        int i, j;

        for (i = 0; i < M.length; i++) 
            for (j = 0; j < M[0].length; j++)
                M[i][j] = ((int) (Math.random() * 90) + 10);
    }

    public String toString()
    {
        int i, j;
        String S = "[ ";
        for (i = 0; i < M.length; i++) 
        {    
            for (j = 0; j < M[0].length; j++)
                S += M[i][j] + " ";
           
           if (i != (M.length-1))       //not the last row
                S += "\n ";
        }

        S += " ]";
        return S;
    }
    
    //  Returns a new array containing all of the values from the row indicated.
    public int[] extractRow(int row)
    {
        if (row < 0 || row > M.length)
            return null;        //return null if a row is invalid
        int [] L = new int [M[0].length];

        int j, k; k = 0;
        for (j = 0; j < M[0].length; j++)
        {
            L[k] = M[row][j];
            k++;
        }
        return L;
    }

    //  Returns a new array containing all of the values from the column indicated.
    public int[] extractCol(int col)
    {
        if (col < 0 || col > M[0].length-1)
            return null;
        
            int [] L = new int [M.length];

        int i, k;   k = 0;
        for (i = 0; i < M.length; i++)
        {
            L[k] = M[i][col];
            k++;
        }

        return L;
     }

     /* Returns the a section of a column indicated by col, starting at indicated row 
        and given length.
        Returns null if indexing is invalid
        Assume that the value in parameter len is postive. (precondition)
    */
    public int[] extractColSection(int col, int startRow, int len)
    {
        if (startRow < 0 || startRow > M.length || col < 0 || col > M[0].length-1)
            return null;
        
        if (startRow + len-1 >= M.length)   //this is bad
            return null;
        
        int[] L = new int[len];  //len indicates how many values we need.
        int i, k; k = 0;

        for (i = startRow; i < startRow+len; i++)
        {
            L[k] = M[i][col];
            k++;
        }

        return L;
    }
    
    /*  Returns a list containing all of the even values in M.
        If there are none, it returns an empty list.        */
    public int[] evenList()
    {
        int i, j, c, k;     c = k = 0;

        for (i = 0; i < M.length; i++)      //Counts the number of even integers in M.
            for (j = 0; j < M[0].length; j++)
                if (M[i][j] % 2 == 0)
                   c++;

        int[] L = new int[c];   //Answer space that holds the # of even elements.

        for (i = 0; i < M.length; i++)    //Finds the even values again & copies them into the answer space.  
            for (j = 0; j < M[0].length; j++)
                if (M[i][j] % 2 == 0)
                {
                    L[k] = M[i][j];
                    k++;
                }  

            return L;
    }

    //  Returns a list containing all of the elements from matrix M.
    public int[] matrixToArray()
    {
        int n = M.length * M[0].length;     //# of the values in the matrix. (Rows* Columns)
        int[] L = new int[n];
       
        int i, j, k; k = 0;
        for (i = 0; i < M.length; i++)      
            for (j = 0; j < M[0].length; j++)
                {
                    L[k] = M[i][j];
                    k++;
                }    
        return L;
    }

    //  Returns a list of all of the elements in M, in order, not including values in row r.
    public int[] removedRowList(int r)
    {
        int n = (M.length - 1 ) * M[0].length; 
        int[] L = new int[n];
        int i, j, k; k = 0;
        for (i = 0; i < M.length; i++)      
            for (j = 0; j < M[0].length; j++)
                if (i != r)     //Filters out row R.  
                    {
                        L[k] = M[i][j];
                        k++;
                    }
        return L;
    }

    //  Returns a matrix not including elements in row r.
    public int[][] removedRowMatrix(int r)
    {        
        int [][] ans = new int [M.length - 1][M[0].length]; 
         
        int[] L = this.removedRowList(r);   //
        
        int i, j, k; k = 0;
        for (i = 0; i < ans.length; i++)      
            for (j = 0; j < ans[0].length; j++)
                if (i != r)     //Filters out row R.  
                    {
                        ans[i][j] = L[k];
                        k++;
                    }
        return ans;
    }

    /*  Returns a matrix with all of the values placed in reverse (first value in the first row will
        become the last value in the last row etc)
         - Copies the value from M into L in reverse, and the copy from L into ans in order.        */
    public int [][] reverseAllValues()
    {
        int [][] ans = new int [M.length][M[0].length];
        int n =  (M.length * M[0].length);
        int [] L = new int[n];

        int i, j, k; k = (L.length - 1);
        for (i = 0; i < M.length; i++)      
            for (j = 0; j < M[0].length; j++)
                {
                  L[k] = M[i][j];
                  k--;
                }
        k = 0;
        for (i = 0; i < ans.length; i++)      
            for (j = 0; j < ans[0].length; j++)
                {
                    ans[i][j] = L[k];
                    k++;
                }

        return ans;     
    }
    
    //  Returns a matrix with every value except the ones in Row R and Column C.
    public int [][] minorMatrix (int R, int C)
    {
        int n = (M.length - 1) * (M[0].length - 1);
        int i, j, k;

        int []L = new int [n];
        int [][] ans = new int [M.length - 1][M[0].length - 1];
        
        k = 0;
        for (i = 0; i < M.length; i++)      
            for (j = 0; j < M[0].length; j++)
                if (!(i == R || j == C))
                   {
                       L[k] = M[i][j];
                       k++;
                   }
       
        k = 0;
        for (i = 0; i < ans.length; i++)      
            for (j = 0; j < ans[0].length; j++)
                {
                    ans[i][j] = L[k];
                    k++;
                }

        return ans;
    }

    /*  Returns a list of all of the neighboring values surrounding element at [R][C]
        Off the Grid
            BAD: 
                - i < 0 || i > M.length-1 || j < 0 || j >= M[0].length
            GOOD: 
                - !(i < 0 || i > M.length-1 || j < 0 || j >= M[0].length)
                - i < 0 && i > M.length-1 && j < 0 && j >= M[0].length
        
        Center Square
            GOOD: 
                - i == R && j == C

        Not Center Sqaure
            BAD: 
                - i == R && j == C
            GOOD: 
                - !(i == R && j == C)
                - i != R || j != C
    */
    public int[] neighbors(int R, int C)
    {
        int i, j, n, k; k = n = 0;
        
        for (i = R-1; i <= R+1; i++)
            for (j = C-1; j <= C+1; j++)
                if (i >= 0 && i < M.length-1 && j >= 0 && j < M[0].length)
                    if (i != R || j != C)
                        n++;

        int [] L = new int[n];
        for (i = R-1; i <= R+1; i++)
            for (j = C-1; j <= C+1; j++)
                if (i >= 0 && i < M.length-1 && j >= 0 && j < M[0].length)
                    if (i != R || j != C)
                        {
                            L[k] = M[i][j];
                            k++;
                        }
         return L;
    }
}