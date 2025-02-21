package org.example.behavioral_design_patterns.state;

public class New implements OrderState{

    @Override
    public double handleCancellation() {
        //Code that handles cancellation for New Orders
        System.out.println("It's a New Order. Pro processing done.");
        //No Charge for new order
        return 0;
    }
}
