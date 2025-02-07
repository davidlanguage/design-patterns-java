package org.example.solid.dependency_inversion;

//Common interface for classes formatting Message object
public interface Formatter {
	
	public String format(final Message message) throws FormatException;
	
}
