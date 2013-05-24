public class Goalie extends Player {
	protected int wins; //Number of wins
	protected int loses; //Number of losses
	protected int winsP; //Number of wins during playoffs
	protected int losesP; //Number of loses during playoffs
	protected int losesOT; //Number of loses during overtime
	protected int gameStart; //The number of games started
	protected int goalA; //Number of goals scored against goalie
	protected double goalAA; //Mean goals-per-60 minutes scored on the goalie
	protected int shotsOG; //Total number of shots on goal the goalie faced
	protected int saves; //Number of saves goalie made
	protected double savePercent; //Percentage of total shots faced the goalie saved (dividing the number of saves by the total number of shots on goal)
	protected int shutouts; //Number of games where goalie had no goals against him and only goalie to play in game
	protected int emptyNG; //Number of goals scored against while off ice for extra attack player
	
	public Goalie(String fname, String lname, int age, boolean gender, double height, double weight, int month, int day, int year, int place, int mStatus,//person fields
			double salaryPY, int contractR, double tSalary, int rating, int gp, double penaltyT, int penaltyN, boolean arm, int number, double numMin, //player fields
			boolean rookie, int penaltyMinor, int penaltyMajor, int penaltyMisc, int penaltyGMisc, int match, //more player fields
			int wins, int loses, int winsP, int losesP, int losesOT, int gameStart, int goalA, double goalAA, int shotsOG, int saves, double savePercent, int shutouts, int emptyNG) { //goalie fields
		
		super(fname, lname, age, gender, height, weight, month, day, year, place, mStatus,//person fields
				salaryPY, contractR, tSalary, rating, gp, penaltyT, penaltyN, arm, number, //player fields
				numMin, rookie, penaltyMinor, penaltyMajor, penaltyMisc, penaltyGMisc, match); //more player fields
		
		this.wins = wins;
		this.loses = loses;
		this.winsP = winsP;
		this.losesP = losesP;
		this.losesOT = losesOT;
		this.gameStart = gameStart;
		this.numMin = numMin;
		this.goalA = goalA;
		this.goalAA = goalAA;
		this.shotsOG = shotsOG;
		this.saves = saves;
		this.savePercent = savePercent;
		this.shutouts = shutouts;
		this.emptyNG = emptyNG;
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
	 * Returns number of games loses
	 * @return loses
	 */
	public int getLoses(){
		return loses;
	}
	
	/**
	 * Returns number of games won during playoffs
	 * @return winsP
	 */
	public int getWinsP(){
		return winsP;
	}
	
	/**
	 * Returns number of games loses during playoffa
	 * @return losesP
	 */
	public int getLosesP(){
		return losesP;
	}
	
	/**
	 * Returns number of games loses during overtime
	 * @return losesOT
	 */
	public int getLosesOT(){
		return losesOT;
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
	 * Returns mean goals-per-60 minutes scored on the goalie
	 * @return goalAA
	 */
	public double getgoalAA(){
		return goalAA;
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
	 * Stores parameter to loses
	 * @param x of type int
	 */
	public void putLoses(int x){
		loses=x;
	}
	
	/**
	 * Stores parameter to winsP
	 * @param x of type int
	 */
	public void putWinsP(int x){
		winsP=x;
	}
	
	/**
	 * Stores parameter to losesP
	 * @param x of type int
	 */
	public void putLosesP(int x){
		losesP=x;
	}
	
	/**
	 * Stores parameter to losesOT
	 * @param x of type int
	 */
	public void putLosesOT(int x){
		losesOT=x;
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
	 * Stores parameter to goalAA
	 * @param x of type double
	 */
	public void putGoalAA(double x){
		goalAA=x;
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
	 * Stores parameter to savePercent
	 * @param x of type double
	 */
	public void putSavePercent(double x){
		savePercent=x;
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
	
	
}
