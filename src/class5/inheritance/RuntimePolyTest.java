package class5.inheritance;

public class RuntimePolyTest {

	public static void main(String[] args) {
		// oneWayOfAnswering();
		anotherWayOfAnswering();
	}

	private static void anotherWayOfAnswering() {
		Student students[] = makeStudents(5, 6);
		makeStudentsAnswer(students);
	}

	private static void makeStudentsAnswer(Student[] students) {
		for (Student s : students) {
			s.answer("What is polymorphism");
		}

	}

	private static Student[] makeStudents(int x, int y) {
		Student students[] = new Student[x + y];
		for (int i = 0; i < x; i++) {
			students[i] = new Male();
		}
		for (int i = x; i < x + y; i++) {
			students[i] = new Female();
		}
		return students;
	}

	private static void oneWayOfAnswering() {
		Male[] males = new Male[5];
		Female[] females = new Female[6];
		createMales(males);
		createFemales(females);
		makeFemalesAnswer(females);
		makeMalesAnswer(males);
	}

	private static void makeMalesAnswer(Male[] males) {
		for (Male m : males) {
			m.answer("What is Inheritance");
		}

	}

	private static void makeFemalesAnswer(Female[] females) {
		for (Female f : females) {
			f.answer("What is Polymorphism");
		}

	}

	private static void createFemales(Female[] females) {
		for (int i = 0; i < females.length; i++) {
			females[i] = new Female();
		}

	}

	private static void createMales(Male[] males) {
		for (int i = 0; i < males.length; i++) {
			males[i] = new Male();
		}

	}

}

abstract class Student {
	void answer(String question) {

	}
}

class Male extends Student {
	@Override
	void answer(String question) {
		System.out.println("Male answer  -> " + question);
	}
}

class Female extends Student {
	@Override
	void answer(String question) {
		System.out.println("Female Answer -> " + question);
	}
}
