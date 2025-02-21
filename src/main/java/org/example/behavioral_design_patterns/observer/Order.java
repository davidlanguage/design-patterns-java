package org.example.behavioral_design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

//A concrete subject
//This is observer aka observable
public class Order {

    private String id;

    private double shippingCost;
    //cost of items
    private double itemCost;

    //This is to store the discount applied on updated() method of PriceObserver
    //We create getters and setters to
    private double discount;
    //no of items
    private int count;

    final private List<OrderObserver> observers = new ArrayList<>();

    public void attach(OrderObserver orderObserver){
        observers.add(orderObserver);
    }

    public void dettach(OrderObserver orderObserver){
        observers.remove(orderObserver);
    }

    public Order(final String id) {
        this.id = id;
    }

    public double getTotal() {
        return itemCost - discount + shippingCost;
    }

    public void addItem(final double price) {
        itemCost += price;
        count ++;
        //we pass our Order objet to each observer
        //this sends notifications to all observers
        observers.forEach(observer -> observer.updated(this));
    }

    public int getCount() {
        return count;
    }

    public void setShippingCost(final double cost) {
        this.shippingCost = cost;
    }

    public void setDiscount(final double discount) {
        this.discount = discount;
    }

    public double getItemCost() {
        return itemCost;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        // we delete the observers from the toString() method
        //we add the getTotal() value to the toString()
        return "Order#"+id+"\nItem cost:"+itemCost+"\nNo. of items:"+count
                +"\nShipping cost:"+shippingCost+"\nDiscount:"+discount
                +"\nTotal:"+getTotal();
    }
}
