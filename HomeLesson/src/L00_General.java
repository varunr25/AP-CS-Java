import java.util.Scanner;

public class L00_General 
{
	public int getUserInput(String sDisplayText)
	{
		Scanner myObj = new Scanner(System.in);
		System.out.print(sDisplayText + ": ");
		int x = myObj.nextInt();
		//myObj.close();
		return x;
	}

	public String getStringInput(String sDisplayText)
	{
		Scanner myObj = new Scanner(System.in);
		System.out.print(sDisplayText + ": ");
		String x = myObj.nextLine();
		//myObj.close();
		return x;
	}

	public void giveOutput(String sDisplayText, int iDisplayValue)
	{
		System.out.println(sDisplayText + ": " + iDisplayValue);		
	}
	
	public void giveOutput(String sDisplayText)
	{
		System.out.println(sDisplayText);		
	}
}