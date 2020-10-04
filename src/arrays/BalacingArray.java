package arrays;

import accessmodifiers.check.Night;

public class BalacingArray {

	/*
	 * Test Conditions canBalance([1, 1, 1, 2, 1]) ->true canBalance([2, 1, 1, 2,
	 * 1]) -> false canBalance([10, 10]) -> true
	 */

	private static boolean result;

	public static void main(String[] args) {

		int[] array = { 2, 5, 1, 7, 1 };

		System.out.println(canBalance(array));

	}

	static boolean canBalance(int[] array) {

		int mid;

		if (array.length % 2 == 0) {

			mid = (array.length / 2) - 1;

		} else {
			mid = array.length / 2;
		}

		int total1 = 0;
		int total2 = 0;

		for (int i = 0; i <= mid; i++) {
			total1 += array[i];

		}

		for (int j = array.length - 1; j > mid; j--) {

			total2 += array[j];

		}

		if (total1 == total2) {
			result = true;
		}

		return result;
	}

}
