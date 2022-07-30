public class StarField 
{
    private Star[][] Sky;

    // Creates the sky.
    public StarField(int rows, int cols)    
    {
        Sky = new Star[rows][cols];     //All Star objects are initially null.
    }

    public int numRows() 
    { return Sky.length;    }

    public int numCols()
    { return Sky[0].length; }

    //  Returns a String containin all of the Star images in grid form.
    public String toString()
    {
        String ans = "";
        Star x;
        int i, j;
        for (i = 0; i < numRows(); i++)                    //for (Star[] row: Sky)
            {
                for (j = 0; j < numCols(); j++)                //for (Star[] x: row)
                    {
                        x = Sky[i][j];
                        if (x == null)
                            ans += "- ";
                        
                        else
                            ans += x.getImage() + " ";                    
                    }
                ans += "\n";
            }
        return ans;
    }

    /*  Adds a Star object into the sky at the given location (intensity, image, constellation)
        - GOOD: R >= 0 && R < this.numRows()
    */
    public void addStar (int intensity, int R, int C, String image, String constellation)
    {
        /*if (R < 0 || R >= this.numRows() || C < 0 || C >= this.numCols())
            return 0; */
        
        Star star = new Star(R, C, intensity, image, constellation); 
        Sky[R][C] = star;       
    }
    
    //  Returns a list of all of the Stars in the Sky.
    public Star[] starList()
    {
        int n = 0;
        int i, j, k; k = 0;
        for (i = 0; i < numRows(); i++)     //Counts the number of stars
            for (j = 0; j < numCols(); j++)
                if (Sky[i][j] != null)
                    n++;
        
        Star [] L = new Star[n];

        for (i = 0; i < numRows(); i++)     //Re-finds the stars and k-counts them into a list
             for (j = 0; j < numCols(); j++)
                 if (Sky[i][j] != null)
                        {
                            L[k] = Sky[i][j];
                            k++;
                        }
        return L;
    }

    //  Returns a list of all of the Stars in a certain constellation.
    public Star[] constellationList(String constellationName)
    {
        int n = 0;
        int i, j, k; k = 0;
        for (i = 0; i < numRows(); i++)     //Counts the number of stars
            for (j = 0; j < numCols(); j++)
                if ((Sky[i][j] != null) && (constellationName.equals(Sky[i][j].getConstellation())))
                    n++;
       
        Star [] L = new Star[n];     // Creates a Star array of the exact size. 

        for (i = 0; i < numRows(); i++)     //Re-finds the stars and k-counts them into a list
             for (j = 0; j < numCols(); j++)
                if ((Sky[i][j] != null) && constellationName.equals(Sky[i][j].getConstellation()))
                        {
                            L[k] = Sky[i][j];
                            k++;
                        }
        return L;
    }

    //  Returns the number of non-null star objects neighboring the location R/C.
    public int countNeigbors(int R, int C)
    {
        if (R < 0 || R >= Sky.length || C < 0 || C >= Sky[0].length)
            return 0;

        int i, j, n; n = 0; 
        
        for (i = R-1; i <= R+1; i++)
            for (j = C-1; j <= C+1; j++)
                if (i >= 0 && i < Sky.length)        //Checks to see if 'i' row number is valid.
                    if(j >= 0 && j < Sky[0].length)      //Checks to see if 'j' column number is valid.
                        if(Sky[i][j] != null)               //Checks to see if the Star is null.
                            if(i != R || j != C)                //Checks to see if the Star is not me (center square).     
                                n++;
        return n;
    }

    // Prints the neiboring stars surrounding (R,C)
    public Star[] neighboringStars(int R, int C)
    {
        int n = this.countNeigbors(R, C);

        // Create a Star array of the exact size.
        Star[] L = new Star[n];

        int i, j, k; k = 0;
        for (i = R-1; i <= R+1; i++)
            for (j = C-1; j <= C+1; j++)
                if (i >= 0 && i < Sky.length)        //Checks to see if 'i' row number is valid.
                    if(j >= 0 && j < Sky[0].length)      //Checks to see if 'j' column number is valid.
                        if(Sky[i][j] != null)               //Checks to see if the Star is null.
                            if(i != R || j != C)                //Checks to see if the Star is not me (center square).  
                                {
                                    L[k] = Sky[i][j];
                                    k++;
                                }
        return L;
    }

    /*  Write method averageImageIntensity(), whose header is shown below, such that it returns the average intensity for all of the Stars in a given 
        constellation with a certain image.  
        The Stars to be included in the averaging must be in the same constellation and must have the same image String.
    */
    public double averageImageIntensity(String constellation, String image)
    {
      int i, j, n, total;
      i = j = n = total = 0; 
        if ((Sky[i][j] != null) && constellation.equals(Sky[i][j].getConstellation()) && image.equals(Sky[i][j].getImage()))
                        {
                            total += Sky[i][j].getIntensity();
                            n++;
                        }
        double avg = (total / n);
        return avg;                  
    }

    /*  Write method northAndEast(), whose header is shown below, such that it returns an array containing the Star objects that are directly North (Up)
        and directly East (Right) of the given location indicated by parameters R and C. Only non-null Star objects shall be added to the array and the array 
        shall be sized to contain exactly the correct number of non-null Star objects.  If the given location is invalid, northAndEast() shall return null.  
        If the location is valid, but there are no non-null Stars to add to the list, then northAndEast() shall return an array with zero elements.  
        If one or two non-null Stars are available then northAndEast() shall return an array with one or two elements, respectively.
    */ 
    public Star[] northAndEast(int R, int C)
    {
        int i, j, k; k = 0;
        Star[] L = new Star[2];
        for (i = R; i <= R; i++)
            for (j = C+1; j <= C+1; j++)
                if (i >= 0 && i < Sky.length)       
                    if(j >= 0 && j < Sky[0].length)      
                        if(Sky[i][j] == null)               
                            {
                                L[k] = null;                                
                            }    
                        else
                            {
                                L[k] = Sky[i][j];
                            }
        
        for (i = R+1; i <= R; i++)
            for (j = C; j <= C+1; j++)
                if (i >= 0 && i < Sky.length)       
                    if(j >= 0 && j < Sky[0].length)     
                        if(Sky[i][j] == null)               
                            {
                                L[k] = null;                                
                            }    
                        else
                            {
                                L[k] = Sky[i][j];
                            }        
        
    return L;
    }
}