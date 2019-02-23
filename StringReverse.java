//made by Nestor Ouranitsas on 2/20/2019
//this program accepts a string then reverses it and prints it out.

import java.util.ArrayList;
import java.util.Arrays;

public class StringReverse {

    public String reverseAndPrint(String s)
    {
        //splits the string into an 1 by X array of characters
        char[] split = s.toCharArray();

        //zero out reverse
        String reverse = "";

        //loop to add last character to reverse until i = 0 (first index);
        for (int i = 1; i <= split.length; ++i)
        {
            reverse += split[split.length-i];
        }
        return reverse;
    }
    public static void main (String[] args)
    {
        StringReverse myReverser = new StringReverse();
        String str = "Titty Smacker";
        System.out.println("Your String Forward is: " + str);
        System.out.println("Your String Backwards is: " + myReverser.reverseAndPrint(str));
    }



}
