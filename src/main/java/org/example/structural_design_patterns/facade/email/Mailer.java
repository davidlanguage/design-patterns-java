package org.example.structural_design_patterns.facade.email;

public class Mailer {

	private static final Mailer MAILER = new Mailer();
	
	public static Mailer getMailer() {
		return MAILER;
	}
	
	private Mailer() {
		
	}
	
	public boolean send(Email email) {
		return true;
	}; 
	
}
