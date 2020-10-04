package furnitureshowroom.imple;

import furnitureshowroom.abstracts.Delivery;
import furnitureshowroom.abstracts.Furniture;

public class Store implements Delivery {

	private String customerName;
	private String location;
	private double totalAmount;
	private String furnitureName;
	private int quantity;

	public Store(String s, String p) {
		this.customerName = s;
		this.location = p;
	}

	@Override
	public void quantity(int n, Furniture f) {

		furnitureName = f.getName();
		quantity = n;
		final double fPrice = f.getPrice();
		this.totalAmount = n * fPrice;
		System.out.println("\n" + furnitureName + " is selected." + "\n" + "Quantity :" + n + "\n\n"
				+ "Total to be Paid : $" + totalAmount);

	}

	@Override
	public void billDetails() {

		System.out.println("\n\n" + "Bill" + "\n" + "------------ \n");
		System.out.println(furnitureName + " * " + quantity + " = " + totalAmount);

	}

	@Override
	public void deliveryDetails() {
		try {
			if (location == "chennai" || location == "banglore") {
				System.out.println("\n\n" + "Thank you for shopping with us " + customerName + " your " + furnitureName
						+ " will be delivered to you in next 24 hours.");
			} else {

				throw new DeliverynotAvailableException("Sorry we can't deliver to your location");
			}
		} catch (DeliverynotAvailableException e) {

			System.out.println("\n\n" + "Delivery Message :" + e.getMessage());

		}
	}

}

@SuppressWarnings("serial")
class DeliverynotAvailableException extends Exception {

	DeliverynotAvailableException(String s) {
		super(s);
	}
}
