package tasks.arraylist.sorting_array;

import java.util.ArrayList;
import java.util.List;

//	Sorting ArrayList in Ascending and Descending order without using sort method

public class PriceList {

	private static ArrayList<Double> price = new ArrayList<>();

//	Method to add price
	public void setPrice(double priceEach) {
		price.add(priceEach);
	}

//	Method to sort and return a list of price in descending order
	public List<Double> sortPriceListDescending() {

		ArrayList<Double> descendingArray = new ArrayList<Double>(price);

		for (int i = 0; i < descendingArray.size(); i++) {

			for (int j = 0; j < descendingArray.size(); j++) {

				if (descendingArray.get(i) > descendingArray.get(j)) {

					double temp = descendingArray.get(i);
					descendingArray.set(i, descendingArray.get(j));
					descendingArray.set(j, temp);

				}
			}
		}

		return descendingArray;

	}

//	Method to sort and return a list of price in Ascending order
	public List<Double> sortPriceListAscending() {

		ArrayList<Double> ascendingArray = new ArrayList<Double>(price);

		for (int i = 0; i < ascendingArray.size() - 1; i++) {

			for (int j = 0; j < ascendingArray.size() - 1 - i; j++) {

				if (ascendingArray.get(i) < ascendingArray.get(j)) {

					double temp = ascendingArray.get(i);
					ascendingArray.set(i, ascendingArray.get(j));
					ascendingArray.set(j, temp);

				}
			}
		}

		return ascendingArray;

	}

//	Method to  get prices in list
	public List<Double> getPrices() {

		return price;

	}

}
