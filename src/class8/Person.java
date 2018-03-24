package class8;

public class Person {
	String name;

	boolean eat = false;
	boolean talk = false;

	void think(int milliseconds) {
		for (int i = 0; i < milliseconds; i += 25) {
			System.out.println(name + " is thinking");
			pause(25);
		}
	}

	void talkWithFlags(int millis) {
		talk = true;
		if (eat != true) {
			for (int i = 0; i < millis; i += 50) {
				System.out.println(name + " is talking");
				pause(50);
			}
		} else {
			System.out.println("I can't talk because I'm eatging");
		}
		talk = false;

	}

	void sleep(int millis) {
		for (int i = 0; i < millis; i += 50) {
			System.out.println(name + " is sleeping");
			pause(50);
		}

	}

	synchronized void eat(int milliseconds) {
		for (int i = 0; i < milliseconds; i += 100) {
			System.out.println(name + " is eating");
			pause(100);

		}
	}

	synchronized void talk(int millis) {
		for (int i = 0; i < millis; i += 50) {
			System.out.println(name + " is talking");
			pause(50);
		}
	}

	void eatWithFlags(int milliseconds) {
		eat = true;
		if (talk != true) {
			for (int i = 0; i < milliseconds; i += 100) {
				System.out.println(name + " is eating");
				pause(100);
				int x = getRandomNumber(10);
				if (x > 8)
					throw new RuntimeException(name + " is choking while eating");
			}
		} else {
			System.out.println("I can't eat because I'm talking");
		}
		eat = false;
	}

	int getRandomNumber(int x) {
		return (int) (Math.random() * x);
	}

	void pause(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (Exception e) {
		}
	}

}
