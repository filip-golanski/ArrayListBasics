import java.io.File;

public class Ex_1 {

	public static void main(String[] args) {
		// Write a Java program to get a list
		// of all file/directory names from the given ???
		
		File ls = new File("./");
		String[] list = ls.list();
		for (String entry : list) {
			System.out.println(entry);
		}
	}

}
