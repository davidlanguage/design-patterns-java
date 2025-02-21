package org.example.behavioral_design_patterns.state;

public class Client {

    public static void main(String[] args) {
        final Order order = new Order();
        order.paymentSuccessful();
        order.dispatched();
        order.delivered();
        order.cancel();
    }
}
