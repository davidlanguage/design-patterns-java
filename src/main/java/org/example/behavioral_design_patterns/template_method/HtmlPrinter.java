package org.example.behavioral_design_patterns.template_method;

import java.util.Map;

//Concrete implementation. Implements steps needed..
//..by template method
public class HtmlPrinter extends OrderPrinter {

	@Override
	protected String start() {
		return "<html><head><title>Order Details</title></head><body>";
	}

	@Override
	protected String formatOrderNumber(final Order order) {
		return "<h1>Order #"+order.getId()+"</h1>";
	}

	@Override
	protected String formatItems(final Order order) {

		final StringBuilder builder = new StringBuilder("<p><ul>");
		for(final Map.Entry<String, Double> e : order.getItems().entrySet()) {
			builder.append("<li>"+e.getKey()+" $"+e.getValue()+"</li>");
		}
		builder.append("</ul></p>");
		return builder.toString();
	}

	@Override
	protected String formatTotal(final Order order) {
		return "<br/><hr/><h3>Total : $"+order.getTotal()+"</h3>";
	}

	@Override
	protected String end() {
		return "</body></html>";
	}

}
