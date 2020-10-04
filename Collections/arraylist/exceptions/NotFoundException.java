package arraylist.exceptions;

public class NotFoundException extends RuntimeException {

	public NotFoundException(String str) {
		super(str);
	}

	@Override
	public String toString() {
		return "Entered Book or BuyerName dosen't exist in out system";
	}
}


