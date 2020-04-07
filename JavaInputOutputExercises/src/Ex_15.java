import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex_15 {

	public static void main(String[] args) throws IOException {
		// Write a Java program to write 
		// and read a plain text file
		File ls = new File("./src/test2.txt");
		FileWriter write = new FileWriter(ls);
		write.write("This is also a Testfile\nThis is a new Line\n");
		write.close();
		Scanner sc = new Scanner(ls);
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
}
