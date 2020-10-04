package furnitureshowroom.imple;

import furnitureshowroom.abstracts.Furniture;

public class Chair extends Furniture {

	public Chair(double d) {

		super("Chair", d);

	}

	@Override
	public void furnDetails() {

		final String name = this.getName();
		final double price = this.getPrice();

		System.out.println(name + " - $" + price);

	}

}
