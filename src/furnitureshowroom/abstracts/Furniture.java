package furnitureshowroom.abstracts;

public abstract class Furniture {

	private String name;
	private double price;

	public Furniture(String s, double d) {
		this.name = s;
		this.price = d;
	}

	public String getName() {

		return name;

	}

	public double getPrice() {

		return price;

	}

	public abstract void furnDetails();

}
