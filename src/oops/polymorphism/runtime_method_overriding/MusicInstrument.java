package oops.polymorphism.runtime_method_overriding;

public class MusicInstrument {
	
	public void play() {
		
		System.out.println("This is a music instrument, it gives music when played by a musician !");
		
	}

}

class Guitar extends MusicInstrument{
	
	@Override
	public void play() {
		
		System.out.println("Guitar is playing ! Guitar uses strings to produce music !");
	}
	
}

class Keyboard extends Guitar{
	
	@Override
	public void play() {
		
		System.out.println("Keyboard is playing ! Keybords produces sounds of all music instruments !");
		
	}
	
}