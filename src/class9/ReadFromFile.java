package class9;

import static org.junit.jupiter.api.Assumptions.assumingThat;

import java.io.File;
import java.io.FileInputStream;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ReadFromFile {

	public static void main(String[] args) throws Exception {
		File file = new File("/Users/sdosapati/indeed/source-candidate-pipeline/.idea/vcs.xml");
		FileInputStream fis = new FileInputStream(file);
		// System.out.println(readOneByteAtATime(fis));
		// System.out.println(readAllDataInOneShot(fis));
		String s = readAllDataInOneShot(fis);
		System.out.println(s.contains("siva"));
	}

	private static String readAllDataInOneShot(FileInputStream fis) throws Exception {
		int x = fis.available();
		System.out.println("total bytes - " + x);
		byte b[] = new byte[x];
		fis.read(b);
		String s = new String(b);
		// System.out.println(s);
		return s;

	}

	private static String readOneByteAtATime(FileInputStream fis) throws Exception {
		StringBuilder builder = new StringBuilder(200);
		while (true) {
			int i = fis.read();
			if (i == -1) {
				break;
			}
			char ch = (char) i;
			// System.out.print(ch);
			builder.append(ch);
		}
		fis.close();
		return builder.toString();
	}

}
