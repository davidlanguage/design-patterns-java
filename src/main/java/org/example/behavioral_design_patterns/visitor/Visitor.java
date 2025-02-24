package org.example.behavioral_design_patterns.visitor;

//We use method overloading for each of the child classes of AbstractEmployee
public interface Visitor {

    void visit(final Programmer programmer);

    void visit(final ProjectLead projectLead);

    void visit(final Manager manager);

    void visit(final VicePresident vicePresident);

}
