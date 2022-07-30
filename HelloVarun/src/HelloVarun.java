//"Hello World - 9/4/20"
/*
 Illustrates the print() and println() methods.
*/

/*
 	-Java is an object oriented language
	-You must always know what class  your objects are instances of 
 	-Class = definition
	-Object = actual thing
*/

public class HelloVarun 
{

	public static void main(String[] args) 
	{
		System.out.println("Hi, this is Varun Rajesh!"); // Prints what's in the quotes
		
		System.out.println(); //Prints out a blank line
		
		//lines 15-17 are printed onto one line, even though they are on 3 lines.
		
		System.out.print("This is on");
		System.out.print(" a single ");
		System.out.println("line!");
		
		System.out.println(); 
		
		//			Escape Sequences
		/*
		 	\"  - double quote character
		 	\n	- Enter key character
		 	\t	- Tab character
		 	\\	- Backslash character
		 	
		 */
		
		System.out.println("Print the double quote:\""); 	//Prints a "
		System.out.println("Print the enter:\n");			//Puts a new line
		System.out.println("Print the tab character:\t !");	//Prints a tab 
		System.out.println("Print the backslash:\\");		//Prints \
		
		System.out.println();
		
		System.out.println(5 + 2);		//Prints 7		Addition operator
		System.out.println("5" + 2);	//Prints 52		Stringization operator
		System.out.println("5" + 2 + 7);//Prints 527	From string to concatenated
		
	}

}
