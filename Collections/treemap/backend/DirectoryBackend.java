package treemap.backend;

public class DirectoryBackend {

//	class to find and display details
	public static void findInDirectory(String userInput) {

		CityCodes codes = new CityCodes();

		for (String areaname : codes.chennaiCodes().keySet()) {

			if (areaname.contains(userInput)) {

				userInput = areaname;
				break;
			}
		}

		if (codes.chennaiCodes().containsKey(userInput)) {

			int code = codes.chennaiCodes().get(userInput);

			System.out.println("\n" + codes + (codes.code + code) + "\n" + "Area :" + userInput.toUpperCase());

		} else {

			int value = Integer.parseInt(userInput);

			if (codes.chennaiCodes().containsValue(value)) {

				System.out.println("\n" + codes + (codes.code + value) + "\n" + "Area :");

				codes.chennaiCodes().keySet().stream().forEach(x -> {
					if (codes.chennaiCodes().get(x) == value)
						System.out.println(x.toUpperCase());
				});

			} else {

				throw new NotFound("\nEntered code or area name is incorrect ! \nPlease try again ");

			}
		}

	}

}
