package oops.encapsulation;

import java.util.Scanner;

//Encapsulation - Main Class

public class StudentHome {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		StuDetails st = new StuDetails();

		System.out.println(" Welcome to Student Home !!" + "\n" + "Enter the Student details to register");

		System.out.println("Enter student name :");
		st.setName(scan.next());

		System.out.println("Enter student ID :");
		st.setIdNum(scan.nextInt());

		System.out.println("Enter student Age :");
		st.setAge(scan.nextInt());

		System.out.println("Sudent Name :" + st.getName());
		System.out.println("Student ID :" + st.getIdNum());
		System.out.println("Student Age :" + st.getAge());
		System.out.println("Student Successfully Registered ! Thank you.");

		scan.close();

	}
}
