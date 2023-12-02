package it.unibo.apice.oop.p07inheritance.composition;

public class CounterImpl implements CounterAbs {

	private int value;

	public CounterImpl(final int initialValue) {
		this.value = initialValue;
	}

	public void increment() {
		this.value++;
	}

	public int getValue() {
		return this.value;
	}
}
