public class Goalie extends Player {
	private int wins; //Number of wins
	private int loses; //Number of losses
	
	//Perhaps playoff wins here?

	private int gameStart; //The number of games started
	private double numMin; //Total number of minutes the goalie has been on ice
	private int goalA; //Number of goals scored against goalie
	private double goalAA; //Mean goals-per-60 minutes scored on the goalie
	private int shotsOG; //Total number of shots on goal the goalie faced
	private int saves; //Number of saves goalie made
	private double savePercent; //Percentage of total shots faced the goalie saved (dividing the number of saves by the total number of shots on goal)
	private int shutouts; //Number of games where goalie had no goals against him and only goalie to play in game
	private int emptyNG; //Number of goals scored against while off ice for extra attack player
	
	public Goalie(String name, int age, boolean gender, double height, double weight, int month, int day, int year, int place, int mStatus,//person fields
			double salaryPY, int contractR, double tSalary, int rating, int gp, double penaltyT, int penaltyN, boolean arm, int number, //player fields
			int gameStart, double numMin, int goalA, double goalAA, int shotsOG, int saves, double savePercent, int shutouts, int emptyNG) { //goalie fields
		super(name, age, gender, height, weight, month, day, year, place, mStatus,//person fields
				salaryPY, contractR, tSalary, rating, gp, penaltyT, penaltyN, arm, number); //player fields
		
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
	 * @return won
	 * @author MK, AV, CH, PJ
	 */
	public int getWin(){
		return wins;
	}
	
	/**
	 * Returns number of games loses
	 * @return loses
	 * @author MK, AV, CH, PJ
	 */
	public int getLoses(){
		return loses;
	}
	
	/**
	 * Returns number of games started
	 * @return gameStart
	 * @author MK, AV, CH, PJ
	 */
	public int getGameStart(){
		return gameStart;
	}
	
	/**
	 * Returns total number of minutes goalie is on ice
	 * @return numMin
	 * @author MK, AV, CH, PJ
	 */
	public double getNumMin(){
		return numMin;
	}
	
	/**
	 * Returns number of goals scored against the goalie
	 * @return goalAA
	 * @author MK, AV, CH, PJ
	 */
	public int getGoalA(){
		return goalA;
	}
	
	/**
	 * Returns mean goals-per-60 minutes scored on the goalie
	 * @return goalAA
	 * @author MK, AV, CH, PJ
	 */
	public double getgoalAA(){
		return goalAA;
	}
	
	/**
	 * Returns total number of shots on goal the goalie faced
	 * @return shotsOG
	 * @author MK, AV, CH, PJ
	 */
	public int getShotsOG(){
		return shotsOG;
	}
	
	/**
	 * Returns number of saves goalie has made
	 * @return saves
	 * @author MK, AV, CH, PJ
	 */
	public int getSaves(){
		return saves;
	}
	
	/**
	 * Returns percentage of total shots faced the goalie saved
	 * @return savePercent
	 * @author MK, AV, CH, PJ
	 */
	public double getSavePercent(){
		return savePercent;
	}
	
	/**
	 * Returns number of games where goalie had no goals against him and only goalie to play in game 
	 * @return shoutouts
	 * @author MK, AV, CH, PJ
	 */
	public int getShutouts(){
		return shutouts;
	}
	
	/**
	 * Returns number of goals scored against while off ice for extra attack player
	 * @return emptyNG
	 * @author MK, AV, CH, PJ
	 */
	public int getEmptyNG(){
		return emptyNG;
	}
	
	//Mutator Methods
	/**
	 * Stores parameter to wins
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	 */
	public void putWins(int x){
		wins=x;
	}
	
	/**
	 * Stores parameter to loses
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	 */
	public void putLoses(int x){
		loses=x;
	}
	
	/**
	 * Stores parameter to gameStart
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	 */
	public void putGameStart(int x){
		gameStart=x;
	}
	
	/**
	 * Stores parameter to numMin
	 * @param x of type double
	 * @author MK, AV, CH, PJ
	 */
	public void putNumMin(double x){
		numMin=x;
	}
	
	/**
	 * Stores parameter to goalA
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	 */
	public void putGoalA(int x){
		goalA=x;
	}
	
	/**
	 * Stores parameter to goalAA
	 * @param x of type double
	 * @author MK, AV, CH, PJ
	 */
	public void putGoalAA(double x){
		goalAA=x;
	}
	
	/**
	 * Stores parameter to shotsOG
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	 */
	public void putShotsOG(int x){
		shotsOG=x;
	}
	
	/**
	 * Stores parameter to saves
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	 */
	public void putSaves(int x){
		saves=x;
	}
	
	/**
	 * Stores parameter to savePercent
	 * @param x of type double
	 * @author MK, AV, CH, PJ
	 */
	public void putSavePercent(double x){
		savePercent=x;
	}
	
	/**
	 * Stores parameter to shutouts
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	 */
	public void putShutouts(int x){
		shutouts=x;
	}
	
	/**
	 * Stores parameter to emptyNG
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	 */
	public void putEmptyNG(int x){
		emptyNG=x;
	}
	
	
}
