package operators;

import java.util.*;

import operators.operations.Calculate;

public class Calculator {

	public static void main(String[] args) {

		String[] operations = { "Sum", "Difference", "Multiplication", "Division", "Modulus", "Percentage",
				"To Increment", "To Decrement", "To compare two numbers", "To Check Even or Odd" };

		Calculate cal = new Calculate();

		Scanner scan = new Scanner(System.in);

		System.out.println("Please select the operation to be performed :" + "\n");

		for (int i = 0; i < operations.length; i++) {
			System.out.println(i + 1 + ". " + operations[i]);
		}

		int n;

		do {
			n = scan.nextInt();
			switch (n) {

			case 1:
				System.out.println(operations[n - 1] + " : " + cal.sum(scan.nextDouble(), scan.nextDouble()));
				n = 0;
				break;

			case 2:
				System.out.println(operations[n - 1] + " : " + cal.difference(scan.nextDouble(), scan.nextDouble()));
				n = 0;
				break;

			case 3:
				System.out
						.println(operations[n - 1] + " : " + cal.multiplication(scan.nextDouble(), scan.nextDouble()));
				n = 0;
				break;

			case 4:
				System.out.println(operations[n - 1] + " : " + cal.divide(scan.nextDouble(), scan.nextDouble()));
				n = 0;
				break;

			case 5:
				System.out.println(operations[n - 1] + " : " + cal.modulus(scan.nextDouble(), scan.nextDouble()));
				n = 0;
				break;

			case 6:
				System.out.println(operations[n - 1] + " : " + cal.percentage(scan.nextDouble(), scan.nextDouble()));
				n = 0;
				break;

			case 7:
				System.out.println(operations[n - 1] + " : " + cal.incrementOf(scan.nextDouble()));
				n = 0;
				break;

			case 8:
				System.out.println(operations[n - 1] + " : " + cal.decrementOf(scan.nextDouble()));
				n = 0;
				break;

			case 9:
				System.out.println(operations[n - 1] + " : " + cal.compareWith(scan.nextDouble(), scan.nextDouble()));
				n = 0;
				break;

			case 10:
				System.out.println(operations[n - 1] + " : ");
				cal.evenOdd(scan.nextDouble(), scan.nextDouble());
				n = 0;
				break;

			default:
				System.out.println("Enter a vaild choice :");
			}

		} while (n != 0);

		System.out.println("\n\n" + "Is cal object reference of class calculate :");
		cal.instanceOf(cal);

		scan.close();

	}
}
