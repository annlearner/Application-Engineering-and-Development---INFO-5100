package class9;

import java.util.Scanner;

public class FrontDesk {

	private static StudentsManager studentsManager = new StudentsManagerImpl();
	private static StudentsPersistor persistor = new StudentsPersistorImpl();

	public static void main(String[] args) throws Exception {
		studentsManager = persistor.load();
		manageStudents();

	}

	private static void manageStudents() throws Exception {
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("Please enter your operation (ADD|DELETE|FIND|MODIFY|DISPLAY|SAVE|EXIT)");
			String input = s.nextLine();
			if (input.equals("EXIT")) {
				System.out.println("Thank you..");
				return;
			}
			if (input.equals("DISPLAY")) {
				studentsManager.displayStudents();
				continue;
			}
			if (input.equals("MODIFY")) {
				System.out.println("Enter the Roll Number :");
				String roll = s.nextLine();
				Student student = studentsManager.findStudent(roll);
				if (student == null) {
					System.out.println("No student with roll -> " + roll + ". Please try another option");
					continue;
				}
				System.out.println("Enter the Grade: ");
				String grade = s.nextLine();
				student.setGrade(grade);
				continue;
			}
			if (input.equals("FIND")) {
				System.out.println("Enter the Roll Number :");
				String roll = s.nextLine();
				Student student = studentsManager.findStudent(roll);
				if (student == null) {
					System.out.println("No student with roll -> " + roll + ". Please try another option");
					continue;
				}
				System.out.println(student.getLine());
				continue;

			}
			if (input.equals("DELETE")) {
				System.out.println("Enter the Roll Number :");
				String roll = s.nextLine();
				Student student = studentsManager.findStudent(roll);
				if (student == null) {
					System.out.println("No student with roll -> " + roll + ". Please try another option");
					continue;
				}
				studentsManager.deleteStudent(roll);
				continue;

			}
			if (input.equals("ADD")) {
				System.out.println("Enter the student detals -> Roll, Name, Grade, Gender");
				String line = s.nextLine();
				Student st = Student.fromLine(line);
				studentsManager.addStudent(st);
				continue;

			}
			if (input.equals("SAVE")) {
				persistor.save(studentsManager);
				continue;
			}

		}
	}

}
