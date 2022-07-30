/* 
     NameList
    - Manages a list of names.
    - The name strings shall be stored in an array of String.
    - The names will be store in lastname, firstname order using a comma.
*/  
   
public class NameList 
{
    private String [] Names;  //Names.length is the max capacity of the list (ex: we can store 10 names)
    private int size;       //size is the current size of the list (ex: size==0, since we haven't added any names)

    
    
        //int size()
        public int size()
        {
            return size;
        }
        //boolean isEmpty()
        public boolean isEmpty()
        {
            boolean empty = false;
    
            if (size() != 0)
                return empty;
    
            empty = true;
            return empty;
        }
    
        //isFull()
        public boolean isFull()
        {
            if (Names.length > size)
                return false;
            return true;
        }
    
        //addName()
    
        public boolean addName(String newName)
        {
            if (!isFull())
            {
                Names[size] = newName;
                size++;
                return true;
            }
            return false;
        }
    
        //toString()
        public String toString()
        {
            int i;
            String S = "[ ";
            for (i = 0; i < size; i++)
                S += Names[i] + " ";
            S += "]";
    
            return S;
        }
        //removeName(int p) ?
        public void removeName(int p)
        {
            int i;

            if (p >= 0 && p < size)
            {
                for (i = p; i < size-1; i++)
                    Names[i] = Names[i+1];

                size--;
            }
        }

        //getName(int p)
        public String getName(int p)
        {
            if (p < 0 || p >= size)
                return null;

            return Names[p]; 
        }

        //getLastName(int p)
        public String getLastName(int p)
        {
            String N;

            N = getName(p);

            if (N == null)
                return null;

            int c;
            c = N.indexOf(",");
            if (c == -1)
                return N;

            return N.substring(0, c);
        }

        //findName(String name) - linear search
        public int findName(String N)
        {
            int i;
            for (i = 0; i < size; i++)
                if (N.equals(Names[i]))
                    return i;
            return -1;
        }

        //searchList(String sub) - returns a list of names that contain the sub substring
        public boolean contains(String N)
        {
            int i;
            for (i = 0; i < size; i++)
                if (Names[i].equals(N))
                    return true;
            return false;
        }

        //sort()
        public void sort()
        {
            int n, i;
            String T; 

            for (n = 1; n <= size; n++)
                for (i = 0; i < size-1; i++)
                    if (Names[i].compareTo(Names[i+1]) > 0)
                    {
                        T = Names[i]; 
                        Names[i] = Names[i + 1];
                        Names[i + 1] = T; 
                    }
        }

        //Seaches the list for the sub.
        public String searchList(String sub)
        {
            String Ans= " ";
            int i;

            for (i = 0; i < size; i++)
                if (Names[i].indexOf(sub) != -1)
                    Ans += Names[i] + ";";

            Ans = Ans.substring(0, Ans.length()-1);

            return Ans;
        }
    }
}