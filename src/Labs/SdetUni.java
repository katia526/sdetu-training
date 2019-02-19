package Labs;

public class SdetUni {

	public static void main(String[] args) {
	Student stu1= new Student("janelle","451264");
		Student stu2= new Student("jef","658241");
		
		//acc1.setName("jef")
		//stu1.setName("jef");
		//stu2.setName("Marie");
		//System.out.println(stu1.getName());
		stu1.enroll("Math151");
		stu1.enroll("Eng255");
		stu1.enroll("His205");
		
		
		stu1.showCourses();
		stu1.checkBalance();
		stu1.payTuition(600);
		stu1.checkBalance();
		System.out.println(stu1.toString());
	}
}
class Student {
	private static int iD = 0;
	private String studentNumber;
	private String SSN;
	private String name;
	private String email;
	public String courses ="";
	private static final int costOfCourse =800;
	private int balance=0;
	
	public Student(String name, String SSN) {
		iD++;
		this.name = name;
		this.SSN = SSN;
		setEmail();
		setStudentNumber();
	}
	

private void setEmail() {
	email = name.toLowerCase() + "." + iD + "@sdetuniversity.com";
	System.out.println("Your email: " + email);
	
}


private void setStudentNumber() {
	int max = 9000;
	int min = 1000;
	int random = (int) (Math.random() * (max - min));
	random = random + min;
	System.out.println(random);
	studentNumber = iD +""+ random + "" + SSN.substring(2,6);
	System.out.println(studentNumber);
	
}
public void enroll(String course)	{
	this.courses = this.courses + "\n" + course;
	
	balance = balance + costOfCourse;
	System.out.println(balance);
}
public void payTuition(int amount) {
	System.out.println("Payment: $" + amount);
	balance = balance - amount;
	System.out.println(balance);
}
public void checkBalance() {
	System.out.println("Balance :$" + balance);
}
public void showCourses() {
	System.out.println(courses);
}
public String toString() {
	return "[NAME: " + name + " ]\n[COURSES: " + courses + " ]\nBALANCE: " + balance + " ]";
}
}