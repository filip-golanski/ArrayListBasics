import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_12 {

	public static void main(String[] args) throws FileNotFoundException {
		//  Write a Java program to read a plain text file.

		File ls = new File("./src/test.txt");
		Scanner sc = new Scanner(ls);
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
}
