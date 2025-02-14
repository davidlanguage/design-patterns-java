package org.example.structural_design_patterns.decorator;

public class Client {

	public static void main(String[] args) {
		//Regular String Message
		final Message m = new TextMessage("The <FORCE> is strong with this one!");
		System.out.println(m.getContent());

		//HTML Encoder
		final Message decorator = new HtmlEncodedMessage(m);
		System.out.println(decorator.getContent());

		//Base64 Encoder
		final Message encoder64 = new Base64EncodedMessage(m);
		System.out.println("Base64 Encoded Message: " +  encoder64.getContent());

		//Base64 Decoder: We use the previously Base64 encoded message
		final Message base64Decoder = new Base64DecodedMessage(encoder64);
		System.out.println("Base64 Decoded Message: " + base64Decoder.getContent());
	}
}
