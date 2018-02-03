package class2;

public class Student {
	String name;
	float gpa;

	void printGrade() {
		System.out.println(name + "'s grade is " + getGrade());
	}

	String getGrade() {
		if (gpa > 3.75) {
			return "A";
		}
		if (gpa > 3.5) {
			String r = "A-";
			return r;
		}
		if (gpa > 3.25) {
			return "B";
		}
		if (gpa > 3.0) {
			return "B-";
		}

		return "C";
	}
}
