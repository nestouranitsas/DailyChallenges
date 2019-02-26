
//can refactor to use StringReverse.java;

import java.util.ArrayList;
import java.util.Arrays;

class CardValidator
{
    public Boolean validateCcNum(String cardNum)
    {
        int nDigits = cardNum.length();

        int sum = 0;
        Boolean isSecond = false;
        for (int i = nDigits-1; i>= 0; i--)
        {
            int digit = cardNum.charAt(i) - '0';

            if (isSecond == true)
            {
                digit = digit*2;
                sum += digit / 10;
                sum += digit % 10;

                isSecond = !isSecond;
            }
        }
        return (sum % 10 == 0);
    }

    public static void main (String[] args)
    {
        CardValidator myValidator = new CardValidator();
        String cardNum = "3541651733821524947";
        myValidator.validateCcNum(cardNum);
        if (myValidator.validateCcNum(cardNum) == true)
        {
            System.out.println("Card Number: " + cardNum + " is a VALID credit card number.");
        }
        else
        {
            System.out.println("Card Number: " + cardNum + " is an INVALID credit card number.");
        }
    }
}