package it.unibo.apice.oop.p19threads;

public class SimpleSynchronizer {

	private boolean signalArrived;

	public SimpleSynchronizer() {
		signalArrived = false;
	}
	
	public synchronized void waitForSignal() throws InterruptedException {
		while (!signalArrived) {
			wait();
		}
		signalArrived = false;
	}

	public synchronized void signal() {
		signalArrived = true;
		notifyAll();
	}

}
