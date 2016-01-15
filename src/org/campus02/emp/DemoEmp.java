package org.campus02.emp;

public class DemoEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeManager EmpMang = new EmployeeManager();
		
		Employee Maier2 = new Employee(2, "Maier", 1250.0, "Verkauf");
		EmpMang.addEmployee(Maier2);
		
		System.out.println(EmpMang.findByDepartment("Verkauf"));
		System.out.println(EmpMang.findByEmpNumber(1));
		System.out.println(EmpMang.findByMaxSalary());
		System.out.println(EmpMang.equals(Maier2.getEmpNumber()));
	}

}
