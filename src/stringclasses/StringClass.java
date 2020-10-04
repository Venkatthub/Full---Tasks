package stringclasses;

public class StringClass {

	public static void main(String[] args) {

		stringClass();
		stringBuilder();
		stringBuffer();

	}

	public static void stringClass() {

//		String is immutable so you memory address will not remains same whenever you do reinitialization

		String vegetable = new String("Potato");

		System.out.println(vegetable.hashCode()); // returns hashcode value of potato

		vegetable = "Tomato";

		System.out.println(vegetable.hashCode());

		vegetable = "Potato";

		System.out.println(vegetable.hashCode()); // returns hashcode value of previous potato when reinitialized

	}

	public static void stringBuilder() {

//		String Builder is mutable so you memory address remains same, not thread safe - multiple threads can access

		StringBuilder vegetable = new StringBuilder("Brinjal");

		System.out.println("\n\n" + vegetable.hashCode());

		System.out.println(vegetable.capacity());

		vegetable.replace(0, vegetable.length(), "Onion");

		System.out.println(vegetable);

		System.out.println(vegetable.hashCode()); // returns the same hashcode value hence it is immutable

		vegetable.append(" is a good for Hair growth."); // adding string

		System.out.println(vegetable);

		System.out.println(vegetable.capacity());

		vegetable.indexOf("i");

		System.out.println(vegetable.reverse());

	}

	public static void stringBuffer() {

//		String Buffer is mutable so you memory address remains same, thread safe - only one thread can access

		StringBuffer vegetable = new StringBuffer("Carrot");

		System.out.println("\n\n" + vegetable.hashCode()); // returns the hashcode value

		System.out.println(vegetable.capacity());

		vegetable.replace(0, vegetable.length(), "Beetroot");

		System.out.println(vegetable);

		System.out.println(vegetable.hashCode()); // returns the same hashcode value hence it is immutable

		vegetable.append(" is a good for Hair growth."); // adding string

		System.out.println(vegetable);

		System.out.println(vegetable.capacity());

		vegetable.indexOf("i");

		System.out.println(vegetable.reverse());

	}

}
