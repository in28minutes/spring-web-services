package com.in28minutes.rest.webservices.restfulwebservices.versioning;

/**
 * Minimalistic way of defining a normal class with Java Records:
 * For more details <a href="https://docs.oracle.com/en/java/javase/17/language/records.html">Records</a>
 */
public record PersonV1(String name) {

	@Override
	public String toString() {
		return "PersonV1 [name=" + name + "]";
	}

}

// Traditional Verbose Class Declaration
//public class PersonV1 {
//	private final String name;
//
//	public PersonV1(String name) {
//		super();
//		this.name = name;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	@Override
//	public String toString() {
//		return "PersonV1 [name=" + name + "]";
//	}
//
//}