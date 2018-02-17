package class2;

public class ClassRoom {
	public static void main(String args[]) {

		Student zane = new Student();
		zane.gpa = 3.97f;
		System.out.println(zane.getGrade());
		Student lu = new Student();
		Student pravallika = new Student();
		lu.name = "Lu";
		pravallika.name = "Pravallika";

		lu.gpa = 3.59f;
		pravallika.gpa = 3.87f;

		// System.out.println(lu.name + "'s grade is " + lu.getGrade());
		// System.out.println(pravallika.name + "'s grade is " + pravallika.getGrade());

		// lu.printGrade();
		// pravallika.printGrade();

		ClassRoom cr;
		cr = new ClassRoom();
		cr.printGrade(lu);
		cr.printGrade(pravallika);
	}

	public void printGrade(Student s) {
		System.out.println(s.name + "'s grade is " + s.getGrade());
	}
}
