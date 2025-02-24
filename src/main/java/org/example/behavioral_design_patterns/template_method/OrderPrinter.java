package org.example.behavioral_design_patterns.template_method;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

//Abstract base class defines the template method
public abstract class OrderPrinter {

    //We want to modify the steps in the child classes, but not the printOrder method.
    public final void printOder(final Order order, final String filename) throws FileNotFoundException {

        try (final PrintWriter writer = new PrintWriter(filename)){

            writer.println(start());

            writer.println(formatOrderNumber(order));

            writer.println(formatItems(order));

            writer.println(formatTotal(order));

            writer.println(end());
        }
    }

    protected abstract String start();

    protected abstract String formatOrderNumber(final Order order);

    protected abstract String formatItems(final Order order);

    protected abstract String formatTotal(final Order oder);

    protected abstract String end();

}
