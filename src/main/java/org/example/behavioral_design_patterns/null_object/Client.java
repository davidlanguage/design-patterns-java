package org.example.behavioral_design_patterns.null_object;

public class Client {

	public static void main(String[] args) {
		final ComplexService service = new ComplexService("Simple report",new NullStorageService());
		service.generateReport();
		
	}

}
