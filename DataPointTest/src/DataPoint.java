public class DataPoint extends Object
{
	private double value;
	private double frequency;
	
	//Value set by user. Frequency is zero by default.
	public DataPoint (double value)
	{
		this.value = value;
		frequency = 0;
	}
	
	//Value and Frequency are set by user.
	public DataPoint (double value, double frequency)
	{
		this.value = value;
		this.frequency = frequency;
	}
	
	//
	public String toSting()
	{
		return "(" + this.value + ", " + this.frequency + ")";
	}
	
	public double getValue () 
	{
		return this.value;
	}

	public double getFrequency()
	{
		return this.frequency;
	}
	
	//The user may Increment or Decrement the frequency only. 
	public double incrementFrequency()
	{
		this.frequency++;
		return this.frequency;
		//return ++this.frequency;
	}
	
	public double decrementFrequency()
	{
		this.frequency--;
		return this.frequency;
		//return --this.frequency;
	}
	
	
}

