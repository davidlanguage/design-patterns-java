package org.example.behavioral_design_patterns.null_object;

import java.io.IOException;
import java.io.PrintWriter;

public class StorageService {

	public void save(final Report report) {
		System.out.println("Writing report out");
		try(final PrintWriter writer = new PrintWriter(report.getName()+".txt")) {
			
			writer.println(report.getName());
			
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}
}
