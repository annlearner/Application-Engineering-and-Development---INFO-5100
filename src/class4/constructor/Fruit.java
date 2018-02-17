package class4.constructor;

public class Fruit {

	private String type;
	private float price;
	private float weight;
	public int quantity;
	
	String color;

	public void setQuantity(int q) {
		if (q > quantity) {
			throw new RuntimeException(q + " has to be less than " + quantity);
		}
		if (q < 0) {
			throw new RuntimeException(q + " can't be less than 0");
		}
		this.quantity = q;
	}

	public float getPrice() {
		return price;
	}

	public Fruit() {
		this("Banana", 1);
	}

	public void finalize() {
		String x = this.toString();
		System.out.println(x + " is destroyed");
	}

	public String toString() {
		return "Type -> " + type + " : Price -> " + price + " : Weight -> " + weight + " : Quantity -> " + quantity;
	}

	public void eatOne() {
		this.quantity--;
	}

	public Fruit(String type, int quantity) {
		this(type);
		this.quantity = quantity;
		calculatePrice();
	}

	private void calculatePrice() {
		if (type.equals("Apple")) {
			this.price = 0.50f * quantity;
		}
		if (type.equals("Banana")) {
			this.price = 0.25f * quantity;
		}

	}

	public Fruit(String type, float weight, float price) {
		this(type);
		this.weight = weight;
		this.price = price;
	}

	public Fruit(String type) {
		this.type = type;
		System.out.println(type + " is ordered");
	}

}
