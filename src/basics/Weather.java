package basics;

public class Weather {
	public static void main(String[] args) {
		
		
		int temperatures = 65;
		String sunCondition = "Overcast";
		
		if (temperatures > 80) {
			System.out.println("It's Pleasant. Wear shorts and t-shirts");
		}
		else if ((temperatures > 60) && (sunCondition == "Sunny")) {
			System.out.println("It's a little cooler, Perhaps wear a long-sleeve shirt and jeans");
			System.out.println("Wear a hat to keep the sun out of your eyes.");
			
		}
		else if ((temperatures > 50) || (sunCondition == "Overcast")) {
			System.out.println("This is a cool day, make sure to wear warmer clothes.");
		}
		else {
			System.out.println("It's a cold day, Bring a sweater");
		}
		System.out.println("The program is ending");	
	}

}
