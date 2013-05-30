import java.util.Scanner;


public class Prompts {
  
	/**
	 * Prompts for the statistics for the different types of players (forwards, defenses, goalies) depending on how many players the user wants to enter statistics for.
	 * @return The array of players the user wanted to enter statistics for
	 */
	public static Player[] promptPlayer(){
		Scanner in=new Scanner(System.in);
		int num;
		String playerType;
		
		//Temporary fields for person
		String fname; //First name
		String lname; //Last name
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
		int numMin; //Total number of minutes the player has been on ice
		String tempRookie;
		boolean rookie = false; //If the player is a rookie (true if he/she is)
		
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
		int otGoals; //Number of overtime goals
		
		System.out.print("Enter the amount of players on the team: ");
		num=in.nextInt();
		
		Player p[]=new Player[num];
		
		for (int c=0; c<num; c++){
			//Prompt for all person fields
			do {
				System.out.print("Enter the first name of player "+(c+1)+": ");
				fname = in.nextLine();
				in.nextLine();
				System.out.print("Enter the last name of player "+(c+1)+": ");
				lname = in.nextLine();
				in.nextLine();
			} while (fname.equals("")&&lname.equals("")); //Ensures that something is entered

			do {
				System.out.print("Enter the age of "+fname+": ");
				age = in.nextInt();
			} while (age <= 0); //Ensures age is greater than 0

			do {
				System.out.print("Enter the gender of "+fname+" (m/f): ");
				tempGender = in.next();
			} while (!tempGender.equalsIgnoreCase("m") && !tempGender.equalsIgnoreCase("f"));
			if (tempGender.equalsIgnoreCase("m"))
				gender = true;
			else
				gender = false;

			do {
				System.out.print("Enter the height of "+fname+": ");
				height = in.nextDouble();
			} while (height <= 0); //Ensures height is greater than 0

			do {
				System.out.print("Enter the weight of "+fname+": ");
				weight = in.nextDouble();
			} while (weight <= 0); //Ensures weight is greater than 0
			
			do {
				System.out.print("Enter the birth month of "+fname+": ");
				birthMonth = in.nextInt();
			} while (birthMonth <= 0 || birthMonth >12); //Ensures birth month is between January and Decemeber
			
			do {
				System.out.print("Enter the birth day of "+fname+": ");
				birthDay = in.nextInt();
			} while (birthDay <= 0 || birthDay >31); //Ensures birth day is between 1 and 31
			
			do {
				System.out.print("Enter the birth year of "+fname+": ");
				birthYear = in.nextInt();
			} while (birthYear <= 0); //Ensures birth month is greater than 0
			
			do {
				System.out.print("Enter birth place based on list: "); //Show list
				birthPlace = in.nextInt();
			} while (birthPlace <= 0 || birthPlace > 21); //Ensures birth place selection is in the list
			
			do {
				System.out.print("Enter martial status based on list: "); //Show list
				martialStatus = in.nextInt();
			} while (martialStatus <= 0 || martialStatus > 5); //Ensures martial status selection is in the list
			
			//prompt for player stuff
			do{
				System.out.print("Enter the player's salary per year: ");
				salaryPY=in.nextDouble();
			}while (salaryPY<0); //Ensures the player does have a salary per year
			
			do{
				System.out.print("Enter the number of years "+fname+" has left in their contract: ");
				contractR=in.nextInt();
			}while (contractR<0); //Ensures the player has number of years in the contract
			
			do{
				System.out.print("Enter "+fname+"'s total salary over the contract's length: ");
				tSalary=in.nextDouble();
			}while (tSalary<0); //Ensures the player has number of years in the contract
			
			do{
				System.out.print("Enter number of games "+fname+" has played: ");
				gp=in.nextInt();
			}while (gp<0); //Ensures the player has at least player 0 games
			
			do{
				System.out.print("Enter the number of seconds "+fname+" has spent in the penalty box: ");
				penaltyT=in.nextDouble();
			}while (penaltyT<0); //Ensures the player has at least spent 0 seconds in the penalty box
			
			do{
				System.out.print("Enter the number of times "+fname+" has gone to the penalty box: ");
				penaltyN=in.nextInt();
			}while (penaltyN<0); //Ensures the player has at least been in the penalty box once
			
			do {
				System.out.print("Enter "+fname+"'s shooting arm (R/L): ");
				tempArm = in.next();
			} while (!tempArm.equalsIgnoreCase("R") && !tempArm.equalsIgnoreCase("L"));
			if (tempArm.equalsIgnoreCase("R"))
				arm=true;
			else
				arm=false;
			
			do{
				System.out.print("Enter "+fname+"'s jersey number: ");
				number=in.nextInt();
			}while (number<0); //Ensures the player doesn't have a negative jersey number
			
			do{
				System.out.print("Enter the number of minutes "+fname+" has been on the ice: ");
				numMin=in.nextInt();
			}while (numMin<0); //Ensures the player has had minutes on the ice
			
			do{
				System.out.print("Enter if "+fname+" is a rookie (yes/no): ");
				tempRookie=in.next();
			}while (!tempRookie.equalsIgnoreCase("yes")||!tempRookie.equalsIgnoreCase("no")); //Ensures the player is a rookie or not
			if (tempRookie.equalsIgnoreCase("yes"))
				rookie=true;
			else if (tempRookie.equalsIgnoreCase("no"))
				rookie=false;
			
			do {
				System.out.print("Select wheather "+fname+" is a forward, defense or goalie: ");
				playerType=in.next();
			}while (!playerType.equalsIgnoreCase("forward")||!playerType.equalsIgnoreCase("defense")||!playerType.equalsIgnoreCase("goalie"));
			
			if (playerType.equalsIgnoreCase("forward")||playerType.equalsIgnoreCase("defense")){
				do{
					System.out.print("Enter the number of game-winning goals by "+fname+": ");
					gwGoals=in.nextInt();
				}while (gwGoals<0); //Ensure the player doesn't have negative game-winning goals
				
				do{
					System.out.print("Enter the number of power-play goals by "+fname+": ");
					ppGoals=in.nextInt();
				}while (ppGoals<0); //Ensure the player doesn't have negative power-play goals
				
				do{
					System.out.print("Enter the number of shootout goals by "+fname+": ");
					soGoals=in.nextInt();
				}while (soGoals<0); //Ensure the player doesn't have negative shootout goals
				
				do{
					System.out.print("Enter the number of overtime goals by "+fname+": ");
					otGoals=in.nextInt();
				}while (otGoals<0); //Ensure the player doesn't have negative overtime goals
				
				if (playerType.equalsIgnoreCase("forward"))
					//Creating object for Forward
					p[c]=new Forward(fname, lname, gender, height, weight, birthMonth, birthDay, birthYear, birthPlace, martialStatus, //Person fields
							salaryPY, contractR, tSalary, gp, penaltyT, penaltyN, arm, number, numMin, rookie, //Player fields
							0, 0, 0, 0, 0, 0, 0, 0, 0, 0, gwGoals, ppGoals, soGoals, otGoals, 0, 0 //Forward fields
							); 
				else
					//Creating object for Defense
					p[c]=new Defense(fname, lname, gender, height, weight, birthMonth, birthDay, birthYear, birthPlace, martialStatus, //Person fields
							salaryPY, contractR, tSalary, gp, penaltyT, penaltyN, arm, number, numMin, rookie, //Player fields
							0, 0, 0, 0, 0, 0, 0, 0, 0, 0, gwGoals, ppGoals, soGoals, otGoals, 0, 0 //Defense fields
							);
				
			}else if (playerType.equalsIgnoreCase("goalie")){
				do{
					System.out.print("Enter the number of times "+fname+" has won: ");
					wins=in.nextInt();
				}while (wins<0); //Ensures the number of wins is above zero (valid)
				
				do{
					System.out.print("Enter the number of times "+fname+" has lost: ");
					loses=in.nextInt();
				}while(loses<0); //Ensures the number of loses is above zero (valid)
				
				do{
					System.out.print("Enter the number of times "+fname+" has won during playoffs: ");
					winsP=in.nextInt();
				}while(winsP<0); //Ensures the number of wins during playoffs is above zero (valid)
				
				do{
					System.out.print("Enter the number of times "+fname+" has lost during playoffs: ");
					losesP=in.nextInt();
				}while(losesP<0); //Ensures the number of loses during playoffs is above zero (valid)
				
				do{
					System.out.print("Enter the number of times "+fname+" has lost during overtime: ");
					losesOT=in.nextInt();
				}while(losesOT<0); //Ensures the number of loses during overtime is above zero (valid)
				
				do{
					System.out.print("Enter the number of times "+fname+" has started at the beginning of a game: ");
					gameStart=in.nextInt();
				}while(gameStart<0); //Ensures the number of games started is above zero (valid)
				
				do{
					System.out.print("Enter the number of times "+fname+" got scored on: ");
					goalA=in.nextInt();
				}while(goalA<0); //Ensures the number of goals scored against is above zero (valid)
				
				do{
					System.out.print("Enter the total number of times "+fname+" was shot on (shots on goal): ");
					shotsOG=in.nextInt();
				}while(shotsOG<0); //Ensures the total number of shots on goal is above zero (valid)
				
				do{
					System.out.print("Enter the number of times "+fname+" made a save: ");
					saves=in.nextInt();
				}while(saves<0); //Ensures the number of saves goalie made is above zero (valid)
				
				do{
					System.out.print("Enter the number of times "+fname+" was never scored against and played for the entire game: ");
					shutouts=in.nextInt();
				}while(shutouts<0); //Ensures the number of shutouts is above zero (valid)
				
				do{
					System.out.print("Enter the number of times "+fname+" was scored on while off the ice to add an extra attack player: ");
					emptyNG=in.nextInt();
				}while(emptyNG<0); //Ensures the the number of empty net goals is above zero (valid)
				
				//Creating object for goalie
				p[c]=new Goalie(fname, lname, gender, height, weight, birthMonth, birthDay, birthYear, birthPlace, martialStatus,//person fields
						salaryPY, contractR, tSalary, 1, gp, penaltyT, penaltyN, arm, number, numMin, rookie, //player fields
						wins, loses, winsP, losesP, losesOT, gameStart, goalA, shotsOG, saves, shutouts, emptyNG //goalie fields
						);
			}
		}
		return p;
	}
	
	/**
	 * Prompts for the statistics for the different types of coaches (head, assistant, goaltender, trainer) depending on how many coaches the user wants to enter statistics for.
	 * @return The array of coaches the user wanted to enter statistics for
	 */
	public static Coach[] promptCoach(){
		Scanner in=new Scanner(System.in);
		int num;
		String coachType;
		
		//Temporary fields for person
		String fname; //First name
		String lname; //Last name
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
		
		//Temporary fields for head
		int winS; //Regular season wins
		int loseS; //Regular season losses
		int tieS; //Regular season ties
		int overtimeLS; //Regular season overtime loses
		int gameCS; //Regular season games coached
		int winP; //Playoff wins
		int loseP; //Playoff loses
		int gameCP; //Playoff games coached
		int stanleyN; //Number of Stanley Cups
		
		do {
			System.out.print("Enter the number of coaches you want to enter statistics for: ");
			num=in.nextInt();
		}while (num<0); //Ensures the user has to enter the a coach
		
		Coach c[]=new Coach[num];
		
		for (int i=0; i<num; i++){
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
				System.out.print("Enter the age of "+fname+": ");
				age = in.nextInt();
			} while (age <= 0); //Ensures age is greater than 0

			do {
				System.out.print("Enter the gender of "+fname+" (m/f): ");
				tempGender = in.next();
			} while (!tempGender.equalsIgnoreCase("m") && !tempGender.equalsIgnoreCase("f"));
			if (tempGender.equalsIgnoreCase("m"))
				gender = true;
			else
				gender = false;

			do {
				System.out.print("Enter the height of "+fname+": ");
				height = in.nextDouble();
			} while (height <= 0); //Ensures height is greater than 0

			do {
				System.out.print("Enter the weight of "+fname+": ");
				weight = in.nextDouble();
			} while (weight <= 0); //Ensures weight is greater than 0
			
			do {
				System.out.print("Enter the birth month of "+fname+": ");
				birthMonth = in.nextInt();
			} while (birthMonth <= 0 || birthMonth >12); //Ensures birth month is between January and Decemeber
			
			do {
				System.out.print("Enter the birth day of "+fname+": ");
				birthDay = in.nextInt();
			} while (birthDay <= 0 || birthDay >31); //Ensures birth day is between 1 and 31
			
			do {
				System.out.print("Enter the birth year of "+fname+": ");
				birthYear = in.nextInt();
			} while (birthYear <= 0); //Ensures birth month is greater than 0
			
			do {
				System.out.print("Enter birth place based on list: "); //Show list
				birthPlace = in.nextInt();
			} while (birthPlace <= 0 || birthPlace > 21); //Ensures birth place selection is in the list
			
			do {
				System.out.print("Enter martial status based on list: "); //Show list
				martialStatus = in.nextInt();
			} while (martialStatus <= 0 || martialStatus > 5); //Ensures martial status selection is in the list
			
			do {
				System.out.print("Select wheather "+fname+" is a head coach, assistant coach, goaltender coach or trainer (head/assistant/goaltender/trainer):");
				coachType=in.next();
			}while (!coachType.equalsIgnoreCase("head")||!coachType.equalsIgnoreCase("assistant")||!coachType.equalsIgnoreCase("goaltender")||!coachType.equalsIgnoreCase("trainer"));
			
			if (coachType.equalsIgnoreCase("head")){
				//prompt for head fields
				do{
					System.out.print("Enter "+fname+"'s wins during regular season: ");
					winS=in.nextInt();
				}while (winS<0); //Ensures the the coach doesn't have negative wins
				
				do{
					System.out.print("Enter "+fname+"'s loses during regular season: ");
					loseS=in.nextInt();
				}while (loseS<0); //Ensures the the coach doesn't have negative loses
				
				do{
					System.out.print("Enter the number of ties "+fname+" has during regular season: ");
					tieS=in.nextInt();
				}while (tieS<0); //Ensures the the coach doesn't have negative ties
				
				do{
					System.out.print("Enter the number of overtime losses "+fname+" has during regular season: ");
					overtimeLS=in.nextInt();
				}while (overtimeLS<0); //Ensures the the coach doesn't have negative overtime loses
				
				do{
					System.out.print("Enter the number of games coach by "+fname+" during regular season: ");
					gameCS=in.nextInt();
				}while (gameCS<0); //Ensures the the coach doesn't have negative games coached
				
				do{
					System.out.print("Enter "+fname+"'s wins during playoffs: ");
					winP=in.nextInt();
				}while (winP<0); //Ensures the the coach doesn't have negative wins
				
				do{
					System.out.print("Enter "+fname+"'s loses during playoffs: ");
					loseP=in.nextInt();
				}while (loseP<0); //Ensures the the coach doesn't have negative loses
				
				do{
					System.out.print("Enter "+fname+" loses during playoffs: ");
					gameCP=in.nextInt();
				}while (gameCP<0); //Ensures the the coach doesn't have negative games coach during playoffs
				
				do{
					System.out.print("Enter the number of times "+fname+" has won the Stanley Cup: ");
					stanleyN=in.nextInt();
				}while (stanleyN<0); //Ensures the the coach doesn't have negative number of times the coach wins Stanley Cups
				
				//Creating object for head coach
				c[i]=new head(fname, lname, gender, height, weight, birthMonth, birthDay, birthYear, birthPlace, martialStatus, //person fields
						winS, loseS, tieS, overtimeLS, gameCS, 0, winP, loseP, gameCP, stanleyN //head fields
						); 
			}
			else if (coachType.equalsIgnoreCase("assistant"))
				//Creating object for assistant coach
				c[i]=new assistant(fname, lname, gender, height, weight, birthMonth, birthDay, birthYear, birthPlace, martialStatus); //person fields
			else if (coachType.equalsIgnoreCase("goaltender"))
				//Creating object for goaltender coach
				c[i]=new goaltender(fname, lname, gender, height, weight, birthMonth, birthDay, birthYear, birthPlace, martialStatus); //person fields
			else if (coachType.equalsIgnoreCase("trainer"))
				//Creating object for trainer
				c[i]=new trainer(fname, lname, gender, height, weight, birthMonth, birthDay, birthYear, birthPlace, martialStatus); //person fields
		}
		return c;
	}

}
