package Session4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new  Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		Random indexgen = new Random();
		System.out.println("Enter number");
		while(scan.hasNextInt()) {
		    list.add(scan.nextInt());
		}
		
		Integer nums[] = list.toArray(new Integer[0]);
		
		int index = indexgen.nextInt(list.size());
		System.out.println("random number generated "+index);
		System.out.println("value in array at that index "+nums[index]);
		scan.close();

	}

}
