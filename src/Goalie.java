import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Goalie extends Player {
	protected int wins; //Number of wins
	protected int losses; //Number of losses
	protected int winsP; //Number of wins during playoffs
	protected int lossesP; //Number of losses during playoffs
	protected int lossesOT; //Number of losses during overtime
	protected int gameStart; //The number of games started by goalie
	protected int goalA; //Number of goals scored against goalie
	protected int shotsOG; //Total number of shots faced by goalie
	protected int saves; //Number of saves by goalie
	protected double savePercent; //Percentage of total shots faced that were saved (dividing the number of saves by the total number of shots on goal), calculated
	protected int shutouts; //Number of games where all the goals were blocked by the goalie and the goalie was playing for the entire duration of the game
	protected int emptyNG; //Number of goals scored against while off ice for extra attack player
	
	/**
   	* Constructs an object of type Goalie
   	*/
	public Goalie(String fname, String lname, boolean gender, double height, double weight, int month, int day, int year, int place, int mStatus,//person fields
			double salaryPY, int contractR, double tSalary, int rating, int gp, double penaltyT, int penaltyN, boolean arm, int number, //player fields
			double numMin, boolean rookie, //more player fields
			int wins, int losses, int winsP, int lossesP, int lossesOT, int gameStart, int goalA, int shotsOG, int saves, int shutouts, int emptyNG) { //goalie fields
		
		super(fname, lname, gender, height, weight, month, day, year, place, mStatus,//person fields
				salaryPY, contractR, tSalary, gp, penaltyT, arm, number, //player fields
				numMin, rookie); //more player fields
		
		this.wins = wins;
		this.losses = losses;
		this.winsP = winsP;
		this.lossesP = lossesP;
		this.lossesOT = lossesOT;
		this.gameStart = gameStart;
		this.numMin = numMin;
		this.goalA = goalA;
		this.shotsOG = shotsOG;
		this.saves = saves;
		this.shutouts = shutouts;
		this.emptyNG = emptyNG;
		
		updateSavePercent();
	}
	
	/**
	* Constructs an object of type Goalie by calling the load method
   	* @throws IOException
	*/
	public Goalie(BufferedReader br) throws IOException {
		super(br);
		loadgoalie(br);
	}
	
	/**
   	* Constructs an object of type Goalie by prompting for each field
	* @throws IOException
	*/
	public Goalie() {
		super();
		prompt();
	}
	
	/**
	 * Loads goalie data from a text file into this object
	 * @author MK, AV, CH, PJ
	 * @throws IOException 
	 * @overrides load in Player
	 */
	public void loadgoalie( BufferedReader br) throws IOException {
		//load goalie fields into object
		String x;
		
		x = br.readLine();
		wins = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		losses = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		winsP = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		lossesP = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		lossesOT = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		gameStart = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		goalA = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		shotsOG = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		saves = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		savePercent = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		shutouts = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		emptyNG = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
	}
	
	/**
	 * Saves all statistics of goalie onto a text file
	 * @param pw of type PrintWriter
	 * @overrides save in Player
	 */
	public void save(PrintWriter pw) {
		super.save(pw);
		//Writes all goalie fields onto text file
		pw.println("Number of wins: "+wins);
		pw.println("Numer of losses: "+losses);
		pw.println("Number of wins during playoffs: "+winsP);
		pw.println("Number of losses during playoffs: "+lossesP);
		pw.println("Number of losses during overtime: "+lossesOT);
		pw.println("Number of games started by goalie: "+gameStart);
		pw.println("Number of goals scored against goalie: "+goalA);
		pw.println("Total number of shots faced by goalie: "+shotsOG);
		pw.println("Number of saves by goalie: "+saves);
		pw.println("Save Percentage: "+savePercent);
		pw.println("Shutout Saves: "+shutouts);
		pw.println("Empty Net Goals: "+emptyNG);
	}
	
	/**
	 * Loads a goalie's data through prompting the user
	 * @author MK, AV, CH, PJ
	 * @overrides prompt in Player
	 */
	public void prompt() {
		Scanner in = new Scanner(System.in);
		do {
			System.out.print("Enter the number of times "+fname+" has won: ");
			wins=in.nextInt();
		} while (wins<0); //Ensures the number of wins is above zero (valid)
		
		do {
			System.out.print("Enter the number of times "+fname+" has lost: ");
			losses=in.nextInt();
		} while(losses<0); //Ensures the number of losses is above zero (valid)
		
		do {
			System.out.print("Enter the number of times "+fname+" has won during playoffs: ");
			winsP=in.nextInt();
		} while(winsP<0); //Ensures the number of wins during playoffs is above zero (valid)
		
		do {
			System.out.print("Enter the number of times "+fname+" has lost during playoffs: ");
			lossesP=in.nextInt();
		} while(lossesP<0); //Ensures the number of losses during playoffs is above zero (valid)
		
		do {
			System.out.print("Enter the number of times "+fname+" has lost during overtime: ");
			lossesOT=in.nextInt();
		} while(lossesOT<0); //Ensures the number of losses during overtime is above zero (valid)
		
		do {
			System.out.print("Enter the number of times "+fname+" has started at the beginning of a game: ");
			gameStart=in.nextInt();
		} while(gameStart<0); //Ensures the number of games started is above zero (valid)
		
		do {
			System.out.print("Enter the number of times "+fname+" got scored on: ");
			goalA=in.nextInt();
		} while(goalA<0); //Ensures the number of goals scored against is above zero (valid)
		
		do {
			System.out.print("Enter the total number of times "+fname+" was shot on (shots on goal): ");
			shotsOG=in.nextInt();
		} while(shotsOG<0); //Ensures the total number of shots on goal is above zero (valid)
		
		do {
			System.out.print("Enter the number of times "+fname+" made a save: ");
			saves=in.nextInt();
		} while(saves<0); //Ensures the number of saves goalie made is above zero (valid)
		
		do {
			System.out.print("Enter the number of "+fname+"'s shutouts: ");
			shutouts=in.nextInt();
		} while(shutouts<0); //Ensures the number of shutouts is above zero (valid)
		
		do {
			System.out.print("Enter the number of times "+fname+" was scored on while off the ice to add an extra attack player: ");
			emptyNG=in.nextInt();
		} while(emptyNG<0); //Ensures the the number of empty net goals is above zero (valid)
		updateSavePercent();
		in.close();
	}
	
	//Accessor Methods
	/**
	 * Returns number of games won
	 * @return wins
	 */
	public int getWins(){
		return wins;
	}
	
	/**
	 * Returns number of games losses
	 * @return losses
	 */
	public int getLoses(){
		return losses;
	}
	
	/**
	 * Returns number of games won during playoffs
	 * @return winsP
	 */
	public int getWinsP(){
		return winsP;
	}
	
	/**
	 * Returns number of games losses during playoffs
	 * @return lossesP
	 */
	public int getLosesP(){
		return lossesP;
	}
	
	/**
	 * Returns number of games losses during overtime
	 * @return lossesOT
	 */
	public int getLosesOT(){
		return lossesOT;
	}
	
	/**
	 * Returns number of games started
	 * @return gameStart
	 */
	public int getGameStart(){
		return gameStart;
	}
	
	/**
	 * Returns number of goals scored against the goalie
	 * @return goalAA
	 */
	public int getGoalA(){
		return goalA;
	}
	
	/**
	 * Returns total number of shots on goal the goalie faced
	 * @return shotsOG
	 */
	public int getShotsOG(){
		return shotsOG;
	}
	
	/**
	 * Returns number of saves goalie has made
	 * @return saves
	 */
	public int getSaves(){
		return saves;
	}
	
	/**
	 * Returns percentage of total shots faced the goalie saved
	 * @return savePercent
	 */
	public double getSavePercent(){
		updateSavePercent();
		return savePercent;
	}
	
	/**
	 * Returns number of games where goalie had no goals against him and only goalie to play in game 
	 * @return shutouts
	 */
	public int getShutouts(){
		return shutouts;
	}
	
	/**
	 * Returns number of goals scored against while off ice for extra attack player
	 * @return emptyNG
	 */
	public int getEmptyNG(){
		return emptyNG;
	}
	
	//Mutator Methods
	/**
	 * Stores parameter to wins
	 * @param x of type int
	 */
	public void putWins(int x){
		wins=x;
	}
	
	/**
	 * Stores parameter to losses
	 * @param x of type int
	 */
	public void putLoses(int x){
		losses=x;
	}
	
	/**
	 * Stores parameter to winsP
	 * @param x of type int
	 */
	public void putWinsP(int x){
		winsP=x;
	}
	
	/**
	 * Stores parameter to lossesP
	 * @param x of type int
	 */
	public void putLosesP(int x){
		lossesP=x;
	}
	
	/**
	 * Stores parameter to lossesOT
	 * @param x of type int
	 */
	public void putLosesOT(int x){
		lossesOT=x;
	}
	
	/**
	 * Stores parameter to gameStart
	 * @param x of type int
	 */
	public void putGameStart(int x){
		gameStart=x;
	}
	
	/**
	 * Stores parameter to goalA
	 * @param x of type int
	 */
	public void putGoalA(int x){
		goalA=x;
	}
	
	/**
	 * Stores parameter to shotsOG
	 * @param x of type int
	 */
	public void putShotsOG(int x){
		shotsOG=x;
	}
	
	/**
	 * Stores parameter to saves
	 * @param x of type int
	 */
	public void putSaves(int x){
		saves=x;
	}
	
	/**
	 * Stores parameter to shutouts
	 * @param x of type int
	 */
	public void putShutouts(int x){
		shutouts=x;
	}
	
	/**
	 * Stores parameter to emptyNG
	 * @param x of type int
	 */
	public void putEmptyNG(int x){
		emptyNG=x;
	}
	
	//Update Methods
	/**
	 * Stores parameter to savePercent
	 * @param x of type double
	 */
	public void updateSavePercent(){
		savePercent=goalA/shotsOG;
	}

	/**
	 * calculates the rating of a goalie
	 */
	public void calculateRating() {
		rating = (int)(savePercent*0.5 + numMin*0.01 + height*0.1 + wins*0.2 + winsP*0.4 -losses*0.4 - lossesP*0.6 - 0.1*age - 0.9*penaltyT);
		if (rookie = true)
			rating = (int) (rating*0.8);
		if (rating<40)
			rating = 40;
	}
}
