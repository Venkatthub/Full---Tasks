

public class ObjectClassMethods {

	public static void main(String[] args) {

		Object o = new Object();

		// toString()

		System.out.println(o.toString());

		// hashcode

		System.out.println(o.hashCode());

		ObjectClassMethods n = new ObjectClassMethods();

		System.out.println(n.hashCode());

		System.out.println(n.toString());

		// equals
		System.out.println(o.equals(n));

		System.out.println(o.equals(o));
	}
}
