package org.subha.dto;

public class Employee implements Comparable{
	private int emp_id;
	private String empName;
	public int getEmp_id() {
		return emp_id;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", empName=" + empName + "]";
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public Employee(int emp_id, String empName) {
		this.emp_id = emp_id;
		this.empName = empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public int compareTo(Object o) {
		Integer empId= this.emp_id;
		Employee e= (Employee) o;
		Integer e_id= e.emp_id;
		return empId.compareTo(e_id);	}
}
