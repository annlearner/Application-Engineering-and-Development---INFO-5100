package class5.inheritance;

public class StaticTest {

	public static void main(String[] args) {
		NEUJan2018INFO5100Student lu = new NEUJan2018INFO5100Student("Lu");
		NEUJan2018INFO5100Student pa = new NEUJan2018INFO5100Student("Pravallika");
		System.out.println(lu);
		System.out.println(pa);
		pa.makeProfessorSick();
		System.out.println(pa);
		System.out.println(lu);
		System.out.println("--------");
		pa.ask("What is Inheritance");
		lu.ask("What is Abstraction");

		NEUJan2018INFO5100Student.ask("How is weather");

	}

}

class NEUJan2018INFO5100Student {
	String name;
	static NEUJan2018INFO5100Professor professor = new NEUJan2018INFO5100Professor("Siva");

	public static int sum(int a, int b) {
		return a + b;
	}

	public static void ask(String question) {
		professor.answer(question);
	}

	public NEUJan2018INFO5100Student(String name) {
		this.name = name;
	}

	public String toString() {
		return "[Student, Professor, Professor's health ] = [" + " " + this.name + " , " + professor.name + ", "
				+ professor.getHealthStatus() + "]";
	}

	public void makeProfessorSick() {
		professor.healthy = false;
	}
}

class NEUJan2018INFO5100Professor {
	String name;
	boolean healthy = true;

	void answer(String question) {
		System.out.println("Answer Question -> " + question);
	}

	public NEUJan2018INFO5100Professor(String name) {
		this.name = name;
	}

	public String getHealthStatus() {
		if (healthy)
			return "Healthy";
		return "Sick";
	}

}
