package class9;

import java.io.File;

public class FindTextFilesInADirectory {

	public static void main(String[] args) {
		File file = new File("/Users/sdosapati/indeed/source-candidate-pipeline");
		displayTextFilesInADirectory(file);
	}

	private static void displayTextFilesInADirectory(File file) {
		File[] files = file.listFiles();
		for (File f : files) {
			if (f.isDirectory()) {
				displayTextFilesInADirectory(f);
				continue;
			}

			String name = f.getName();
			if (name.endsWith(".xml")) {
				System.out.println(f.getAbsolutePath());
			}
		}
	}

}
