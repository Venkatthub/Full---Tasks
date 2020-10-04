package realworld_furnitureshowroom;

import java.util.Scanner;

import realworld_furnitureshowroom.backend.Furnitures;

public class ShowroomManagement {

	// enum for types of furniture supported
	enum FurnitureTypes {

		TABLE, CHAIR, SOFA;

	}

	public static void main(String[] args) throws Exception {

		Furnitures furn = new Furnitures();

		Scanner scan = new Scanner(System.in); // Opening Scanner to get
		// input user

		System.out.println("Furniture types supported :" + "\n");
		FurnitureTypes[] types = FurnitureTypes.values();

		for (FurnitureTypes furnitureTypes : types) {
			System.out.println(furnitureTypes);
		}

		// Store the enum length in a vaiable
		int numberOfTypes = FurnitureTypes.values().length;

		// Adding cost of furniture
		while (numberOfTypes != 0) {

			System.out.println("\n" + "Enter furniture type and cost :");
			String name = scan.next();
			double cost = scan.nextDouble();
			furn.add(cost, name);
			numberOfTypes -= 1;

		}

		// Adding furniture
		furn.add("Normal Chair");
		furn.add("Wooden Chair");
		furn.add("Wooden Sofa");
		furn.add("Normal Sofa");
		furn.add("Wooden Table");
		furn.add("Normal Table");

		furn.costOfFurnsTypes();

		for (String s : furn.furnsInShowroom()) {
			System.out.println(s);
		}

		scan.close();
	}
}
