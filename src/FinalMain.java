import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class FinalMain {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new FileReader("J:\\Mustaqeem\\Grade 12\\Computer Science\\Resources\\file"));
		
		String filepath;
		int i = 1; //counter
		int option; //Specifies the option that the user selects from the menu
		
		League league = new League ();
		Team team;
		do {
			System.out.println("For Team " + i);
			System.out.println("1 - Manually enter Team");
			System.out.println("2 - Load Team from text file");
			System.out.println("3 - Exit");
			System.out.println("Select an option: ");
			option = in.nextInt();
			if (option == 1) {
				//Prompts for team stats
				team = methods.promptforTeam();
				league.addTeam(team);
				i++;
			}
			else if (option == 2) {
				//loads from text file
				System.out.println("Enter location of the text file you want to load from: ");
				filepath = in.next();
				team = methods.loadTeam("J:\\Mustaqeem\\Grade 12\\Computer Science\\Resources\\file", br);
				league.addTeam(team);
				i++;
			}
			else
				System.out.println("Invalid option.");
		}while (option!=3);
	}
}
