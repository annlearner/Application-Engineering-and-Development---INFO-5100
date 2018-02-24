package class5.inheritance;

public class InheritanceTest {
	public static void main(String args[]) {
		Apple a = new Apple();
		a.setPrice(0.25f);
		a.seedsCount = 10;
		System.out.println(a.isEatable());
		System.out.println(a);

		Apple a1 = new Apple(0.25f, 0.5f, 10);

		Banana b = new Banana();
		b.setPrice(0.43f);
		b.setDaysToExpire(7);
		Orange o = new Orange();
		System.out.println("-----------------");
		System.out.println(b);
		System.out.println(a);
		System.out.println(o);
		System.out.println("-----------------");
		Orange oo = new Orange();
		oo.setDaysToExpire(10);
		RedApple ra = new RedApple();
		ra.setDaysToExpire(1);
		System.out.println(oo + " Discount -> " + oo.calculateDiscount());
		System.out.println(ra + " Discount -> " + ra.calculateDiscount());
	}
}

class Fruit {
	private float price;
	private float weight;
	private int daysToExpire;

	public float calculateDiscount() {
		if (getDaysToExpire() <= 2) {
			return 0.10f;
		}
		return 0f;
	}

	public Fruit(float price, float weight, int daysToExpire) {
		System.out.println("Fruit is constructed with parameters");
		this.price = price;
		this.weight = weight;
		this.daysToExpire = daysToExpire;
	}

	/*
	 * public Fruit() { System.out.println("Fruit is constructed"); }
	 */

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getDaysToExpire() {
		return daysToExpire;
	}

	public void setDaysToExpire(int daysToExpire) {
		this.daysToExpire = daysToExpire;
	}

	public final String toString() {
		return getType() + " -> " + convertDataToString() + getExtraDisplayableData();
	}

	protected String getType() {
		return "Fruit";
	}

	protected String getExtraDisplayableData() {
		return "";
	}

	protected String convertDataToString() {
		return "[Price,Weight,DaysToExpire] = [" + price + "," + weight + "," + daysToExpire + "]";
	}

}

class Apple extends Fruit {

	@Override
	public float calculateDiscount() {
		if (getDaysToExpire() <= 3 && getPrice() > 0.20f) {
			return 0.10f;
		} else {
			return 0;
		}
	}

	public Apple() {
		super(0.1f, 0.25f, 5);
		// System.out.println("Apple is consructed");
	}

	public Apple(float price, float weight, int daysToExpire) {
		super(price, weight, daysToExpire);
	}

	int seedsCount;

	public boolean isEatable() {
		// System.out.println(convertDataToString());
		if (seedsCount > 100)
			return false;
		return true;
	}

	protected String getType() {
		return "Apple";
	}

	@Override
	/*
	 * public String toString() { return "Apple -> " + seedsCount + ", " +
	 * isEatable(); }
	 */

	protected String getExtraDisplayableData() {
		return "[Seeds Count, Eatable]= [" + seedsCount + ", " + isEatable();
	}

}

class RedApple extends Apple {
	/*
	 * public String toString() { return "NON SENSE"; }
	 */
}

final class Banana extends Fruit {
	public Banana() {
		super(0, 0, 0);
	}

	public String getType() {
		return "Banana";
	}

	public float calculateDiscount() {
		if (getWeight() > 0.5f) {
			return 0.25f;
		}
		return super.calculateDiscount();
	}
}


class Orange extends Fruit {
	public Orange() {
		super(0, 0, 0);
	}

	@Override
	public String getType() {
		return "Orange";
	}
}
