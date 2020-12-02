package JavaActivity4;


interface BicycleParts{
	public static final int gears = 0;
	public static final int speed = 0;
}

interface BicycleOperations{
	
	public void applyBrake(int decrement) ;
	public void speedUp(int increment);
	
	
}
class Bicycle implements BicycleParts,BicycleOperations{

	public int 	gears;
	public int currentspeed;
	Bicycle(int gears,int speed){
		this.gears=gears;
		this.currentspeed=speed;
	}
	@Override
	public void applyBrake(int decrement) {
		currentspeed =currentspeed-decrement;
		System.out.println("current speed after applying brake"+currentspeed);		
	}
	@Override
	public void speedUp(int increment) {
		currentspeed =currentspeed+increment;
		System.out.println("current speed after speeding up"+currentspeed);	
	}
	
	public String bicycleDesc() {
		return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentspeed);
	}

}

