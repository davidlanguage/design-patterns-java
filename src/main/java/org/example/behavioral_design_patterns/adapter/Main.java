package org.example.behavioral_design_patterns.adapter;

public class Main {

	public static void main(String[] args) {
		/** Using Class/Two-way adapter **/ 
		EmployeeClassAdapter employeeClassAdapter = new EmployeeClassAdapter();

		//This is a two way adapter
		//adaptee is expected, and we are passing the adapter
		populateEmployeeData(employeeClassAdapter);

		BusinessCardDesigner designer = new BusinessCardDesigner();

		String card = designer.designCard(employeeClassAdapter);

		System.out.println(card);

		/** Using Object Adapter **/
		
	}

	private static void populateEmployeeData(Employee employee) {
		employee.setFullName("Elliot Alderson");
		employee.setJobTitle("Security Engineer");
		employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
	}
}
