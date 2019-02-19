package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		
		
		// Declare an array
		String[] countries;
		
		// Define the array
		
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		System.out.println(countries[1]);
		
		// Declare & Define the array
		
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		
		int i = 0;
		
		// do loop : enters the loop then tests condition
		do {
			System.out.println("states: " + states[i]);
			i = i + 1;
		} while (i < 5);
		
		// while loop : tests condition first then enters loop
		
		int n = 0;
		boolean stateFound = false;
		while (!stateFound) {
			String state = states[n];
			System.out.println(state);
			if (state == "Texas") {
			System.out.println("State Found!");
			stateFound = true;
			}
			n++;
		}
		
		//System.out.println(states[1]);
		//System.out.println(states[2]);
		//System.out.println(states[3]);
				
		
		// for Loop: best structure for iterating through an array
		System.out.println("PRINTING WITH FOR LOOP");
		for (int x = 0; x < 5; x++) {
			System.out.println(states[x]);
		}
	}

}
