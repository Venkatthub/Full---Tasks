package oops.abstraction.interfaces;

import java.util.Scanner;

public class Employee {

	public static Scanner scan = null;

	public static void main(String[] args) {

		EmpDetails e = new EmpDetails();
		Account a = new Account();
		scan = new Scanner(System.in);
		System.out.println("Enter the Name :");
		e.setName(scan.next());
		System.out.println("Enter the Id :");
		e.setId(scan.nextInt());
		System.out.println("Enter the Gender :");
		e.setGender(scan.next());
		System.out.println("Enter Mobile :");
		e.setPhone(scan.nextLong());
		System.out.println("\n\n" + "Name :" + e.getName());
		System.out.println("Gender :" + e.getGender());
		System.out.println("Id :" + e.getId());
		System.out.println("Mobile Number :" + e.getNumber());

		try {
			String ch;
			do {
				System.out.println("\n" + "Want to Enter Bank ? Y/N");
				ch = scan.next();
				if (ch.equals("y")) {
					a.display(e);
					int c = scan.nextInt();
					a.bankService(c);
					if (c == 2) {
						a.setDeposit(scan.nextDouble());
					} else if (c == 3) {
						a.setWithdraw(scan.nextDouble());
					}
				}
			} while (ch.equals("y"));
		} catch (Exception e1) {
			System.out.println("Exception " + e1.getMessage());
		} finally {
			scan.close();
		}
	}

}