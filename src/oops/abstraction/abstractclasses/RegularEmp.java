package oops.abstraction.abstractclasses;

public class RegularEmp extends Employee {

	void empDetails(String name, int id) {
		System.out.println("Name \t Id \t Type");
		System.out.println("--------------------------");
		System.out.print(name + "\t");
		System.out.print(id + "\t");
		System.out.println("Regular");
	}

	@Override
	void salary() {
		final double sal = 25000.20;
		System.out.println("\n" + "Salary of Regular Employee is " + sal);
	}
}
