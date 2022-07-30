import java.util.Date;
public class L03
{
    static L00_General obj_General;
    public static void main(String[] args) 
    {
        obj_General = new L00_General();
        //problem301();
        //problem302();
        //problem303();
        //problem304();
        //problem305();
        //problem306();
        //problem307();
        //problem308();
        //problem309();
        //problem310();
        //problem311();
    }

    public static void problem301()
    {
        /*
        Write a Java program to reverse a string. Go to the editor
        Input Data:
        Input a string: The quick brown fox
        Expected Output

        Reverse string: xof nworb kciuq ehT
        */
        
        String sInput = obj_General.getStringInput("Input a string");
        int iLength = sInput.length();
        String sOutput = "";
        int i;

        for (i = iLength-1; i >= 0; i--)
		{
            sOutput = sOutput + sInput.charAt(i);                     
        }

        System.out.println("Reversed version of your input: " + sOutput); 
    }

    public static void problem302()
    {
        /*
        Write a Java program to count the letters, spaces, numbers and other characters of an input string. Go to the editor
        Expected Output

        The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
        letter: 23                                               
        space: 9                                                 
        number: 10                                               
        other: 6
        */
        
        String sInput = obj_General.getStringInput("Input a string");
        int iLength = sInput.length();
        int iNumber, iSpace, iLetter, iOther;
        iNumber = 0; 
        iSpace = 0; 
        iLetter = 0;
        iOther = 0;

       for (int i = 0; i < iLength; i++)
       {
           if (Character.isDigit(sInput.charAt(i)))
           {
               iNumber++;
           }
           
           else if (Character.isLetter(sInput.charAt(i)))
           {
               iLetter++;
           }

           else if (Character.isSpaceChar(sInput.charAt(i)))
           {
               iSpace++;
           }

           else 
           {
               iOther++;
           } 
       }
       System.out.println("# of Digits: " + iNumber);
       System.out.println("# of Letters: " + iLetter);
       System.out.println("# of Spaces: " + iSpace);
       System.out.println("# of Special Characters: " + iOther);       
    }

    public static void problem303()
    {
        /*
        Write a Java program to print the following string in a specific format (see the output). Go to the editor
        Sample Output

        Twinkle, twinkle, little star,
            How I wonder what you are! 
                Up above the world so high,   		
                Like a diamond in the sky. 
        Twinkle, twinkle, little star, 
            How I wonder what you are
        */

        System.out.println("Twinkle, twinkle, little star,\n\tHow I wonder what you are!\n\t\tUp above the world so high,\n\t\tLike a diamond in the sky.\nTwinkle, twinkle, little star,\n\tHow I wonder what you are");
    }

    public static void problem304()
    {
        /*
        Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn. Go to the editor
        Sample Output:

        Input number: 5                                                        
        5 + 55 + 555
        */

        int iInput = obj_General.getUserInput("Input a single digit integer");

        int iOutput1, iOutput2, iOutput3;
        iOutput1 = iInput;
        iOutput2 = (iInput * 11);
        iOutput3 = (iInput * 111);
        System.out.println(iOutput1 + " + " + iOutput2 + " + " + iOutput3);
        System.out.printf("%d + %d%d + %d%d%d", iInput, iInput, iInput, iInput, iInput, iInput);
    }

    public static void problem305()
    {
        /*
        Write a Java program to display the system time. Go to the editor
        Sample Output:

        Current Date time: Fri Jun 16 14:17:40 IST 2017
        */

        Date dtCurrent = new Date();
        System.out.printf("Current Date Time: %s", dtCurrent);
    }

    public static void problem306()
    {
        /*
            Write a Java program to accept a number and check the number is even or not. 
            Prints "even" if the number is even or "odd" if the number is odd. Go to the editor
            Sample Output:

            Input a number: 20                                                     
            The number 20 is "Even"
        */
        int iInput = obj_General.getUserInput("Input a number");

        if (iInput % 2 == 0)
        {
            System.out.printf("The number %d is \"Even\"", iInput);
        }
        
        else 
        {
            System.out.printf("The number %d is \"Odd\"", iInput);
        }
    }
    
    public static void problem307()
    {
        /*
        Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both. 
        Sample Output:

        Divided by 3:                                                          
        3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57
        , 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,              
                                                                            
        Divided by 5:                                                          
        5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 
        95,                                                                    
                                                                            
        Divided by 3 & 5:                                                      
        15, 30, 45, 60, 75, 90,
        */

        System.out.println("Divided by 3: ");
        for (int i = 1; i < 100; i++)
        {
            if (i % 3 == 0) 
			System.out.print(i +", ");
        }
        
        System.out.println("\n\nDivided by 5: ");
        for (int i = 1; i < 100; i++)
        {
            if (i % 5 == 0) 
			System.out.print(i +", ");
        }
       
        System.out.println("\n\nDivided by 3 & 5: ");
        for (int i = 1; i < 100; i++)
        {
            if (i % 3 == 0 && i % 5 == 0) 
			System.out.print(i +", ");
        }
    }

    public static void problem308()
    {
        /*
        Write a Java program to convert a string to an integer in Java. Go to the editor
        Sample Output:

        Input a number(string): 25                                             
        The integer value is: 25
        */

        String sInput = obj_General.getStringInput("Input a number");
        int iOutput = Integer.parseInt(sInput);
        obj_General.giveOutput("The integer value is", iOutput);
    }

    public static void problem309()
    {
        /*
        Write a Java program to convert seconds to hour, minute and seconds. Go to the editor
        Sample Output:

        Input seconds: 86399                                                   
        23:59:59
        */
        int iInput = obj_General.getUserInput("Input seconds");
        int iSeconds = iInput % 60;
        int iHours = iInput / 60;
        int iMinutes = iHours % 60;
        iHours = iHours / 60;
        System.out.println(iHours + ":" + iMinutes + ":" + iSeconds);
    }

    public static void problem310()
    {
        /*
        Write a Java program to accepts an integer and count the factors of the number. Go to the editor
        Sample Output:

        Input an integer: 25                                                   
        3
        */
        int iInput = obj_General.getUserInput("Input an integer");
        int i, c; 
        c = 0;
        for (i = 1; i <= iInput; i++)
        {
            if (iInput % i == 0 )
                {
                    c++;
                }
        }
        System.out.println(c);
    }    
} 