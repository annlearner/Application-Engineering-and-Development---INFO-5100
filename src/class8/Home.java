package class8;

import java.util.ArrayList;
import java.util.Collection;

public class Home {

	public static void main(String[] args) throws Exception {
		Person ann = new Person();
		ann.name = "Ann";
		Person cva = new Person();
		cva.name = "Cva";
		long start = System.currentTimeMillis();
		// thinkAndEatSequentially(ann);
		Collection<Thread> threads = thinkAndEatParallelyUsingFunctionalProgramming(ann);
		threads.addAll(thinkAndEatParallelyUsingNormalProgramming(cva));
		for (Thread t : threads) {
			t.join();
		}
		long end = System.currentTimeMillis();
		long diff = end - start;
		System.out.println("Thinking and Eating took -> " + diff + " milliseconds ");

	}

	private static Collection<Thread> thinkAndEatParallelyUsingFunctionalProgramming(Person ann) throws Exception {
		Thread a = new Thread(() -> ann.think(2500));
		Thread b = new Thread(() -> ann.eat(2500));
		a.start();
		b.start();
		ArrayList<Thread> threads = new ArrayList<Thread>();
		threads.add(a);
		threads.add(b);
		return threads;
		// a.join();
		// b.join();

	}

	private static Collection<Thread> thinkAndEatParallelyUsingNormalProgramming(Person p) throws Exception {
		Thread a = new ThinkingThread(p, 2500);
		EatingRunnable er = new EatingRunnable(p, 2500);
		Thread b = new Thread(er);
		a.start();
		b.start();
		ArrayList<Thread> threads = new ArrayList<Thread>();
		threads.add(a);
		threads.add(b);
		return threads;
		// a.join();
		// b.join();

	}

	private static void thinkAndEatSequentially(Person ann) {
		ann.think(2500);
		ann.eat(2500);
	}

	static class ThinkingThread extends Thread {
		Person p;
		int millis;

		ThinkingThread(Person p, int millis) {
			this.p = p;
			this.millis = millis;
		}

		public void run() {
			p.think(millis);
		}
	}

	static class EatingRunnable implements Runnable {
		Person p;
		int millis;

		EatingRunnable(Person p, int millis) {
			this.p = p;
			this.millis = millis;
		}

		@Override
		public void run() {
			p.eat(millis);

		}

	}

}
