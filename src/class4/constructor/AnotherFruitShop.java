package class4.constructor;

import java.io.File;
import java.util.Scanner;

public class AnotherFruitShop {

	public static void main(String[] args) {
		//File file = new File("siva.txt");

		Fruit apple = new Fruit("Apple", 10);
		System.out.println(apple);
		// apple.type = "Banana";
		// apple.price = 0.10f;
		// System.out.println(apple);

		Fruit[] fruits = processRequests();
		for (Fruit f : fruits) {
			if (f != null) {
				System.out.println(f);
			}
		}
		float totalCash = calculateTotalCash(fruits);
		System.out.println("Total Cash -> " + totalCash);
	}

	private static float calculateTotalCash(Fruit[] fruits) {
		float totalCash = 0.0f;
		for (Fruit f : fruits) {
			if (f != null) {
				totalCash = totalCash + f.getPrice();
			}
		}
		return totalCash;
	}

	private static Fruit[] processRequests() {
		Scanner scanner = new Scanner(System.in);
		Fruit fruits[] = new Fruit[10];
		int fruitCount = 0;
		while (true) {
			System.out.println("Enter Fruit Type (Apple|Banana|Exit");

			String type = scanner.nextLine();
			if (type.equalsIgnoreCase("Exit")) {
				break;
			}
			System.out.println("Enter Quantity");
			int quantity = Integer.parseInt(scanner.nextLine());
			Fruit fruit = new Fruit(type, quantity);
			fruits[fruitCount++] = fruit;
		}
		return fruits;
	}

}
