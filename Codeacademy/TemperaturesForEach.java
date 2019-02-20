import java.util.ArrayList;

/*creates an array list called weekly temperatures
  adds sever temperatures then prints the list
*/

//creating TemperaturesForEach class
public class TemperaturesForEach {
    
    //Defining main method
    public static void main(String[] args) {

		ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>();
		weeklyTemperatures.add(78);
		weeklyTemperatures.add(67);
		weeklyTemperatures.add(89); 
		weeklyTemperatures.add(94);
		
		for (Integer temperature : weeklyTemperatures) {
			System.out.println(temperature);
		}
	
	}
}