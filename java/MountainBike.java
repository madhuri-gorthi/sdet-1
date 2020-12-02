package JavaActivity4;

public class MountainBike extends Bicycle{

	 public int seatheight;
	MountainBike(int gears, int speed,int height) {
		super(gears, speed);
		this.seatheight=height;
		
	}

	public void setHeight(int newValue) {
	    seatheight = newValue;
	}
	public String bicycleDesc() {
		
		return("seat height"+seatheight+super.bicycleDesc());
	}
}
