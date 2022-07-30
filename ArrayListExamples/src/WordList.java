//  Varun Rajesh: Q3T2 - ArrayList

import java.util.ArrayList;

public class WordList
{
    private ArrayList<String> Words;

    public WordList()
    {
        Words = new ArrayList<String>();
    }
    
    /*  A
        Write method addWord(), such that it adds the new String W in front of the first sentence
        in List Words that is longer in length than word String W.
    */
    public void addWord(String W)
    {
        String add = W + Words.get(0);
        Integer x = Words.remove(0);
        Words.add(0, new String(add));
    }

    /*  B
        Write method textList(), such that it returns a new ArrayList object containing only 
        the String objects from list Words that contain the word String W.
    */
    public ArrayList<String> textList(String W)
    {
        ArrayList<String> List = new ArrayList<String>();

        int i;
        for (i = 0; i < Words.size(); i++)
        {
            if (Words.get(i).containsWord())
            {
                List.add(Words.get(i));
            }         
        }

        return List;
    }

    /*  C
        Write method longestWordSentence(), such that it returns the longest sentence 
        from list Words that contains the word String W.
    */
    public String longestWordSentence(String W)
    {
        int i; 
        int p = 0;

		for (i = 0; i < Words.size(); i++)
        {
            if (Words.get(i).compareTo(Words.get(p)) > 0)
            {
                p = i;
            }
		}

        return Words.get(p);
    }
			
}