package oops.abstraction.abstractclasses;

import java.util.Scanner;

public abstract class Employee {
	static Scanner scan = null;

	abstract void salary();

	static String login() {
		scan = new Scanner(System.in);
		// Logging in with the type
		System.out.println("Enter type of login : r / c");
		String type = scan.next();
		return type;
	}

	public static void main(String[] args) {

		RegularEmp re = new RegularEmp();
		ContractEmp ce = new ContractEmp();

		scan = new Scanner(System.in);

		String empName;
		int empId;

		// Getting employee details
		System.out.println("Please enter Employee Name :");
		empName = scan.next();
		System.out.println("Please enter Employee ID :");
		empId = scan.nextInt();

		switch (login()) {
		case "r":
			re.empDetails(empName, empId);
			re.salary();
			break;
		case "c":
			ce.empDetails(empName, empId);
			ce.salary();
			break;
		}
	}
}
