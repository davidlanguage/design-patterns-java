package org.example.behavioral_design_patterns.interpreter;

public class Report {

	private String name;
	//"NOT ADMIN", "FINANCE_USER AND ADMIN"
	private String permission;
	
	public Report(final String name, final String permissions) {
		this.name = name;
		this.permission = permissions;
	}

	public String getName() {
		return name;
	}

	public String getPermission() {
		return permission;
	}
	
	
}
