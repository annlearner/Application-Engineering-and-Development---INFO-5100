package class5.inheritance;

interface JavaProfessor {
	public void teachJava();

	public void answerQuestions();
}

interface Employee {
	public void workInCompany();
}

interface Parent {

	void playWithKids();
}

public class MultiSkilledPerson implements JavaProfessor, Employee, Parent {
	public void teachJava() {

	}

	public void answerQuestions() {

	}

	public void playWithKids() {

	}

	public void workInCompany() {

	}

	public static void main(String args[]) {
		MultiSkilledPerson cva = new MultiSkilledPerson();
		AnotherSkilledPerson ann = new AnotherSkilledPerson();

		JavaProfessor jp = new MultiSkilledPerson();
		// jp.
	}

}

class AnotherSkilledPerson {
	public void teachJava() {

	}

	public void answerQuestions() {

	}

	public void workInCompany() {

	}
}
