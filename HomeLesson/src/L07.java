import java.util.*;
import java.util.Scanner;
public class L07 
{
    static L00_General obj_General;
    public static void main(String[] args)
    {
        obj_General = new L00_General();
        problem704();
    }

    public static void problem701()
    {
       /*
        Write a Java program to check whether a given string ends with the contents of another string. 
        Sample Output:

        "Python Exercises" ends with "se"? false                                                                      
        "Python Exercise" ends with "se"? true
       */          
      
       String sInput = "Python Exercises";
       boolean bContains = true;
       if (sInput.endsWith("se"))
       {
            bContains = true;
       }

       else
       {
           bContains = false;
       }
       
       System.out.println("\"Python Exercises\" ends with \"se\"? " + bContains);
    }

    public static void problem701b()
    {
        /*
            Write a Java program to check whether a given string ends with the contents of another string. 
            Sample Output:

            "Python Exercises" ends with "se"? false                                                                      
            "Python Exercise" ends with "se"? true
        */ 
        
        String sInput = "Python Exercises";
        int iInputLength = sInput.length();
        String sSearchString = "ses";
        int iLength = iInputLength - sSearchString.length();
        String sCompare = sInput.substring(iLength, iInputLength);
        boolean bContains = true;
       
        if (sSearchString.compareTo(sCompare) == 0)
        {
            bContains = true;
        }

        else
        {
            bContains = false;
        }
        
        System.out.printf("%s" +  " ends with " + "%s" + " ? " + "%b", sInput, sSearchString, bContains);
    }

    public static void problem702()
    {
        /*
            Write a Java program to get the index of all the characters of the alphabet.
            The quick brown fox jumps over the lazy dog.
        */  
        String sInput = obj_General.getStringInput("Input a sentence");
        String[] sArrayAlphabet = new String[sInput.length()];
        String sAlphabet = "abcdefghijklmnopqrstuvwxyz";
        int i;
        int[] iOutput = new int[sInput.length()];        

        for (i = 0; i < sAlphabet.length(); i++)
        {
            Character cCurrentCharacter = sAlphabet.charAt(i);
            iOutput[i] = sInput.indexOf(cCurrentCharacter, i);
            System.out.println(cCurrentCharacter + ": " + iOutput[i]);
        }
            
    }

    public static void problem703a()
    {
       /*
        Write a Java program to replace a specified character with another character. 
        Sample Output:

        Original string: The quick brown fox jumps over the lazy dog.                                                 
        New String: The quick brown fox jumps over the lazy fog.
       */     
        Scanner myObj = new Scanner(System.in);
        System.out.print("Input a string: ");
        String sInput = myObj.nextLine();

        System.out.print("Input a character: ");
        Character cInputOne = myObj.next().charAt(0);

        System.out.print("Input another character: ");
        Character cInputTwo = myObj.next().charAt(0);
        
        String sOutput = sInput;
        Character cSwap = ' ';
        Character cCurrent = ' ';
        int i;
        for (i = 0; i < sInput.length(); i++)
        {
            cCurrent = sInput.charAt(i);
            if(cCurrent == cInputOne)
            {
                cSwap = cInputTwo;
                cInputTwo = cInputOne;
                cInputOne = cSwap;
            }
        }        
    }

    public static void problem703b()
    {
        /*
            Write a Java program to replace a specified character with another character. 
            Sample Output:

            Original string: The quick brown fox jumps over the lazy dog.                                                 
            New String: The quick brown fox jumps over the lazy fog.
        */     
        Scanner myObj = new Scanner(System.in);
        System.out.print("Input a string: ");
        String sInput = myObj.nextLine();

        System.out.print("Input a character: ");
        Character cInputOne = myObj.next().charAt(0);

        System.out.print("Input another character: ");
        Character cInputTwo = myObj.next().charAt(0);
        
        String sOutput = sInput.replace(cInputOne, cInputTwo);
        System.out.println("Old String: " + sInput);
        System.out.println("New String: " + sOutput);
    }

    public static void problem704()
    {
       /*
        Write a Java program to find the second most frequent character in a given string. 

        Sample Output:

        The given string is: successes
        The second most frequent char in the string is: c
       */

        Scanner myObj = new Scanner(System.in);
        System.out.print("Input a string: ");
        String sInput = myObj.nextLine();        
    }   
}