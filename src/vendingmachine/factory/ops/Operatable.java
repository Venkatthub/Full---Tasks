package vendingmachine.factory.ops;

public interface Operatable {

	void collectCoins(double d);

	void disburseItem();

	void printBill();
}
