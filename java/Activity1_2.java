package JavaActivity2;

public class Activity1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] num = {10, 77, 10, 54, -11, 10};
		 
		boolean result =result(num);
		System.out.println("Result: " +result);
		
	}
	public static boolean result(int[] num) {
		int sum=0;
		 for(int i=0;i<num.length;i++) {
			 if(num[i]==10) {
				 sum=sum+num[i];
			 }
		 }
		 return sum==30;
		
	}

}
