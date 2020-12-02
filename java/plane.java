package JavaActivity4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class plane {
	
	private int  maxpassenger;
	private List<String> passengers;
	private Date LastTimeLanded;
	private Date LastTimetakeoff;

	plane(int maxpassenger){
		this.maxpassenger=maxpassenger;
		this.passengers=new ArrayList<>();
	}
	public void onboard(String name) {
		this.passengers.add(name);
		
	}
	public Date takeoff() {
		this.LastTimetakeoff=new Date();
		return LastTimetakeoff;
	}
	public void land() {
		this.LastTimeLanded=new Date();
		this.passengers.clear();
		
	}
	public Date getLastTimeLanded() {
		return LastTimeLanded;
		
	}
	public List<String> getPassesngers() {
		return passengers;
	}

}
