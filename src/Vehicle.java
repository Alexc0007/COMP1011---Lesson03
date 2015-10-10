
/**
 * @author Alexc007
 *Class Description: Creating a Vehicle class to use as 
 *a SuperClass for all other Vehicle subClasses 
 *@version 0.2 - Added Vehicle Class
 */
public class Vehicle 
{
	//INSTANCE VARIABLES - PROPERTIES++++++++++++++++++++++++++++++++
	private int numWheels = 4; //the number of wheels in a vehicle
	private int numDoors = 2; //the minimum number of doors in a vehicle
	private String color = "";  //vehicle color
	private String make = "";
	private String model = "";
	private String year = "";
	private double speed = 0;
	private final double MAX_SPEED = 40; //max speed is 40 Meters/Sec
	
	//CONSTRUCTOR++++++++++++++++++++++++++++++++++++++++++++++++++
	public Vehicle()
	{
		
	}
	//GET ACCESSOR METHODS+++++++++++++++++++++++++++++++++++++++++++++++++++++
	public int getNumWheels()
	{
		return this.numWheels;
	}
	
	
	public int getNumDoors()
	{
		return this.numDoors;
	}
		
	
	public String getColor() 
	{
		return this.color;
	}
	
	public String getMake()
	{
		return this.make;
	}
	
	public String getModel()
	{
		return this.model;
	}
	
	public String getYear() 
	{
		return this.year;
	}
	
	public double getSpeed() 
	{
		return this.speed;
	}
	
	public double getMAX_SPEED()
	{
		return this.MAX_SPEED;
	}
	
	//PUBLIC METHODS+++++++++++++++++++++++++++++++++++++++++++++++
	public void accelerate()
	{
		this.speed +=4; //car accelerates 4 meters per second^2
		if(this.speed >= this.MAX_SPEED)
		{
			this.speed = MAX_SPEED;
		}
			
	}
	
	public void decelerate()
	{
		this.speed -=6;
		if(this.speed < 0) //so we cant go backwards
			this.speed = 0;
	}
	
	public void turnLeft()
	{
		System.out.println("Turning Left");
	}
	
	public void turnRight()
	{
		System.out.println("Turning Right");
	}
}
