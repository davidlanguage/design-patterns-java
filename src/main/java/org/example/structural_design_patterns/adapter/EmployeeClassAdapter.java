package org.example.structural_design_patterns.adapter;

/**
 * A class adapter, works as Two-way adapter
 * Employee && Customer
 * Employee POJO with the necessary fields, and Customer methods to adapt the expected response and behavior of Employee
 * Employee remains a POJO; EmployeeClassAdapter adapts the basic behavior of Employee without having to extend
 * the functionality of a regular POJO (open close)
 */
public class EmployeeClassAdapter extends Employee implements Customer {

    @Override
    public String getName() {
        //since we extend Employee, we can use Employee's getFullName() method by using the 'this' keyword.
        return this.getFullName();
    }

    @Override
    public String getDesignation() {
        return this.getJobTitle();
    }

    @Override
    public String getAddress() {
        return this.getOfficeLocation();
    }
}
