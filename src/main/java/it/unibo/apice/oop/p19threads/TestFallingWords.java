package it.unibo.apice.oop.p19threads;

import java.util.Random;

import org.fusesource.jansi.Ansi.Color;

public class TestFallingWords {

	static final int COUNT_DOWN_IN_SECS = 10;
	
	public static void main(String[] args) {
		Screen sc = Screen.getInstance();

		String sentence = "This is a long falling sentence from the top of the screen to the bottom";
		
		int startPos = 10;
		int startLine = 3;
		int endLine = 20;
		long whenToPause = 400;
		
		sc.clear();
		sc.writeStringAt(startLine, startPos, Color.YELLOW, sentence);

		Thread countDownThread = new CountDownAgent(10);
		countDownThread.start();
		try {
			countDownThread.join();
		} catch (Exception ex) {}
		
		Random gen = new Random(1000);
		
		String[] words = sentence.split(" ");
		int currentPos = startPos;
		for (String w: words) {
			new WordFallingAgent(w, startLine, currentPos, endLine, 20 + gen.nextInt(40), whenToPause).start();
			currentPos += w.length() + 1;
		}
		
		new PauseNotifierAgent(whenToPause).start();
	}

}
