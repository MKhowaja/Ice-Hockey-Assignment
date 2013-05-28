import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
Note: this class is incomplete.
 */

public class final_main {
	/**
	 * Loads the data of a team from a textfile to this object
	 * @param String filepath
	 * @author MK, AV, CH, PJ
	 * @throws IOException 
	 */
	public static Team loadTeam(String filepath) throws IOException {
		String x;
		FileReader fr = new FileReader(filepath);
		BufferedReader br = new BufferedReader(fr);
		Team temp;

		String name; //Name of team (Documenting required)
		String division;
		String conference;
		double payroll;  //How much the team is paying its players currently for the season (in millions)
		int gpT; //Games played
		int winsT; //Games won
		int losesT; //Games lost
		int goalsFor; //Total goals scored (including power-play, short-handed and empty-net goals)
		int goalsAgainst; //Total goals scored against (including power-play, short-handed and empty-net goals)
		int ppo; //Number of power play opportunities
		int tsh; //Number of times short handed
		int ppGoalsT; //Total number of powerplay goals
		int shGoals; //Total number of shorthanded goals
		int ppGoalsA; //Total number of powerplay goals against
		int shGoalsA; //Total number of shorthanded goals against
		int shotsFor; //Total shots
		int shotsAgainst; //Total shots against
		int savesT; //Total saves

		x = br.readLine();
		name = x.substring(x.indexOf(": ")+2,x.length());

		x = br.readLine();
		division = x.substring(x.indexOf(": ")+2,x.length());

		x = br.readLine();
		conference = x.substring(x.indexOf(": ")+2,x.length());

		x = br.readLine();
		payroll = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		gpT = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		winsT = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		losesT = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		goalsFor = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		goalsAgainst = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		ppo = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		tsh  = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		ppGoalsT = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		shGoals = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		ppGoalsA = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		shGoalsA = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		shotsFor = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		shotsAgainst = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		savesT = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		temp = new Team(name, division, conference, payroll, gpT,
				winsT, losesT, goalsFor, goalsAgainst, ppo,
				tsh, ppGoalsT, shGoals, ppGoalsA, shGoalsA,
				shotsFor, shotsAgainst, savesT);

		return temp;
	}

	/**
	 * Loads the data from a text file onto an object of type person in the program
	 * Note: keep files with coaches and files with players separate
	 * @param String filepath
	 * @param number number of players to load into array
	 * @author MK, AV, CH, PJ
	 */
	public static Person[] playerLoad(String file, int number) throws IOException{
		String x;
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String classType;
		Person person[] = new Person[number];

		//loads person fields into the object
		for (int i = 0;i<number;i++) {
			x = br.readLine();
			classType = x.substring(x.indexOf(": ")+2,x.length());

			if (classType.equals("assistant"))
				person[i] = new assistant(null, null, false, 0, 0, 0, 0, 0, 0, 0);
			else if (classType.equals("goaltender"))
				person[i] = new goaltender(null, null, false, 0, 0, 0, 0, 0, 0, 0);
			else if (classType.equals("head"))
				person[i] = new head(null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
			else if (classType.equals("trainer"))
				person[i] = new trainer(null, null, false, 0, 0, 0, 0, 0, 0, 0);
			else if (classType.equals("forward"))
				person[i] = new Forward(null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, 0, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
			else if (classType.equals("defense"))
				person[i] = new Defense(null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, 0, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
			else
				person[i] = new Goalie(null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, 0, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

			x = br.readLine();
			person[i].fname = x.substring(x.indexOf(": ")+2,x.length());

			x = br.readLine();
			person[i].lname = x.substring(x.indexOf(": ")+2,x.length());

			x = br.readLine();
			person[i].age = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

			x = br.readLine();
			x = x.substring(x.indexOf(": ")+2,x.length());
			if (x.equals("male"))
				person[i].gender = true;
			else
				person[i].gender = false;

			x = br.readLine();
			person[i].height = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

			x = br.readLine();
			person[i].weight = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

			x = br.readLine();
			person[i].birthMonth = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

			x = br.readLine();
			person[i].birthDay = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

			x = br.readLine();
			person[i].birthYear = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

			x = br.readLine();
			person[i].birthPlace = Person.convertBirthPlaceToInt(x.substring(x.indexOf(": ")+2,x.length()));

			x = br.readLine();
			person[i].maritalStatus = Person.convertMaritalStatusToInt(x.substring(x.indexOf(": ")+2,x.length()));

			if (classType.equals("head")) {
				//loads coach fields into the object

				x = br.readLine();
				((head)person[i]).winS = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((head)person[i]).loseS = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((head)person[i]).gameCS = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((head)person[i]).pointPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((head)person[i]).winP = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((head)person[i]).loseP = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((head)person[i]).gameCP = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((head)person[i]).stanleyN = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
			}
			else if (classType.equals("forward")||classType.equals("defense")||classType.equals("goalie")) {
				//load player fields into object
				x = br.readLine();
				((Player)person[i]).salaryPY = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Player)person[i]).contractR = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Player)person[i]).tSalary = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Player)person[i]).rating = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Player)person[i]).gp = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Player)person[i]).penaltyT = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Player)person[i]).penaltyN = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				x = x.substring(x.indexOf(": ")+2,x.length());
				if (x.equals("right arm"))
					((Player)person[i]).arm = true;
				else
					((Player)person[i]).arm = false;

				x = br.readLine();
				((Player)person[i]).number = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Player)person[i]).numMin = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				x = x.substring(x.indexOf(": ")+2,x.length());
				if (x.equals("true")) 
					((Player)person[i]).rookie = true;
				else
					((Player)person[i]).rookie = false;

				if (classType.equals("forward")) {
					//load forward fields into object
					x = br.readLine();
					((Forward)person[i]).plusMinus = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Forward)person[i]).avgGoalsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Forward)person[i]).avgGoalPercentagePS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Forward)person[i]).avgShotsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Forward)person[i]).zsGoalPercentage = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Forward)person[i]).avgAssistsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Forward)person[i]).avgPenaltyPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Forward)person[i]).avgPPGoalsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Forward)person[i]).avgSOGoalsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Forward)person[i]).avgNShifts = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Forward)person[i]).gwGoals = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Forward)person[i]).ppGoals = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Forward)person[i]).soGoals = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Forward)person[i]).otGoals = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Forward)person[i]).points = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Forward)person[i]).faceoffPercentage = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Forward)person[i]).shootPercentage = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
				}
				else if (classType.equals("defense")) {
					//load defense fields into object
					x = br.readLine();
					((Defense)person[i]).plusMinus = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Defense)person[i]).avgGoalsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Defense)person[i]).avgGoalPercentagePS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Defense)person[i]).avgShotsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Defense)person[i]).zsGoalPercentage = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Defense)person[i]).avgAssistsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Defense)person[i]).avgPenaltyPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Defense)person[i]).avgPPGoalsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Defense)person[i]).avgSOGoalsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Defense)person[i]).avgNShifts = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Defense)person[i]).gwGoals = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Defense)person[i]).ppGoals = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Defense)person[i]).soGoals = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Defense)person[i]).otGoals = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Defense)person[i]).points = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Defense)person[i]).faceoffPercentage = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Defense)person[i]).shootPercentage = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
				}
				else {
					//load goalie fields into object
					x = br.readLine();
					((Goalie)person[i]).wins = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Goalie)person[i]).loses = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Goalie)person[i]).winsP = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Goalie)person[i]).losesP = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Goalie)person[i]).losesOT = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Goalie)person[i]).gameStart = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Goalie)person[i]).goalA = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Goalie)person[i]).shotsOG = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Goalie)person[i]).saves = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Goalie)person[i]).savePercent = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Goalie)person[i]).shutouts = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

					x = br.readLine();
					((Goalie)person[i]).emptyNG = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				}	
			}
			x = br.readLine();//skips the space between each player
		}
		br.close();
		fr.close();
		return person;
	}

	/**
	 * Saves the data of a Person object onto a text file
	 * @param String filepath
	 * @param Object of type person
	 * @author MK, AV, CH, PJ
	 */
	public static void playerSave(String file, Person p) throws IOException {
		FileWriter fw = new FileWriter(file);    //FileWriter 
		PrintWriter pw = new PrintWriter (fw);     //PrintWriter
		String temp;

		if (p instanceof Coach) {
			if (p instanceof head)
				temp = "head";
			else if (p instanceof assistant)
				temp = "assistant";
			else if (p instanceof goaltender)
				temp = "goaltender";
			else
				temp = "trainer";
			pw.println("Coach type: "+temp);
		}
		else if (p instanceof Forward)
			pw.println("Position: forward");
		else if (p instanceof Defense)
			pw.println("Position: defense");
		else 
			pw.println("Position: goalie");

		//Writes all person fields onto text file
		pw.println("First name: "+p.getFName());
		pw.println("Last name: "+p.getLName());
		pw.println("Age: "+p.getAge());
		if (p.getGender()==true)
			pw.println("Gender: male");
		else
			pw.println("Gender: female");
		pw.println("Height: "+p.getHeight());
		pw.println("Weight: "+p.getWeight());
		pw.println("Birth month: "+p.getBirthMonth());
		pw.println("Birth day: "+p.getBirthDay());
		pw.println("Birth year: "+p.getBirthYear());
		pw.println("Birth place: "+Person.convertBirthPlaceToString(p.getBirthPlace()));
		pw.println("Marital status: "+Person.convertMaritalStatusToString(p.getMaritalStatus()));

		if (p instanceof head){
			//Writes all the fields that coach has onto text file
			pw.println("Season wins: "+((head) p).getWinS());
			pw.println("Season losses: "+((head) p).getloseS());
			pw.println("Season games coached: "+((head) p).getGameCS());
			pw.println("Points percentage: "+((head) p).getPointPS());
			pw.println("Playoff wins: "+((head) p).getWinP());
			pw.println("Playoff losses: "+((head) p).getLoseP());
			pw.println("Playoff games coached: "+((head) p).getGameCP());
			pw.println("Number of Stanley Cups won: "+((head) p).getStanleyN());
			pw.println("Total Games Coached: "+((head) p).gettotalGamesCoached());
		}
		else if ((p instanceof Forward) || (p instanceof Defense) || (p instanceof Goalie)){
			//Writes all the player fields onto text file
			pw.println("Salary per year: "+((Player) p).getSalaryPY());
			pw.println("Number of years remaining in contract: "+((Player) p).getcontractR());
			pw.println("Total salary over entire contract length: "+((Player) p).getTSalary());
			pw.println("Rating: "+((Player) p).getRating());
			pw.println("Games played: "+((Player) p).getGP());
			pw.println("Time spent in penalties: "+((Player) p).getPenaltyT());
			pw.println("Number of penalties: "+((Player) p).getPenaltyN());
			if (((Player)p).getArm()==true){
				pw.println("Arm: right arm");
			}
			else{
				pw.println("Arm: left arm");
			}
			pw.println("Jersey number: "+((Player) p).getNumber());
			pw.println("Total number of minutes on ice: "+((Player) p).getNumMin());
			pw.println("Rookie: "+((Player)p).getRookie());


			if (p instanceof Forward) { 
				//writes all forward fields onto text file
				pw.println("Plus/Minus: "+((Forward) p).getplusMinus());
				pw.println("Average goals per season: "+((Forward) p).getavgGoalsPS());
				pw.println("Average goal percentage per season: "+((Forward) p).getavgGoalPercentagePS());
				pw.println("Average shots taken per season: "+((Forward) p).getavgShotsPS());
				pw.println("Z-score of goal percentage: "+((Forward) p).getzsGoalPercentage());
				pw.println("Average assists per season: "+((Forward) p).getavgAssistsPS());
				pw.println("Average penalty minutes per season: "+((Forward) p).getavgPenaltyPS());
				pw.println("Average power play goals per season: "+((Forward) p).getavgPPGoalsPS());
				pw.println("Average shoot-out goals per season: "+((Forward) p).getavgSOGoalsPS());
				pw.println("Average number of shifts per game: "+((Forward) p).getAvgNShifts());
				pw.println("Number of game-winning goals: "+((Forward) p).getGWGoals());
				pw.println("Number of power play goals: "+((Forward) p).getPPGoals());
				pw.println("Number of shootout goals: "+((Forward) p).getSOGoals());
				pw.println("Number of overtime goals: "+((Forward) p).getOTGoals());
				pw.println("Points: "+((Forward) p).getPoints());
				pw.println("Faceoff win percentage: "+((Forward) p).getFaceoffPercentage());
				pw.println("Shooting percentage: "+((Forward) p).getShootPercentage());
			}
			else if (p instanceof Defense){
				//Writes all the fields that defense has onto text file	
				pw.println("Plus/Minus: "+((Defense) p).getplusMinus());
				pw.println("Average goals per season: "+((Defense) p).getavgGoalsPS());
				pw.println("Average goal percentage per season: "+((Defense) p).getavgGoalPercentagePS());
				pw.println("Average shots taken per season: "+((Defense) p).getavgShotsPS());
				pw.println("Z-score of goal percentage: "+((Defense) p).getzsGoalPercentage());
				pw.println("Average assists per season: "+((Defense) p).getavgAssistsPS());
				pw.println("Average penalty minutes per season: "+((Defense) p).getavgPenaltyPS());
				pw.println("Average power play goals per season: "+((Defense) p).getavgPPGoalsPS());
				pw.println("Average shoot-out goals per season: "+((Defense) p).getavgSOGoalsPS());
				pw.println("Average number of shifts per game: "+((Defense) p).getAvgNShifts());
				pw.println("Number of game-winning goals: "+((Defense) p).getGWGoals());
				pw.println("Number of power play goals: "+((Defense) p).getPPGoals());
				pw.println("Number of shootout goals: "+((Defense) p).getSOGoals());
				pw.println("Number of overtime goals: "+((Defense) p).getOTGoals());
				pw.println("Points: "+((Defense) p).getPoints());
				pw.println("Faceoff win percentage: "+((Defense) p).getFaceoffPercentage());
				pw.println("Shooting percentage: "+((Defense) p).getShootPercentage());
			}
			else if (p instanceof Goalie){
				//Writes all the fields that goalie has onto text file
				pw.println("Wins: "+((Goalie) p).getWins());
				pw.println("Losses: "+((Goalie) p).getLoses());
				pw.println("Number of wins during playoffs: "+((Goalie) p).getWinsP());
				pw.println("Number of losses during playoffs: "+((Goalie) p).getLosesP());
				pw.println("Number of losses during overtime: "+((Goalie) p).getLosesOT());
				pw.println("Bumber of games started: "+((Goalie) p).getGameStart());
				pw.println("Number of goals scored against: "+((Goalie) p).getGoalA());
				pw.println("Total number of shots on goal the goalie faced: "+((Goalie) p).getShotsOG());
				pw.println("Bymber of saves goalie made: "+((Goalie) p).getSaves());
				pw.println("Percentage of total shots faced the goalie saved: "+((Goalie) p).getSavePercent());
				pw.println("Number of games where goalie had no goals aginst him/her and only goalie to play in game: "+((Goalie) p).getShutouts());
				pw.println("Number of goals scored against while off ice: "+((Goalie) p).getEmptyNG());
			}
		}	
		fw.close();
		pw.close();
	}

	public static void main(String []args) throws IOException {
		Scanner in = new Scanner(System.in);
		String filepath;

		int c = 0; //Tracks the index of the person in being added into the array
		int option; //Specifies the option that the user selects from the menu
		int playerNum = 0; //Specifies the number of player the user wants to enter for a team
		String playerType;

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
		int birthPlace; //City, Province/State of birth; Province/State in short notation
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



		Team[] team = new Team[2];
		for ( int i = 0; i<team.length;i++) {
			do {
				System.out.println("For Team 1");
				System.out.println("1 - Prompt for team details. ");
				System.out.println("2 - Load team details. ");
				System.out.println("Select an option: ");
				option = in.nextInt();
				if (option == 1) {
					//Prompts for team stats


					team[i] = new Team(name, division, conference, payroll, gpT,
							winsT, losesT, goalsFor, goalsAgainst, ppo,
							tsh, ppGoalsT, shGoals, ppGoalsA, shGoalsA,
							shotsFor, shotsAgainst, savesT);
				}
				else if (option == 2) {
					//loads from text file
					System.out.println("Enter location of the text file you want to load from: ");
					filepath = in.next();
					team[i] = loadTeam(filepath);
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
						numMin=in.nextDouble());
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
							team[j].getPlayers()[j]=new Forward(fname, lname, gender, height, weight, month, day, year, place, mStatus,//person fields
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
		//next step (save?)


	}
}

