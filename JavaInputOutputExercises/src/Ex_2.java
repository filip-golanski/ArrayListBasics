import java.io.File;

public class Ex_2 {

	public static void main(String[] args) {
		// Write a Java program to get specific 
		// files by extensions from a specified folder

		File ls = new File("./src");
		String[] list = ls.list();
		for (String entry : list) {
			if (entry.endsWith(".java"))
				System.out.println(entry);
		}
	}
}
