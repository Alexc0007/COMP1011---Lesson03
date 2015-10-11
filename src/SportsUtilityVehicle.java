/**
 * 
 */

/**
 * @author Alexc007
 *
 */
public class SportsUtilityVehicle extends Vehicle {


	/**
	 * @param color
	 * @param make
	 * @param model
	 * @param year
	 */
	
	//CONSTRUCTOR++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public SportsUtilityVehicle(String color, String make, String model, String year)
	{
		super(color, make, model, year);
		this.numDoors = 5;
	}

	//OVERRIDEN METHODS+++++++++++++++++++++++++++++++++++++++++++++++
	@Override
	public void accelerate()
	{
		this.speed +=4;
		if(this.speed >= this.MAX_SPEED)
			this.speed = this.MAX_SPEED;
	}

	
	@Override
	public void decelerate() 
	{
		this.speed -=6;
		if(this.speed < 0) //so we cant go backwards
			this.speed = 0;
	}

}
