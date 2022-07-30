//	Unique List Class
/*	- Manages a list of integer values that are unique.
	- The list of values will always remain sorted (user choice).	
	- Helper methods help other methods do their jobs.
*/
public class UniqueList 
{
	private int[] L;
	private int next;	//Position in the list where new next value will go & size of current list of numbers.

	public UniqueList (int maxSizeList)
	{
		L = new int [Math.abs(maxSizeList)];	//maxListSize = array's capacity to hold values. 
		next = 0;
	}

	public String toString()
	{
		String S = "[ ";
		int i;
		for (i = 0; i < next; i++)
		{
			S += L[i] + " ";
		}
		S += "]";

		return S;
	}
	
	//	Returns next
	public int size()
	{
		return next;
	}

	// 	Returns L.length
	public int capacity()		
	{
		return L.length;	//essentially 'maxSizeList'
	}

	//	isUnique (has a contain method) returns true if the new value is unique, false if value already exists.
	public boolean isUnique(int value)
	{
		int i;
		for (i = 0; i < next; i++)
		{
			if (L[i] == value)
				return false;				
		}
		return true;
	}

	// 	Adds int x to a new value in the list;	returns true if successful, false if unsuccessful
	public boolean add(int value) //Helper Method
	{
		if (next < L.length && isUnique(value))
		{
			L[next] = value;
			next++;
			return true;
		}
		else
			return false;			
	}

	// 	Bubbles the value toward the front of the list into position (one pass of insertion sort)
	public void placeValue()
	{
		int i, T;
		
		for (i = next; i > 0; i--)
		{
			T = L[i];
			L[i] = L[i - 1];
			L[i - 1] = T;
		}
	}	

	//	Returns a list of all of the odd POSITIONED numbers in the list. 
	public int [] oddPositioned()
	{
		int[] ans = new int [size() / 2];	//created the answer space
		int i, k = 0;
		
		for (i = 1; i < size(); i += 2)		//indexes the source with SUBi
		{
			ans[k] = L[i];		//indexes answer with SUBk
			k++;				
		}

		return ans;
	}

	//	Returns a list of all of the odd POSITIONED numbers in the list.  (size / 2)	
	public int [] evenPostitioned()
	{
		int n = this.size() / 2;	//n = number of elements in the answer.
		if (size() % 2 == 1)
		{
			n++;
		}
		
		int [] ans = new int [n];
		int k = 0; int i;

		for (i = 0; i < size(); i += 2)		//indexes the source with SUBi
		{
			ans[k] = L[i];		//indexes answer with SUBk
			k++;				
		}
		return ans; 
	}

	//	Returns a list of all of the odd VALUED elements in the list. 	
	public int [] oddValued()
	{
		int n = 0;			//n = number of elements in the answer.

		int [] ans = new int[n];
		int i;

		int k = 0;
		for (i = 0; i < size(); i++)
			{
				if (L[i] % 2 == 1)
				{
					ans[k] = L[n];
					k++;
				}
			}
				
		return ans;
	}
}