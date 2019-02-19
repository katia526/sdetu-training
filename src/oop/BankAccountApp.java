package oop;

class BankAccountApp {

	public static void main(String[] args) {
		// creating a new bank account >> think instantiate an object
		
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "0125689";
		
		//acc1.name = "Roger Huet";
		// with encapsulation (hiding) : public api methods
		acc1.setName("Roger Hueeet");
		
		
		System.out.println(acc1.getName());
		
		acc1.setSsn("2345568978");
		System.out.println("SSN: " + acc1.getSsn());
		
		acc1.balance = 10000;
		
		acc1.setRate();
		acc1.increaseRate();		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);
		
		System.out.println(acc1.toString());
		
		
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "0125689";
		acc2.checkBalance();
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "0125689";
		acc3.checkBalance();
		/*
		// demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.name = "Juan";
		cd1.interestRate = "4.5";
		cd1.balance = 3000;
		cd1.accounttype = "CD Account";
		System.out.println(cd1.toString());
		cd1.compount();
*/
		}
		

}
