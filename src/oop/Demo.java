package oop;

class Person {
	
	String name;
	String email;
	String phone;
	
	void walk () {
		System.out.println(name + " is walking.");
	}
	
	void eat(){
		System.out.println(name +" is eating.");
	}
	
	void sleep() {
		System.out.println(name +" is sleeping.");
	}
}

public class Demo {

	public static void main(String[] args) {
		// Instantiating an object
		Person person1 = new Person();
		
		// Define some properties
		person1.name = "Joe";
		person1.email = "Joe@testmail.com";
		person1.phone = "12584697";
		
		//Abstraction
		person1.walk();
		person1.sleep();
		person1.eat();
		
	}
		//Person
		/*
		//Attributes, variables, adjectives, descriptors
		
		String name = "Joe";
		String email = "Joe@testmail.com";
		String phone = "45987216";

		// action activity behaviour
		walking(name);
		System.out.println(name + " is walking.");
		System.out.println(name +" is eating.");
		
		// what about binding attributes and properties together
		
		
		
		
				}
	
	// enhance by adding functions to minimize code

	static void walking(String name) {
		System.out.println(name + " is walking");
		// TODO Auto-generated method stub
		
	}
*/
}
