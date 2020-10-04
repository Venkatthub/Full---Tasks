package arraylist.abstracts;

import arraylist.Imple.Buyer;

public interface Deliverable {

	void read();

	void takeAway(String name, String location, Buyer b);

}
