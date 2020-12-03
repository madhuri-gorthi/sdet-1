package Session3;

import java.util.ArrayList;

public class Acitvity3_1 {
	
	public static void main(String[] args) {
		ArrayList<String> mylist = new ArrayList<String>();
		mylist.add("hyderabad");
		mylist.add("madhapur");
		mylist.add("secunderabad");
		mylist.add("gachibowli");
		mylist.add("lingampalli");
		
		for(int i=0;i<mylist.size();i++) {
			System.out.println("array "+mylist.get(i));
		}
		
		System.out.println("Third element in the list"+mylist.get(2));
		
		System.out.println("check name"+mylist.contains("hyderabad"));
		
		System.out.println("size of the array"+mylist.size());
		
		mylist.remove(4);
		System.out.println("size of the array"+mylist.size());
		
	}

}
