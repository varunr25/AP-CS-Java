/*	CircleRunner
 	- Uses the class Circle in order to determind the radius and the diameter.  
*/
public class CircleRunner 
{
	public static void main(String[] args) 
	{
		//Here, we instantiate object of the class. 
		Circle C1 = new Circle(5.7);
		System.out.println("C1: " + C1.toString()); 	//C1: Circle@2f92e0f4

		Circle C2 = new Circle(12.2);
		System.out.println("C2: " + C2.toString());		//C2: Circle@28a418fc
		
		double r;
		
		r = C1.getRadius();
		System.out.println("C1's radius is: " + r); 	
		
		r = C2.getRadius();
		System.out.println("C2's radius is: " + r); 
		
		Circle C3 = new Circle(2 * C1.getRadius());
		r = C3.getRadius();		
		System.out.println("C3's radius is: " + r); 
	
		C3.setRadius(122.5);	
		r = C3.getRadius();

		System.out.println("C3's radius now is: " + r);
		
		r = C3.getDiameter();
		System.out.println("C3's diameter now is: " + r);
	}
}