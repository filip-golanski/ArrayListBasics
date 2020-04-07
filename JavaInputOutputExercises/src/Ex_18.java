import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_18 {

	public static void main(String[] args) throws FileNotFoundException {
		// Write a Java program to find
		// the longest word in a text file 
		File ls = new File("./src/test2.txt");
		Scanner sc = new Scanner(ls);
		String longest = "";
		String temp = "";
		while(sc.hasNext())
		{
			temp = sc.next();
			if (longest.length() < temp.length())
			{
				longest = temp;
			}
		}
		sc.close();
		System.out.println("Längstes Wort mit "+longest.length()+" Buchstaben:\n"+longest);
	}
}

