import java.util.Scanner;


public class methods {
  public Team promptforTeam() {
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
		System.out.print("Enter team's name: ");
		name=in.nextLine();
		
		System.out.println("Enter name of divison the team is in: ");
		division = in.next();
		
		System.out.println("Enter the name of the conference the team is in: ");
		conference = in.next();
		
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
	}

}
