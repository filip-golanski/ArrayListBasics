import java.io.File;

public class Ex_4 {

	public static void main(String[] args) {
		//  Write a Java program to check if a file 
		// or directory has read and write permission

		File ls = new File("./src");
		System.out.println(ls.canRead() && ls.canWrite());
	}
}
