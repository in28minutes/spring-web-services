package com.in28minutes.rest.webservices.restfulwebservices.versioning;

/**
 * Minimalistic way of defining a normal class with Java Records:
 * For more details <a href="https://docs.oracle.com/en/java/javase/17/language/records.html">Records</a>
 */
public record PersonV2(Name name) {


	@Override
	public String toString() {
		return "PersonV2 [name=" + name + "]";
	}

}

// Traditional Verbose Class Declaration
//public class PersonV2 {
//	private final Name name;
//
//	public PersonV2(Name name) {
//		super();
//		this.name = name;
//	}
//
//	public Name getName() {
//		return name;
//	}
//
//	@Override
//	public String toString() {
//		return "PersonV2 [name=" + name + "]";
//	}
//
//}