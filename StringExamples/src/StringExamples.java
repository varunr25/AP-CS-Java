import javax.lang.model.util.ElementScanner14;

//StringExamples

/*
 	Note:  String objects are immutable, which means we cannot directly alter the characters in the string.
 	Note:  We shall not be using the char data type at all in this course.  We use String objects of length 1 as characters.
 	
  	String() 					- 	Constructor methods.
  	
  	int length()				-  	Returns the number of characters in the String.
  
  								   	Inherited from Object
  	.toString()					-  	Returns the String (we tend not to use this)
  	.equals(Object obj)			-  	Returns true if this object's characters matches obj's characters exactly, false if not.
  
  	+							-  	Concatenation operator, which returns a new String that contains all of the characters
  								   	from both String.
  	+=							-  	Concatenation with assignment  (concatenation accumulator operator)
  	
  	substring(int p)			
  	substring(int p, int maxp)	
  	
  	int indexOf(String sub)		
									Gained from the Comparable Interfact
  	int compareTo(Object obj)	-	This is an optional method that any class can implement.	
  								-	To gain this method a class must say "implements Comparable"
  								- 	Comparable is called an interface (contains unfinished methods).
  								
  	int indexOf(String sub)	- returns the position of the first sub found in the String, returns -1 if sub is not found.
*/

public class StringExamples 
{
	public static void main(String[] args) 
	{
		String x = new String();			//The default String is an empty string (long way)
		System.out.println("x:" + x + "!");
		
		
		
		String A = "Hello";					//String constant (literal) (short way)
		
		String B = new String("Hashim");	//String object (standard way)
		
		String C = new String(B);			//copy of a String
		//String C = B;						//alias situation
			
		System.out.println("A:" + A + "!");
		
		
		String T = "";						//T is the empty string (short way)
		T += A;
		System.out.println("T = " + T);
		T += A;
		System.out.println("T = " + T);
		
		
		//     012345
		//A = "Hello"
		//B = "Hashim"
		//C = "Hashim
		
		
		//When the == operator is used with object references, it is almost always false.
		//It will only be true if one reference is an alias of the other.
		//Alias means that the references contain the same memory location number.
		//Note: We do not use == operator with objects, unless we are checking for an alias situation.
		if (C == B)
			System.out.println("True if C actually references the same object as B");
		else
			System.out.println("No");
		
		
		//Note:  To check objects for equality, we use the equals() method.
		if (A.equals(B))
			System.out.println("A is has the same characters as B");
		else
			System.out.println("No");
		
		
		if (C.equals(B))
			System.out.println("C is has the same characters as B");
		else
			System.out.println("No");
		
		
		C = new String("America");		//C now references a new String object. 
	
		//     012345
		//A = "Hello"
		//B = "Hashim"
		//C = "America"
		
		// Axxxxxx, Haxxxx, Hexxx
		
		/*
		  	int compareTo(Object obj)	//Note:  compareTo() returns an int value.
		  								//Note:  compareTo() is not commutative, so order matters.
			A.compareTo(B)				//Asks A to compare its values to the values in B.
		  	
		  	Comparison			Return value
		  	A same as B				== 0
		  	A less than B			 < 0
		  	A greater than B		 > 0	  	 
		*/
		
		//Any class that implements Comparable has compareTo() which operates in this way.
		//equality
		if (A.compareTo(B) == 0)	//A is the same as B
			System.out.println(A + " is the same string as " + B);
		else
			System.out.println(A + " is the NOT same string as " + B);
		
		//A is less than B
		if (A.compareTo(B) < 0)		//earlier in the alpha-numeric-bet
			System.out.println(A + " is earlier in the alphabet than " + B);
		
		//A is greater than B
		if (A.compareTo(B) > 0)		//later in the alpha-numeric-bet
			System.out.println(A + " is later in the alphabet than " + B);
		
		System.out.println("------------------------------------------------\n");
		
		//     012345
		//B = "Hashim"
		//C = "America"
		
		//Note: compareTo() returns 0 when equals() returns true.
		if (C.compareTo(B) == 0)
			System.out.println(C + " is the same string as " + B);
		else
			System.out.println(C + " is the NOT same string as " + B);
			
					   //C < B
		if (C.compareTo(B) < 0)	
			System.out.println(C + " is earlier in the alphabet than " + B);
				
		if (C.compareTo(B) > 0)	
			System.out.println(C + " is later in the alphabet than " + B);
		
		
		
		/*
		  	The substring() methods return new String objects containing the
		  	characters described by the parameter index values.
		  
		 	String substring(int p) - returns a new String from character number p to the end.
		 	
		 	String substring(int p, int maxp) -  returns a new String from character number p
		 										 upto but not inclucde character number maxp.
		 										 All characters: p <= i < maxp
		*/
		
		//	   012345
		//B = "Hashim"
		System.out.println("B: " + B);
	
		String L, M, R;
		
		L = B.substring(0);			//Hashim				
		L = B.substring(0, 1);		//H				The first character 	(BASIC: L$ = LEFT$(B$, 1))
		
		M = B.substring(1);			//ashim
		M = B.substring(1, 4);		//ash
		
		M = B.substring(1, 2);		//a
		
		L = B.substring(0, 3);		//Has
		R = B.substring(3);			//him
		
		R = B.substring(B.length()-1); //m			The last characdter 	(BASIC:  R$ = RIGHT$(B$, 1)) 
		
		
		B = L + "-" + R;
		System.out.println("B: " + B);
		
		
		int i;
		T = "";
		
		for (i = 0; i < B.length(); i++)
		{
			L = B.substring(i, i+1);				//This is how to get a character out of a String
			T += L + " ";
		}
		System.out.println("T: " + T);
		
		String F;
		
		//Parse the full name into a first name and a last name String.
		//          012345678
		String N = "Joe Bob Schmo";
		
		int p;
		
		//Searching for a character in a String, the long way.
		p = -1; 		//-1 means not found.
		
		for (i = 0; i < N.length(); i++)
		{
			A = N.substring(i, i+1);
			if (A.equals(" "))									//A.compareTo(" ") == 0
				p = i;
		}
		
		System.out.println("The position of the last spacebar: " + p);
		
		F = N.substring(0, p);
		L = N.substring(p+1);
		
		System.out.println("First Name: " + F);
		System.out.println("Last Name: " + L);
		
		
		
		//************ indexOf() **************************
		/*
		  int indexOf(String sub)	- returns the position of the first sub found in the String, returns -1 if sub is not found.
		
		  //   0123456789012
		  S = "Welcome back!";
		  
		  p = S.indexOf("W");	//p == 0
		  p = S.indexOf("Wel");	//p == 0
		  p = S.indexOf("e");	//p == 1
		  p = S.indexOf("WE");	//p == -1
		  p = S.indexOf("!");	//p == 12
		  p = S.indexOf("?");	//p == -1
		
		*/
		//   0123456789012
		N = "Joe Bob Schmo";
		
		//Searching for a character in a String, the long way.
		p = N.indexOf(" "); //p == 3
		
		System.out.println("The position of the first spacebar: " + p);
		
		F = N.substring(0, p); //Joe
		L = N.substring(p+1);  //Bob Schmo
		
		//Separates the first name from the rest of the String.
		System.out.println("First Name: " + F);  //Joe
												 //0123456
		System.out.println("Last Name: " + L);	 //Bob Schmo
		System.out.println();
		
		p = L.indexOf(" ");
		M = L.substring(0, p);
		L = L.substring(p+1);
		
		System.out.println("All three names separated.");
		System.out.println("First Name: " + F);
		System.out.println("Middle Name: " + M);
		System.out.println("Last Name: " + L);		
		
		/*
			We can parse sub-strings reliabily if we have unique characters to search for.
			Format means the way in which data is organized.
			
			String				Unique Character
			------------------------------------
			Joe Schmo			" "
			Schmo,Joe 			", "
			Schmo, Joe 			",  "
			joschmo@aol.com		"@"	or 	"."
			(845)639-6566		"("	or	")"	or "-"
			845-639-6566		"-" (but it has two)
			8456396566			<none>
			*/
			
		String W;

		W = "Well, it's no secret that the best thing about a secret is secretly telling someone your secret, thereby secretly adding another secret to their secret collection of secrets, secretly.";
		W += " ";
		String words = new String(W);	
		p = 0;			//Position of "secret"
		int n = 0;		//The counter
		

		while (p != -1)
		{
			p = words.indexOf("secret");	//if p not -1, then "secret" is in W and p is where it starts.
			if (p != -1)
			{
				n++;
				words = words.substring(p+1);	//Destructive algorithm
			}
		}
		System.out.println();
		System.out.println("I found \"secret\" " + n + " times.");
		System.out.println(W);

		//Parse words from a sentence.
		words = new String(W);
		words += " ";

		String X;

		while (!words.isEmpty())
		{
			p = words.indexOf(" ");
			if (p != -1)
			{
				X = words.substring(0, p+1);	// 0 <= i < p+1 which is 0 <= i <= p	(all characters from 1st char to the spacebar)
				words = words.substring(p+1);	//all characters after the spacebar
				System.out.println(X);			
			}
		}		
		System.out.println("----------------");

		String Q = "Is it a question?";
		p = Q.indexOf("?");

		if (p != -1 && Q.length() > 3 && p == Q.length()-1)
		{
			System.out.println("It is a question.");
		}
		else 
		{
			System.out.println("It is NOT a question.");
		}	
		
		C = "Sit down!";

		p = C.indexOf(" ");		//-1 means spacebar is not there. else, p is the position of the space bar.
		
		if ((p == -1) || (p == 0) )
		{
			System.out.println("It is not a two word command.");
		}
		else
		{
			p = C.indexOf("!");
			if (p == C.length())
			{
				System.out.println("It is a two word command.");
			}
		}
		
		//Verify that every comma is follow by only one space.
		W = "Thereby, we are adding commas, if not secretly, to tell our silly sentence.";
		System.out.println("W: " + W);
		System.out.println("Does this sentence have only commans followed by a single spacebar?");

		boolean ok = true;	//flag value

		p = W.indexOf(", ");
		if (p != -1)
		{
			ok = false;
		}
		else
		{
			for (i = 0; i < W.length(); i++)
			{
				A = W.substring(i, i+1);		//the character at position i
				if (A.equals(","))
				{
					B = W.substring(i+1, i+2);	//the character at position i+1
					if (!B.equals(" "))
					{
						ok = false;
					}
				}
			}
		}
		
		if (ok)
		{
			System.out.println("Yes, all commas are followed by one spacebar.");
		}
		else
		{
			System.out.println("No, I found a comma followed by two spacebars.");

		}		
	}
}