package oops.abstraction.abstractclasses;

public class ContractEmp extends Employee {

	void empDetails(String name, int id) {
		System.out.println("Name \t Id \t Type");
		System.out.println("--------------------------");
		System.out.print(name + "\t");
		System.out.print(id + "\t");
		System.out.println("Contract");
	}

	@Override
	void salary() {
		final double sal = 20000.80;
		System.out.println("\n" + "Salary of Contract Employee is " + sal);
	}
}
