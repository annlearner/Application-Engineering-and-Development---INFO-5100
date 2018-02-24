package class5;

public class InheritanceTest {

	public static void main(String[] args) {
		Apple a = new Apple();
		a.setDaysToExpire(5);
		a.setPrice(0.50f);
		a.setWeight(0.40f);
		Orange o = new Orange();
		o.setDaysToExpire(10);
		o.setPrice(0.10f);
		o.setWeight(0.25f);
		System.out.println(a);
		System.out.println(o);

	}

}

class Apple {
	private float price;
	private float weight;
	private int daysToExpire;
	private int numberOfSeeds;

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

	public String toString() {
		return "Apple -> " + convertDataToString();
	}

	protected String convertDataToString() {
		return "[Price,Weight,DaysToExpire] = [" + price + "," + weight + "," + daysToExpire + "]";
	}
}

class Banana {
	private float price;
	private float weight;
	private int daysToExpire;

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

	public String toString() {
		return "Banana -> " + convertDataToString();
	}

	protected String convertDataToString() {
		return "[Price,Weight,DaysToExpire] = [" + price + "," + weight + "," + daysToExpire + "]";
	}

}

class Orange {
	private float price;
	private float weight;
	private int daysToExpire;
	private int numberOfSeeds;

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

	public String toString() {
		return "Orange -> " + convertDataToString();
	}

	protected String convertDataToString() {
		return "[Price,Weight,DaysToExpire] = [" + price + "," + weight + "," + daysToExpire + "]";
	}

}