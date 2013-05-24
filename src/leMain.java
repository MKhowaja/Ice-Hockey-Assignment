import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
Note: this class is incomplete.
*/

public class leMain {
	/**
	 * Loads the data from a text file onto an object of type person in the program
	 * @param String filepath
	 * @param Object of type person, Note: this object must be initialized already
	 * @author MK, AV, CH, PJ
	 */
	public static void playerLoad(String file, Person person) throws IOException{
		String x;
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String classType;
		
		//loads person fields into the object
		x = br.readLine();
		classType = x.substring(x.indexOf(": ")+2,x.length());
		
		if (classType.equals("coach")) {
			x = br.readLine();
			((Coach)person).coachType = Coach.convertCoachTypeToInt(x.substring(x.indexOf(": ")+2,x.length()));
		}
			
		x = br.readLine();
		person.fname = x.substring(x.indexOf(": ")+2,x.length());
		
		x = br.readLine();
		person.lname = x.substring(x.indexOf(": ")+2,x.length());
		
		x = br.readLine();
		person.age = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
		
		x = br.readLine();
		x = x.substring(x.indexOf(": ")+2,x.length());
		if (x.equals("male"))
			person.gender = true;
		else
			person.gender = false;
		
		x = br.readLine();
		person.height = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
		
		x = br.readLine();
		person.weight = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
		
		x = br.readLine();
		person.birthMonth = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
		
		x = br.readLine();
		person.birthDay = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
		
		x = br.readLine();
		person.birthYear = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
		
		x = br.readLine();
		person.birthPlace = Person.convertBirthPlaceToInt(x.substring(x.indexOf(": ")+2,x.length()));
		
		x = br.readLine();
		person.maritalStatus = Person.convertMaritalStatusToInt(x.substring(x.indexOf(": ")+2,x.length()));
		
		if (classType.equals("coach")) {
			//loads coach fields into the object
			x = br.readLine();
			((Coach)person).winS = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
			
			x = br.readLine();
			((Coach)person).loseS = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
			
			x = br.readLine();
			((Coach)person).gameCS = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
			
			x = br.readLine();
			((Coach)person).pointPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
			
			x = br.readLine();
			((Coach)person).winP = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
			
			x = br.readLine();
			((Coach)person).loseP = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
			
			x = br.readLine();
			((Coach)person).gameCP = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
			
			x = br.readLine();
			((Coach)person).stanleyN = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
		}
		else if (classType.equals("forward")||classType.equals("defense")||classType.equals("goalie")) {
			//load player fields into object
			x = br.readLine();
			((Player)person).salaryPY = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
			
			x = br.readLine();
			((Player)person).contractR = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
			
			x = br.readLine();
			((Player)person).tSalary = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
			
			x = br.readLine();
			((Player)person).rating = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
			
			x = br.readLine();
			((Player)person).gp = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
			
			x = br.readLine();
			((Player)person).penaltyT = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
			
			x = br.readLine();
			((Player)person).penaltyN = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
			
			x = br.readLine();
			x = x.substring(x.indexOf(": ")+2,x.length());
			if (x.equals("right arm"))
				((Player)person).arm = true;
			else
				((Player)person).arm = false;
			
			x = br.readLine();
			((Player)person).number = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
			
			x = br.readLine();
			((Player)person).numMin = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
			
			x = br.readLine();
			x = x.substring(x.indexOf(": ")+2,x.length());
			if (x.equals("true")) 
				((Player)person).rookie = true;
			else
				((Player)person).rookie = false;
			
			x = br.readLine();
			((Player)person).penaltyMinor = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
			
			x = br.readLine();
			((Player)person).penaltyMajor = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
			
			x = br.readLine();
			((Player)person).penaltyMisc = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
			
			x = br.readLine();
			((Player)person).penaltyGMisc = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
			
			x = br.readLine();
			((Player)person).match = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
			
			if (classType.equals("forward")) {
				//load forward fields into object
				x = br.readLine();
				((Forward)person).plusMinus = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Forward)person).avgGoalsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Forward)person).avgGoalPercentagePS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Forward)person).avgShotsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Forward)person).zsGoalPercentage = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Forward)person).avgAssistsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Forward)person).avgPenaltyPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Forward)person).avgPPGoalsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Forward)person).avgSOGoalsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Forward)person).gwGoals = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Forward)person).ppGoals = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Forward)person).soGoals = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Forward)person).avgNShifts = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Forward)person).otGoals = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Forward)person).faceoffPercentage = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Forward)person).points = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Forward)person).shootPercentage = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
			}
			else if (classType.equals("defense")) {
				//load defense fields into object
				x = br.readLine();
				((Defense)person).plusMinus = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Defense)person).avgGoalsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Defense)person).avgGoalPercentagePS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Defense)person).avgShotsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Defense)person).zsGoalPercentage = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Defense)person).avgAssistsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Defense)person).avgPenaltyPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Defense)person).avgPPGoalsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Defense)person).avgSOGoalsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Defense)person).gwGoals = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Defense)person).ppGoals = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Defense)person).soGoals = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
			}
			else {
				//load goalie fields into object
				x = br.readLine();
				((Goalie)person).wins = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Goalie)person).loses = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Goalie)person).winsP = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Goalie)person).losesP = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Goalie)person).losesOT = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Goalie)person).gameStart = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Goalie)person).goalA = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Goalie)person).goalAA = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Goalie)person).shotsOG = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Goalie)person).saves = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Goalie)person).savePercent = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Goalie)person).shutouts = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((Goalie)person).emptyNG = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
			}			
		}
		br.close();
		fr.close();
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
		
		if (p instanceof Coach) {
			pw.println("Class: coach");
			pw.println("Coach type: "+(Coach.convertCoachTypeToString(((Coach)p).getcoachType())));
		}
		
		else if (p instanceof Forward)
			pw.println("Class: forward");
		else if (p instanceof Defense)
			pw.println("Class: defense");
		else 
			pw.println("Class: goalie");
		
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
		pw.println("BirthPlace: "+Person.convertBirthPlaceToString(p.getBirthPlace()));
		pw.println("Marital status: "+Person.convertMaritalStatusToString(p.getMaritalStatus()));

		if (p instanceof Coach){
			//Writes all the fields that coach has onto text file
			pw.println("Season wins: "+((Coach) p).getWinS());
			pw.println("Season losses: "+((Coach) p).getloseS());
			pw.println("Season games coached: "+((Coach) p).getGameCS());
			pw.println("Points percentage: "+((Coach) p).getPointPS());
			pw.println("Playoff wins: "+((Coach) p).getWinP());
			pw.println("Playoff losses: "+((Coach) p).getLoseP());
			pw.println("Playoff games coached: "+((Coach) p).getGameCP());
			pw.println("Number of Stanley Cups won: "+((Coach) p).getStanleyN());
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
			pw.println("Number of minor penalties: "+((Player) p).getPenaltyMinor());
			pw.println("Number of major penalties: "+((Player) p).getPenaltyMajor());
			pw.println("Number of misconduct penalties: "+((Player) p).getPenaltyMisc());
			pw.println("Number of game misconduct penalties: "+((Player) p).getPenaltyGMisc());
			pw.println("Match penalties: "+((Player) p).getMatch());
			
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
				pw.println("Number of game-winning goals: "+((Forward) p).getGWGoals());
				pw.println("Number of power play goals: "+((Forward) p).getPPGoals());
				pw.println("Number of shootout goals: "+((Forward) p).getSOGoals());
				pw.println("Average number of shifts per game: "+((Forward) p).getAvgNShifts());
				pw.println("Number of overtime goals: "+((Forward) p).getOTGoals());
				pw.println("Faceoff win percentage: "+((Forward) p).getFaceoffPercentage());
				pw.println("Points: "+((Forward) p).getPoints());
				pw.println("Shooting percentage: "+((Forward) p).getShootPercentage());
			}
			else if (p instanceof Defense){
				//Writes all the fields that defense has onto text file	
				pw.println("Plus/Minus: "+((Defense) p).getplusMinus());
				pw.println("Average goals per season: "+((Defense) p).getavgGoalsPS());
				pw.println("Average goal percentage per season: "+((Defense) p).getavgGoalPercentagePS());
				pw.println("Average shots taken per season: "+((Defense) p).getavgShotsPS());
				pw.println("Z=score of goal percentage: "+((Defense) p).getzsGoalPercentage());
				pw.println("Average assists per season: "+((Defense) p).getavgAssistsPS());
				pw.println("Average penalty minutes per season: "+((Defense) p).getavgPenaltyPS());
				pw.println("Average power play goals per season: "+((Defense) p).getavgPPGoalsPS());
				pw.println("Average shoot-out goals per season: "+((Defense) p).getavgSOGoalsPS());
				pw.println("Number of game-winning goals: "+((Defense) p).getGWGoals());
				pw.println("Number of power play goals: "+((Defense) p).getPPGoals());
				pw.println("Number of shootout goals: "+((Defense) p).getSOGoals());
				pw.println("Average number of shifts per game: "+((Defense) p).getAvgNShifts());
				pw.println("Number of overtime goals: "+((Defense) p).getOTGoals());
				pw.println("Faceoff win percentage: "+((Defense) p).getFaceoffPercentage());
				pw.println("Points: "+((Defense) p).getPoints());
			}
			else if (p instanceof Goalie){
				//Writes all the fields that goalie has onto text file
				pw.println("Wins: "+((Goalie) p).getWins());
				pw.println("Losses: "+((Goalie) p).getLoses());
				pw.println("Number of wins during playoffs: "+((Goalie) p).getWinsP());
				pw.println("Number of losses during playoffs: "+((Goalie) p).getLosesP());
				pw.println("Number of losses during overtime: "+((Goalie) p).getLosesOT());
				pw.println("Bumber of games started: "+((Goalie) p).getGameStart());
				pw.println("Number of goals scored against: "+((Goalie) p).getGameStart());
				pw.println("Mean goals scored against goalie: "+((Goalie) p).getGoalA());
				pw.println("Mean goals per 60 minutes scored on the goalie: "+((Goalie) p).getgoalAA());
				pw.println("Total number of shots on goal the goalie faced: "+((Goalie) p).getShotsOG());
				pw.println("Bymber of saves goalie made: "+((Goalie) p).getSaves());
				pw.println("Percentage of total shots faced the goalie saved: "+((Goalie) p).getSavePercent());
				pw.println("Number of games where goalie had no goals aginst him/her and only goalie to play in game: "+((Goalie) p).getShutouts());
				pw.println("Number of goals scored against while off ice for extra attack player: "+((Goalie) p).getEmptyNG());
			}
		}	
		fw.close();
		pw.close();
	}
	
	public static void main(String []args) {
	  	Scanner in = new Scanner(System.in);
	  
		int c = 0; //Tracks the index of the person in being added into the array
		int option; //Specifies the option that the user selects from the menu
		int playerNum; //Specifies the number of player the user wants to enter for a team
		String personType;
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
		String birthPlace; //City, Province/State of birth; Province/State in short notation
		String martialStatus; //Single, Married, Divorced, Widowed etc.

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
		int gwGoals; //Number of game-winning goals
		int ppGoals; //Number of power play goals
		int soGoals; //Number of shoot-out goals
		
		//Temporary fields for team
		String name; //Name of team (Documenting required)
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

		for (int t=0; t<2; t++){
			System.out.println("For team "+(t+1)+" enter data.");
			
			//Prompts for team stats
			do{
				System.out.print("Enter team "+(t+1)+"'s name: ");
				name=in.nextLine();
			}while (name.equals("")&&name.equals("")); //Ensures that something is entered
			
			do{
				System.out.print("Enter "+name+"'s payroll for players: ");
				payroll=in.nextDouble();
			}while (payroll<0); //Ensures the payroll for the players isn't negative
			
			do{
				System.out.print("Enter the number of games the "+name+" played: ");
				gpT=in.nextInt();
			}while(gpT<0); //Ensures the number of games played is above zero (valid)
			
			do{
				System.out.print("Enter the number of games the "+name+" won: ");
				winsT=in.nextInt();
			}while(winsT<0); //Ensures the number of games won is above zero (valid)
			
			do{
				System.out.print("Enter the number of games the "+name+" lost: ");
				losesT=in.nextInt();
			}while(losesT<0); //Ensures the number of games lost is above zero (valid)
			
			do{
				System.out.print("Enter the total number of goals the "+name+" scored (including power-play, short-handed and empty-net goals): ");
				goalsFor=in.nextInt();
			}while(goalsFor<0); //Ensures the total goals scored is above zero (valid)
			
			do{
				System.out.print("Enter the total goals scored against the "+name+" (including power-play, short-handed and empty-net goals): ");
				goalsAgainst=in.nextInt();
			}while(goalsAgainst<0); //Ensures the total goals scored against is above zero (valid)
			
			do{
				System.out.print("Enter the number of power-play opportunities that the "+name+" have: ");
				ppo=in.nextInt();
			}while(ppo<0); //Ensures the number of power-play opportunities is above zero (valid)
			
			do{
				System.out.print("Enter the number of times the "+name+" were short-handed: ");
				tsh=in.nextInt();
			}while(tsh<0); //Ensures the number of times short-handed is above zero (valid)
			
			do{
				System.out.print("Enter the total number of power-play goals the "+name+" have: ");
				ppGoalsT=in.nextInt();
			}while(ppGoalsT<0); //Ensures the total number of power-play goals is above zero (valid)
			
			do{
				System.out.print("Enter the total number of short-handed goals the "+name+" have: ");
				shGoals=in.nextInt();
			}while(shGoals<0); //Ensures the total number of short-handed goals is above zero (valid)
			
			do{
				System.out.print("Enter the total number of power-play goals aganist the "+name+": ");
				ppGoalsA=in.nextInt();
			}while(ppGoalsA<0); //Ensures the total number of power-play goals against is above zero (valid)
			
			do{
				System.out.print("Enter the total number of short-handed goals against the "+name+": ");
				shGoalsA=in.nextInt();
			}while(shGoalsA<0); //Ensures the total number of short-handed goals against is above zero (valid)
			
			do{
				System.out.print("Enter the total number of shots on the "+name+"'s goal: "); //More info needed
				shotsFor=in.nextInt();
			}while(shotsFor<0); //Ensures the total shots on goal is above zero (valid)
			
			do{
				System.out.print("Enter the total number of shots against the "+name+": ");
				shotsAgainst=in.nextInt();
			}while(shotsAgainst<0); //Ensures the total shots against is above zero (valid)
			
			do{
				System.out.print("Enter the total number of saves for the "+name+": ");
				savesT=in.nextInt();
			}while(savesT<0); //Ensures the total saves is above zero (valid)
			
			do{
				System.out.print("\nEnter the amount players you want to enter for the "+name+": ");
				playerNum=in.nextInt();
			}while (playerNum<0 || playerNum>23); //Ensures the amount of players is a valid amount players that can be on a team
			
			for (int p=0; p<playerNum; p++){
				do {
					System.out.println("\nFor player "+(p+1)+" enter the statistics.");
					do {
						//outputs menu and prompts for an option
						System.out.println("1 - Enter statistics.");
						System.out.println("2 - Save data."); //saves a full object
						System.out.println("3 - Load data."); //loads an empty object with data
						System.out.println("4 - Exit entering, saving and loading statistics for player "+(p+1)+".");
						System.out.print("Select an option: ");
						option = in.nextInt();
					} while (option < 0 || option > 4);
					if (option == 1) {				
						//Prompt for all person fields
						do {
							System.out.print("Enter first name: ");
							fname = in.nextLine();
							in.nextLine();
							System.out.print("Enter last name: ");
							lname = in.nextLine();
							in.nextLine();
						} while (fname.equals("")&&lname.equals("")); //Ensures that something is entered

						do {
							System.out.print("Enter age: ");
							age = in.nextInt();
						} while (age <= 0); //Ensures age is greater than 0

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
							birthPlace = in.next();
						} while (Integer.parseInt(birthPlace) <= 0 || Integer.parseInt(birthPlace) > 21); //Ensures birth place selection is in the list
						
						do {
							System.out.print("Enter martial status based on list: "); //Show list
							martialStatus = in.next();
						} while (Integer.parseInt(martialStatus) <= 0 || Integer.parseInt(martialStatus) > 21); //Ensures martial status selection is in the list
						
						//prompt for coach/player
						do {
							System.out.print("Select whether person is a coach or player: ");
							personType = in.next();
							if (personType.equalsIgnoreCase("player")) {
								//prompt for player stuff
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
								
								System.out.print("Select whether player is forward, defence or goalie: ");
								playerType = in.next();
								if (playerType.equalsIgnoreCase("forward")||playerType.equalsIgnoreCase("defence")){
									do{
										System.out.print("Enter the number of game-winning goals: ");
										gwGoals=in.nextInt();
									}while (gwGoals<0); //Ensure the player doesn't have negative game-winning goals
									
									do{
										System.out.print("Enter the number of power-play goals: ");
										ppGoals=in.nextInt();
									}while (ppGoals<0); //Ensure the player doesn't have negative power-play goals
									
									do{
										System.out.print("Enter the number of shootout goals: ");
										soGoals=in.nextInt();
									}while (soGoals<0); //Ensure the player doesn't have negative shootout goals
									
								}else if (playerType.equalsIgnoreCase("goalie")){
									do{
										System.out.print("Enter the number of wins: ");
										wins=in.nextInt();
									}while (wins<0); //Ensures the number of wins is above zero (valid)
									
									do{
										System.out.print("Enter the number of loses: ");
										loses=in.nextInt();
									}while(loses<0); //Ensures the number of loses is above zero (valid)
									
									do{
										System.out.print("Enter the number of wins during playoffs: ");
										winsP=in.nextInt();
									}while(winsP<0); //Ensures the number of wins during playoffs is above zero (valid)
									
									do{
										System.out.print("Enter the number of loses during playoffs: ");
										losesP=in.nextInt();
									}while(losesP<0); //Ensures the number of loses during playoffs is above zero (valid)
									
									do{
										System.out.print("Enter the number of loses during overtime: ");
										losesOT=in.nextInt();
									}while(losesOT<0); //Ensures the number of loses during overtime is above zero (valid)
									
									do{
										System.out.print("Enter the number of games started: ");
										gameStart=in.nextInt();
									}while(gameStart<0); //Ensures the number of games started is above zero (valid)
									
									do{
										System.out.print("Enter the number of goals scored against: ");
										goalA=in.nextInt();
									}while(goalA<0); //Ensures the number of goals scored against is above zero (valid)
									
									do{
										System.out.print("Enter the total number of shots on goal: ");
										shotsOG=in.nextInt();
									}while(shotsOG<0); //Ensures the total number of shots on goal is above zero (valid)
									
									do{
										System.out.print("Enter the number of saves goalie made: ");
										saves=in.nextInt();
									}while(saves<0); //Ensures the number of saves goalie made is above zero (valid)
									
									do{
										System.out.print("Enter the number of games where goalie had no goals against him and only goalie to play in game: ");
										shutouts=in.nextInt();
									}while(shutouts<0); //Ensures the number of shutouts is above zero (valid)
									
									do{
										System.out.print("Enter the number of goals scored against while off ice for extra attack player: ");
										emptyNG=in.nextInt();
									}while(emptyNG<0); //Ensures the the number of empty net goals is above zero (valid)
								}
							}
							else if (personType.equalsIgnoreCase("coach")) {
								//prompt for coach fields
								do{
									System.out.print("Enter the coach's wins for the regular season: ");
									winS=in.nextInt();
								}while (winS<0); //Ensures the the coach doesn't have negative wins
								
								do{
									System.out.print("Enter the coach's loses for the regular season: ");
									loseS=in.nextInt();
								}while (loseS<0); //Ensures the the coach doesn't have negative loses
								
								do{
									System.out.print("Enter the coach's games coached for the regular season: ");
									gameCS=in.nextInt();
								}while (gameCS<0); //Ensures the the coach doesn't have negative games coached
								
								do{
									System.out.print("Enter the coach's wins for the playoffs: ");
									winP=in.nextInt();
								}while (winP<0); //Ensures the the coach doesn't have negative wins
								
								do{
									System.out.print("Enter the coach's loses for the playoffs: ");
									loseP=in.nextInt();
								}while (loseP<0); //Ensures the the coach doesn't have negative loses
								
								do{
									System.out.print("Enter the coach's games coached for the playoffs: ");
									gameCP=in.nextInt();
								}while (gameCP<0); //Ensures the the coach doesn't have negative games coached
								
								do{
									System.out.print("Enter the number of times the coach has won Stanley Cups: ");
									stanleyN=in.nextInt();
								}while (gameCP<0); //Ensures the the coach doesn't have negative number of times the coach wins Stanley Cups
								
								do {
									System.out.print("Enter the type of coach the coach is: "); //Show list
									coachType = in.nextInt();
								} while (coachType <= 0 || coachType > 3); //Ensures coach type selection is in the list
							} 
						} while (!personType.equalsIgnoreCase("player") && !personType.equalsIgnoreCase("coach"));
					}
					else if (option == 2) {
						
					}
					else if (option == 3) {

					}
					else {
						System.out.println("You are exiting the entering, saving and loading data part of the program for player "+(p+1)+".\n");
					}
				} while (option != 4);
			}
		}
	}
}
