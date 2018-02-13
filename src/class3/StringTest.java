package class3;

public class StringTest {

	public static void main(String[] args) {

		StringTest st = new StringTest();
		// st.experiment();
		String a = "orth eastern";

		System.out.println(st.countVowelsUsingRegularForLoop(a));
	}

	void experiment() {
		String x;
		String xx = new String("Siva");
		String y = "Anitha";
		String y1 = "Anitha";
		String y2 = new String("Anitha");
		String yy = y;
		String zz = new String("Anitha");
		boolean a = (xx == "Siva"); // false
		boolean b = (y == "Anitha"); // true
		boolean c = (y == yy); // true
		boolean d = (xx == yy);// false
		boolean e = (zz == y);// false
		boolean e1 = (y1 == y);// true

		String xxx = "Siva";
		boolean a1 = (xx.equals("Siva"));// true
		boolean a11 = (xxx.equals(xx));

		y = null;
		y1 = null;
		y2 = null;
		zz = null;
		yy = null;

	}

	int countVowelsUsingRegularForLoop(String string) {
		char ch[] = string.toCharArray();
		int vowels = 0;
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if (isVowel(c)) {
				vowels++;
			}
		}
		return vowels;

	}

	int countVowelsUsingEnhancedForLoop(String string) {
		char ch[] = string.toCharArray();
		int vowels = 0;
		for (char c : ch) {
			if (isVowel(c)) {
				vowels++;
			}
		}
		return vowels;

	}

	boolean isVowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		}
		return false;
	}

}
