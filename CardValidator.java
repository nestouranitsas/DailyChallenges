
//can refactor to use StringReverse.java;

import java.util.ArrayList;
import java.util.Arrays;

class CardValidator
{
    public Boolean validateCard(String cardNum)
    {
        //get the last digit as checksum as int
        String checkSumStr = cardNum.substring(cardNum.length()-1, cardNum.length());

        //Convert the checksum str to int
        int checkSumInt = Integer.valueOf(checkSumStr);

        //reverse the string
        char[] split = cardNum.toCharArray();
        String reverse = "";
        for (int i = 1; i <= split.length-1; ++i)
        {
            reverse = reverse + split[split.length-i];
        }

        //convert char array to int array
        int[] revSplit = reverse.length;
        for (char i : reverse)
        {
            revSplit = Integer.parseInt(String.valueOf(reverse));
        }
        //for (int c : revSplit)
        {
        //    intArr Character.getNumericValue(c);
        }
        Boolean isValid = false;
        return isValid;
    }

    public static void main (String[] args)
    {
        CardValidator myValidator = new CardValidator();
        String cardNum = "4024007140216309";
        myValidator.validateCard(cardNum);
        if ( myValidator.validateCard(cardNum) == true)
        {
            System.out.println("Card Number: " + cardNum + " is a valid credit card number.");
        }
        else
        {
            System.out.println("Card Number: " + cardNum + " is invalid.");
        }
    }
}