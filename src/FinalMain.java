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
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String filepath;

		int c = 0; //Tracks the index of the person in being added into the array
		int option; //Specifies the option that the user selects from the menu
		int playerNum = 0; //Specifies the number of player the user wants to enter for a team
		String playerType; //Forward, Defense or Goalie
		int temp; //all purpose

		//Temporary fields for person
		String fname; //Name
		String lname;
		int age; //Age
		String tempGender;
		boolean gender; //True if male 
		double height; //Height in centimetres
		double weight; //Weight in kg
		int birthMonth; //Month of birth 
		int birthDay; //Day of birth
		int birthYear; //Year of birth
		int birthPlace; //City, Proince/State of birth; Province/State in short notation
		int martialStatus; //Single, Married, Divorced, Widowed etc.

		//Temporary fields for player
		double salaryPY; //Salary per year
		int contractR; //# of years remaining of contract 
		double tSalary; //Total salary over entire contract length
		int rating; //Temp for something awesome
		int gp; //Games played
		double penaltyT; //Time spent in penalties
		int penaltyN; //Number of penalties
		boolean arm; //Shooting arm: True if right arm
		String tempArm;
		int number; //Jersey number
		double numMin; //Total number of minutes the player has been on ice
		String temprookie;
		boolean rookie; //If the player is a rookie (true if he/she is)

		//Temporary fields for coach
		int winS; //Regular season wins
		int loseS; //Regular season loses
		int gameCS; //Regular season games coached
		int winP; //Playoff wins
		int loseP; //Playoff loses
		int gameCP; //Playoff games coached
		int stanleyN; //Number of Stanley Cups
		int coachType; //The type of coach (head, assistant or goaltender)

		//Temporary fields for goalie
		int wins; //Number of wins
		int loses; //Number of losses
		int winsP; //Number of wins during playoffs
		int losesP; //Number of loses during playoffs
		int losesOT; //Number of loses during overtime
		int gameStart; //The number of games started
		int goalA; //Number of goals scored against goalie
		int shotsOG; //Total number of shots on goal the goalie faced
		int saves; //Number of saves goalie made
		int shutouts; //Number of games where goalie had no goals against him and only goalie to play in game
		int emptyNG; //Number of goals scored against while off ice for extra attack player

		//Temporary fields for forward or defense
		int plusMinus; //Holds +/- for each player
		double avgGoalsPS; //Average goals per season
		double avgGoalPercentagePS; //Average goal percentage per season
		double avgShotsPS; //Average shots taken per season
		double zsGoalPercentage; //Z-score of goal percentage 
		double avgAssistsPS; //Average assists per season
		double avgPenaltyPS; //Average penalty minutes per season
		double avgPPGoalsPS; //Average power play goals per season (double)
		double avgSOGoalsPS; //Average shoot-out goals per season
		double avgNShifts; //Average number of shifts per game
		int gwGoals; //Number of game-winning goals
		int ppGoals; //Number of power play goals
		int soGoals; //Number of shoot-out goals
		int otGoals; //Number of overtime goals
		double points; //Points (Goals + Assists)
		double faceoffPercentage; //Face off win percentage
		double shootPercentage; //Shooting Percentage
		
		League league = new League ();
		
		System.out.println("Enter the number of teams: ");
		temp = in.nextInt();
		Team[] team = new Team[temp];
		
		for (int i = 0; i<team.length;i++) {
			do {
				System.out.println("For Team " + (i+1));
				System.out.println("1 - Manually enter Team");
				System.out.println("2 - Load Team from text file");
				System.out.println("Select an option: ");
				option = in.nextInt();
				if (option == 1) {
					//Prompts for team stats
					team[i] = methods.promptforTeam();
				}
				else if (option == 2) {
					//loads from text file
					System.out.println("Enter location of the text file you want to load from: ");
					filepath = in.next();
					team[i] = methods.loadTeam(filepath);
				}
				else
					System.out.println("Invalid option.");
			} while (option<1||option>2);
			//load players now
			do {
				System.out.println("1 - Manually enter players.");
				System.out.println("2 - Load players from text file.");
				System.out.println("Select an option: ");
				option = in.nextInt();
			} while( option < 1 || option > 2);

			if (option == 1) {	
				for (int j = 0;j<playerNum;j++) {
					//person fields
					do {
						System.out.print("Enter first name: ");
						fname = in.nextLine();
						in.nextLine();
						System.out.print("Enter last name: ");
						lname = in.nextLine();
						in.nextLine();
					} while (fname.equals("")&&lname.equals("")); //Ensures that something is entered

					do {
						System.out.print("Enter gender (m/f): ");
						tempGender = in.next();
					} while (!tempGender.equalsIgnoreCase("m") && !tempGender.equalsIgnoreCase("f"));
					if (tempGender.equalsIgnoreCase("m"))
						gender = true;
					else
						gender = false;

					do {
						System.out.print("Enter height: ");
						height = in.nextDouble();
					} while (height <= 0); //Ensures height is greater than 0

					do {
						System.out.print("Enter weight: ");
						weight = in.nextDouble();
					} while (weight <= 0); //Ensures weight is greater than 0

					do {
						System.out.print("Enter birth month: ");
						birthMonth = in.nextInt();
					} while (birthMonth <= 0 || birthMonth >12); //Ensures birth month is between January and Decemeber

					do {
						System.out.print("Enter birth day: ");
						birthDay = in.nextInt();
					} while (birthDay <= 0 || birthDay >31); //Ensures birth day is between 1 and 31

					do {
						System.out.print("Enter birth year: ");
						birthYear = in.nextInt();
					} while (birthYear <= 0); //Ensures birth month is greater than 0

					do {
						System.out.print("Enter birth place based on list: "); //Show list
						birthPlace = in.nextInt();
					} while (birthPlace <= 0 || birthPlace > 21); //Ensures birth place selection is in the list

					do {
						System.out.print("Enter martial status based on list: "); //Show list
						martialStatus = in.nextInt();
					} while (martialStatus <= 0 || martialStatus > 21); //Ensures martial status selection is in the list

					//player fields
					do{
						System.out.print("Enter the player's salary per year: ");
						salaryPY=in.nextDouble();
					}while (salaryPY<0); //Ensures the player does have a salary per year

					do{
						System.out.print("Enter the player's number of years remaining in the contract: ");
						contractR=in.nextInt();
					}while (contractR<0); //Ensures the player has number of years in the contract

					do{
						System.out.print("Enter the player's total salary over the entire contract: ");
						tSalary=in.nextDouble();
					}while (tSalary<0); //Ensures the player has number of years in the contract

					do{
						System.out.print("Enter the number of games the player has played: ");
						gp=in.nextInt();
					}while (gp<0); //Ensures the player has at least player 0 games

					do{
						System.out.print("Enter the time spent in penalty box for the player: ");
						penaltyT=in.nextDouble();
					}while (penaltyT<0); //Ensures the player has at least spent 0 seconds in the penalty box

					do{
						System.out.print("Enter the number times spent in the penalty box: ");
						penaltyN=in.nextInt();
					}while (penaltyN<0); //Ensures the player has at least been in the penalty box once

					do {
						System.out.print("Enter player's shooting arm (R/L): ");
						tempArm = in.next();
					} while (!tempArm.equalsIgnoreCase("R") && !tempArm.equalsIgnoreCase("L"));
					if (tempArm.equalsIgnoreCase("R"))
						arm=true;
					else
						arm=false;

					do{
						System.out.print("Enter the player's jersey number: ");
						number=in.nextInt();
					}while (number<0); //Ensures the player doesn't have a negative jersey number


					do{
						System.out.print("Enter the amount of time the player has been on the ice (in minutes): ");
						numMin=in.nextDouble();
					}while (numMin<0); //Ensures that time is positive

					do{
						System.out.print("Is the player a rookie? (Y/N)");
						temprookie = in.next();
					}while (!temprookie.equalsIgnoreCase("Y") && !temprookie.equalsIgnoreCase("N"));
					if (temprookie.equalsIgnoreCase("Y"))
						arm=true;
					else
						arm=false;
					//prompt for specific class fields
					do {
						System.out.println("1 - Forward");
						System.out.println("2 - Defense");
						System.out.println("3 - Goalie");
						System.out.println("Select the player's position: ");
						option = in.nextInt();
					} while (option < 1 || option > 3);

					if (option == 1 || option == 2) {
						//prompts for forward/defense fields



						if (option == 1)
							team[j].getPlayers()[j]=new Forward(fname, lname, gender, height, weight, month, day, year, place, maritalStatus,//person fields
									salaryPY, contractR, tSalary, rating, gp, penaltyT, penaltyN, arm, number, //player fields
									numMin, rookie, plusMinus, avgGoalsPS, double avgGoalPercentagePS, double avgShotsPS, double zsGoalPercentage, double avgAssistsPS, //forward fields
									avgPenaltyPS, avgPPGoalsPS, avgSOGoalsPS, avgNShifts, gwGoals, ppGoals, soGoals,//more forward fields
									int otGoals, faceoffPercentage, shootPercentage);
						else if (option == 2)
							team[j].getPlayers()[j]=new Defense();
					}
					else { //prompts for goalie fields

					}

				}

			}
			else if (option == 2) {
				System.out.println("Enter location of the text file that contains the players");
				filepath = in.next();
				team[i].putPlayers((Player[]) playerLoad(filepath,playerNum));
			}


		}

	}

}
