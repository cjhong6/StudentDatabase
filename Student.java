package studentdatabaseapp;
import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses="";
	private int tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	//Constructor: Prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshment\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter grade year: ");
		this.gradeYear = in.nextInt();
		setStudentID();
	}
	
	//Generate student ID
	private void setStudentID() {
		this.studentID = gradeYear+""+ id;
		id++;
	}
	
	//Enroll in class
	public void enroll() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a course to enroll(Q to quit): ");
		String course = in.nextLine();
		while(!course.equals("Q")) {
			//append the new course to the list of old course
			courses = courses+"\n "+course;
			tuitionBalance += costOfCourse;
			System.out.print("Enter a course to enroll(Q to quit): ");
			course = in.nextLine();
		}
	}
	
	//View Balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	
	//Pay Tuition
	public void payTuition() {
		viewBalance();
		Scanner in = new Scanner(System.in);
		System.out.print("How much would you like to pay? $" );
		int payment = in.nextInt();
		if(tuitionBalance>0) {
			tuitionBalance-=payment;
		}
		System.out.println("Thanks for your payment of $" + payment);
		viewBalance();
	}
	
	//Show status
	public String toString() {
		return "Name: " + firstName + " " + lastName +
				"\nGrade: "+gradeYear+
				"\nStudent ID: " + studentID +
				"\nCourses: " + courses +
				"\nBalance: $" + tuitionBalance;
	}
	
}
