package org.campus02.emp;

import java.util.ArrayList;

public class EmployeeManager {
	private ArrayList<Employee> employees = new ArrayList<>();
	
	public void addEmployee(Employee emp) {
		employees.add(emp);
	}
	
	public Employee findByEmpNumber(int number) {
		for (Employee employee : employees) {
			if (employee.getEmpNumber() == number) {
				return employee;
			}
		}
		return null;
	}
	
	public Employee find(Employee e) {
		int index = employees.indexOf(e);
		if (index == -1){
			return null;
		}
		return employees.get(index);
	}
	
	public Employee  findByMaxSalary() {
		double MaxSalery = 0.0;
		for (Employee employee : employees) {
			if (employee.getSalary() > MaxSalery) {
				MaxSalery = employee.getSalary();
			}
		}
		
		for (Employee employee : employees) {
			if (employee.getSalary() == MaxSalery) {
				return employee;
			}
		}
		return null;
	}
	
	public ArrayList<Employee>  findByDepartment(String  department){
		
		ArrayList<Employee> Helper = new ArrayList<Employee>();
		
		for (Employee employee : employees) {
			if (employee.getDepartment().equals(department)) {
				Helper.add(employee);
			}
		}
		
		return Helper;
	}
	
}
