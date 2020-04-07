import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex_16 {

	public static void main(String[] args) throws IOException {
		// Write a Java program to append 
		// text to an existing file
		File ls = new File("./src/test2.txt");
		FileWriter write = new FileWriter(ls,true); //append
		write.write("This is also a Testfile\nThis is a new Line");
		write.close();
	}
}