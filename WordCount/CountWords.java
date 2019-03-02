/*
Created by Nestor Ouranitsas on 3/2/2019

This program counts the number of words in a file.
Additionally, it prints the number of unique words, the unique words themselves,
as well as the frequency of those words.
*/

import java.util.HashMap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountWords
{
    public void wordCount(String filename) throws IOException
    {
        
        
        //creating hashmap to count the words key = word, value = # of occurances
        HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
        
        //setting up the buffered reader
        File file = new File(filename);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;

        //opens and reads the file
        try
        {
            int counter = 0;
            while ((line = br.readLine()) != null)
            {
                //splits the line into words
                String[] regwords = line.trim().split("\\s+");
                for (String regword : regwords)
                {
                    ++counter;
                    String word = regword.replaceAll(":{2}-|,","").toLowerCase();
                    if (!wordMap.containsKey(word))
                    {
                        wordMap.put(word, 1);
                    }
                    else
                    {
                        int temp = wordMap.get(word);
                        wordMap.put(word, ++temp);
                    }
                }
                
            }
            
            //Prints the number of words in the file
            System.out.println("There are " + counter + " words in the file: " + filename + ".");
            
            //Prints the number of unique words and each word and the number of occurances.
            System.out.println("There are " + wordMap.size() + " unique words in the file: " + filename + ". They are as follows:" + "\n");
            for (String word : wordMap.keySet()) 
            {
                System.out.println("The word '" + word + "' appears " + wordMap.get(word) + " times.");
            }
        }
        finally
        {
            br.close();
        }
    }
    public static void main (String[] args) throws IOException
    {
        CountWords myCounter = new CountWords();
        //wc_test.txt has X words
        myCounter.wordCount("wc_test.txt");
    }
}