package oops.polymorphism.compiletime_method_overloading;

//Method Overloading

public class CollegeDepartments {

//Department method with zero parameters
public void department() {
	System.out.println("For Faulties :");
	System.out.println("Managerment"
			+ "\n"
			+ "Controller of Exams"
			+ "\n"
			+ "Cultural");
}


//Same department method with parameter
public void department(String str) {
	System.out.println("ECE Department"
			+ "\n"
			+ "CSE Deraprtment"
			+ "\n"
			+ "EEE Department"
			+ "\n"
			+ "Mech Department");
}
}
