package org.example.behavioral_design_patterns.visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Manager extends AbstractEmployee {
	
	private List<Employee> directReports = new ArrayList<>();

	public Manager(final String name,final Employee...employees) {
		super(name);
		Arrays.stream(employees).forEach(directReports::add);
	}
	
	@Override
	public Collection<Employee> getDirectReports() {
		return directReports;
	}

	@Override
	public void accept(final Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String toString() {
		return "Manager{" +
				"directReports=" + directReports +
				'}';
	}
}
