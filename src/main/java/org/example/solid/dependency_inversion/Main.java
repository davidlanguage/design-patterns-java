package org.example.solid.dependency_inversion;

import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("TEST");
		final Message msg = new Message("This is a message again 2");
		final MessagePrinter printer = new MessagePrinter();
		try(final PrintWriter writer = new PrintWriter("test_msg.txt")){
			printer.writeMessage(msg,new JSONFormatter(), writer);
		}


	}

}
