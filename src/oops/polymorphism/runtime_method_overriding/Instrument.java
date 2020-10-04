package oops.polymorphism.runtime_method_overriding;

// Compiler decides what type of method to run during runtime

public class Instrument {

	public static void main(String[] args) {

		MusicInstrument mi = new MusicInstrument();

		mi.play();

		MusicInstrument kl = new Keyboard();
		Keyboard k = (Keyboard) kl;

		k.play();

		MusicInstrument g = new Guitar();

		g.play();

	}

}
