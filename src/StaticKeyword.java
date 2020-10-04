

// static binding // done by compile time //

public class StaticKeyword {

	public static void main(String[] args) {

		System.out.println(Human.message);
		Human.walk();
		System.out.println(Boy.message);
		Boy.walk();
		System.out.println(Girl.message);
		Girl.walk();
	}

}

class Human {

	static String message = "A human can be a boy or a girl";

	static void walk() {
		System.out.println("Human walks");
	}

}

class Boy extends Human {

	static String message = "A boy !";

	static void walk() {
		System.out.println("Boy walks");
	}

}

class Girl extends Human {

	static String message = "A girl !";

	static void walk() {
		System.out.println("Girl walks");
	}

}