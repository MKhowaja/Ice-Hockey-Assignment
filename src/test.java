import java.util.Scanner;


public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String folder;
		Scanner in = new Scanner(System.in);
		folder = in.nextLine();
		if (folder.substring(folder.length()-1).equals("\\"))
			System.out.println("folder");

	}

}
