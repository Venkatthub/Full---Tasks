package furnitureshowroom.imple;

import furnitureshowroom.abstracts.Furniture;

public class Table extends Furniture {

	public Table(double d) {

		super("Table", d);

	}

	@Override
	public void furnDetails() {

		final String name = this.getName();
		final double price = this.getPrice();

		System.out.println(name + " - $" + price);

	}
}
