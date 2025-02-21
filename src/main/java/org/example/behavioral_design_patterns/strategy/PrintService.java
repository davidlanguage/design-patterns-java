package org.example.behavioral_design_patterns.strategy;


import java.util.LinkedList;

//Context 
public class PrintService {

    private OrderPrinter printer;

    //User to decide which type of order they want (SummaryPrinter or DetailPrinter)
    public PrintService(final OrderPrinter printer) {
        this.printer = printer;
    }

    public void printOrders(final LinkedList<Order> orders) {
        printer.print(orders);
    }
}
