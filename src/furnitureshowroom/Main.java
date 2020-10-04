package furnitureshowroom;

import furnitureshowroom.abstracts.Furniture;
import furnitureshowroom.imple.Chair;
import furnitureshowroom.imple.Sofa;
import furnitureshowroom.imple.Store;
import furnitureshowroom.imple.Table;

public class Main {

	public static void main(String[] args) {

		final Furniture c = new Chair(1000);
		final Furniture t = new Table(2500);
		final Furniture s = new Sofa(6000);
		Store customer = new Store("venkat", "mumbai");

		c.furnDetails();
		t.furnDetails();
		s.furnDetails();

		customer.quantity(2, s);
		customer.billDetails();
		customer.deliveryDetails();

	}

}
