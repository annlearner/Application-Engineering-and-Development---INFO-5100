package class8;

public class StudentThreads {
	static Student john = new Student("John");
	static Student wei = new Student("Wei");

	public static void main(String[] args) throws Exception {
		// listenInClassRoom();
		askQuestions();
	}

	private static void askQuestions() {
		Thread johnThread = new Thread(() -> john.askQuestion());
		Thread weiThread = new Thread(() -> wei.askQuestion());
		johnThread.start();
		weiThread.start();
		listenInClassRoom();
	}

	private static void listenInClassRoom() {
		/*
		 * while (john.isAwake()) { john.listen(); Thread.sleep(100); } while
		 * (wei.isAwake()) { wei.listen(); Thread.sleep(100); }
		 */
		Thread johnListeningThread = makeStudentThread(john);
		Thread weiListeningThread = makeStudentThread(wei);
		johnListeningThread.start();
		weiListeningThread.start();
		//johnListeningThread.start();
	}

	static Thread makeStudentThread(final Student s) {
		return new Thread() {
			public void run() {
				while (true) {
					s.listen();
					sleep(100);
				}
			}

			private void sleep(int x) {
				try {
					Thread.sleep(x);
				} catch (Exception e) {
				}
			}
		};
	}

}

class Student {
	String name;

	public boolean isAwake() {
		return true;
	}

	public void askQuestionWithSynchronizedOnClassInsideMethod() {
		synchronized (Student.class) {
			int x = 0;
			while (x < 5) {
				System.out.println(name + " is asking question " + x);
				x++;
				sleep(100);

			}
		}
	}

	public void askQuestion() {
		loop(name, 5);
	}

	private synchronized static void loop(String name, int xx) {
		int x = 0;
		while (x < xx) {
			System.out.println(name + " is asking question " + x);
			x++;
			sleep(100);

		}

	}

	private static void sleep(int x) {
		try {
			Thread.sleep(100);
		} catch (Exception e) {
		}
	}

	Student(String name) {
		this.name = name;
	}

	public void listen() {
		System.out.println(name + " is listening");
	}
}
