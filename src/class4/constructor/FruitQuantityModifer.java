package class4.constructor;

public class FruitQuantityModifer {

	public static void main(String[] args) {
		Fruit apples = new Fruit("Apple", 17);
		System.out.println(apples);
		apples.setQuantity(15);// setMoney()
		System.out.println(apples);

		apples.setQuantity(14);
		System.out.println(apples);

		apples.setQuantity(1);
		System.out.println(apples);

		apples.quantity = -1;
		System.out.println(apples);
		
		apples.color = "Red";

		// apples.eatOne();
		// apples.eatOne();
		// apples.eatOne();// askMoney();
		//System.out.println(apples);

	}

}
