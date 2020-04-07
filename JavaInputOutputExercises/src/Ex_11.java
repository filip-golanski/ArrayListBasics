import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex_11 {

	public static void main(String[] args) throws IOException {
		//  Write a Java program to read
		// a file content line by line

		File ls = new File("./src/Ex_11.java");
		Scanner sc = new Scanner(ls);
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
}
