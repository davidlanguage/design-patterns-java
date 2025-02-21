package org.example.behavioral_design_patterns.strategy;

import java.util.Collection;

//Strategy
public interface OrderPrinter {

    void print(final Collection<Order> orders);
}
