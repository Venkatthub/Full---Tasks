package serialization;

import java.io.Serializable;

@SuppressWarnings("serial")
public class EmployeePOJO implements Serializable{
    
    private String employeeName;
    private int empolyeeIid;
    private double employeeSalary;

	@Override
	public String toString() {

		return "Employee name :"+this.employeeName+" Employee Id : "+ this.empolyeeIid+" Employee Salary : "+this.employeeSalary;

	}

	public void setName(String name) {
		this.employeeName = name;
	}

	public void setId(int id) {
		this.empolyeeIid = id;
	}

	public void setSal(double sal) {
		this.employeeSalary = sal;
	}

	public String getName() {
		return employeeName;
	}

	public int getId() {
		return empolyeeIid;
	}

	public double getSalary() {
		return employeeSalary;
	}

}
