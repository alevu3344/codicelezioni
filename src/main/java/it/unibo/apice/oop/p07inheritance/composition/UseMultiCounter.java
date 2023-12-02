package it.unibo.apice.oop.p07inheritance.composition;

public class UseMultiCounter {
    public static void main(String[] s) {
        final MultiCounterImpl mc = new MultiCounterImpl(10);
        final CounterAbs c = mc;

        System.out.println(c.getValue()); // 10
        c.increment();
        c.increment();
        System.out.println(c.getValue()); // 12
        mc.multiIncrement(10);
        System.out.println(c.getValue()); // 22
    }
}
