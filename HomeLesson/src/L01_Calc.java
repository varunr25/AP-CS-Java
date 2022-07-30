import java.util.Scanner; 
public class L01_Calc 
{
	
	public static void main(String[] args) 
	{
		int a, b;		
		int input = 1;
		
		Scanner Scanner_name = new Scanner(System.in);
			
		a = getInput("A");
		b = getInput("B");
			
		while (input != 0)
		{
			System.out.println("\nChoose one of the following: ");
			System.out.println("Option 1: Addition");
			System.out.println("Option 2: Subtraction");
			System.out.println("Option 3: Multiplication");
			System.out.println("Option 4: Division");
			System.out.println("Option 5: Remainder");
			System.out.println("Option 6: RESTART");
			System.out.println("Option 0: EXIT");
			System.out.println("Input the option you want.");
						 
			input = Scanner_name.nextInt();			
			
			int output = 0;

			if (input == 1)
				{
					output = a + b;
					giveOutput("Sum", output);
				}
			
			if (input == 2)
				{
					output = a - b;
					giveOutput("Difference", output);
				}

			if (input == 3)
				{
					output = a * b;
					giveOutput("Product", output);
				}

			if (input == 4)
				{
					output = a / b;
					giveOutput("Quotient", output);
				}
		
			if (input == 5)
				{
					output = a % b;
					giveOutput("Remainder", output);
				}
			
			if (input == 6)
				{
					System.out.println("--------------------------\n");
					a = getInput("A");
					b = getInput("B");			
				}
		}
		Scanner_name.close();
	}
	
	public static int getInput(String sLetter)
	{
		System.out.print("Input Value " + sLetter + ": ");
		
		Scanner Scanner_name= new Scanner(System.in);
		int x = Scanner_name.nextInt();
		System.out.println();
		Scanner_name.close();
		return x;
	}
	
	public static void giveOutput (String sOperation, int iOutput)
	{
		System.out.println(sOperation + ": " + iOutput);
		System.out.println("--------------------------");
	}
}