package org.example.behavioral_design_patterns.visitor;

public class Client {

	public static void main(String[] args) {

		final Employee emps = buildOrganization();

		final Visitor visitor = new PrintVisitor();

		visitOrgStructure(emps, visitor);
		
	}

	private static Employee buildOrganization() {
		
		final Programmer p1 = new Programmer("Rachel","C++");
		final Programmer p2 = new Programmer("Andy","Java");
		
		final Programmer p3 = new Programmer("Josh","C#");
		final Programmer p4 = new Programmer("Bill","C++");
		
		final ProjectLead pl1 = new ProjectLead("Tina", p1, p2);
		final ProjectLead pl2 = new ProjectLead("Joey", p3, p4);
		
		final Manager m1 = new Manager("Chad", pl1);
		final Manager m2 = new Manager("Chad II", pl2);
		
		final VicePresident vp = new VicePresident("Richard", m1,m2);
		
		return vp;
	}

	private static void visitOrgStructure(final Employee employee, final Visitor visitor){
		employee.accept(visitor);
		employee.getDirectReports()
				.forEach(emp -> visitOrgStructure(emp, visitor));
	}

}
