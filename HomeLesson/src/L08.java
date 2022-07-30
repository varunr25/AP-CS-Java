import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class L08 
{
    static L00_General obj_General;
    public static void main(String[] args)
    {
        obj_General = new L00_General();
        problem806();        
    }
    
    public static void problem801a()
    {
       /*
        Write a Java method to find the smallest number among three numbers. 
        Test Data:
        Input the first number: 25
        Input the Second number: 37
        Input the third number: 29
        Expected Output:

        The smallest value is 25.0
       */  

        int iFirst = obj_General.getUserInput("Input value number one");
        int iSecond = obj_General.getUserInput("Input value number two");
        int iThird = obj_General.getUserInput("Input value number three");
        
        int iOutput = problem801b(iFirst, iSecond, iThird);
        System.out.println("The smallest value is " +  (double) iOutput);
    }

    public static int problem801b(int iFirst, int iSecond, int iThird)
    {
        int iOutput = 0;

        if (iFirst < iSecond && iFirst < iThird)
        {
            iOutput = iFirst;
        }

        if (iSecond < iFirst && iSecond < iThird)
        {
            iOutput = iSecond;
        }

        if (iThird < iFirst && iThird < iSecond)
        {
            iOutput = iThird;
        }

        return iOutput;
    }
    public static void swaptest()
    {
        int num1 = 55;
        int num2 = 85;
        System.out.println("The values before swapping are: number1 = " + num1 + " and number2 = " + num2);
        // Calling the function to swap
        swapByReference(num1, num2);
        System.out.println("\nThe numbers before and after swapping will be same in main:");
        System.out.println("Once the swapping is done, the values will be back to original: num1 = " + num1 + " and num2 is " + num2);
    }
    public static void swapByReference(int num1, int num2) 
    {
        System.out.println("Before swapping in function locally, num1 = " + num1 + " num2 = " + num2);
        // Swapping number1 and number2
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping in function locally, num1 = " + num1 + " num2 = " + num2);
    }

    public static void problem802a()
    {
       /*
        Write a Java method to compute the average of three numbers. 
        Test Data:
        Input the first number: 25
        Input the second number: 45
        Input the third number: 65
        Expected Output:

        The average value is 45.0
       */  

      int iArray[] = new int[3];
      int i;
      for (i = 0; i < iArray.length; i++)
      {
          iArray[i] = obj_General.getUserInput("Input Value");
      }

      double iOutput = problem802b(iArray);

      System.out.println("The average value is " + iOutput);
    }

    public static double problem802b(int iArray[])
    {
        int iSum = 0;
        int i;
        for (i = 0; i < iArray.length; i++)
        {
            iSum = iSum + iArray[i];
        }
        double iAverage = (double)iSum / (double)iArray.length;

        return iAverage;
    }

    public static void problem803()
    {
       /*
        Write a Java method to display the middle character of a string. 
        Note: a) If the length of the string is odd there will be two middle characters.
        b) If the length of the string is even there will be one middle character.
        Test Data:
        Input a string: 350
        Expected Output:
                                                                                
        The middle character in the string: 5
       */  
    boolean bLoop = true;
    while (bLoop == true)
    {
        Scanner stringInput = new Scanner(System.in);
        System.out.print("Input a string: ");
        String sInput = stringInput.nextLine();
        
        int iLength = sInput.length();
        if (iLength == 0)
        {
            bLoop = true;
            System.out.println("Try again. \n");
        }        
        else
        {
            Character cOutput = ' ';
            String sOutput = ""; 
        
            if (iLength % 2 != 0)
            {
            int iMedian = iLength / 2;
            cOutput = sInput.charAt(iMedian); 
            System.out.println("The middle character of the string is " + cOutput);
            }
    
            else
            {
            int iMedian = iLength / 2;
            Character cOutputOne = sInput.charAt(iMedian-1);  
            Character cOutputTwo = sInput.charAt(iMedian);
            sOutput = cOutputOne.toString() + cOutputTwo.toString();
            System.out.println("The middle characters of the string are " + sOutput);        
            }
            stringInput.close();
            bLoop = false;
        }
    }
}

    public static void problem804()
    {
       /*
        Write a Java method to count all vowels in a string. 
        Test Data:
        Input the string: w3resource
        Expected Output:

        Number of  Vowels in the string: 4
       */  
        Scanner stringInput = new Scanner(System.in);

        System.out.print("Input a string: ");
        String sInput = stringInput.nextLine();
        sInput = sInput.toLowerCase();
        stringInput.close();

        int iOutput = 0;
        int i;
        for (i = 0; i < sInput.length(); i++)
        {
            if (sInput.charAt(i) == 'a')
            {
                iOutput++;
            }

            if (sInput.charAt(i) == 'e')
            {
                iOutput++;
            }

            if (sInput.charAt(i) == 'i')
            {
                iOutput++;
            }

            if (sInput.charAt(i) == 'o')
            {
                iOutput++;
            }

            if (sInput.charAt(i) == 'u')
            {
                iOutput++;
            }
        }
        System.out.println("There are " + iOutput + " vowel(s) in the string.");
    }

    public static void problem805()
    {
       /*
        Write a Java method to count all words in a string. 
        Test Data:
        Input the string: The quick brown fox jumps over the lazy dog.
        Expected Output:

        Number of words in the string: 9
       */  
        Scanner stringInput = new Scanner(System.in);

        System.out.print("Input a string: ");
        String sInput = stringInput.nextLine();
        stringInput.close();
        int iOutput = 0;
        int i;
        sInput = sInput.trim();
        for (i = 0; i < sInput.length(); i++)
        {
            if((sInput.charAt(i) == ' ') && (sInput.charAt(i-1) != ' '))
            {
                iOutput++;                
            }
        }

        iOutput = iOutput + 1;
        System.out.println("Number of words in the string: " + iOutput);
    }

    public static void problem806()
    {
       /*
        Write a Java method to check whether a string is a valid password. 
        Password rules:
        A password must have at least ten characters.
        A password consists of only letters and digits.
        A password must contain at least two digits.

        Expected Output:

        1. A password must have at least 10 characters.                                             
        2. A password consists of only letters and digits.                                         
        3. A password must contain at least two digits                                        
        Input a password (You are agreeing to the above Terms and Conditions.): abcd1234           
        Password is valid: abcd1234
       */  

        Scanner stringInput = new Scanner(System.in);

        System.out.print("Input a password (You are agreeing to the above Terms and Conditions): ");
        String sInput = stringInput.nextLine();
        stringInput.close();
        sInput = sInput.trim();
        int iLength = sInput.length();

        if (iLength < 10)
        {
            System.out.println("This password is not valid. It has " + iLength + " characters instead of at least 10.");
        }
        else
        {
            Pattern pSpecial = Pattern.compile("[^A-Za-z0-9]");
            Matcher mSpecial = pSpecial.matcher(sInput);
            if (mSpecial.find())
            {
                System.out.println("This password is not valid. It contains special characters.");
            }
            else
            {
                Pattern pNumber = Pattern.compile("[0-9][0-9]");
                Matcher mNumber = pNumber.matcher(sInput);
                if(mNumber.find())
                {
                    System.out.println("This password, " + sInput + ", is valid.");
                }
                else
                {
                    System.out.println("This password is not valid. It doesn't contain any numbers.");
                }
            }
        }

    }

    public static void problem806_alt()
    {
        /*
        Write a Java method to check whether a string is a valid password. 
        Password rules:
        A password must have at least ten characters.
        A password consists of only letters and digits.
        A password must contain at least two digits.

        Expected Output:

        1. A password must have at least 10 characters.                                             
        2. A password consists of only letters and digits.                                         
        3. A password must contain at least two digits                                        
        Input a password (You are agreeing to the above Terms and Conditions.): abcd1234           
        Password is valid: abcd1234
       */  

        Scanner stringInput = new Scanner(System.in);

        System.out.print("Input a password (You are agreeing to the above Terms and Conditions): ");
        String sInput = stringInput.nextLine();
        stringInput.close();
        sInput = sInput.trim();
        int iLength = sInput.length();

    }

    public static void problem808()
    {
       /*
        
       */  

    }

    public static void problem809()
    {
       /*
        
       */  

    }

    public static void problem810()
    {
       /*
        
       */  

    }

}
