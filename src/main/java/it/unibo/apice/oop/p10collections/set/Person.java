package it.unibo.apice.oop.p10collections.set;

import java.util.Objects;

public class Person {

	final private String name;
	final private int year;
	final private boolean married;

	public Person(String name, int year, boolean married) {
		this.name = name;
		this.year = year;
		this.married = married;
	}

	public boolean isMarried() {
		return this.married;
	}

	public String getName() {
		return this.name;
	}

	public int getYear() {
		return this.year;
	}

	public String toString() {
		return this.name + ":" + this.year + ": marr-" + this.married;
	}

	public int hashCode() {
		return Objects.hash(name, year);
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		return Objects.equals(name, other.name) && year == other.year;
	}
}