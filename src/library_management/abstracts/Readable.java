package library_management.abstracts;

import library_management.imple.Buyer;

public interface Readable{

	void read();
	
	void takeAway(String name, String location, Buyer b);
	
}
