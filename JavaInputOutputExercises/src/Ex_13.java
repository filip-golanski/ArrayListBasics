import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_13 {

	public static void main(String[] args) throws FileNotFoundException {
		//  Write a java program to read a file 
		// line by line and store it into a variable
		File ls = new File("./src/Ex_13.java");
		Scanner sc = new Scanner(ls);
		String variable = "";	// meckert, weil unbenutzt
		while(sc.hasNextLine())
		{
			variable += sc.nextLine();
		}
		sc.close();
	}
}
