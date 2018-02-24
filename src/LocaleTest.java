import java.util.Arrays;
import java.util.Locale;

public class LocaleTest {
	public static void main(String args[]) {
		Locale locale[] = Locale.getAvailableLocales();
		int count = 0;
		for (Locale x : locale) {
			System.out.println(count++ + " :: " + x.toString()+" :: "+x.getCountry()+" :: "+x.getLanguage()+" :: "+x.getDisplayLanguage() + " :: "+x.getDisplayCountry());
		}
		//Arrays.stream(locale).forEach((Locale x) -> System.out.println(x));
	}
}
