package basics;

public class minMaxApp {

	public static void main(int[] args) {
		int[] cijfer = {12, 5, 20, 89, 40, 1, 66};
		
		printMin();
		
		
		
		System.out.println("program is starting");
		
		System.out.println(min);
		//int numA;
		//int numB = 20;
		//addNumbers();
	//	int product = multiplyNumbers(numA, numB);
		//System.out.println("The product of numbers "  + numA + " and " + numB + " is " + multiplyNumbers(numA, numB));
		//System.out.println("The product of numbers "  + numA + " and " + numB + " is " + product);

	}
	private static int printMin(int[] cijfer) {
		
		
	//}
	//public static int printMin(int[] cijfer) {
		int min = cijfer[0];
		for (int i = 1; i <= cijfer.length; i++) {
			if (cijfer[i] < min)
				min = (cijfer[i]);
			return min;
	}
	}
	*/*
	static void addNumbers(int numberA, int numberB) {
		// this function will add two numbers
		int sum = numberA + numberB;
		System.out.println("The sum of numbers " + numberA + " and " + numberB + " is " + sum);
	}
	
	static int multiplyNumbers(int valueA, int valueB) {
	  int product = valueA * valueB;
	  addNumbers(product, product);
	  return product;
	}
}
/*/
		
    }
}

