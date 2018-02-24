package class5.inheritance;

public class OverloadingTest {

	public static void main(String[] args) {
		Person cva = new Person();
		Banana b = new Banana();
		Chocolate c = new Chocolate();

		cva.eatChocolate(c);
		cva.eatBanana(b);

		cva.eat(b);
		cva.eat(c);
	}

}

class Person {

	public void eat(Chocolate c) {
		System.out.println("Eating chocoloate");
	}

	public void eat(Banana b) {
		System.out.println("Eating banana");
	}

	public void eatChocolate(Chocolate c) {
		System.out.println("Eating chocolate");
	}

	public void eatBiscuit(Biscuit b) {
		System.out.println("Eating biscuit");
	}

	public void eatBanana(Banana b) {
		System.out.println("Eating banana");
	}
}

class Chocolate {
}

class Biscuit {
}
