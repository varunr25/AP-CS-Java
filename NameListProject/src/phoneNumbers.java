//Varun Rajesh: Q2T2 - String, Array of String
 
public class phoneNumbers 
{
    private String[] phones;
    private int size;
        
    public boolean dashesFormat(String phone)
    {
        //Returns true if the given phone number is in Dashes Format, false if not.
        boolean dashes = true;
        if (phone.indexOf("-") == 3)        
        {
            dashes = true;
        }
        else
        {
            dashes = false;
        }        
        
        return dashes;
    }

    public boolean digitsOnlyFormat(String phone)
    {
        //Returns true if the given phone number is in Digits Only Format, false if not.
        boolean digits = true;
        if (phone.indexOf("-") == 3)
        {
            digits = false;
        }
        else
        {
            digits = true;
        }  

        return digits;
    }

    public String convertToAreaCodeFormat(String phone) 
    {
        /*
        Returns a String that is a phone number in Area Code format. 
        Phone numbers in Digits Only or Dashes Format shall be converted to Area Code Format. 
        You must use previously written methods, parts a) and/or b) 
        */
        String conversion = "(";
                
        if (digitsOnlyFormat(phone) == true)
        {
            conversion += phone.substring(0,2);
            conversion += ")";
            conversion +=phone.substring(3,5);
            conversion += "-";
            conversion += phone.substring(6);
        }

        return conversion;
    }

    public String findNumberByAreaCode(String area)
    {
        /*
        Returns the first phone number String in the list that contains the given area code. 
        The phone number must be returned in Area Code Format. 
        The method returns null if no phone number exist with the given area code. 
        You must use previously written methods, parts a), b), and/or c) in your solution assuming they work correctly 
        as described.
        */
        
        String output = null;
        
        for (int i = 0; i < phones.length; i++)
        {
            if (phones[i] != null)
            {
                convertToAreaCodeFormat(phones[i]);
                if (phones[i].substring(1,3) == area)
                {
                    output = phones[i];
                }

            }
        }
        return output;
    }  
}