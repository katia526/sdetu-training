package Labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("456238974", 1000);
		BankAccount acc2 = new BankAccount("954872216", 2000);
		BankAccount acc3 = new BankAccount("762356874", 2500);
		
		acc1.setName("jim");
		System.out.println(acc1.getName());
		
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		
		acc1.accrue();
	}
}
class BankAccount implements IInterest {
	// properties of bank account
	private static int iD = 1000;
	private String accountNumber; // id + random 2-digit number + first 2 of SSN
	private static final String routingNumber = "0054006577";
	private String name;
	private String SSN;
	private double balance;
	
	// constructors
	
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		System.out.println("New Account Created");
		this.SSN = SSN;
		iD++;
		System.out.println(iD);
		setAccountNumber();
	}
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		System.out.println(random);
		accountNumber = iD + "" + random + SSN.substring(0,2);
		System.out.println("your accountnumber = " + accountNumber);
	
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void payBill(double amount) {
		
		System.out.println("paying Bill : " + amount);
		balance = balance - amount;
		showBalance();
	}
	public void makeDeposit(double amount) {
		System.out.println("Deposit: " + amount);
		balance = balance + amount;
		showBalance();
	}
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}
	@Override
	public void accrue() {
	
		balance = balance * (1 + rate/100);
		showBalance();
	}
}

