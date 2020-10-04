package arrays;

public class CurrencyTeller {

	static int number = 1000000;

	public static void main(String[] args) {

		System.out.print("Curreny you have :");
		printCurrency(number / 10000000, hundreds()[4]);
		printCurrency((number / 100000) % 100, hundreds()[3]);
		printCurrency((number / 1000) % 100, hundreds()[2]);
		printCurrency((number / 100) % 10, hundreds()[1]);
		printCurrency(number % 100, hundreds()[0]);

	}

	static void printCurrency(int n, String s) {

		String ones[] = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"tweleve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		
		if (n > 19) {
		
			System.out.print(tens()[n / 10] + "  " + ones[n % 10]);
	
		} else {
		
			System.out.print(ones[n]);
		
		}
		if (n != 0)
		
			System.out.print(" " + s + " ");

	}

	public static String[] hundreds() {
		
		return new String[] { "", "Hundred", "Thousand", "Lakh", "Million" };
	
	}

	public static String[] tens() {
	
		return new String[] { "", "Ten", "Twenty", "Thiry", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

	}

}
