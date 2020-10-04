package accessmodifiers.check;

public class Morning extends Night {

	public double morningStartTime = 5.00; // can be accessed anywhere in the project

	void displayMorning() {

		System.out.println("Morning starts from :" + morningStartTime);
		
		Night n = new Night();
		
		n.display();

	}

	
}
