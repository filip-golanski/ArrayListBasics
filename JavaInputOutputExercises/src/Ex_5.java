import java.io.File;

public class Ex_5 {

	public static void main(String[] args) {
		//  Write a Java program to check if 
		// given pathname is a directory or a file

		File ls = new File("./src");
		if (ls.isDirectory())
			System.out.println("Directory");
		else
			System.out.println("File");
	}
}
