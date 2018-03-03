import java.util.ArrayList;
import java.util.List;

public class MergeTest {

	public static void main(String[] args) {

	}

	public List<Integer> consensus(List<Iterator> streams, int numToAgree) {
		int numberCount[] = new int[1000];
		int maxNumber = Integer.MIN_VALUE;
		for (Iterator i : streams) {
			int mn = iterateOnIterator(i, numberCount);
			maxNumber = Math.max(maxNumber, mn);
		}
		return makeList(numberCount, maxNumber);
	}

	private List<Integer> makeList(int[] numberCount, int maxNumber) {
		List<Integer> results = new ArrayList<Integer>();
		for (int i = 0; i < maxNumber; i++) {
			if (numberCount[i] >= 2) {
				results.add(numberCount[i]);
			}
		}
		return results;
	}

	private int iterateOnIterator(Iterator i, int countArray[]) {
		int current = Integer.MIN_VALUE;
		while (i.hasNext()) {
			int next = i.next();
			if (next == current) {
				continue;
			}
			current = next;
			countArray[current]++;
		}
		return current;
	}
}

interface Iterator {
	int peek();

	int next();

	boolean hasNext();
}
