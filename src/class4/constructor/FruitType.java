package class4.constructor;

public enum FruitType {
	APPLE(0.5f), BANANA(0.25f), GRAPES(0), MANGO(0.75f);
	float price;
	FruitType(float price){
		this.price = price;
	}
	FruitType(){
		
	}
}
