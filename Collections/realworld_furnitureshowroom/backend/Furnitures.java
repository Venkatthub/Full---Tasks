package realworld_furnitureshowroom.backend;

import java.util.Set;
import java.util.TreeMap;

public class Furnitures extends Object {

	private double chairCost;
	private double tableCost;
	private double sofaCost;

	TreeMap<String, Double> hm = new TreeMap<>();

	// Adding bounds to generic to take only string value into this method
	// Adding furniture into TreeMap
	public <T extends String> void add(T name) throws FurnitureNotAccepted {

		if (name.toLowerCase().contains("table")) {

			hm.put(name, tableCost);

		} else if (name.toLowerCase().contains("chair")) {

			hm.put(name, chairCost);

		} else if (name.toLowerCase().contains("sofa")) {

			hm.put(name, sofaCost);

		} else {

			throw new FurnitureNotAccepted("Furniture not Accepted");
		}
	}

	// Setting the cost of furniture
	// Method Overloading with generic bound
	public <T extends Double> void add(T cost, String name) throws FurnitureNotAccepted {

		if (name.toLowerCase().contains("sofa"))
			this.sofaCost = cost;

		else if (name.toLowerCase().contains("table"))
			this.tableCost = cost;

		else if (name.toLowerCase().contains("chair"))
			this.chairCost = cost;

		else
			throw new FurnitureNotAccepted("Furniture name is Invalid" + "\n" + "Cannot set cost");

	}

	// Getting the cost of sofa
	public double getSofaCost() {

		return sofaCost;

	}

	// Getting the cost of Chair
	public double getChairCost() {

		return chairCost;

	}

	// Getting the cost of Table
	public double getTableCost() {

		return tableCost;

	}

	// To display all available furns
	public Set<String> furnsInShowroom() {

		return hm.keySet();

	}

	// To display all costs with respect to types
	public void costOfFurnsTypes() {

		System.out.println("Tables Types :" + tableCost + "$");
		System.out.println("Chairs Types :" + chairCost + "$");
		System.out.println("Sofa Types :" + sofaCost + "$");

	}

}
