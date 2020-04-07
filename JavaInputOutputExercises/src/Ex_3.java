import java.io.File;

public class Ex_3 {


	public static void main(String[] args) {
		// Write a Java program to check if a file 
		// or directory specified by pathname exists or not

		File ls = new File("./src");
		System.out.println(ls.exists());
	}
}
