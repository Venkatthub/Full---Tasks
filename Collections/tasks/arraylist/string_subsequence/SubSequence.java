package tasks.arraylist.string_subsequence;

import java.util.ArrayList;
import java.util.List;

// class to get subsequences of each vegetables

public class SubSequence {

//	To print all subsequence of each vegetables
	public void printArrayList(List<String> list) {
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
	}

	public ArrayList<String> getSequence(String str) {

		if (str.length() == 0) {

			ArrayList<String> empty = new ArrayList<>();
			empty.add("");
			return empty;
		}

		char ch = str.charAt(0);

		String subStr = str.substring(1);

//		Recursion
		ArrayList<String> subSequences = getSequence(subStr);

		ArrayList<String> res = new ArrayList<>();
		for (String val : subSequences) {
			res.add(val);
			res.add(ch + val);
		}

		return res;
	}

}
