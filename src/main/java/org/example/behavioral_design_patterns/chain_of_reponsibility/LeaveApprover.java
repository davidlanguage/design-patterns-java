package org.example.behavioral_design_patterns.chain_of_reponsibility;

//This represents a handler in chain of responsibility
public interface LeaveApprover {

    void processLeaveApplication(LeaveApplication leaveApplication);

    String getApproverRole();

}
