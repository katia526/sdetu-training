package basics;

public class factorialApp {

	public static void main(String[] args) {
		
		
	for (int i = 1; i <=10; i++)	
	System.out.println(fact(i));
}

public static int fact(int n) {
    if (n <= 1)
        return 1;
    else
        return n * fact(n - 1);


	}

}
