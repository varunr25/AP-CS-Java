/*  DoubleArray
    - Manages an array of Double objects.
*/
public class DoubleArray 
{
    private Double[] L;

    public DoubleArray(int size) 
    {
       L = new Double[size]; 
       this.loadRandom(100);
    }

    public int size()
    {
        return L.length;
    }

    public void loadRandom(double max)
    {
        //Loads list L with random Ineger objects ranging from 1 to 100
        
        int i;
        for (i = 0; i < L.length; i++)
        {
            L[i] = new Double (Math.random() * max);
        }
    }

    public Double summation()
    {
        //Returns the sum of all of the values in list L.

        double sum = 0.0;

        for (Double X: L)
        {
            sum += X.intValue();
        }
        
        return new Double (sum);
    }

    public Double average()
    {
        //Returns the average of all of the values in List L, as a Double.

        double avg = 0.0;

        int sum = summation().intValue();
        avg = (double) sum / L.length;

        return new Double (avg);
    }

    public int find(Double k)
    {
        //Returns the position of k in L, if found.
        
        int i;
        for (i = 0; i < L.length; i++)
        {
            if (k.equals(L[i]))
            {
                return i;
            }
        }
        return -1;
    }

    public int highest()
    {
        //Store the first value and its position.
        
        int i, p;
        Double H;
        H = L[0];
        p = 0;

        for (i = 0; i < L.length; i++)
        {
            if (L[i].compareTo(H) > 0)
            {
                H = L[i];
                p = i;
            }
        }

        return p;
    }

    public void sort()
    {
        /*
        - Uses compareTo().
        - Integer class implements Comparable.
        */

        int n, i;
        Double T; 

        for (n = 1; n <= L.length; n++)             //repeat n times
        {
            for (i = 0; i < L.length-1; i++)        //pass through the list
               {
                if (L[i].compareTo(L[i+1]) > 0)
                {
                    T = L[i]; 
                    L[i] = L[i + 1];
                    L[i + 1] = T; 
                }
               }
        }        
    }
    
    public Double median()
    {
        /*
        - List will be sorted after a call to this method
        - A list with an odd number of elements is the middle value.
        - A list with an even number of elements is the average of the middle two values.
        */

        this.sort();

        double p = [L.length / 2];
        double med;

        if (L.length % 2 == 1)
        {
            med = (double) L[p].intValue();
        }
        else
        {
            med = (L[p].intValue() + L[p-1].intValue()) / 2.0;
        }
        return new Double(med);
    }
}