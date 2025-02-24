package org.example.behavioral_design_patterns.visitor;

public class PrintVisitor implements Visitor{

    @Override
    public void visit(final Programmer programmer) {
        final String msg = programmer.getName() + " is a " + programmer.getSkill() + " programmer.";
        System.out.println(msg);
    }

    @Override
    public void visit(final ProjectLead projectLead) {
        final String msg = projectLead.getName() + " is a Project Lead with " + projectLead.getDirectReports().size() + " programmers reporting.";
        System.out.println(msg);
    }

    @Override
    public void visit(final Manager manager) {
        final String msg = manager.getName() + " is a Manager with " + manager.getDirectReports().size() + " leads reporting.";
        System.out.println(msg);
    }

    @Override
    public void visit(final VicePresident vicePresident) {
        final String msg = vicePresident.getName() + " is a Vicepresident with "+ vicePresident.getDirectReports().size() +" managers reporting";
        System.out.println(msg);
    }
}
