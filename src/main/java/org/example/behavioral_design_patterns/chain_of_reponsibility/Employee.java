package org.example.behavioral_design_patterns.chain_of_reponsibility;

//Abstract handler
public abstract class Employee implements LeaveApprover {

    private final String role;

    private LeaveApprover successor;

    public Employee(String role, LeaveApprover successor){
        this.role = role;
        this.successor = successor;
    }

    @Override
    public void processLeaveApplication(LeaveApplication leaveApplication) {
        if (!processRequest(leaveApplication) && successor != null){
            successor.processLeaveApplication(leaveApplication);
        }
    }

    protected abstract boolean processRequest(LeaveApplication application);

    @Override
    public String getApproverRole() {
        return role;
    }
}