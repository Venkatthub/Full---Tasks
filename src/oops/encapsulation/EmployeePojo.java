package oops.encapsulation;

//Employee POJO

public class EmployeePojo {
	private String empName;
	private int empId;
	private double salary;

	@Override
	public String toString() {
		return "EmployeePojo [empName=" + empName + ", empId=" + empId + ", salary=" + salary + "]";
	}

	public void setName(String name) {
		this.empName = name;
	}

	public void setId(int id) {
		this.empId = id;
	}

	public void setSal(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return empName;
	}

	public int getId() {
		return empId;
	}

	public double getSalary() {
		return salary;
	}

}
