package it.unibo.apice.oop.p19threads;

public class PrintAvailableProcs {
	public static void main(String[] args) {
		int nprocs = Runtime.getRuntime().availableProcessors();
		System.out.println("Available processors: " + nprocs);
	}
}
