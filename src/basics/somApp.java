package basics;

public class somApp {

	public static void main(String[] args) {
		sum()
		
		
		System.out.prinln(sum);
	}	
		
	private static void sum() {
		// TODO Auto-generated method stub
		
	}

	public static int sum(int[] numbers) {
	    int sum=0;
	    for (int i = 0; i < numbers.length; i++) {
	        sum=sum+numbers[i];
	    }
	    return sum;
	}
	

}
