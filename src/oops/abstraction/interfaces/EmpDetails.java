package oops.abstraction.interfaces;

public class EmpDetails {

	private String name;
	private int id;
	private String gender;
	private long phNo;

	public void setName(String eName) {
		name = eName;
	}

	public void setId(int eId) {
		id = eId;
	}

	public void setGender(String eGender) {
		gender = eGender;
	}

	public void setPhone(long ePhoneNumber) {
		phNo = ePhoneNumber;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getGender() {
		return gender;
	}

	public long getNumber() {
		return phNo;
	}
}
