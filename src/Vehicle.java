
/**
 * @author Alexc007
 *Class Description: Creating a Vehicle class to use as 
 *a SuperClass for all other Vehicle subClasses 
 *@version 0.2 - Added Vehicle Class
 */
public abstract class Vehicle 
{
	//INSTANCE VARIABLES - PROPERTIES++++++++++++++++++++++++++++++++
	protected int numWheels = 4; //the number of wheels in a vehicle
	protected int numDoors = 2; //the minimum number of doors in a vehicle
	private String color = "";  //vehicle color
	private String make = "";
	private String model = "";
	private String year = "";
	protected double speed = 0;
	protected final double MAX_SPEED = 40; //max speed is 40 Meters/Sec
	
	//CONSTRUCTORS++++++++++++++++++++++++++++++++++++++++++++++++++
	
	public Vehicle(int wheels , int doors , String color , String make , String model , String year)
	{
		this.numWheels = wheels;
		this.numDoors = doors;
		this.color = color;
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public Vehicle(String color , String make , String model , String year)
	{
		this.color = color;
		this.make = make;
		this.model = model;
		this.year = year;
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
	
	//PUBLIC ABSTRACT METHODS+++++++++++++++++++++++++++++++++++++++++++++++
	//MUST BE OVERRIDEN
	public abstract void accelerate();
	
	public abstract void decelerate();
	//PUBLIC MEHTODS+++++++++++++++++++++++++++++++++++++++++++++++++
	public void turnLeft()
	{
		System.out.println("Turning Left");
	}
	
	public void turnRight()
	{
		System.out.println("Turning Right");
	}
}
