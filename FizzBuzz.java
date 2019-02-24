/*
Prints numbers from 1 to 100 for 
multiples of a prints Fizz
multiples of b prints Buzz
multiples of a and b prints FizzBuzz
*/
public class FizzBuzz {
    public static void main (String[] args) {
        int num = 0;
        int a = 3;
        int b = 5;
        for (int i = 0; i < 100; ++i) {
            num += 1;
            if ((num % a == 0) && (num % b == 0)) {
                System.out.println("FizzBuzz");
            }
            else if (num % a == 0) {
                System.out.println("Fizz");
            }
            else if (num % b == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(num);
            }   
        } 
    }
}
