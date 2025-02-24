package org.example.behavioral_design_patterns.null_object;

public class ComplexService {

	private StorageService storage;
	
	private String reportName;
	
	public ComplexService(final StorageService storage) {
		this.storage = storage;
		reportName = "A Complex Report";
	}
	
	public ComplexService(final String reportName, final StorageService storage) {
		this.storage = storage;
		this.reportName = reportName;
	}
	
	public void generateReport() {
		System.out.println("Starting a complex report build!");
		
		try {
			Thread.sleep(3000);
		} catch (final InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Done with report..");
		storage.save(new Report(reportName));
	}
}
