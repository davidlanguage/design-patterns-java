package org.example.creational_design_patterns.factory_method;

import org.example.creational_design_patterns.factory_method.message.Message;

public class Client {

	public static void main(String[] args) {

		printMessage(new JSONMessageCreator());

		printMessage(new TextMessageCreator());
	}
	
	public static void printMessage(final MessageCreator creator) {
		final Message msg = creator.getMessage();
		System.out.println(msg.getContent());
	}
}
