package operators.operations;

public interface Calculatable {
	
	double sum(double a,double b);

	double difference(double a,double b);

	double multiplication(double a,double b);

	double divide(double a,double b);

	double modulus(double a,double b);

	double percentage(double a,double b);

	double greaterThan(double a,double b);

	double lesserThan(double a,double b);

	void equalTo(double a,double b);

	double incrementOf(double a);

	double decrementOf(double a);

	String compareWith(double a,double b);

	void evenOdd(double a,double b);

	void instanceOf(Calculate cal);

}
