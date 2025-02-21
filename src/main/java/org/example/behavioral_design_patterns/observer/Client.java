package org.example.behavioral_design_patterns.observer;

public class Client {
    
    public static void main(String[] args) {
        final Order order = new Order("100");
        final PriceObserver priceObserver = new PriceObserver();
        order.attach(priceObserver);

        order.addItem(50);
        System.out.println(order);

        order.addItem(200);
        System.out.println(order);
    }
}
