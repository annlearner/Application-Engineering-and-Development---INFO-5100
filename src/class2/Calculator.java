package class2;

public class Calculator {

	int sum(int a, int b) {
		int result = a + b;
		return result;
	}

	int multiply(int a, int b) {
		int result = a * b;
		return result;
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		int x = c.sum(10, 5);
		System.out.println(x);
		x = c.multiply(10, 7);
		System.out.println(x);

	}

}
