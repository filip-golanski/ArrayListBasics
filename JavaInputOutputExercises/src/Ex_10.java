import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex_10 {

	public static void main(String[] args) throws IOException {
		//  Write a Java program to read
		// contents from a file into a byte array

		File ls = new File("./src/Ex_10.java");
		FileReader reader = new FileReader(ls);
		byte[] array = new byte[(int)ls.length()];
		int number = reader.read();
		int counter = 0;
		while (number >=0)
		{
			array[counter] = (byte) number;
			counter++;
			number = reader.read();
		}
		reader.close();
		for (byte b : array) {
			System.out.println(b);
		}
	}
}
