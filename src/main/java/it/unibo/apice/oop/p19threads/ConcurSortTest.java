package it.unibo.apice.oop.p19threads;

import java.util.*;

public class ConcurSortTest {

	static final int VECTOR_SIZE = 100000000;
	
	public static void main(String[] args) {
	
		log("Generating array...");
		int[] v = genArray(VECTOR_SIZE);
		
		log("Array generated.");
		log("Concurrent sorting (" + VECTOR_SIZE + " elements)...");
	
		long t0 = System.nanoTime();		
		Thread master = new SortingMaster(v);
		master.start();		
		try {
			master.join();
			long t1 = System.nanoTime();
			log("Done. Time elapsed: " + ((t1 - t0) / 1000000) + " ms");
			if (check(v)) {
				log("SORTING OK.");
			} else {
				log("SORTING NOT OK.");
			}
		} catch (InterruptedException ex) {
			log("Interrupted.");
		}
	}

	private static boolean check(int[] v) {
		double a = v[0];
		for (int i = 1; i < v.length; i++) {
			if (a > v[i]) {
				return false;
			}
			a = v[i];
		}
		return true;
	}

	private static int[] genArray(int n) {
		Random gen = new Random(10000);
		int v[] = new int[n];
		for (int i = 0; i < v.length; i++) {
			v[i] = gen.nextInt();
		}
		return v;
	}

	private static void log(String msg) {
		System.out.println(msg);
	}
}
