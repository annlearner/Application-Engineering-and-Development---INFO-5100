package class6.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsTest {

	public static void main(String[] args) {
		Student a = Student.make(100, "John");
		Student b = Student.make(101, "Robert");
		Student c = Student.make(102, "Mary");

		ArrayList<Student> students = new ArrayList<Student>();
		students.add(a);
		students.add(b);
		students.add(c);
		System.out.println(students.size() + " -> " + students);
		students.remove(0);
		System.out.println(students);

		// Set numbers = new HashSet();
		// Set numbers = new LinkedHashSet();
		Set numbers = new TreeSet();
		numbers.add(1);
		numbers.add(1);
		numbers.add(2);
		numbers.add(10);
		numbers.add(-1);
		System.out.println(numbers);

		Map<Integer, Student> studentsMap = new HashMap<Integer, Student>();
		studentsMap.put(a.roll, a);
		studentsMap.put(b.roll, b);
		System.out.println(studentsMap.size());
		System.out.println(studentsMap.containsKey(100));
		System.out.println(studentsMap.get(101));
		System.out.println(studentsMap);

		Map numbersMap = new HashMap();

		numbersMap.put(1, "siva");
		numbersMap.put(100, "john");
		numbersMap.put(10, "Robert");
		//numbersMap.put(true, false);
		//numbersMap.put("george", "bush");
		System.out.println(numbersMap);

	}

}
