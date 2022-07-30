import java.util.Scanner;
import jdk.jshell.Snippet;
import java.util.Date;
import java.util.*;
public class L04 
{
    static L00_General obj_General;
    public static void main(String[] args)
    {
        obj_General = new L00_General();
        //problem401v1();
        //problem401v2();
        problem402();
    }

    public static void problem401v1()
    {
        /*
        Write a Java program to capitalize the first letter of each word in a sentence. Go to the editor
        Sample Output:

        Input a Sentence: the quick brown fox jumps over the lazy dog.         
        The Quick Brown Fox Jumps Over The Lazy Dog.
        */

        String sInput = obj_General.getStringInput("Input a sentence");
        int iLength = sInput.length();
        String sOutput = "";
        int i;
        char cCurrent;
        boolean bCapitalize = true;

        for (i = 0; i < iLength; i++)
        {
            cCurrent = sInput.charAt(i);
            if (Character.isSpaceChar(cCurrent))
            {
                bCapitalize = true;
                sOutput = sOutput + cCurrent;
            }
           
            else
            {                   
                if (bCapitalize == true) 
                {
                    cCurrent = Character.toUpperCase(cCurrent);
                }
                sOutput = sOutput + cCurrent;  
                bCapitalize = false; 
            }         
        }
        System.out.println(sOutput);
    }

    public static void problem401v2 ()
    {
        /*
        Write a Java program to capitalize the first letter of each word in a sentence. Go to the editor
        Sample Output:

        Input a Sentence: the quick brown fox jumps over the lazy dog.         
        The Quick Brown Fox Jumps Over The Lazy Dog.
        */

        Scanner in = new Scanner(System.in);
        System.out.print("Input a Sentence: ");
        String line = in.nextLine();
        String upper_case_line = ""; 
        Scanner lineScan = new Scanner(line); 
        //lineScan.useDelimiter("-");
        while(lineScan.hasNext()) 
            {
                String word = lineScan.next(); 
                upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
                System.out.println(word);
            }
        System.out.println(upper_case_line.trim()); 
     }
     
     public static void problem402()
     {
        /*
        Write a Java program to convert a given string into lowercase. 
        Sample Output:

        Input a String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.           
        the quick brown fox jumps over the lazy dog.
        */
        String sInput = obj_General.getStringInput("Input a sentence");
        int iLength = sInput.length();
        String sOutput = sInput.toLowerCase();
        System.out.println(sOutput);
     }
}