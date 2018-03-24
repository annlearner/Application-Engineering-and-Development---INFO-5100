import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NormalizerTest {

	public static void main(String[] args) {
		String[] titlesArray = new String[] { "Software Engineer", "Mechanical Engineer", "Clerk", "Project Manager" };
		ArrayList<String> titles = new ArrayList<String>(Arrays.asList(titlesArray));
		Normalizer n = new Normalizer(titles);
		n.normalize("Software Engineer Project Clerk");

	}

}

class Normalizer {
	private Map<String, Integer> titleIds = new HashMap<String, Integer>();
	private Map<String, List<Integer>> invertedIndexMap = new HashMap<String, List<Integer>>();

	public Normalizer(List<String> titles) {
		storeTitles(titles);
	}

	private void storeTitles(List<String> titles) {
		for (String title : titles) {
			storeTitle(title.trim());
		}
	}

	private void storeTitle(String title) {
		if (titleIds.containsKey(title))
			return;
		int titleId = titleIds.size() + 1;
		titleIds.put(title, titleId);
		for (String t : title.split(" ")) {
			List<Integer> titleIdList = invertedIndexMap.get(t);
			if (titleIdList == null) {
				titleIdList = new ArrayList<Integer>();
				invertedIndexMap.put(t, titleIdList);
			}
			titleIdList.add(titleId);
		}
	}

	public String normalize(String jobTitle) {
		Map<String, List<Integer>> wordIndexes = new HashMap<String, List<Integer>>();
		for (String t : jobTitle.split(" ")) {
			List<Integer> list = invertedIndexMap.get(t);
			if (list == null)
				continue;
			wordIndexes.put(t, list);
		}
		wordIndexes.forEach((k, v) -> System.out.println(k + " -> " + v));
		return null;
	}
}
