public class Forward extends Player {
  
	private int plusMinus;
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
	private int position //position of forward player: -1 = left wing; 0 = centre; 1 = right wing
	
	public Forward(String name, int age, boolean gender, double height, double weight, int month, int day, int year, String place, String mStatus) {//+more 
		super(name, age, gender, height, weight, month, day, year, place, mStatus);
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
		/**
	 * Returns position of a player
	 * @return position in the form of a string: left, centre or right
	 * @author MK, AV, CH, PJ
	 */
	public String getPosition (){
		if (position = -1){
			return "left"
		}
		else if (position = 0){
			return "centre"
		}
		else if (position = 1{
			return "right"
		}
		else{
			return "error"
		}
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
	/**
	 * stores parameter to position
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	 */
	public void putPosition (int x){
		position = x
	}
}
