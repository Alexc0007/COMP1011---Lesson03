/**
 * 
 */

/**
 * @author Alexc007
 * Program Description: Demo Files for COMP1011 - Lesson03
 * @version 0.1 - Created Basic Project
 * 
 */
public class Project {

	/**
	 * Main Method for Project
	 * @param args
	 */
	public static void main(String[] args) 
	{
		SportsUtilityVehicle myHonda = new SportsUtilityVehicle("Black" , "Honda" , "Pilot" , "2015");
		
		Truck myFord = new Truck(6 , 3 , "White" , "Ford" , "FX" , "2008");
		
		
		
		
		
		for(int seconds = 0 ; seconds < 10 ; seconds++) //loop to accelerate for 2 secodns
		{
			myHonda.accelerate();
			myFord.accelerate();
		}
		System.out.println("Vehicle Speed: " + myHonda.getSpeed());//print the speed out after acceleration
		System.out.println("Truck Speed: " + myFord.getSpeed());
		//formula of acceleration is incorrect , cuz acceleration is measured by Sec^2
		
		

	}

	
	//stopped at Lesson 3 part 3 - 45 minutes
}
