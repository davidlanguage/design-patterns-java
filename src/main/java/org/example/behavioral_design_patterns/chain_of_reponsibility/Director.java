package org.example.behavioral_design_patterns.chain_of_reponsibility;


//A concrete handler
public class Director extends Employee {

	public Director(final LeaveApprover nextApprover) {
		super(Role.DIRECTOR.getRoleName(), nextApprover);
	}
	
	@Override
	protected boolean processRequest(LeaveApplication application) {
		if(application.getType() == Type.LOP) {
			application.approve(getApproverRole());
			return true;
		}
		return false;
	}
	
}
