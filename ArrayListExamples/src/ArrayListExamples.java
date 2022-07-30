/*  ArrayList Examples
 	- ArrayList();  constructs an empty list
 	- int size();  returns the size of the list
 	- add(Object); add onto the end of the list
 	- add(int, Object); performs insert functionality
 	- remove(int);  remove and return
	- set(int, Object);  edit and return
*/

import java.util.ArrayList;

public class ArrayListExamples 
{
	public static void main(String[] args) 
	{
		//ArrayList is a raw type. 
		//References to generic type ArrayList<E> should be parameterized
		ArrayList A = new ArrayList();		
		System.out.println("A.size() = " + A.size());
		
        
		//L1 can hold Integer objects.
		ArrayList<Integer> L1= new ArrayList<Integer>();
		
		System.out.println("L1.size() = " + L1.size());
		
		L1.add(new Integer(5));			//boolean add(Object)
		L1.add(new Integer(10));
		L1.add(new Integer(15));
		L1.add(new Integer(20));
		L1.add(new Integer(25));
		
		
		System.out.println("L1.size() = " + L1.size());
		System.out.println("L1: " + L1.toString());  //L1: [5, 10, 15, 20, 25]
		
		// 0  1  2  3  4
		// 5 10 15 20 25
		
		
		L1.add(0, new Integer(2));		//void add(int, Object)	
		System.out.println("L1: " + L1.toString());  //L1: [2, 5, 10, 15, 20, 25]
		
		// 0  1  2  3  4  5
		// 2  5 10 15 20 25
		
		L1.add(new Integer(30));		
		System.out.println("L1: " + L1.toString());  //L1: [2, 5, 10, 15, 20, 25, 30]
		
		// 0  1  2  3  4  5  6
		// 2  5 10 15 20 25 30
		
		//Note: We have two add() methods, one renumbers, the other does not.
		//All successive values will be renumbered when using add(int,Object).
		
		
		L1.add(3, new Integer(12));		//void add(int, Object)	
		System.out.println("L1: " + L1.toString());  //L1: [2, 5, 10, 12, 15, 20, 25]
		
		// 0  1  2  3  4  5  6  7
		// 2  5 10 12 15 20 25 30
		
		L1.remove(0);			//Object remove(int);  remove and return
		System.out.println("L1: " + L1.toString());  //L1: [5, 10, 12, 15, 20, 25]
		System.out.println("L1.size() = " + L1.size());
		
		//We shall only use remove(int).
		//All successive values will be renumbered here also.
		
		// 0  1  2  3  4  5  6
		// 5 10 12 15 20 25 30
		
		Integer x;
		
		x = L1.remove(2);			
		System.out.println("L1: " + L1.toString());  //L1: [5, 10, 15, 20, 25]
		System.out.println("x = " + x.intValue());	 //x = 12
		
		//Note: When performing multiple removes, it is recommended to work backwards.
		//Working backwards through the list eliminated the renumbering issue.
		
		x = L1.set(3, new Integer(14));		//Object set(int, Object);  edit and return
		
		System.out.println("L1: " + L1.toString());  //L1: [5, 10, 15, 14, 25]
		System.out.println("x = " + x.intValue());	 //x = 20
				
		Integer v;
		
		v = L1.get(3);					//Object get(int); returns the object 
		
		System.out.println("v: " + v);
	
		
		System.out.println("******************************\n\n");
		
		L1.add(new Integer(32));
		L1.add(new Integer(35));
		L1.add(new Integer(40));
		L1.add(new Integer(45));
		
		//L1: [5, 10, 15, 14, 25, 30, 32, 35, 40, 45]
		
		//Create a List that contains all of the even values from L1.	
		ArrayList<Integer> EvenL1 = new ArrayList<Integer>();
		
		int i;
		for (i = 0; i < L1.size(); i++)
			if (L1.get(i).intValue() % 2 == 0)
				EvenL1.add(L1.get(i));
		System.out.println("EvenL1: " + EvenL1.toString());
		System.out.println();
		
		
		
		//*****************************************************************
		//Copy values from an array into an ArrayList, edit, copy them back.
		
		int[] vals = {2,5,7,9,0,0,4,0,1,0};
		
		//print out the array
		System.out.print("vals: ");
		for (i = 0; i < vals.length; i++)
			System.out.print(vals[i] + " ");
		System.out.println();
		
		
		ArrayList<Integer> vList = new ArrayList<Integer>();
		
		for (i = 0; i < vals.length; i++)
			vList.add(new Integer(vals[i]));
		
		System.out.println("vList: " + vList.toString());
		
		//Edit: Let's remove all of the zeros from the ArrayList.
		for (i = 0; i < vList.size(); i++)
			if (vList.get(i).intValue() == 0)
			{
				vList.remove(i);
				i--;
			}
		
		//vList: [2, 5, 7, 9, 4, 1]
		
		//vList: [2, 5, 7, 9, 0, 0, 4, 0, 1, 0]
		//vList: [2, 5, 7, 9, 0, 4, 1] (ooops! we need i--;)
		//vList: [2, 5, 7, 9, 4, 1]

		System.out.println("vList: " + vList.toString());
		
		
		//then copy them back into the array.
		//We can either zero out the existing array first, or create a new one.
		//Let's zero out the original array. 

		//zero out the original array.
		for (i = 0; i < vals.length; i++)
			vals[i] = 0;
			
		//copy the values from the ArrayList to the array.
		for (i = 0; i < vList.size(); i++)
			vals[i] = vList.get(i).intValue();
		
		//print out the array
		System.out.print("vals: ");
		for (i = 0; i < vals.length; i++)
			System.out.print(vals[i] + " ");
		System.out.println();
		
		
		//*****************************************************************
		
		/*		  
		int x; 
		
		(C++)					(Java)
		Array					ArrayList
		
		L[i] = x;				A.set(i, new Integer(x));
		x = L[i];				x = A.get(i).intValue();
		
		addOnEnd()				A.add(new Integer(x));
		insert()				A.add(p, new Integer(x));
		
		remove()				A.remove(p);	
		*/
		
		//*****************************************************************
		
		//Standard Algorithms: summation, average, find, highest, pattern insert/remove
		
		System.out.println("---------------------------------------\n");
		
		
		//ArrayList<Integer> L1 = new ArrayList<Integer>();
		System.out.println("L1: " + L1);
		
		//Write a section of code that will calculate the summation of all L1.
		
		int sum;
		
		//For each loop version.
		sum = 0;
		for (Integer X: L1)
			sum += X.intValue();
		System.out.println("Sum: " + sum);
		
		//For i loop version.
		sum = 0;
		for (i = 0; i < L1.size(); i++)
			sum += L1.get(i).intValue();
		System.out.println("Sum: " + sum);
		
		//Calculate the average of all L1.
		double avg;
		avg = (double) sum / L1.size();
		System.out.println("Average: " + avg);
		
				
		//Count how many K values are found in L1.
		Integer K = new Integer(25);
		int c = 0;
		
		//Count how many values are L1 are greater than X.
		for (i = 0; i < L1.size(); i++)
			if (K.equals(L1.get(i)))						//K.intValue() == L1.get(i).intValue()
				c++;
		System.out.println("I found " + c + " value(s) equal to " + K);
		
		
		//highest 
		int p;
		
		p = 0;
		for (i = 0; i < L1.size(); i++)
			if (L1.get(i).compareTo(L1.get(p)) > 0)			//K.intValue() > L1.get(i).intValue()
				p = i;
		
		System.out.println("The highest value: " + L1.get(p));
		
		
		//Insert -1 in front of all odd values in L1.
		System.out.println("L1: " + L1);
		
		//L1: [5, 10, 15, 14, 25, 30, 32, 35, 40, 45]
		//      0  1   2   3   4   5   6   7   8   9  10  11  12  13  14
		//L1: [-1, 5, 10, -1, 15, 14, -1, 25, 30, 32, -1, 35, 40, -1, 45]
		
		Integer N = new Integer(-1);
		
		for (i = 0; i < L1.size(); i++)
			if ( Math.abs(L1.get(i).intValue()) % 2 == 1)
			{
				L1.add(i, N);				//insert N in front of i-th element
				i++;
			}
		
		/*
		  Alternatively
		  
		  for (i = L1.size()-1; i >= 0; i--)
		  	if (L1.get(i).intValue() % 2 == 1)
				L1.add(i, N);  
		*/
		
		System.out.println("L1: " + L1);
	
		
		//L1: [-1, 5, 10, -1, 15, 14, -1, 25, 30, 32, -1, 35, 40, -1, 45]
		//Create a subset of L1.
		//Let's create a subset of L1 containing all of the ... elements. 
		
		ArrayList<Integer> subSet = new ArrayList<Integer>();
		
		for (i = 0; i < L1.size(); i++)			//replace true with a ... condition.
			if ( true )						
				subSet.add(L1.get(i));
		
		System.out.println("subSet: " + subSet);
	}
}