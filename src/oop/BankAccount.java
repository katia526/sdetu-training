package oop;

public class BankAccount implements IRate {
	
	String accountNumber;
	//static variables
	private static final String routingNumber = "25687452";
	
	//instance variable
	private String name;
	private String ssn;
	String accounttype;
	double balance;
	
	// constructors definition : unique methods
	//   1. they are used to define/setup / initialize properties of an object
	//	 2. constructors are IMPLICITLY called upon instantiation
	//   3. The same name as the class itself
	//   4. constructors have no return type
	BankAccount() {
		System.out.println("NEW account created");
	}
	
	// Overloading: call same method name with different arguments
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit){
		
		// initDeposit, accountType,  msg are all local variables
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $ " + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg ="Error! minimum deposit must be at least $1000";
			
		} else {
			Msg = "Thanks for your initial deposit of: $ " + initDeposit;
		}
		
		System.out.println(Msg);
		balance = initDeposit;
	}
	
	
	// Getters /Setters
	
	// allow the user to define the name
	
	public void setName(String name){
		this.name = "Mr." + name;
		
	}
	
	public String getName() {
		return name;
	}
	
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	// Interface methods
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	public void increaseRate(){
		System.out.println("INCREASING RATE");
	}
	
	// Define methods 
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("Deposit");
	}
	
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("WITHDRAW");
	}
	
	// Private : can only be called from within the class
	private void showActivity(String activity) {
		System.out.println("showing recent activity" + activity);
		System.out.println("your new balance is: $" + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance: " + balance);
		
	}
	
	void getStatus() {
		
	}
	@Override
	public String toString(){
		return "[Name " + name + ". Account " + accountNumber + " Routing # " + routingNumber + " .Balance: $" + balance + "]";
	}
}
