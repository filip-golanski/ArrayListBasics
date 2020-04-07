import java.io.File;

public class Ex_9 {

	public static void main(String[] args) {
		//  Write a Java program to get 
		// file size in bytes, kb, mb

		File ls = new File("./src/Ex_9.java");
		double size = ls.length();
		System.out.println(size+" Bytes");
		System.out.println(size/1000.0+" Kilobytes");
		System.out.println(size/1000000.0+" Megabytes");
	}
}
