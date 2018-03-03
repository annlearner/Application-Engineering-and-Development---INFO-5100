package class6.collections;

import java.util.ArrayList;
import java.util.HashMap;

public class PerformanceTest {

	public static void main(String[] args) {
		findTimeUsingArrayList();
		findTimeUsingHashMap();
	}

	private static void findTimeUsingArrayList() {
		ArrayList<String> names = new ArrayList<String>();
		int max = 10000000;
		for (int i = 0; i < max; i++) {
			names.add("siva" + i);

		}
		System.out.println("Added objects into memory..");
		boolean found = false;
		long start = System.nanoTime();
		found = names.contains("siva99999999");
		long end = System.nanoTime();
		System.out.println("Took time to find in arraylist -> " + (end - start) + " -> " + found);
	}

	private static void findTimeUsingHashMap() {

		HashMap names = new HashMap();
		int max = 10000000;
		for (int i = 0; i < max; i++) {
			names.put("siva" + i, "siva" + i);

		}
		System.out.println("Added objects into memory..");
		boolean found = false;
		long start = System.nanoTime();
		boolean b = names.containsKey("siva99999999");
		long end = System.nanoTime();
		System.out.println("Took time to find in  map-> " + (end - start) + " -> " + b);

	}

}
