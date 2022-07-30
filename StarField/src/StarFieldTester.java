/*	Star Field
	 - Creates a star field object (data structure class).
	 - Adds a bunch of star objects into the field (unit class).
	 - Adds some stars as part of a constellation. 
	 - Print out the Sky.
	 - Get a list of all of the Stars in a specific combination.
*/
public class StarFieldTester 
{
	public static void main(String[] args) 
	{
		StarField theSky = new StarField(10, 10);
		int i, R, C;
		for (i = 1; i <= 20; i++)
		{
			R = (int)(Math.random() * 10);
			C = (int)(Math.random() * 10);
			theSky.addStar(1, R, C, "*", "");
		}
			
		theSky.addStar(1, 9, 4, "*", "Varun Hook");
		theSky.addStar(1, 5, 4, "X", "Varun Hook");
		theSky.addStar(1, 8, 4, "*", "Varun Hook");
		theSky.addStar(1, 7, 4, "*", "Varun Hook");
		theSky.addStar(1, 6, 4, "*", "Varun Hook");
		theSky.addStar(1, 5, 3, "*", "Varun Hook");
		theSky.addStar(1, 5, 5, "*", "Varun Hook");
		theSky.addStar(1, 4, 4, "*", "Varun Hook");
		theSky.addStar(1, 4, 6, "*", "Varun Hook");
		theSky.addStar(1, 3, 7, "*", "Varun Hook");
		theSky.addStar(1, 3, 2, "*", "Varun Hook");
		theSky.addStar(1, 4, 4, "*", "Nunes Constellation");
		
		System.out.println(theSky.toString());

		Star[] L;	//means that L[i] will give you a star object. 
		
		L = theSky.starList();	//Gets a list of all of the Stars in the sky.
		System.out.print("All of the stars: ");
		for (i = 0; i < L.length; i++)
			System.out.print(L[i].getImage() + " ");
		System.out.println();
		
		L = theSky.constellationList("Varun Hook");		//Calls the constellation function.
		System.out.print("All the stars in the 'Varun Hook' constellation: ");
		for (i = 0; i < L.length; i++)
			System.out.print(L[i].getImage() + " ");
		System.out.println();

		int n; n = theSky.countNeigbors(4, 5);
		System.out.println("The number of neighbors surrounding [4][5]: " +  n + ".");		
		
		L = theSky.neighboringStars(2, 2);
		for (i = 0; i < L.length; i++)
			System.out.println(L[i].getImage() + " is located at: (" + L[i].getRow() + ", " + L[i].getColumn() + ").");		
		
		double t = theSky.averageImageIntensity("Nunes Contellation", "*");
		System.out.println(t);

		L = theSky.northAndEast(4, 5);
		for (i = 0; i < L.length; i++)
			System.out.println(L[i].getImage() + " is located at: (" + L[i].getRow() + ", " + L[i].getColumn() + ").");	

	}
}