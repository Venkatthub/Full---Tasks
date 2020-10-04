package treemap;

import java.util.*;

import treemap.backend.DirectoryBackend;

/*
 * Chennai Pincode Directory
 * Find any Pincode and Areas in chennai
 * Runner class to get input from the user to find the Pin code or area
 */

public class ChennaiPincodeDirectory {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println(" Welcome to Chennai City Pincode Directory !" + "\n\n"
				+ "Enter the area code or area name to begin search" + "\n");

		String userInput = scan.next().strip();

		DirectoryBackend.findInDirectory(userInput);

		scan.close();

	}

}
