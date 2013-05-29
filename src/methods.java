import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;


public class methods {
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
			
			x = br.readLine();//skips the space between each player
			br.mark(1000); //stores this location in the memory so program can revisit this part of the stream later
			
			x = x.substring(x.indexOf(": ")+2,x.length()); //checks if next class in the text file is a coach or not
			
			br.reset();
			
		} while (x.equals("forward")||x.equals("defense")||x.equals("goalie"));
		return players;
	}
	
	/**
	 * Loads the coach data from a text file into a stack of coaches
	 * Note: include only player objects in the text file
	 * @param String filepath
	 * @author MK, AV, CH, PJ
	 */
	public static Stack loadCoach() {
		Stack coaches = new Stack();
		return coaches;
	}
	
	/**
	 * Saves all data into a text file 
	 * @param String filepath
	 * @author MK, AV, CH, PJ
	 */
	public static void saveAll(String filepath) {//should we make separate save methods and pass writer has parameter?
		FileWriter fw;
		
		
	}
}
