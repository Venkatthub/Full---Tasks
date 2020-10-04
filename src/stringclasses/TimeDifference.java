package stringclasses;

public class TimeDifference {

	public static void main(String[] args) {

		long time = System.currentTimeMillis();

		StringBuilder build = new StringBuilder("Java ");

		for (int i = 0; i < 10000; i++) {
			build.append("Program");
		}

		System.out.println("Builder " + (time - System.currentTimeMillis()) + "ms");

		StringBuffer buffer = new StringBuffer("Javac ");

		for (int i = 0; i < 10000; i++) {
			buffer.append("Program");
		}

		System.out.println("Buffer " + (time - System.currentTimeMillis()) + "ms");
		System.out.println(buffer.toString());
		System.out.println(build.toString());
		System.out.println(buffer.equals(buffer));
		System.out.println(build.equals(build));
		System.out.println(buffer.hashCode());
		System.out.println(build.hashCode());
	}

}
