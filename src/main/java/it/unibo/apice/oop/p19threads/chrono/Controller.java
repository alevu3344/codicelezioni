package it.unibo.apice.oop.p19threads.chrono;

public interface Controller {

	void attachView(ChronoView view);
	void notifyStarted();
	void notifyStopped();
	void notifyReset();

}
