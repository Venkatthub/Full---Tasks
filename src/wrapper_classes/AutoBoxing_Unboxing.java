package wrapper_classes;


//Converting primitive data types into objects and reverse 

public class AutoBoxing_Unboxing {
	public static void main(String[] args) {

		Integer a = 6; // AutoBoxing

		int b = a; // Unboxing

		int c = a;

		System.out.println("Sum of number :" + b + c);

		Integer i = (Integer) 20; // BoxingExplictly

		int j = i.intValue();// unboxing

		System.out.println("Sum of numbers :" + (i + j));

		if (a < 20) {
			System.out.println("Square of the number :" + a * a);
		}
	}
}
