package org.example.behavioral_design_patterns.template_method;

import java.io.FileNotFoundException;

public class Client {

	public static void main(String[] args) throws FileNotFoundException {

		final Order order = new Order("1001");

		order.addItem("Soda", 2.50);

		order.addItem("Sandwich", 11.95);

		order.addItem("Pizza",15.95);

		final OrderPrinter printer = new HtmlPrinter();

		printer.printOder(order, "1001.html");

	}
}
