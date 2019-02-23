
//can refactor to use StringReverse.java;

import java.util.ArrayList;
import java.util.Arrays;

class CardValidator
{
    public void validateCard(String cardNum)
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

        //doubles ODD digits
        for (int i = 0; i < revInt.length; i++)
        {
            if (i%2 == 0)
            {
                revInt[i] = revInt[i]*2;
            }
        }

        //subtracts 9 from all digts greater than 9
        for (int i = 0; i < revInt.length; i++)
        {
            if (revInt[i] > 9)
            {
                revInt[i] = revInt[i] - 9;
            }
        }

        //adds all numbers in array
        int sum = 0;
        for (int i : revInt)
        {
            sum += i;
        }

        Boolean isValid;
        //checks modulo 10 of sum against checksum if equal isvalid is true, else fasle
        if(sum%10 == checkSumInt)
        {
            isValid = true;
        }
        else 
        {
            isValid = false;
        }
        
        if (isValid = true)
        {
            System.out.println("Card Number: " + cardNum + " is a valid credit card number.");
        }
        else 
        {
            System.out.println("Card Number: " + cardNum + " is an invalid credit card number.");
        }
    }

    public static void main (String[] args)
    {
        CardValidator myValidator = new CardValidator();
        String cardNum = "4556737586899855";
        myValidator.validateCard(cardNum);
    }
}