package class4;

public class Student {
	private String name;

	public String getName() {
		return name;
	}

	private Professor p;

	public Student(String name, Professor p) {
		this.p = p;
		this.name = name;
	}

	public boolean isNameStartsWith(String string) {
		return this.name.startsWith(string);
	}

	public boolean isNameStartsWithOurImplementation(String string) {
		if (string == null)
			return false;
		char my[] = this.name.toCharArray();
		char other[] = string.toCharArray();
		if (other.length > my.length) {
			return false;
		}
		for (int i = 0; i < other.length; i++) {
			if (other[i] != my[i]) {
				return false;
			}
		}
		return true;
	}

	public void askProfessorToStartTheClass() {
		// p.think();
		p.teach();
	}
}
