package class4;

public class Classroom {

	public static void main(String[] args) {
		Professor cva = new Professor();
		Student yue = new Student("Yue", cva);
		Student lu = new Student("Lu", cva);
		Student zane = new Student("Zane", cva);

		yue.askProfessorToStartTheClass();
		System.out.println(zane.isNameStartsWith("Z"));
		System.out.println(zane.isNameStartsWith("Za"));
		System.out.println(zane.isNameStartsWith("AB"));
		//System.out.println(zane.isNameStartsWith(null));
		System.out.println(zane.isNameStartsWith(""));
		System.out.println(zane.isNameStartsWith("Zane"));
		System.out.println(zane.isNameStartsWith("Zane and Siva and whatever"));

	}

}
