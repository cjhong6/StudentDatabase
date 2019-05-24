package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("How many students would you like to create?");
		Scanner in = new Scanner(System.in);
		int numOfStudent = in.nextInt();
		Student[] students = new Student[numOfStudent];
		
		for(int i=0; i<students.length; i++) {
			Student student = new Student();
			student.enroll();
			student.payTuition();
			students[i] = student;
			System.out.println(students[i].toString());
		}
		
		
		

	}

}
