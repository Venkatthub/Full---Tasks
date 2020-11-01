package library_management.imple;

public class NotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotFoundException(String str) {
		super(str);
	}

	@Override
	public String toString() {
		return "Entered Book or BuyerName dosen't exist in out system";
	}
}

@SuppressWarnings("serial")
class BookNotFound extends NotFoundException {

	public BookNotFound(String str) {

		super(str);

	}

}