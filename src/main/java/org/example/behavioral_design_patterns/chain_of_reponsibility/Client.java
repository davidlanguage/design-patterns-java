package org.example.behavioral_design_patterns.chain_of_reponsibility;

import java.time.LocalDate;

public class Client {

	public static void main(String[] args) {
	   final LeaveApplication leaveApplication = LeaveApplication.getBuilder()
			   .withType(Type.LOP)
			   .from(LocalDate.now())
			   .to(LocalDate.now().plusDays(2))
			   .build();

	   System.out.println(leaveApplication);

	   System.out.println("*************************************************");

	   final LeaveApprover approver = createChain();

	   approver.processLeaveApplication(leaveApplication);

		System.out.println(leaveApplication);

	}

	//create a chain of leave approvers
	private static LeaveApprover createChain(){
		final Director director = new Director(null); //null param, because there is not successor.
		final Manager manager = new Manager(director); //If a manager cannot approve the leave, then the director will
		final ProjectLead projectLead = new ProjectLead(manager); // If the project lead cannot approve the leave, then the manager will
		return projectLead; // we return the first item in the chain
	}

	
}
