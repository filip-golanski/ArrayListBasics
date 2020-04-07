import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_14 {

	public static void main(String[] args) throws FileNotFoundException {
		//  Write a Java program to store text
		// file content line by line into an array

		File ls = new File("./src/test.txt");
		Scanner sc = new Scanner(ls);
		String[] array = new String[100];
		int counter = 0;
		while(sc.hasNextLine())
		{
			array[counter] = sc.nextLine();
			counter++;
		}
		sc.close();
	}
}
