
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

        //reverses the string and drops the first digit (previously last digit)
        char[] split = cardNum.toCharArray();
        String reverse = "";
        for (int i = 2; i <= split.length; ++i)
        {
            reverse += split[split.length-i];
        }

        //convert reverse string into char array
        char[] revChar = reverse.toCharArray();

        //convert char array into int array
        int[] revInt = new int[revChar.length];
        for (int j = 0; j < revChar.length; j++)
        {
            revInt[j] = (int)revChar[j] - '0';
        }
        System.out.println(Arrays.toString(revInt));

        //doubles ODD digits
        for (int i = 0; i < revInt.length; i++)
        {
            if (revInt[i]%2 == 1)
            {
                revInt[i] = revInt[i]*2;
            }
        }
        System.out.println(Arrays.toString(revInt));

        

        //adds all numbers in array
        int sum = 0;
        for (int i : revInt)
        {
            sum += i;
        }
        System.out.println(sum);

        //if()

        Boolean isValid = false;
        return isValid;
    }

    public static void main (String[] args)
    {
        CardValidator myValidator = new CardValidator();
        String cardNum = "4556737586899855";
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