package it.unibo.apice.oop.p19threads;

public class TestSynchUsers {

	public static void main(String[] args) {

		SimpleSynchronizer sync = new SimpleSynchronizer();
		
		new SynchUserA(sync).start();
		new SynchUserB(sync).start();
		
	}

}
