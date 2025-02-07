package org.example.solid.dependency_inversion;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {

	//Writes message to a file
	public void writeMessage(final Message msg, final Formatter formatter,
							 final PrintWriter printWriter) throws IOException {

		printWriter.println(formatter.format(msg)); //formats and writes message
		printWriter.flush();

	}
}
