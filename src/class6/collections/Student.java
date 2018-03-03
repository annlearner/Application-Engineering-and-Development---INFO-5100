package class6.collections;

public class Student {
	int roll;
	String name;

	static Student make(int roll, String name) {
		Student s = new Student();
		s.roll = roll;
		s.name = name;
		return s;
	}

	public String toString() {
		return "[Roll,Name]=[" + roll + "," + name + "]";
	}
}
