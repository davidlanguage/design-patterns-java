package org.example.solid.dependency_inversion;

import java.io.IOException;

//Thrown by formatter
public class FormatException extends IOException {
	
	public FormatException(final Exception cause) {
		super(cause);
	}
}
