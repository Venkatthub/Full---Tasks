

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferRead {

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		try {

			String s = bf.readLine();
			System.out.println(s);

		} finally {

			System.out.println("Bye !");
		}

	}

}
