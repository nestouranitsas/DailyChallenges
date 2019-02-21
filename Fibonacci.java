//Made By Nestor Ouranitsas on 2/20/2019
//This Program takes a number and generates the fibonacci sequence to that number or Nth number

public class Fibonacci
{
    public static void main(String[] args)
    {
        int n = 10;
        int t1 = 0;
        int t2 = 1;
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + ", "); 
            int sum = t1+t2;
            t1 = t2;
            t2 = sum;
        }
    }
}