package intMatrixTester;

public class test 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*You are to write methods designed to be used in a text processing program. 
Various lines of text shall be stored in an array of Sentence objects. 
Each Sentence contains many, one or possibly no words at all.
You may assume that neither the String Words nor the Integer WordCount is null.
 
Consider the Sentence class below.
 
A Sentence object contains a sentence String and a word count Integer.
The String, Words, contains the text sentence.
The Integer, WordCount, contains the number of words in the sentence*/
 
public class Sentence
{
        	private String Words;
        	private Integer WordCount;
        	
        	public Sentence (String Words, Integer WordCount)
        	{
                    	this.Words = Words;
                    	this.WordCount = WordCount;
        	}
        	
        	public String toString()
        	{
                    	return "[" + this.WordCount + "] " + this.Words;
        	}
        	
        	public String getWords()
        	{
                    	return this.Words;
        	}
        	
public Integer getWordCount()
{
        	return this.WordCount;
}
 
---------------------------------------------

public class TextFile
{
        	private Sentence[ ] Text;
 
        	public TextFile() {…}                    	//creates and array of Sentence references
        	
                                                                    	//adds a sentence and resizes the array
        	public void addSentence (Sentence S){…} 
 

public Integer totalWordCount()
{
	//Returns the total number of words found in all the Sentences in array Text, as an Integer.
		
	int words = 0;
	
	 for (Integer words: Text[i].getWordCount)
	 {
		 wordSum += words.intValue();   
	 } 
    
    return new Integer (words);
} 

public Integer[ ] wordTotals()
{
	/*Returns an array of Integer objects that contains the word count for each of the
	  sentence objects in the array Text, in the order that they appear in the list. */
	
    int i;
    Integer [] words;

    for (i = 0; i < Text.length; i++)
    {
    	words[i] = Text[i].getWordCount;
    }

    return words;	
}  

public String longestSentence()
{
     /*Returns the longest sentence in the array Text. The longest sentence is defined as the 
       sentence containing the most words.*/
		
    int i, p;
    
    Integer H;
    H = Text[0];
    p = 0;

    for (i = 0; i < Text.length; i++)
    {
        if (Text[i].compareTo(H) > 0)
        {
            H = Text[i];
            p = i;
        }
    }
    
    String longest = Text[p].getWords;;    
    return longest;    
}