package class2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class StudentTest {

	@Test
	void test() {
		Student student = new Student();
		student.gpa = 3.95f;
		String grade = student.getGrade();
		Assert.assertEquals(grade, "A+");
		student.gpa = 3.80f;
		grade = student.getGrade();
		Assert.assertEquals(grade, "A");
		student.gpa = 3.60f;
		grade = student.getGrade();
		Assert.assertEquals(grade, "A-");
		student.gpa = 3.40f;
		grade = student.getGrade();
		Assert.assertEquals(grade, "B");
		student.gpa = 3.20f;
		grade = student.getGrade();
		Assert.assertEquals(grade, "B-");

	}

}
