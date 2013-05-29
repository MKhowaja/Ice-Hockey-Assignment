import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;


public class trycatchtest {

	/**
	 * @param args
	 */
	//"G:\\Mustaqeem\\Grade 12\\Computer Science\\Resources\\file.txt"
	public static void main(String[] args) {
		Stack coaches = new Stack();
		Scanner in = new Scanner(System.in);
		String filepath;
		boolean fileFound;
		String x;
		BufferedReader br = null;
		do {
			System.out.println("Enter filepath: ");
			filepath = in.nextLine();
			try {
				br = new BufferedReader(new FileReader(filepath));
				fileFound = true;
			}
			catch (FileNotFoundException e) {
				fileFound = false;
				System.out.println("File not found.");
			}
		} while (fileFound == false);
		
		
		try {
			 do {
				 
				 
			 } while (br.readLine() != null);
		}
		catch (IOException e) {
			System.out.println("-explodes-");
		}
	}

}


