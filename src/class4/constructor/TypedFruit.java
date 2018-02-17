package class4.constructor;

public class TypedFruit {
	FruitType type;
	int quantity;
	float price;

	TypedFruit(FruitType ft, int quantity) {
		this.type = ft;
		this.quantity = quantity;
		calculatePrice();
	}

	void calculatePriceOldWay() {
		if (type == FruitType.APPLE) {
			this.price = 0.5f * quantity;
		}
		if (type == FruitType.BANANA) {
			this.price = 0.25f * quantity;
		}
	}

	void calculatePrice() {
		this.price = type.price * quantity;
	}

	public String toString() {
		return "Fruit Type -> " + type + " : Quantity -> " + quantity + " : Price -> " + price;
	}
}
