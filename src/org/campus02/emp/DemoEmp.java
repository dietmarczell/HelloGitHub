package org.campus02.emp;

public class DemoEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeManager EmpMang = new EmployeeManager();
		
		Employee Maier = new Employee(1, "Maier", 1250.0, "Verkauf");
		EmpMang.addEmployee(Maier);
		
		System.out.println(EmpMang.findByDepartment("Verkauf"));
		System.out.println(EmpMang.findByEmpNumber(1));
		System.out.println(EmpMang.findByMaxSalary());
	}

}
