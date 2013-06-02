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
		BufferedReader br;
		
		String filepath;
		int i = 1; //counter
		int option; //Specifies the option that the user selects from the menu
		
		League league = new League ();
		//Team team; don't need this with new constructor?
		boolean menuRunning;
		
		//team
		menuRunning = true;
		do {
			System.out.println("Step 1: Enter team information");
			System.out.println("1 - Manually enter Team");
			System.out.println("2 - Load Team from text file");
			System.out.println("3 - Continue");//make sure at least 1 team is loaded before continuing
			System.out.println("Select an option: ");
			option = in.nextInt();
			if (option == 1) {
				//Prompts for team stats
				league.addTeam(new Team());
				i++;
			}
			else if (option == 2) {
				//loads from text file
				System.out.print("Enter location of the text file you want to load from: ");
				filepath = in.nextLine();
				br = new BufferedReader(new FileReader(filepath));
				league.addTeam(new Team(br));
				i++;
			}
			else if (option == 3) {//to avoid printing invalid
				if (i<1)
					System.out.println("Error - Information is required for at least 1 team.");
				else
					menuRunning = false;
			}
			else
				System.out.println("Invalid option.");
		} while (menuRunning);
		
		//players
		menuRunning = true;
		do {
			System.out.println("Step 1: Enter player information");
			System.out.println("1 - Manually enter players");
			System.out.println("2 - Load players from text file");
			System.out.println("3 - Continue");//make sure at least 1 team is loaded before continuing
			System.out.println("Select an option: ");
			option = in.nextInt();
			//blah blah
			
		} while (menuRunning);
		
		//coaches
		menuRunning = true;
		do {
			System.out.println("Step 1: Enter player information");
			System.out.println("1 - Manually enter players");
			System.out.println("2 - Load players from text file");
			System.out.println("3 - Continue");//make sure at least 1 team is loaded before continuing
			System.out.println("Select an option: ");
			option = in.nextInt();
			//blah blah
		} while (menuRunning);
		
		System.out.println("Enter location to save text file: ");
		filepath = in.next(); //implement do while try catch structure found in old code folder.
		//save stuff :) done!
		
		
		
	}
}