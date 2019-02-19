package basics;

public class Days {
	public static void main(String[] args) {
		//Execute different block of code based on the condition
		
		String dayOfWeek = "Tuesday";
		
		switch (dayOfWeek) {
		case "Monday" :
			System.out.println("Today is Monday");
			
		case "Tuesday" : 
			System.out.println("Today is Tuesday");
		
		
		case "Wednesday" : 
			System.out.println("Today is Wednesday");
			break;
		case "Thursday" : 
			System.out.println("Today is Thursday");
			break;
		default : System.out.println("Error!");
		}
	}

}
