
/**
 * @author Alexc007
 *
 */
public class Truck extends Vehicle
{

	//CONSTRUCTOR++++++++++++++++++++++++++++++++++++++++++++++++
	public Truck(int wheels, int doors, String color, String make, String model, String year)
	{
		super(wheels, doors, color, make, model, year);
		checkNumDoors();
	}
	
	
	
	//PRIVATE METHODS++++++++++++++++++++++++++++++++++++++++++
	private void checkNumDoors()
	{
		if(this.numDoors < 3)
			this.numDoors = 3;
	}
	
	//OVERRIDEN PUBLIC METHODS+++++++++++++++++++++++++++++++++++
	@Override
	
	public void accelerate()
	{
		this.speed +=2;
		if(this.speed >= this.MAX_SPEED)
			this.speed = this.MAX_SPEED;
	}
	@Override
	public void decelerate()
	{
		this.speed -=3;
		if(this.speed < 0) //so we cant go backwards
			this.speed = 0;
	}
	
	
}
