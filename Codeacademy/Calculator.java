
/*
calculator program that can add, subtract, multiply, divide, 
modulo given 2 integers
*/

//creates the calculator class
public class Calculator {
  
  //calculator class constructor
  Calculator() { 
  }
  
  //defining add method
  public int add(int a, int b) {
    return a + b;
  }
 
  //defining subtract method
  public int subtract(int a, int b) {
    return a - b;
  }
  
  //defining multiply method
  public int multiply(int a, int b) {
    return a * b;
  }
  
  //defining divide method
  public int divide(int a, int b) {
    if (b == 0) {
      System.out.println("Error! Dividing by zero is not allowed.");
     return 0;
    } else {
      return a / b;
    }
  }
  
  //defining modulo method
  public int modulo(int a, int b) {
    if(b == 0){
      System.out.println("Error! dividing by zero is now allowed!");
      return 0;
    } else {
      return a % b;
    }
  }
 
//defining the main method
 public static void main(String[] args) {
   
  //creates calculator object called myCalculator
  Calculator myCalculator = new Calculator();
   System.out.println(myCalculator.add(5,7));
   System.out.println(myCalculator.subtract(45,11));
   System.out.println(myCalculator.divide(15,0));
   
 }
  
 
  
}