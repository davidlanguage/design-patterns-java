package org.example.behavioral_design_patterns.state;

public class Cancelled implements OrderState{

    @Override
    public double handleCancellation() {
        //What happens is someone cancels an already cancelled order?
        throw new IllegalStateException("Cancellation cannot be called in a an already cancelled order.");
    }
}
