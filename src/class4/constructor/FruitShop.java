package class4.constructor;

public class FruitShop {

	public static void main(String[] args) {
		Fruit apple = new Fruit("Apple", 3);

		System.out.println(apple);

		apple = null;

		System.gc();

		Fruit banana = new Fruit("Banana", 5);

		System.out.println(banana);

		Fruit grapes = new Fruit("Grapes", 0.5f, 2.5f);

		System.out.println(grapes);

		Fruit hungryManFruit = new Fruit();

		System.out.println(hungryManFruit);

		TypedFruit anotherApple = new TypedFruit(FruitType.APPLE, 4);
		System.out.println(anotherApple);

		TypedFruit anotherBanana = new TypedFruit(FruitType.BANANA, 8);
		System.out.println(anotherBanana);

	}

}
