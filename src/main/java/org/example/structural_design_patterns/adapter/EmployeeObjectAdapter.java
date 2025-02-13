package org.example.structural_design_patterns.adapter;

/**
 * An object adapter. Using composition to translate interface
 */
//We only implement Customer. We do not extend Employee
public class EmployeeObjectAdapter implements Customer{

    //Adaptee object
    private Employee adaptee;

    public EmployeeObjectAdapter(final Employee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public String getName() {
        return adaptee.getFullName();
    }

    @Override
    public String getDesignation() {
        return adaptee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return adaptee.getOfficeLocation();
    }
}
