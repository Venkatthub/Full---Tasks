package furnitureshowroom.imple;

import furnitureshowroom.abstracts.Furniture;

public class Sofa extends Furniture{

	public Sofa(double d) {

		super("Sofa", d);

	}
	

	@Override
	public void furnDetails() {
		
		final String name=this.getName();
		final double price=this.getPrice();
		
		System.out.println(name +" - $"+price);
		
	}
}
