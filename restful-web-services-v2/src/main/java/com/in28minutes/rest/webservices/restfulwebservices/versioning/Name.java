package com.in28minutes.rest.webservices.restfulwebservices.versioning;

/**
 * Minimalistic way of defining a normal class with Java Records:
 * For more details <a href="https://docs.oracle.com/en/java/javase/17/language/records.html">Records</a>
 */
public record Name(String firstName, String lastName) {

	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}

// Traditional Verbose Class Declaration
//public class Name {
//	private final String firstName;
//	private final String lastName;
//
//	public Name(String firstName, String lastName) {
//		super();
//		this.firstName = firstName;
//		this.lastName = lastName;
//	}
//
//	public String getFirstName() {
//		return firstName;
//	}
//
//	public String getLastName() {
//		return lastName;
//	}
//
//	@Override
//	public String toString() {
//		return "Name [firstName=" + firstName + ", lastName=" + lastName + "]";
//	}
//
//}
