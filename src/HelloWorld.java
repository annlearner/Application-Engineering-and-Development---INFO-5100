import java.net.InetAddress;

public class HelloWorld {
	public static void main(String args[]) throws Exception {
		System.out.println("God is great..");
		InetAddress ia = InetAddress.getLocalHost();
		System.out.println(ia);
		System.out.println("Trying something else..");
	}
}
