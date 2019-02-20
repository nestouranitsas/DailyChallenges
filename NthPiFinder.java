//Created by Nestor Ouranitsas 2/20/2019
//This is a program to the Nth digit of pi, up to the 100th digit
import java.util.Arrays;

public class NthPiFinder 
{
    public static void main (String[] args) 
    {
        // Nth digit of Pi we wish to determine.
        int n = 10;
        
        //100 digits of Pi taken from: http://www.math.com/tables/constants/pi.html
        //set digits = string
        String digits = "1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679";
        
        //convert string to character array
        char[] digitSplit = digits.toCharArray();
        //System.out.println(Arrays.toString(digitSplit)); Prints the whole array if you want to check.
        
        //Determines the appropriate indexing of digitSplit to select the correct digit.  
        if (n > 100) //invalid -- max digit is 100
        {
            System.out.println("Error! The Digit of PI you are trying to find is too high. Please Select a digit lower than 100.");   
        }
        else if (n <= 0) //invalid -- cannot have negative digits
        {
            System.out.println("Error! You Can not search for the 0th, or negative digits. Please Select another Digit.");
        }
        else if (n == 1) //if n = first digit of PI is the 0th in the array
        {
            System.out.println("The " + n + " decimal of Pi is: " + digitSplit[n-1] + ".");
        }
        else //can search for 100
        {
            System.out.println("The " + n + " decimal of Pi is: " + digitSplit[n-1] + ".");
        }
    }
}