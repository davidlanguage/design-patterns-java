package org.example.behavioral_design_patterns.chain_of_reponsibility;

//A concrete handler
public class ProjectLead extends Employee{

    public ProjectLead(final LeaveApprover successor) {
        super(Role.PROJECT_LEAD.getRoleName(), successor);
    }

    @Override
    protected boolean processRequest(final LeaveApplication application) {
        //type is sick leave & duration is less than or equal to 2 days
        //project lead can grant the leave

        if (application.getType() == Type.Sick){
            if (application.getNoOfDays() <= 2){
                application.approve(getApproverRole());
                return true;
            }
        }

        return false;
    }
}
