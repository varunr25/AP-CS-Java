import java.util.*;
public class L05 
{
    static L00_General obj_General;
    public static void main(String[] args)
    {
        obj_General = new L00_General();        
    }

    public static void problem501()
    {
       /*
        Write a Java program to find the penultimate (next to last) word of a sentence. 
        Sample Output:

        Input a String: The quick brown fox jumps over the lazy dog.
        Penultimate word: lazy
       */ 

        String sInput = obj_General.getStringInput("Input a sentence");
        String [] sOutput = sInput.split("[ ]+");
        System.out.println("Penultimate Word: " + sOutput[sOutput.length - 2]);       
    }

    public static void problem502()
    {
       /*
        Write a Java program to find the penultimate (next to last) word of a sentence. 
        Sample Output:

        Input a String: The quick brown fox jumps over the lazy dog.
        Penultimate word: lazy
       */ 

        String sInput = obj_General.getStringInput("Input a sentence");
        int iLength = sInput.length();
        char cCurrent;
        int n = 0;
       
        for (int i = 0; i < iLength; i++)
        {
            cCurrent = sInput.charAt(i);
            if (Character.isSpaceChar(cCurrent))
            {
                n++;
            }
        }
        System.out.println(n);

        char cBack = sInput.charAt(8);
        char cFront = sInput.charAt(9);
    }

    public static void problem503()
    {
        /*
        Write a Java program to get the character at the given index within the String. 
        Sample Output:

        Original String = Java Exercises!                                                                             
        The character at position 0 is J                                                                              
        The character at position 10 is i  
        */
        
        String sInput = obj_General.getStringInput("Input a sentence");
        int iInput = obj_General.getUserInput("Input a number");       
        problem503_process(sInput, iInput);        
    }

    public static void problem503_process(String sInput, int iInput) 
    {
        int c = sInput.length();
        if (iInput > c+1)
        {
            problem503();
        }
       
        else
        {
                System.out.printf("The character at position %d is %c.", iInput, sInput.charAt(iInput-1));
        }
       System.out.println("\nDONE.");
    }
}   