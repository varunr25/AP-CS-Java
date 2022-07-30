//		Data Point
/*	- A Data Point object will be one entry in a Frequency Table.
  	- Ex)
  		- 1.4, 1.7, 1.4, 1.5, 1.6, 1.4, 1.6, 1.5, 1.7, 2.55, 7.11
  	
  	value			frequency
  	1.4					3
  	1.5					2
  	1.6					2
  	1.7					2
  	2.55				1
  	7.11 				1
*/

import java.util.Random;
public class DataPointTester 
{
	public static void main(String[] args) 
	{
		Random R = new Random();	
		
		DataPoint A = new DataPoint(5.6);		//Value = 5.6, Frequency = 0
		DataPoint B = new DataPoint(1.2, 5);	//Value = 1.2, Frequency = 5
		
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		
		double f;
		f = B.incrementFrequency();
		
		System.out.println("Frequency of B is now " + f);
		
		DataPoint[] dataPoints = new DataPoint [5]; //One array object
		
		int i; double v;
		
		for (i = 0; i < dataPoints.length; i++)
		{
			v = R.nextInt() % 50 + R.nextDouble();
			f = R.nextInt(21);
			
			dataPoints[i] = new DataPoint(v, f);
		}	
		
		for (i = 0; i < dataPoints.length; i++)
		{
			System.out.println(dataPoints[i].toSting() + " ");
		}
		System.out.println();
		
		int N = 0;		
		for (i = 0; i < dataPoints.length; i++)
		{
			N += dataPoints[i].getFrequency();
		}
		System.out.println("Total Datapoints Frequency: " + N);
		
		
		
		
		
	}//end of main function

	public static double truncateThousandths(double v)
	{
		return ((int) (v * 1000) / 1000.0); 
	}


}//end of class function
