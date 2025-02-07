package org.example.solid.dependency_inversion;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Message {

	private String msg;

	private String timestamp;
	
	public Message(String msg) {
		this.msg = msg;
		this.timestamp = ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("Europe/Madrid"))
				.format(DateTimeFormatter.ISO_ZONED_DATE_TIME);
	}

	public String getMsg() {
		return msg;
	}

	public String getTimestamp() {
		return timestamp;
	}
}
