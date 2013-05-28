import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class methods {
	public static Team promptforTeam() {
		//Temporary fields for team
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
	
	public static Team loadTeam(String filepath) throws IOException {
		String x;
		FileReader fr = new FileReader(filepath);
		BufferedReader br = new BufferedReader(fr);
		Team temp;
		
		String name; //Name of team
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

		temp = new Team(name, payroll, gpT,
				winsT, losesT, goalsFor, goalsAgainst, ppo,
				tsh, ppGoalsT, shGoals, ppGoalsA, shGoalsA,
				shotsFor, shotsAgainst, savesT);

		return temp;
	}

}
