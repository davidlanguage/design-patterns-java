package org.example.behavioral_design_patterns.chain_of_reponsibility;
//A concrete handler

public class Manager extends Employee {

	public Manager(final LeaveApprover nextApprover) {
		super(Role.MANAGER.getRoleName(), nextApprover);
	}

	@Override
	protected boolean processRequest(final LeaveApplication application) {
		switch (application.getType()) {
		case Sick:
			application.approve(getApproverRole());
			return true;
		case PTO:
			if(application.getNoOfDays() <= 5) {
				application.approve(getApproverRole());
				return true;
			}
		}
		return false;
	}

}