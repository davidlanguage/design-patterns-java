package org.example.solid.interface_segregation.service;

import org.example.solid.interface_segregation.entity.Order;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderPersistenceService implements PersistenceService<Order>{

    private static final Map<Long, Order> ORDERS = new HashMap<>();

    @Override
    public void save(final Order order) {
        synchronized (ORDERS){
            ORDERS.put(order.getId(), order);
        }
    }

    @Override
    public void delete(final Order order) {
        synchronized (ORDERS){
            ORDERS.remove(order.getId(), order);
        }
    }

    @Override
    public Order findById(final Long orderId) {
        synchronized (ORDERS){
            return ORDERS.get(orderId);
        }
    }

//    This is a negative consequence of violating the interface segregation principle
//    @Override
//    public List<Order> findByName(final String orderName) {
//        throw new UnsupportedOperationException("Find by name is not supported");
//    }
}
