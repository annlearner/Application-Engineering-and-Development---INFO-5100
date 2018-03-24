package class9;

import java.util.ArrayList;
import java.util.List;

public class StudentsManagerImpl implements StudentsManager {

	private List<Student> students = new ArrayList<Student>();

	@Override
	public void addStudent(Student student) {
		students.add(student);

	}

	@Override
	public void deleteStudent(String rollNumber) {
		Student s = findStudent(rollNumber);
		students.remove(s);

	}

	@Override
	public Student findStudent(String rollNumber) {
		for (Student s : students) {
			if (s.getRoll().equals(rollNumber)) {
				return s;
			}
		}
		return null;
	}

	public List<Student> getStudents() {
		return students;
	}

	@Override
	public void modifyGrade(String rollNumber, String grade) {
		Student s = findStudent(rollNumber);
		s.setGrade(grade);

	}

	@Override
	public void displayStudents() {
		for (Student s : students) {
			System.out.println(s.getLine());
		}

	}

}
