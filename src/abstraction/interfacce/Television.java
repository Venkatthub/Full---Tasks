package abstraction.interfacce;

public class Television implements Remote {

	@Override
	public void switchOn() {

		System.out.println("Switch on the television");

	}

	@Override
	public void increaseVolume() {

		System.out.println("Increase the volume by 1");

	}

	@Override
	public void decreaseVolume() {

		System.out.println("Decrease the volume by 1");

	}

}
