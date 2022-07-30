import java.util.*;
import java.util.Scanner;
public class L06 
{
    static L00_General obj_General;
    public static void main(String[] args)
    {
        obj_General = new L00_General();
        
    }

    public static void problem601() 
    {
        /*
        Write a Java program to compare two strings lexicographically. Two strings are lexicographically equal
        if they are the same length and contain the same characters in the same positions. 

        Sample Output:

        String 1: This is Exercise 1                                                                                  
        String 2: This is Exercise 2                                                                                  
        "This is Exercise 1" is less than "This is Exercise 2"
        */ 

        String sOne = "This is exercise 1";
        String sTwo = "This is Exercise 1";

        int iComparison = sOne.compareToIgnoreCase(sTwo);

        if (iComparison > 0)
        {
            System.out.println("\"" + sOne + "\" is greater than \"" + sTwo + "\"");
        }

        else if (iComparison < 0)
        {
            System.out.println("\"" + sOne + "\" is less than \"" + sTwo + "\"");
        }

        else
        {
            System.out.println("\"" + sOne + "\" is the same as \"" + sTwo + "\"");
        }
    }

    public static void problem602() 
    {
        /*
        Write a Java program to concatenate a given string to the end of another string. 

        Sample Output:

        String 1: PHP Exercises and                                                                                   
        String 2: Python Exercises                                                                                    
        The concatenated string: PHP Exercises and Python Exercises
        */
        
        String sOne = "PHP Exercises and ";
        String sTwo = "Python Exercises.";

        //String sOnePlusTwo = sOne + sTwo;
        String sOutput = problem602concat(sOne, sTwo);
        
        System.out.println(sOutput);
        //System.out.println(sOnePlusTwo);
        //System.out.println(sOne.concat(sTwo));
    }

    public static String problem602concat(String sOne, String sTwo) 
    {
        String sOnePlusTwo = sOne + sTwo;
        return sOnePlusTwo;
    }

    public static void problem603() 
    {
        /*
        Write a Java program to test if a given string contains the specified sequence of char values. 

        Sample Output:

        Original String: PHP Exercises and Python Exercises                                                           
        Specified sequence of char values: and                                                                        
        true
        */  
        
        String sGiven = "PHP Exercises and Python Exercises";
        System.out.println(sGiven.contains("and"));        
    }

    public static void problem604() 
    {
        /*
        Write a Java program where you input 5 numbers and sort them lowest to highest.
        */
        
        int iCounter;
        int[] iInputs = new int[5];
        for (iCounter = 0; iCounter < 5; iCounter++)
        {
            iInputs[iCounter] = obj_General.getUserInput("Input value #" + (iCounter+1));
        }
        System.out.println("Original Array: " + Arrays.toString(iInputs));
        int iSwap = 0; 
        //boolean bSwap = false;
        iCounter = 0;
        int i, j;
        
        for (i = 0; i < 5; i++)
        {
            for (j = 0; j < 4; j++) 
            {
                if (iInputs[j] > iInputs[j+1])
                {
                    iSwap = iInputs[j];
                    iInputs[j] = iInputs[j+1];
                    iInputs[j+1] = iSwap;
                }
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(iInputs));        
    }
}
