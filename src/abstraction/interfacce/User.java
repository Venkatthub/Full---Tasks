package abstraction.interfacce;

public class User {

	public static void main(String[] args) {

		Remote r = new Television();

		r.switchOn();

		r.increaseVolume();

		r.decreaseVolume();
	}

}
