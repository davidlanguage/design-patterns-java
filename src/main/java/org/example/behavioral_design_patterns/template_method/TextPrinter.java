package org.example.behavioral_design_patterns.template_method;

import java.util.Map;

//Concrete implementation. Implements the steps needed by template method
public class TextPrinter extends OrderPrinter {

    @Override
    protected String start() {
        return "Order Details";
    }

    @Override
    protected String formatOrderNumber(final Order order) {
        return "Order #"+order.getId();
    }

    @Override
    protected String formatItems(final Order order) {

        final String header = "Items\n----------------------------------\n";

        final StringBuilder builder = new StringBuilder(header);

        for (final Map.Entry<String, Double> entry : order.getItems().entrySet()){

            builder.append(entry.getKey() + " $"+entry.getValue() + "\n");

        }

        final String closure = "----------------------------------";

        builder.append(closure);

        return builder.toString();
    }

    @Override
    protected String formatTotal(final Order oder) {
        return "Total: $"+oder.getTotal();
    }

    @Override
    protected String end() {
        return "";
    }
}
