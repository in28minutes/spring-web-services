package com.in28minutes.rest.webservices.restfulwebservices.exception;

import java.time.LocalDateTime;


/**
 * Minimalistic way of defining a normal class with Java Records:
 * For more details <a href="https://docs.oracle.com/en/java/javase/17/language/records.html">Records</a>
 * @param timestamp
 * @param message
 * @param details
 */
public record ErrorDetails(LocalDateTime timestamp, String message, String details) { }


// Traditional Class Declaration
// public class ErrorDetails {
//
//	private final LocalDateTime timestamp;
//	private final String message;
//	private final String details;
//
//	public ErrorDetails(LocalDateTime timestamp, String message, String details) {
//		super();
//		this.timestamp = timestamp;
//		this.message = message;
//		this.details = details;
//	}
//
//	public LocalDateTime getTimestamp() {
//		return timestamp;
//	}
//
//	public String getMessage() {
//		return message;
//	}
//
//	public String getDetails() {
//		return details;
//	}
//}