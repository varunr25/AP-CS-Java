import java.lang.Math;
public class Circle 
{
	private double radius;
	private double area;
	private double circumference;
	private double diameter;
	
	/*
	 	Constructor Method initializes the properties.
		- Note: If no constructor exists, a default will be created by Java
	*/
	
	//User can instantiate a Circle object of any positive radius, otherwise it is a unit circle by default. 
	public Circle (double radius)	
	{							
		if (radius > 0)
		{
			this.radius = radius;		
		}
		else
		{
			this.radius = 1;
		}
	}

	/*	Set and Get Methods allow us to access the properties.
		- Including a Set method creates a mutable object.  
		- Set methods allow users to change values.
			- They are relatively unusual.
			- The user can set a new radius IF it is valid. If invalid, no change is made.
		- Get methods return property values.
	*/
	public double getRadius()	//Get Method
	{
		return this.radius;
	}
	
	public void setRadius(double radius)	//Set Method
	{
		if (radius > 0)
		{
			this.radius = radius;		
		}
		else
		{
			this.radius = 1;
		}
	}
	
	public String getString()
	{
		return "r = " + this.radius;
	}
	
	public double getArea()
	{
		area = (Math.PI) * radius * radius;
		return this.area;
	}
	
	public double getCircumference()
	{
		circumference = 2 * (Math.PI) * radius;
		return this.circumference;
	}	
	
	public double getDiameter()	
	{
		diameter = radius * 2;
		return this.diameter;
	}
}