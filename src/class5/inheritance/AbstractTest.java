package class5.inheritance;

public class AbstractTest {

	public static void main(String[] args) {
		// Phone p = new Phone();
		iPhone ip = new iPhone();
		Samsung s = new Samsung();
		ip.makeCall();
		s.makeCall();
		Phone p = ip;
		p.makeCall();
		p.switchOff();
		p = s;
		p.makeCall();
		p.switchOff();

	}

}

abstract class Phone {
	float price;

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	void switchOff() {
		System.out.println("Phone is switched off");
	}

	abstract void makeCall();
}

class iPhone extends Phone {
	void makeCall() {
		System.out.println("iPhone is making a phone call");
	}

	@Override
	void switchOff() {
		System.out.println("iPhone has a special way to switch off");
	}
}

class Samsung extends Phone {

	@Override
	void makeCall() {
		System.out.println("Samsung is making a phone call");

	}

}