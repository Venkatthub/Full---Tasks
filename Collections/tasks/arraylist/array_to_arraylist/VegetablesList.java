package tasks.arraylist.array_to_arraylist;

import java.util.*;

// converting from Array to ArrayList

public class VegetablesList {

//	Method 1: Adding vegetables to the array using as list method
	public List<String> addVeges(String[] veges) {

		return new ArrayList<>(Arrays.asList(veges));

	}

}
