package oops.encapsulation;

//Student POJO

public class StuDetails {

	private String name;
	private int idNum;
	private int age;

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public int getIdNum() {
		return idNum;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setIdNum(int i) {
		idNum = i;
	}
}
