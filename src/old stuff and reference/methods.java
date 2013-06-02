import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;


public class methods {
	/**
	 * Saves all statistics of team onto a text file
	 * @param t of type Team
	 * @param pw of type PrintWriter
	 */
	public static void saveTeam(Team t, PrintWriter pw){
		pw.println("TEAM NAME: "+t.getName());
		pw.println("Divisison: "+t.getDivision());
		pw.println("Conference: "+t.getConference());
		pw.println("Payroll: "+t.getPayroll());
		pw.println("Games Played: "+t.getGP());
		pw.println("Games Won: "+t.getWins());
		pw.println("Games Lost:"+t.getLosses());
		pw.println("Total Goals Scored: "+t.getGoalsfor());
		pw.println("Total Goals Scored Against: "+t.getGoalsagainst());
		pw.println("Number of Powerplay Opportunities: "+t.getPpo());
		pw.println("Number of Short Times Handed: "+t.getTsh());
		pw.println("Total Number of Powerplay Goals: "+t.getPpgoals());
		pw.println("Total Number of Shorthanded Goals: "+t.getShgoals());
		pw.println("Total Number of Powerplay Goals Against: "+t.getPpgoalsA());
		pw.println("Total number of Shorthanded Goals Against: "+t.getShgoalsA());
		pw.println("Total Shots: "+t.getShotsfor());
		pw.println("Total Shots Against: "+t.getShotsagainst());
		pw.println("Total Saves: "+t.getSaves());
	}
	
	/**
	 * Saves all statistics of a coach depending on what type of coach (head, assistant, trainer or goaltender) onto a text file
	 * @param c of type Coach
	 * @param pw of type PrintWriter
	 */
	public static void saveCoach(Coach c, PrintWriter pw){
		if (c instanceof head)
			pw.println("Coach type: Head");
		else if (c instanceof assistant)
			pw.println("Coach type: assistant");
		else if (c instanceof trainer)
			pw.println("Coach type: trainer");
		else if (c instanceof goaltender)
			pw.println("Coach type: goaltender");
		pw.println("First Name: "+c.getFName());
		pw.println("Last Name: "+c.getLName());
		pw.println("Age: "+c.getAge());
		pw.println("Gender: "+c.getGender());
		pw.println("Height: "+c.getHeight());
		pw.println("Weight: "+c.getWeight());
		pw.println("Month of Birth: "+c.getBirthMonth());
		pw.println("Day of Birth: "+c.getBirthDay());
		pw.println("Year of Birth: "+c.getBirthYear());
		pw.println("Birthplace: "+c.getBirthPlace());
		pw.println("Martial Status: "+c.getMaritalStatus());
		if (c instanceof head){
			//Writes all head fields onto a text file
			pw.println("Regular Season Wins: "+((head)c).getWinS());
			pw.println("Regular Season Loses: "+((head)c).getloseS());
			pw.println("Regular Season Ties: "+((head)c).getTieS());
			pw.println("Regular Season Overtime Loses: "+((head)c).getOvertimeLS());
			pw.println("Regular Season Games Coached: "+((head)c).getGameCS());
			pw.println("Season Points Percentage: "+((head)c).getPointPS());
			pw.println("Playoff Wins: "+((head)c).getWinP());
			pw.println("Playoff Loses: "+((head)c).getLoseP());
			pw.println("Playoff Games Coached: "+((head)c).getGameCP());
		}
	}
	
	/**
	 * Saves all statistics of a player depending on what type of player (forward, defense or goalie) onto a text file
	 * @param p of type Player
	 * @param pw of type PrintWriter
	 */
	public static void savePlayer(Player p, PrintWriter pw){ //i don't think fields are converted (ex. int to string)
		if (p instanceof Forward)
			pw.println("Player type: forward");
		else if (p instanceof Defense)
			pw.println("Player type: defense");
		else if (p instanceof Goalie)
			pw.println("Player type: goalie");
		pw.println("First Name: "+p.getFName());
		pw.println("Last Name: "+p.getLName());
		pw.println("Age: "+p.getAge());
		pw.println("Gender: "+p.getGender());
		pw.println("Height: "+p.getHeight());
		pw.println("Weight: "+p.getWeight());
		pw.println("Month of Birth: "+p.getBirthMonth());
		pw.println("Day of Birth: "+p.getBirthDay());
		pw.println("Year of Birth: "+p.getBirthYear());
		pw.println("Birthplace: "+p.getBirthPlace());
		pw.println("Martial Status: "+p.getMaritalStatus());
		pw.println("Salary per year: "+p.getSalaryPY());
		pw.println("Contract: "+p.getcontractR());
		pw.println("Total salary: "+p.getTSalary());
		pw.println("Rating: "+p.getRating());
		pw.println("Games played: "+p.getGP());
		pw.println("Penalty Minutes: "+p.getPenaltyT());
		pw.println("Number of penalties: "+p.getPenaltyN());
		if (p.getArm()==true)
			pw.println("Arm: right arm");
		else
			pw.println("Arm: left arm");
		pw.println("Jersey number: "+p.getNumber());
		pw.println("Total number of minutes on ice: "+p.getNumMin());
		pw.println("Rookie: "+p.getRookie());
		if (p instanceof Forward){
			//Writes all forward fields onto text file
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
			pw.println("Number of shoot-out goals: "+((Forward) p).getSOGoals());
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
			pw.println("Number of shoot-out goals: "+((Defense) p).getSOGoals());
			pw.println("Number of overtime goals: "+((Defense) p).getOTGoals());
			pw.println("Points: "+((Defense) p).getPoints());
			pw.println("Faceoff win percentage: "+((Defense) p).getFaceoffPercentage());
			pw.println("Shooting percentage: "+((Defense) p).getShootPercentage());
		}
		else if (p instanceof Goalie){
			//Writes all the fields that goalie has onto text file
			pw.println("Number of wins: "+((Goalie) p).getWins());
			pw.println("Numer of losses: "+((Goalie) p).getLoses());
			pw.println("Number of wins during playoffs: "+((Goalie) p).getWinsP());
			pw.println("Number of losses during playoffs: "+((Goalie) p).getLosesP());
			pw.println("Number of losses during overtime: "+((Goalie) p).getLosesOT());
			pw.println("Bumber of games started by goalie: "+((Goalie) p).getGameStart());
			pw.println("Number of goals scored against goalie: "+((Goalie) p).getGoalA());
			pw.println("Total number of shots faced by goalie: "+((Goalie) p).getShotsOG());
			pw.println("Number of saves by goalie: "+((Goalie) p).getSaves());
			pw.println("Save Percentage: "+((Goalie) p).getSavePercent());
			pw.println("Shutout Saves: "+((Goalie) p).getShutouts());
			pw.println("Empty Net Goals: "+((Goalie) p).getEmptyNG());
		}
	}
	
	public static Team promptforTeam() {
		//Temporary fields for team
		String name; //Name of team
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
		Scanner in = new Scanner(System.in);
		System.out.print("1. New Jersey Devils\n2. New York Islanders\n"+
				"3. New York Rangers\n4. Philadelphia Flyers\n5. Pittsburgh Penguins\n"+
				"6. Boston Bruins\n7. Buffalo Sabres\n8. Montréal Canadiens\n"+
				"9. Ottawa Senators\n10. Toronto Maple Leafs\n11. Carolina Hurricanes\n"+
				"12. Florida Panthers\n13. Tampa Bay Lightning\n14. Washington Capitals\n" +
				"15. Winnipeg Jets\n16. Chicago Blackhawks\n17. Columbus Blue Jackets\n"+
				"18. Detroit Red Wings\n19. Nashville Predators\n20. St. Louis Blues\n"+
				"21. Calgary Flames\n22. Edmonton Oilers\n23. Colorado Avalanche\n"+
				"24. Minnesota Wild\n25. Vancouver Canucks\n26. Anaheim Ducks\n"+
				"27. Dallas Stars\n28. Los Angeles Kings\n29. Phoenix Coyotes\n"+
				"30. San Jose Sharks\nEnter (1-30)");
		name=in.nextLine();
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
		
		Team t = new Team(name, payroll, gpT,
				winsT, losesT, goalsFor, goalsAgainst, ppo,
				tsh, ppGoalsT, shGoals, ppGoalsA, shGoalsA,
				shotsFor, shotsAgainst, savesT);
		
		return t;
	}
	
	/**
	 * Loads the team data from a text file to this object
	 * @param String filepath
	 * @author MK, AV, CH, PJ
	 * @throws IOException 
	 */
	public static Team loadTeam(String filepath, BufferedReader br) throws IOException {
		String x;
		Team temp;
		
		String name; //Name of team
		String division; // that the division belongs to
		String conference; // that the conference belongs to
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

		x = br.readLine();//skips first line of text file
		x = br.readLine();//skips second line of text file
		
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

		temp = new Team(name, payroll, gpT,
				winsT, losesT, goalsFor, goalsAgainst, ppo,
				tsh, ppGoalsT, shGoals, ppGoalsA, shGoalsA,
				shotsFor, shotsAgainst, savesT);
		
		temp.putDivision(division); 
		temp.putConference(conference);

		return temp;
	}

	/**
	 * Loads the player data from a text file into a stack of players
	 * Note: include only player objects in the text file
	 * @param String filepath
	 * @author MK, AV, CH, PJ
	 */
	public static Stack loadPlayer(String filepath, BufferedReader br) throws IOException{
		loadTeam(filepath, br); //moves br to desired location in text file
		String x;
		String classType;
		Stack players = new Stack();
		int i = 0; //index of stack of players
		
		br.readLine(); //skips the blank line between team and players

		//loads person fields into the object
		do {
			x = br.readLine();
			classType = x.substring(x.indexOf(": ")+2,x.length());
			

			if (classType.equals("forward"))
				players.push(new Forward(null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, 0, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
			else if (classType.equals("defense"))
				players.push(new Defense(null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, 0, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
			else
				players.push(new Goalie(null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, 0, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));

			x = br.readLine();
			((Person)players.get(i)).fname = x.substring(x.indexOf(": ")+2,x.length());

			x = br.readLine();
			((Person)players.get(i)).lname = x.substring(x.indexOf(": ")+2,x.length());

			x = br.readLine();
			((Person)players.get(i)).age = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

			x = br.readLine();
			x = x.substring(x.indexOf(": ")+2,x.length());
			if (x.equals("male"))
				((Person)players.get(i)).gender = true;
			else
				((Person)players.get(i)).gender = false;

			x = br.readLine();
			((Person)players.get(i)).height = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

			x = br.readLine();
			((Person)players.get(i)).weight = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

			x = br.readLine();
			((Person)players.get(i)).birthMonth = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

			x = br.readLine();
			((Person)players.get(i)).birthDay = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

			x = br.readLine();
			((Person)players.get(i)).birthYear = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

			x = br.readLine();
			((Person)players.get(i)).birthPlace = Person.convertBirthPlaceToInt(x.substring(x.indexOf(": ")+2,x.length()));

			x = br.readLine();
			((Person)players.get(i)).maritalStatus = Person.convertMaritalStatusToInt(x.substring(x.indexOf(": ")+2,x.length()));

			
			//load player fields into object
			x = br.readLine();
			((Player)players.get(i)).salaryPY = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

			x = br.readLine();
			((Player)players.get(i)).contractR = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

			x = br.readLine();
			((Player)players.get(i)).tSalary = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

			x = br.readLine();
			((Player)players.get(i)).rating = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

			x = br.readLine();
			((Player)players.get(i)).gp = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

			x = br.readLine();
			((Player)players.get(i)).penaltyT = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

			x = br.readLine();
			((Player)players.get(i)).penaltyN = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

			x = br.readLine();
			x = x.substring(x.indexOf(": ")+2,x.length());
			if (x.equals("right arm"))
				((Player)players.get(i)).arm = true;
			else
				((Player)players.get(i)).arm = false;

			x = br.readLine();
			((Player)players.get(i)).number = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

			x = br.readLine();
			((Player)players.get(i)).numMin = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

			x = br.readLine();
			x = x.substring(x.indexOf(": ")+2,x.length());
			if (x.equals("true")) 
				((Player)players.get(i)).rookie = true;
			else
				((Player)players.get(i)).rookie = false;

			if (classType.equals("forward")) {
				//load forward fields into object
				x = br.readLine();
				((Forward)players.get(i)).plusMinus = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Forward)players.get(i)).avgGoalsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Forward)players.get(i)).avgGoalPercentagePS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Forward)players.get(i)).avgShotsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Forward)players.get(i)).zsGoalPercentage = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Forward)players.get(i)).avgAssistsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Forward)players.get(i)).avgPenaltyPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Forward)players.get(i)).avgPPGoalsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Forward)players.get(i)).avgSOGoalsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Forward)players.get(i)).avgNShifts = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Forward)players.get(i)).gwGoals = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Forward)players.get(i)).ppGoals = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Forward)players.get(i)).soGoals = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Forward)players.get(i)).otGoals = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Forward)players.get(i)).points = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Forward)players.get(i)).faceoffPercentage = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Forward)players.get(i)).shootPercentage = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
			}
			else if (classType.equals("defense")) {
				//load defense fields into object
				x = br.readLine();
				((Defense)players.get(i)).plusMinus = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Defense)players.get(i)).avgGoalsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Defense)players.get(i)).avgGoalPercentagePS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Defense)players.get(i)).avgShotsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Defense)players.get(i)).zsGoalPercentage = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Defense)players.get(i)).avgAssistsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Defense)players.get(i)).avgPenaltyPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Defense)players.get(i)).avgPPGoalsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Defense)players.get(i)).avgSOGoalsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Defense)players.get(i)).avgNShifts = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Defense)players.get(i)).gwGoals = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Defense)players.get(i)).ppGoals = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Defense)players.get(i)).soGoals = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Defense)players.get(i)).otGoals = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Defense)players.get(i)).points = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Defense)players.get(i)).faceoffPercentage = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Defense)players.get(i)).shootPercentage = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
			}
			else {
				//load goalie fields into object
				x = br.readLine();
				((Goalie)players.get(i)).wins = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Goalie)players.get(i)).loses = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Goalie)players.get(i)).winsP = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Goalie)players.get(i)).losesP = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Goalie)players.get(i)).losesOT = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Goalie)players.get(i)).gameStart = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Goalie)players.get(i)).goalA = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Goalie)players.get(i)).shotsOG = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Goalie)players.get(i)).saves = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Goalie)players.get(i)).savePercent = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Goalie)players.get(i)).shutouts = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((Goalie)players.get(i)).emptyNG = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

			}	
			
			i++; //increments player index
			x = br.readLine();//skips the space between each player
			br.mark(1000); //stores this location in the memory so program can revisit this part of the stream later
			
			x = x.substring(x.indexOf(": ")+2,x.length()); //for use with while condition
			
			br.reset();//moves cursor back to where stream was marked
			
		} while (x.equals("forward")||x.equals("defense")||x.equals("goalie")); //checks if next class in the text file is a coach or not
		return players;
	}
	
	/**
	 * Loads the coach data from a text file into a stack of coaches
	 * Note: include only player objects in the text file
	 * @param String filepath
	 * @author MK, AV, CH, PJ
	 * @throws IOException 
	 */
	public static Stack loadCoach(String filepath, BufferedReader br) throws IOException {
		Stack coaches = new Stack();
		String coachType;
		String x;
		int i = 0;
		loadPlayer(filepath, br); //skips team and players
		
		do {
			x = br.readLine();
			coachType = x.substring(x.indexOf(": ")+2,x.length());
			if (coachType.equals("assistant"))
				coaches.push(new assistant(null, null, false, 0, 0, 0, 0, 0, 0, 0));
			else if (coachType.equals("goaltender"))
				coaches.push(new goaltender(null, null, false, 0, 0, 0, 0, 0, 0, 0));
			else if (coachType.equals("head"))
				coaches.push(new head(null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
			else 
				coaches.push(new trainer(null, null, false, 0, 0, 0, 0, 0, 0, 0));
			
			//loads person fields
			x = br.readLine();
			((Person)coaches.get(i)).fname = x.substring(x.indexOf(": ")+2,x.length());

			x = br.readLine();
			((Person)coaches.get(i)).lname = x.substring(x.indexOf(": ")+2,x.length());

			x = br.readLine();
			((Person)coaches.get(i)).age = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

			x = br.readLine();
			x = x.substring(x.indexOf(": ")+2,x.length());
			if (x.equals("male"))
				((Person)coaches.get(i)).gender = true;
			else
				((Person)coaches.get(i)).gender = false;

			x = br.readLine();
			((Person)coaches.get(i)).height = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

			x = br.readLine();
			((Person)coaches.get(i)).weight = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

			x = br.readLine();
			((Person)coaches.get(i)).birthMonth = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

			x = br.readLine();
			((Person)coaches.get(i)).birthDay = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

			x = br.readLine();
			((Person)coaches.get(i)).birthYear = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

			x = br.readLine();
			((Person)coaches.get(i)).birthPlace = Person.convertBirthPlaceToInt(x.substring(x.indexOf(": ")+2,x.length()));

			x = br.readLine();
			((Person)coaches.get(i)).maritalStatus = Person.convertMaritalStatusToInt(x.substring(x.indexOf(": ")+2,x.length()));
			
			if (coachType.equals("head")) {
				//loads head coach fields into the object

				x = br.readLine();
				((head)coaches.get(i)).winS = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((head)coaches.get(i)).loseS = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((head)coaches.get(i)).putOvertimeLS(Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length())));

				x = br.readLine();
				((head)coaches.get(i)).gameCS = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((head)coaches.get(i)).pointPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((head)coaches.get(i)).winP = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((head)coaches.get(i)).loseP = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((head)coaches.get(i)).gameCP = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

				x = br.readLine();
				((head)coaches.get(i)).stanleyN = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
				
				x = br.readLine();
				((head)coaches.get(i)).puttotalGamesCoached(Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length())));
			}
			i++; //increments coach counter
			x = br.readLine();//skips the space between each coach
			br.mark(1000); //stores this location in the memory so program can revisit this part of the stream later
			x = x.substring(x.indexOf(": ")+2,x.length()); //checks if next class in the text file is end of file or not
			br.reset();
		} while (x != null);
		return coaches;
	}
	
	
}
