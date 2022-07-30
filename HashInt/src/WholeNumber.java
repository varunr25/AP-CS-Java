//WholeNumber
/*
  Unless some other constructor exists, 
  the default constructor is created automatically.
  
  The call to the super class constructor MUST be the first line
  in the derived (sub/child) class constructor method.
  
  If the super class constructor method is not explicitly invoked
  then it will be implicitly invoked automatically and be invisible.
  
    A WholeNumber object is Object type.
  	A WholeNumber object is Comparable type.
  	A WholeNumber object is HashInt type.
  	A WholeNumber is WholeNumber type.
  	
  	TO DO LIST
  	We must write the constructor methods to reflect the new class name.
  	We should override any method that is not exactly compatible with the new class,
  	for example Set methods.
  	We probably should override toString().
  	We may decide to include additional properties and methods.
*/

//A WholeNumber must be non-negative.
public class WholeNumber extends HashInt		
{
	public WholeNumber()
	{
		super();
	}
	
	public WholeNumber(int x)		
	{
		super();					//super(Math.abs(x));
		if (x >= 0)
			super.setX(x);
	}
	
	public WholeNumber(WholeNumber W)
	{
		super(W);
	}
	
	//Override toString(), because we want to.
	public String toString()
	{
		return "+" + super.toString();
	}
	
	//Override setX(), because it's not compatible with this class.
	public int setX(int x)
	{
		if (x >= 0)
			return super.setX(x);
		
		return this.getX();
	}
	
	/*
	  WholeNumber inherited the right to be Comparable.
	  
	  Inherited methods that are invisible, super...
	  getX()
	  equals()
	  compareTo()
	  
	  Any other methods that are added to HashInt will be inherited and
	  invisible also. 
	*/
	
}


