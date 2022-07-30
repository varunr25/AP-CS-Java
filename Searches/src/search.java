import java.lang.Math;
public class search
{
	private int[] L; 	//L is constructed of the given size 5 and all values are zero
	
	//	Searches for the integer in the array. 
	public search (int size)	
	{
		L = new int [Math.abs(size)];
	}
	
	//	Determines the length of the array.
	public int length()		
	{
		return L.length;
	}
	
	//	Loads list L with random integer values ranging from 1 to 100
	public void loadRandom(int max) 
	{
		int i;
		for (i = 0; i < this.L.length; i++)
		{
			L[i] = (int) (Math.random() * max) + 1;
		}		
	}
	
	/* 	Returns true if position P is valid index for array L
		Valid values of P: 0 =< P < A.length
	*/	
		public boolean isValid(int p)					
		{								
			if ((p >= 0) && (p < L.length))
			{
				return true;
			}
			else
			{
				return false;
			}
		}	
		
	/*	This method sets the element at position p = value; also returns the previous value
		If p is invalid, returns zero
	*/
	public int set(int p, int value)	
	{
		int oldV = 0;
		if (this.isValid(p))
		{
			oldV = L[p];
			L[p] = value;
		}
		return oldV; 
	}
	
	//	Returns the value located at position p, if p is valid
	public int get(int p)	
	{
		if (this.isValid(p))
		{
			return L[p];
		}
		else
		{
			return 0;
		}
	}
	
	/*	Returns true if K is found in L, false if not. DOES NOT tell where.
		- NOTE: Usually, when placing an else in a for-loop is WRONG!
	    - Linear Search algorithms must look thru all of the elements in the list in order to 
	    - determine if a value is not present.													
	*/
	public boolean contains(int k)
	{
		for (int x: L)
			if (x == k)
				return true;
		return false;
	}

	// Returns the position of K in L, if it is found. Will return -1 if not found.
	public int find(int k)
	{
		int i, p = -1;
		for (i = 0; i < L.length; i++)
			if (k == L[i])
				return i;	//Position of the first K found
		return p;	//Position of the last K found
				 
	}
	
	/*	Returns the position of the highest value in list L.
	 	 - Stores the first value and its position.
	 	 - It completes a linear search through the list. (Looks at everything in the list)
	 	 - If a higher value is found, it stores that value and it
	 	 - The highest value is the 
	*/	
	public int highest()
	{
		int i, p, H;	// H = highest value | p = position of H
		H = L[0];	p= 0;		
		for (i = 0; i < L.length; i++)	//Updates when the higher value is found
			if (L[i] > H)
			{
				H = L[i];
				p = i;
			}
		return p;
	}

	/*	Bubble Sort
	 	- Starts with the first value in the list and compares it with the second.
	 	- If they are out of order, it swaps them.
	 	- Continue with overlapping pairs (2nd + 3rd, 3rd + 4th, etc)
	 	- Repeats once for each value in the list.
		 - NOTE: For ascending order, after one pass, the highest value becomes last.	
	*/
	public void bubbleSort ()
	{
		int n, i, T;
		
		for (n = 1; n <= L.length; n++)
		{
			for (i = 0; i < L.length-1; i++)
			{
				if (L[i] > L[i + 1])
				{
					T = L[i];
					L[i] = L[i + 1];
					L[i + 1] = T;
				}
				
			}
		}
	}
	
	/*	Insertion Sort
		- Starting with the first element, it bubbles that element as far left as possible.
		- Next, considers the 2nd, 3rd, 4th, etc elements bubbling as far left as possible until
		  all elements are considered. 
		- NOTE: If an array is sorted, then any subset will also be sorted.
		- NOTE: After one pass using this sort, nothing changes. 
	*/
	public void insertionSort ()
	{
		int n, i, T;
		
		for (n = 0; n <= L.length; n++)
		{
			for (i = n; i > 0; i--)
			{
				if (L[i] < L[i - 1])
				{
					T = L[i];
					L[i] = L[i - 1];
					L[i - 1] = T;
				}
			}
		}
	}
	
	/*	Sequential Sort
	    - Starting with the first element in the list, compare it to all of the remaining elements.
	    - If they are out of order swap them.
	    - If it finds a smaller value, it swaps the values in those positions.
	    - Example:
	    	- 1st compared with 2nd, 3rd, etc.
	    	- 2nd compared with 3rd, 4th, etc.
	    	- 3rd compared with 4th, 5th, etc.
	  */	
	public void sequentialSort()
	{
		int n, i,j, T;
		
		for (i = 0; i < L.length-1; i++)
		{
			for (j = i + 1; j < L.length; j++)
			{
				if (L[i] > L[j])
				{
					T = L[i];
					L[i] = L[j];
					L[j] = T;
				}					
			}
		}
	}
	
	/*	Selection Sort
    	- Starting with the first element in the list, locate the smallest value of the remaining elements.
    	- Then, swap it with the value in the first element.
   		- Then, it repeats at the start of the 2nd, 3rd, etc.
    	- NOTE: If an array is sorted ascending, the first element is the smallest value. 
 	*/	
	public void selectionSort()
	{
		int i, j, p;
		int T;
		
		for (i = 0; i < L.length-1; i++)
		{
			p = i;
			for (j = i + 1; j < L.length; j++)
			{
				if (L[j] < L[p])
				{
					p = j;					
				}					
			}
			T = L[i];
			L[i] = L[p];
			L[p] = j;
		}		
	}

	/*	Binary Search
		- Starting with the middle element of a list sorted in ascending order, if the value is found,
	  	  return the middle element position.
		- If the value to be found is greater than the middle value, look to the right.
		- If the value to be found is less than the middle value, look to the left.
		- PRECONDITION: The array MUST be sorted in ascending order.	 
 	*/
	public int binarySearch(int k)
	{
		int low, high, mid;
		low = 0; 
		high = (L.length);
				
		while (low <= high)
		{
			mid = (low + high) / 2;
			
			if (L[mid] == k)
			{
				return mid;
			}
			
			if (L[mid] > k)
			{
				low = mid + 1;		//Look in the right half.
			}
			
			if (L[mid] < k)
			{
				high = mid - 1;		//Look in the left half.
			}			
		}
		return -1;
	}	
}	