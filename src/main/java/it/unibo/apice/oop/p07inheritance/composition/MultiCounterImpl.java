package it.unibo.apice.oop.p07inheritance.composition;

public class MultiCounterImpl implements CounterAbs {

    private final CounterAbs counter;

    public MultiCounterImpl(final int initialValue) {
        this.counter = new CounterImpl(initialValue);
    }

    public void increment() {
        this.counter.increment();
    }

    public int getValue() {
        return this.counter.getValue();
    }

    /* Nuovo metodo */
    public void multiIncrement(final int n) {
        for (int i = 0; i < n; i++) {
            this.increment();
        }
    }
}
