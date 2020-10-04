package oops.encapsulation;

import java.util.Scanner;

//Employee class - Encapsulation

public class EmpClass {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		EmployeePojo emp = new EmployeePojo();
		
		System.out.println("Enter employee ID :");
		emp.setId(scan.nextInt());
		
		System.out.println("Enter employee Name :");
		emp.setName(scan.next());
		
		System.out.println("Enter employee Salary :");
		emp.setSal(scan.nextDouble());
		
		System.out.println("ID \t NAME \t SALARY");
		System.out.println("--------------------------");
		
		System.out.print(emp.getId() + "\t");
		System.out.print(emp.getName() + "\t");
		System.out.print(emp.getSalary() + "\t");
		
		scan.close();
	}

}
