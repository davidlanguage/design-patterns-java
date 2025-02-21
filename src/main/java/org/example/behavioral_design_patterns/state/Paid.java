package org.example.behavioral_design_patterns.state;

public class Paid implements OrderState {

    @Override
    public double handleCancellation() {
        //Code that handles cancellation for Paid Orders
        System.out.println("Contacting payment gateway to rollback transaction");
        //cancellation fee
        return 10;
    }
}
