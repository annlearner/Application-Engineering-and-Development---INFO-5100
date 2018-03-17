package class8;

public class Person {
	String name;

	void think(int milliseconds) {
		for (int i = 0; i < milliseconds; i += 25) {
			System.out.println(name + " is thinking");
			pause(25);
		}
	}

	void eat(int milliseconds) {
		for (int i = 0; i < milliseconds; i += 100) {
			System.out.println(name + " is eating");
			pause(100);
			int x = getRandomNumber(10);
			if (x > 8)
				throw new RuntimeException(name + " is choking while eating");
		}
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
