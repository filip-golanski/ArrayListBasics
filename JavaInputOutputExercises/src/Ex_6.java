import java.io.File;

public class Ex_6 {

	public static void main(String[] args) {
		//  Write a Java program to compare 
		// two files lexicographically

		File ls1 = new File("./src");
		File ls2 = new File("./bin");
		if (ls1.getAbsolutePath().compareTo(ls2.getAbsolutePath()) > 0)
			System.out.println("\""+ls1.getAbsolutePath()+"\" follows \""+ls2.getAbsolutePath()+"\"");
		else
			System.out.println("\""+ls2.getAbsolutePath()+"\" follows \""+ls1.getAbsolutePath()+"\"");
			
	}
}
