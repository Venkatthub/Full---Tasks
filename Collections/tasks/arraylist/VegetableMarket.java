package tasks.arraylist;

import java.util.Scanner;

import tasks.arraylist.array_to_arraylist.VegetablesList;
import tasks.arraylist.arraylist_to_array.MarketEmp;
import tasks.arraylist.sorting_array.PriceList;
import tasks.arraylist.string_subsequence.SubSequence;

// VegetableMarket class to maintain the list of vegetables available

public class VegetableMarket {

	public static void main(String[] args) {

		VegetablesList list = new VegetablesList();

		System.out.println(list.addVeges(vegetableArray()));

		MarketEmp emp = new MarketEmp();

//	for loop to fetch the roles from array
		for (int i = 0; i < emp.getEmployeeRoles().length; i++) {

			System.out.println(emp.getEmployeeRoles()[i] + " ");

		}

		System.out.println();

//		for each loop to fetch elements
		for (String role : emp.getEmployees()) {
			System.out.println(role + " ");
		}

//		Add price for each vegetable
		Scanner scan = new Scanner(System.in);

		PriceList pl = new PriceList();

//		Using Streams and foreach method to get price for each item in the market
		list.addVeges(vegetableArray()).forEach(item -> {
			System.out.println("\n" + "Enter price for " + item);
			pl.setPrice(scan.nextDouble());
		});

//		To display Highest price in the market
		System.out.println("Highest price " + pl.sortPriceListDescending().get(0));

//		To display Lowest price in the market
		System.out.println("Lowest price available in market " + pl.sortPriceListAscending().get(0));

//		Getting string to check sequence
		System.out.println("Enter the ");

//		To print subsequences of all vegetable list
		SubSequence sq = new SubSequence();
		for (String str : vegetableArray()) {
			sq.printArrayList(sq.getSequence(str));
		}

		scan.close();

	}

//	Array of vegetables available in the market
	public static String[] vegetableArray() {

		return new String[] { "Carrot", "Tomoto", "Brinjal", "Onion", "Potato", "Capsicum", "Drumstick",
				"BitterGourd" };

	}

}
