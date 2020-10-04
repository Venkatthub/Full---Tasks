package operators.operations;

public class Calculate implements Calculatable {

	public Calculate() {
		System.out.println("Java Calculator !");
	}

	@Override
	public double sum(double a, double b) {

		System.out.println("Greater Number :" + greaterThan(a, b) + "\n");
		System.out.println("Lesser Number :" + lesserThan(a, b) + "\n");
		return a + b;

	}

	@Override
	public double difference(double a, double b) {

		System.out.println("Greater Number :" + greaterThan(a, b) + "\n");
		System.out.println("Lesser Number :" + lesserThan(a, b) + "\n");
		return a - b;
	}

	@Override
	public double multiplication(double a, double b) {

		System.out.println("Greater Number :" + greaterThan(a, b) + "\n");
		System.out.println("Lesser Number :" + lesserThan(a, b) + "\n");
		return a * b;

	}

	@Override
	public double divide(double a, double b) {

		System.out.println("Greater Number :" + greaterThan(a, b) + "\n");
		System.out.println("Lesser Number :" + lesserThan(a, b) + "\n");
		return a / b;

	}

	@Override
	public double modulus(double a, double b) {

		System.out.println("Greater Number :" + greaterThan(a, b) + "\n");
		System.out.println("Lesser Number :" + lesserThan(a, b) + "\n");
		return a % b;

	}

	@Override
	public double percentage(double a, double b) {

		return a * b / 100;

	}

	@Override
	public double greaterThan(double a, double b) {

		if (a > b) {
			return a;
		}

		return b;

	}

	@Override
	public double lesserThan(double a, double b) {

		if (a < b) {
			return a;
		}

		return b;

	}

	@Override
	public void equalTo(double a, double b) {

		if (a == b) {
			System.out.println(a + " is equal to " + b);
		}

		System.out.println(a + " is not equal to " + b);

	}

	@Override
	public double incrementOf(double a) {

		return a++;

	}

	@Override
	public double decrementOf(double a) {

		return a--;

	}

	@Override
	public String compareWith(double a, double b) {

		return (a >= b) ? a + " is greater than or equal to " + b : a + " is Lesser than or equal to " + b;

	}

	@Override
	public void evenOdd(double a, double b) {

		if ((a % 2 == 0) && (b % 2 == 0)) {

			System.out.println(a + " and " + b + " are Even numbers.");

		} else if (a % 3 == 0 && b % 2 == 0) {

			System.out.println(a + " is a Odd number.");

			System.out.println(b + " is a Even number.");

		} else if (a % 2 == 0 && b % 3 == 0) {

			System.out.println(a + " is a Even number.");

			System.out.println(b + " is a odd number.");
		}
		else {
			System.out.println(a + " and " + b + " are Odd numbers.");
		}
	}

	@Override
	public void instanceOf(Calculate cal) {

		System.out.println(cal instanceof Calculate);

	}

}
