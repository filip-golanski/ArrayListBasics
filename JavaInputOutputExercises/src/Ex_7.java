import java.io.File;
import java.util.Date;

public class Ex_7 {

	public static void main(String[] args) {
		//  Write a Java program to get 
		// last modified time of a file

		File ls = new File("./src");
		System.out.println(new Date(ls.lastModified()));
	}
}
