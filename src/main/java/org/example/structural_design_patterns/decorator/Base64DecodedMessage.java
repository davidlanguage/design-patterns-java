package org.example.structural_design_patterns.decorator;

import java.util.Base64;

public class Base64DecodedMessage implements Message {

	private Message msg;

	public Base64DecodedMessage(final Message msg) {
		this.msg = msg;
	}

	@Override
	public String getContent() {
		// Retrieve the content from the wrapped message
		final String encodedContent = msg.getContent();

		// Decode the Base64 encoded content
		byte[] decodedBytes = Base64.getDecoder().decode(encodedContent);

		// Convert the decoded bytes back to a string (assuming UTF-8 encoding)
		return new String(decodedBytes);
	}
	
	
}
