package org.example.behavioral_design_patterns.adapter;

/**
 * Client code which requires Customer interface.
 */
public class BusinessCardDesigner {

	public String designCard(final Customer customer) {
		String card = "";
		card += customer.getName();
		card += "\n" + customer.getDesignation();
		card += "\n" + customer.getAddress();
		return card;
	}
}
