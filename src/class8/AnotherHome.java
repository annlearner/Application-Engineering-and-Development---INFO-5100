package class8;

public class AnotherHome {

	public static void main(String[] args) {
		// onePersonActivities();
		teamLunch();
	}

	private static void onePersonActivities() {
		Person p = new Person();
		p.name = "Ann";
		// Thread sleep = new Thread(() -> p.sleep(5000));
		Thread eat = new Thread(() -> p.eat(5000));
		Thread talk = new Thread(() -> p.talk(5000));
		Thread think = new Thread(() -> p.think(5000));
		// sleep.start();
		// p.think(5000);
		// p.eat(5000);
		// p.talk(5000);
		// eat.start();
		// talk.start();
		// think.start();
	}

	private static void teamLunch() {
		Person a = new Person();
		a.name = "John";
		Person b = new Person();
		b.name = "Jack";
		Thread aEat = eatThread(a, 4000);
		Thread bEat = eatThread(b, 4000);
		aEat.start();
		bEat.start();
	}

	private static Thread eatThread(Person p, int x) {
		return new Thread(() -> p.eat(x));
	}

}
