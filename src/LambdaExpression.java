
// Lambdas take in parameter and gives us back the result
// Lambdas were mainly used in functional interface

public class LambdaExpression {

	static int a = 10, b = 20;

	public static void main(String[] args) {

		Mathoperation square = (a, b) -> {
			return (a * a) + (b * b);
		};

		System.out.println("Square of the addition of given two numbers :" + square);

		Mathoperation addition = (a, b) -> a + b;

		System.out.println("Addition of given two numbers :" + addition);

		Mathoperation subraction = (a, b) -> a - b;

		System.out.println("Difference of given two numbers :" + subraction);

		Mathoperation div = (a, b) -> a / b;

		System.out.println("Square of given two numbers :" + div);

	}

}

// Function Interface - A interface having only one abstract method
interface Mathoperation {

	int operate(int a, int b);
}