package tasks.arraylist.arraylist_to_array;

import java.util.*;

//From ArrayList to Array

public class MarketEmp {

	private static List<String> roles = Arrays.asList("Manager", "Owner", "Cashier", "Staff", "Delivery Person");

	private static ArrayList<String> employeeTypes = new ArrayList<>(roles);

//	Method to convert and return array from arrayList using toArray method
	public String[] getEmployees() {

		String[] rolesEmp = new String[employeeTypes.size()];

		return employeeTypes.toArray(rolesEmp);

	}

//	Method to convert and return array from arrayList using for loop
	public String[] getEmployeeRoles() {

		String[] rolesEmp = new String[employeeTypes.size()];

		for (int i = 0; i < employeeTypes.size(); i++) {

			rolesEmp[i] = employeeTypes.get(i);

		}

		return rolesEmp;

	}


}
