//import Array list
import java.util.ArrayList;

//defining the grade analyzer class
public class GradeAnalyzer{
  //class constructor
  public GradeAnalyzer(){
  }
  
  //defining the get avereage method -- within the class
  public int getAverage(ArrayList<Integer> grades) {
    //checks the size of the grades list -- empty returns error message
    if (grades.size() < 1) {
      System.out.println("Error! The grades list you are trying to analyze is empty");
      return 0;
    }
    //calculates the sum and average of the grades list and prints it to the console 
    else {
      int sum = 0;
      for (int grade : grades) {
        sum += grade;
      }
      int average = sum / grades.size();
      System.out.println("The Average of the grades is: " + average);
      return average;
    }
  }
  
  //create main method for the class -- within the GradeAnalyzer class
  public static void main (String[] args) {
    //create a new array list object called myClassroom
    ArrayList<Integer> myClassroom = new ArrayList<Integer>();
    //adding grades to the myClassroom object
    myClassroom.add(98);
    myClassroom.add(92);
    myClassroom.add(88);
    myClassroom.add(75);
    myClassroom.add(61);
    myClassroom.add(89);
    myClassroom.add(95);
    
    //creating a new grade analyzer object called myAnalyzer
    GradeAnalyzer myAnalyzer = new GradeAnalyzer();
    //call the getAverage method on the myClassroom object
    myAnalyzer.getAverage(myClassroom);
  }
}