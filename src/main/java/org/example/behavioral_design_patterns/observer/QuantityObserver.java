package org.example.behavioral_design_patterns.observer;

public class QuantityObserver implements OrderObserver {

    @Override
    public void updated(final Order order) {
        final int count = order.getCount();
        if(count <= 5) {
            order.setShippingCost(10);
        } else {
            order.setShippingCost(10 + (count - 5) * 1.5);
        }
    }


}
