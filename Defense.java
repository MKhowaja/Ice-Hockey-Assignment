public class Defense extends Player{
  
	private int plusMinus; //Holds +/- for each player
	private double avgGoalsPS; //Average goals per season
	private double avgGoalPercentagePS; //Average goal percentage per season
	private double avgShotsPS; //Average shots taken per season
	private double zsGoalPercentage; //Z-score of goal percentage 
	private double avgAssistsPS; //Average assists per season
	private double avgPenaltyPS; //Average penalty minutes per season
	private double avgPPGoalsPS; //Average power play goals per season (double)
	private double avgSOGoalsPS; //Average shoot-out goals per season
	private int gwGoals; //Number of game-winning goals
	private int ppGoals; //Number of power play goals
	private int soGoals; //Number of shoot-out goals
	
	public Defense(String name, int age, boolean gender, double height, double weight, int month, int day, int year, int place, int mStatus,//person fields
			double salaryPY, int contractR, double tSalary, int rating, int gp, double penaltyT, int penaltyN, boolean arm, int number, //player fields
			int plusMinus, double avgGoalsPS, double avgGoalPercentagePS, double avgShotsPS, double zsGoalPercentage, double avgAssistsPS, //defense fields
			double avgPenaltyPS, double avgPPGoalsPS, double avgSOGoalsPS, int gwGoals, int ppGoals, int soGoals) {
		super(name, age, gender, height, weight, month, day, year, place, mStatus,//person fields
			salaryPY, contractR, tSalary, rating, gp, penaltyT, penaltyN, arm, number); //player fields
		
		this.plusMinus = plusMinus;
		this.avgGoalsPS = avgGoalsPS;
		this.avgGoalPercentagePS = avgGoalPercentagePS;
		this.avgShotsPS = avgShotsPS;
		this.zsGoalPercentage = zsGoalPercentage;
		this.avgAssistsPS = avgAssistsPS;
		this.avgPenaltyPS = avgPenaltyPS;
		this.avgPPGoalsPS = avgPPGoalsPS;
		this. avgSOGoalsPS = avgSOGoalsPS;
		this.gwGoals = gwGoals;
		this.ppGoals = ppGoals;
		this.soGoals = soGoals;
	}
	//Accessor Methods
	
	/**
	 * Returns +/- of a player
	 * @return plusMinus
	 * @author MK, AV, CH, PJ
	 */
	public int getplusMinus() {
		return plusMinus;
	}
	/**
	 * Returns average goals per season of a player
	 * @return avgGoalsPS
	 * @author MK, AV, CH, PJ
	 */
	public double getavgGoalsPS() {
		return avgGoalsPS;
	}
	/**
	 * Returns average goal percentage per season of a player
	 * @return avgGoalPercentagePS
	 * @author MK, AV, CH, PJ
	 */
	public double getavgGoalPercentagePS() {
		return avgGoalPercentagePS;
	}
	/**
	 * Returns average number of shots per season of a player
	 * @return avgShotsPS
	 * @author MK, AV, CH, PJ
	 */
	public double getavgShotsPS() {
		return avgShotsPS;
	}
	/**
	 * Returns z-score of goal percentage of a player
	 * @return zsGoalPercentage
	 * @author MK, AV, CH, PJ
	 */
	public double getzsGoalPercentage() {
		return zsGoalPercentage;
	}
	/**
	 * Returns average assists per season of a player
	 * @return avgAssistsPS
	 * @author MK, AV, CH, PJ
	 */
	public double getavgAssistsPS() {
		return avgAssistsPS;
	}
	/**
	 * Returns average penalty minutes per season of a player
	 * @return avgPenaltyPS
	 * @author MK, AV, CH, PJ
	 */
	public double getavgPenaltyPS() {
		return avgPenaltyPS;
	}
	/**
	 * Returns average power play goals per season of a player
	 * @return avgPPGoalsPS
	 * @author MK, AV, CH, PJ
	 */
	public double getavgPPGoalsPS() {
		return avgPPGoalsPS;
	}
	/**
	 * Returns average shoot-out goals per season of a player
	 * @return avgSOGoalsPS
	 * @author MK, AV, CH, PJ
	 */
	public double getavgSOGoalsPS() {
		return avgSOGoalsPS;
	}
	public int getgwGoals() {
		return gwGoals;
	}
	
	//Mutator methods
	
	/**
	 * stores parameter to plusMinus
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	 */
	public void putplusMinus(int x) {
		plusMinus = x;
	}
	/**
	 * stores parameter to avgGoalsPS
	 * @param x of type double
	 * @author MK, AV, CH, PJ
	 */
	public void putavgGoalsPS(double x) {
		avgGoalsPS = x;
	}
	/**
	 * stores parameter to avgGoalPercentagePS
	 * @param x of type double
	 * @author MK, AV, CH, PJ
	 */
	public void putavgGoalPercentagePS(double x) {
		avgGoalPercentagePS = x;
	}
	/**
	 * stores parameter to avgShotsPS
	 * @param x of type double
	 * @author MK, AV, CH, PJ
	 */
	public void putavgShotsPS(double x) {
		avgShotsPS = x;
	}
	/**
	 * stores parameter to zsGoalPercentage
	 * @param x of type double
	 * @author MK, AV, CH, PJ
	 */
	public void putzsGoalPercentage(double x) {
		zsGoalPercentage = x;
	}
	/**
	 * stores parameter to avgAssistsPS
	 * @param x of type double
	 * @author MK, AV, CH, PJ
	 */
	public void putavgAssistsPS(double x) {
		avgAssistsPS = x;
	}
	/**
	 * stores parameter to avgPenaltyPS
	 * @param x of type double
	 * @author MK, AV, CH, PJ
	 */
	public void putavgPenaltyPS(double x) {
		avgPenaltyPS = x;
	}
	/**
	 * stores parameter to avgPPGoalsPS
	 * @param x of type double
	 * @author MK, AV, CH, PJ
	 */
	public void putavgPPGoalsPS(double x) {
		avgPPGoalsPS = x;
	}
	/**
	 * stores parameter to avgSOGoalsPS
	 * @param x of type double
	 * @author MK, AV, CH, PJ
	 */
	public void putavgSOGoalsPS(double x) {
		avgSOGoalsPS = x;
	}
}
