package class9;

public class Student {
	private String name;
	private String roll;
	private String grade;
	private String gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLine() {
		return roll + "," + name + "," + grade + "," + gender;
	}

	public static Student fromLine(String line) {
		String t[] = line.split("\\,");
		Student s = new Student();
		s.setRoll(t[0]);
		s.setName(t[1]);
		s.setGrade(t[2]);
		s.setGender(t[3]);
		return s;
	}
}
