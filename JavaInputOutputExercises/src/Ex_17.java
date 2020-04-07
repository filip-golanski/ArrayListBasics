import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_17 {

	public static void main(String[] args) throws FileNotFoundException {
		// Write a Java program to read 
		// first 3 lines from a file
		File ls = new File("./src/test2.txt");
		Scanner sc = new Scanner(ls);
		int counter = 0;
		while(sc.hasNextLine() && counter<3)
		{
			System.out.println(sc.nextLine());
			counter++;
		}
		sc.close();
	}
}

