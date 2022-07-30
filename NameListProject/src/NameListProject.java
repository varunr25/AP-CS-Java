import java.time.Period;

public class NameListProject 
{
	public static void main(String[] args) 
	{
		NameList Period4 = new NameList(10);
		Period4.addName("Mirra");
		Period4.addName("Ethan");
		Period4.addName("Alekyha");
		Period4.addName("Timmy");

		System.out.println("Period 4: " + Period4);
		Period4.removeName(1);

		System.out.println("Period 4: " + Period4);
		System.out.println("The name in position 1: " + Period4.getName(1));

		NameList Period3 = new NameList(10);
		Period3.addName("Schmo,Joe");
		Period3.addName("Nunes,Michael");
		Period3.addName("Bobbo,Bob");
		Period3.addName("Timmy,Timmy");
		Period3.addName("Rich,Richie");
		Period3.addName("Ricaro,Richardo");

		System.out.println("Last name of position 1: " + Period3.getLastName(1));
		System.out.println("Last name (not) Period 4, Position 2: " + Period4.getLastName(2));
		
		int p = Period4.findName("Michael");
		if (p == -1)
		{
			System.out.println("Michael not found");
		}
		else
		{
			System.out.println("Michael found at " + p);
		}

		Period4.sort();
		System.out.println("Period 4: " + Period4);
		System.out.println();

		System.out.println("Period 3: " + Period3);
		System.out.println("Period 3 \"Rich\" names:" + Period3.searchList("Rich"));
	}
}