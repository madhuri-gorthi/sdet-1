package JavaActivity4;

public class Activity2_2 {
	public static void main(String []args) throws InterruptedException {
		plane plane =new plane(10);
		plane.onboard("steve");
		plane.onboard("Michael");
		plane.onboard("robert");
		System.out.println("Plane take of at"+plane.takeoff());
		System.out.println("list of passengers"+plane.getPassesngers());
		Thread.sleep(5000);
		plane.land();
		System.out.println("Plane landed at" +plane.getLastTimeLanded());
		System.out.println("List of passengers after landing"+plane.getPassesngers());
	}

}
