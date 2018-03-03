package class6;

public class ExceptionTest {

	public static void main(String[] args) throws Exception {

		ClassRoom cr = new ClassRoom();
		Student s = new Student();
		for (int i = 0; i < 5; i++) {
			System.out.println(i + "----------");
			cr.attendClass(s);
		}

		System.out.println("Another way of Invoking methods without handling exceptions");
		for (int i = 0; i < 3; i++) {
			System.out.println(5 + i + "------");
			cr.attendClassWithoutCatchingException(s);
		}

	}

}

class ClassRoom {

	void attendClassWithoutCatchingException(Student s) throws Exception {
		Professor p = waitForProfessor();
		p.teach();
		s.listen();
	}

	void attendClass(Student s) {
		try {
			Professor p = waitForProfessor();
			p.teach();
			s.listen();
		} catch (ProfessorIsLateToClassException a) {
			System.out.println(a.toString());
			s.readBook();
			Professor p = new Professor();
			p.teach();
			s.listen();
		} catch (ProfessorIsNotComingToClassException b) {
			System.out.println("I'm going home as professor is not coming -> " + b);
			return;
		} catch (Exception e) {
			s.browseFacebook();
		} finally {
			s.goHome();
		}
	}

	Professor waitForProfessor() throws ProfessorIsLateToClassException, ProfessorIsNotComingToClassException {
		System.out.println("Waiting for Professor -> " + getTime());
		int random = getRandom(10000);
		if (random > 3000 && random <= 6500) {
			// RuntimeException professorException = new RuntimeException("Professor is not
			// coming");
			// throw professorException;
			// return null;
			ProfessorIsLateToClassException ple = new ProfessorIsLateToClassException(random);
			throw ple;
		}
		if (random > 6500) {
			ProfessorIsNotComingToClassException x = new ProfessorIsNotComingToClassException(random);
			throw x;

		}

		sleep(random);
		System.out.println("Professor arrived after waiting for " + random + " milliseconds -> " + getTime());
		return new Professor();
	}

	String getTime() {
		return new java.sql.Time(System.currentTimeMillis()) + "";
	}

	static void sleep(int millis) {
		try {
			Thread.sleep(millis);
		} catch (Exception e) {
		}
	}

	static int getRandom(int x) {
		return (int) (Math.random() * x);
	}
}

class StudentNotListeningException extends RuntimeException {

}

class Student {
	public void listen() throws StudentNotListeningException {
		int random = ClassRoom.getRandom(5000);
		if (random < 2500) {
			System.out.println("Student is listening to class");
		} else {
			StudentNotListeningException snle = new StudentNotListeningException();
			throw snle;
		}
	}

	public void readBook() {
		System.out.println("Student is reading book");

	}

	public void goHome() {
		System.out.println("Student is going Home");

	}

	public void browseFacebook() {
		System.out.println("Student is browsing Facebook");

	}
}

class Professor {
	public void teach() {
		System.out.println("Professor is teaching");
	}

}

class ProfessorIsNotComingToClassException extends Exception {
	int random;

	public ProfessorIsNotComingToClassException(int random) {
		this.random = random;
	}

	public String toString() {
		return "Wait time -> " + random;
	}
}

class ProfessorIsLateToClassException extends Exception {
	int random;

	public ProfessorIsLateToClassException(int random) {
		this.random = random;
	}

	public String toString() {
		return "Wait Time -> " + random;
	}
}