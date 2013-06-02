import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Forward extends Player {
  
	protected int plusMinus; //Holds +/- for each player
	protected double avgGoalsPS; //Average goals per season
	protected double avgGoalPercentagePS; //Average goal percentage per season
	protected double avgShotsPS; //Average shots taken per season
	protected double zsGoalPercentage; //Z-score of goal percentage 
	protected double avgAssistsPS; //Average assists per season
	protected double avgPenaltyPS; //Average penalty minutes per season
	protected double avgPPGoalsPS; //Average power play goals per season (double)
	protected double avgSOGoalsPS; //Average shoot-out goals per season
	protected double avgNShifts; //Average number of shifts per game
	protected int gwGoals; //Number of game-winning goals
	protected int ppGoals; //Number of power play goals
	protected int soGoals; //Number of shoot-out goals
	protected int otGoals; //Number of overtime goals
	protected double points; //Points (Goals + Assists)
	protected double faceoffPercentage; //Face off win percentage
	protected double shootPercentage; //Shooting Percentage
	
	public Forward(String fname, String lname, boolean gender, double height, double weight, int month, int day, int year, int place, int mStatus,//person fields
			double salaryPY, int contractR, double tSalary, int gp, double penaltyT, int penaltyN, boolean arm, int number, //player fields
			double numMin, boolean rookie, //more player fields
			int plusMinus, double avgGoalsPS, double avgGoalPercentagePS, double avgShotsPS, double zsGoalPercentage, double avgAssistsPS, //forward fields
			double avgPenaltyPS, double avgPPGoalsPS, double avgSOGoalsPS, double avgNShifts, int gwGoals, int ppGoals, int soGoals,//more forward fields
			int otGoals, /*points taken care of in constructor,*/double faceoffPercentage, double shootPercentage) {//more forward fields
		
		super(fname, lname, gender, height, weight, month, day, year, place, mStatus,//person fields
				salaryPY, contractR, tSalary, gp, penaltyT, penaltyN, arm, number, //player fields
				numMin, rookie); //more player fields
		
		this.plusMinus = plusMinus;
		this.avgGoalsPS = avgGoalsPS;
		this.avgGoalPercentagePS = avgGoalPercentagePS;
		this.avgShotsPS = avgShotsPS;
		this.zsGoalPercentage = zsGoalPercentage;
		this.avgAssistsPS = avgAssistsPS;
		this.avgPenaltyPS = avgPenaltyPS;
		this.avgPPGoalsPS = avgPPGoalsPS;
		this.avgSOGoalsPS = avgSOGoalsPS;
		this.avgNShifts = avgNShifts;
		this.gwGoals = gwGoals;
		this.ppGoals = ppGoals;
		this.soGoals = soGoals;
		this.otGoals = otGoals;
		this.points = avgGoalsPS + avgAssistsPS; //calculates points
		this.faceoffPercentage = faceoffPercentage;
		this.shootPercentage = shootPercentage;
	}
	
	public Forward(BufferedReader br) throws IOException {
		load(br);
	}
	
	public Forward() {
		prompt();
	}
	
	/**
	 * Loads forward data from a text file into this object
	 * @author MK, AV, CH, PJ
	 * @throws IOException 
	 * @overrides load in Player
	 */
	public void load(String filepath, BufferedReader br) throws IOException {
		//loads person/player fields
		super.load(br);
		//loads forward fields
		String x;
		x = br.readLine();
		plusMinus = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		avgGoalsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		avgGoalPercentagePS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		avgShotsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		zsGoalPercentage = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		avgAssistsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		avgPenaltyPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		avgPPGoalsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		avgSOGoalsPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		avgNShifts = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		gwGoals = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		ppGoals = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		soGoals = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		otGoals = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		points = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		faceoffPercentage = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		shootPercentage = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
	}
	
	/**
	 * Saves all statistics of forward onto a text file
	 * @param pw of type PrintWriter
	 * @overrides save in Player
	 */
	public void save(PrintWriter pw) {
		super.save(pw);
		//Writes all forward fields onto text file
		pw.println("Plus/Minus: "+plusMinus);
		pw.println("Average goals per season: "+avgGoalsPS);
		pw.println("Average goal percentage per season: "+avgGoalPercentagePS);
		pw.println("Average shots taken per season: "+avgShotsPS);
		pw.println("Z-score of goal percentage: "+zsGoalPercentage);
		pw.println("Average assists per season: "+avgAssistsPS);
		pw.println("Average penalty minutes per season: "+avgPenaltyPS);
		pw.println("Average power play goals per season: "+avgPPGoalsPS);
		pw.println("Average shoot-out goals per season: "+avgSOGoalsPS);
		pw.println("Average number of shifts per game: "+avgNShifts);
		pw.println("Number of game-winning goals: "+gwGoals);
		pw.println("Number of power play goals: "+ppGoals);
		pw.println("Number of shoot-out goals: "+soGoals);
		pw.println("Number of overtime goals: "+otGoals);
		pw.println("Points: "+points);
		pw.println("Faceoff win percentage: "+faceoffPercentage);
		pw.println("Shooting percentage: "+shootPercentage);
	}
	
	/**
	 * Loads a forward's data through prompting the user
	 * @author MK, AV, CH, PJ
	 * @overrides prompt in Player
	 */
	public void prompt() {
		Scanner in = new Scanner(System.in);
		super.prompt();
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
		
	}
	
	//Accessor Methods
	/**
	 * Returns +/- of a player
	 * @return plusMinus
	 */
	public int getplusMinus() {
		return plusMinus;
	}
	
	/**
	 * Returns average goals per season of a player
	 * @return avgGoalsPS
	 */
	public double getavgGoalsPS() {
		return avgGoalsPS;
	}
	
	/**
	 * Returns average goal percentage per season of a player
	 * @return avgGoalPercentagePS
	 */
	public double getavgGoalPercentagePS() {
		return avgGoalPercentagePS;
	}
	
	/**
	 * Returns average number of shots per season of a player
	 * @return avgShotsPS
	 */
	public double getavgShotsPS() {
		return avgShotsPS;
	}
	
	/**
	 * Returns z-score of goal percentage of a player
	 * @return zsGoalPercentage
	 */
	public double getzsGoalPercentage() {
		return zsGoalPercentage;
	}
	
	/**
	 * Returns average assists per season of a player
	 * @return avgAssistsPS
	 */
	public double getavgAssistsPS() {
		return avgAssistsPS;
	}
	
	/**
	 * Returns average penalty minutes per season of a player
	 * @return avgPenaltyPS
	 */
	public double getavgPenaltyPS() {
		return avgPenaltyPS;
	}
	
	/**
	 * Returns average power play goals per season of a player
	 * @return avgPPGoalsPS
	 */
	public double getavgPPGoalsPS() {
		return avgPPGoalsPS;
	}
	
	/**
	 * Returns average shoot-out goals per season of a player
	 * @return avgSOGoalsPS
	 */
	public double getavgSOGoalsPS() {
		return avgSOGoalsPS;
	}
	
	/**
	 * Returns the average number of shifts per game
	 * @return avgNShifts
	 */
	public double getAvgNShifts() {
		return avgNShifts;
	}
	
	/**
	 * Returns the number of game-winning goals
	 * @return gwGoals
	 */
	public int getGWGoals() {
		return gwGoals;
	}
	
	/**
	 * Returns the number of power-play goals
	 * @return ppGoals
	 */
	public int getPPGoals() {
		return ppGoals;
	}
	
	/**
	 * Returns the number of shoot-out goals
	 * @return soGoals
	 */
	public int getSOGoals() {
		return soGoals;
	}
	
	/**
	 * Returns the number of overtime goals
	 * @return otGoals
	 */
	public int getOTGoals() {
		return otGoals;
	}
	
	/**
	 * Returns faceoff percentage
	 * @return faceoffPercentage
	 */
	public double getFaceoffPercentage() {
		return faceoffPercentage;
	}
	
	/**
	 * Returns points
	 * @return points
	 */
	public double getPoints() {
		return points;
	}
	
	/**
	 * Returns shooting percentage
	 * @return shootPercentage
	 */
	public double getShootPercentage() {
		return shootPercentage;
	}
	
	//Mutator methods
	/**
	 * stores parameter to plusMinus
	 * @param x of type int
	 */
	public void putplusMinus(int x) {
		plusMinus = x;
	}
	
	/**
	 * stores parameter to avgGoalsPS
	 * @param x of type double
	 */
	public void putavgGoalsPS(double x) {
		avgGoalsPS = x;
	}
	
	/**
	 * stores parameter to avgGoalPercentagePS
	 * @param x of type double
	 */
	public void putavgGoalPercentagePS(double x) {
		avgGoalPercentagePS = x;
	}
	
	/**
	 * stores parameter to avgShotsPS
	 * @param x of type double
	 */
	public void putavgShotsPS(double x) {
		avgShotsPS = x;
	}
	
	/**
	 * stores parameter to zsGoalPercentage
	 * @param x of type double
	 */
	public void putzsGoalPercentage(double x) {
		zsGoalPercentage = x;
	}
	
	/**
	 * stores parameter to avgAssistsPS
	 * @param x of type double
	 */
	public void putavgAssistsPS(double x) {
		avgAssistsPS = x;
	}
	
	/**
	 * stores parameter to avgPenaltyPS
	 * @param x of type double
	 */
	public void putavgPenaltyPS(double x) {
		avgPenaltyPS = x;
	}
	
	/**
	 * stores parameter to avgPPGoalsPS
	 * @param x of type double
	 */
	public void putavgPPGoalsPS(double x) {
		avgPPGoalsPS = x;
	}
	
	/**
	 * stores parameter to avgSOGoalsPS
	 * @param x of type double
	 */
	public void putavgSOGoalsPS(double x) {
		avgSOGoalsPS = x;
	}
	
	/**
	 * stores parameter to avgNShifts
	 * @param x of type double
	 */
	public void putAvgNshifts(int x){
		avgNShifts = x;
	}
	
	/**
	 * stores parameter to gwGoals
	 * @param x of type int
	 */
	public void putGWGoals(int x){
		gwGoals = x;
	}
	
	/**
	 * stores parameter to ppGoals
	 * @param x of type int
	 */
	public void putPPGoals(int x){
		ppGoals = x;
	}
	
	/**
	 * stores parameter to soGoals
	 * @param x of type int
	 */
	public void putSOGoals(int x){
		soGoals = x;
	}
	
	/**
	 * stores parameter to otGoals
	 * @param x of type int
	 */
	public void putOTGoals(int x) {
		otGoals = x;
	}
	
	/**
	 * stores parameter to faceoffPercentage
	 * @param x of type double
	 */
	public void putFaceoffPercentage(double x) {
		faceoffPercentage = x;
	}
	
	/**
	 * stores parameter to points
	 * @param x of type double
	 */
	public void putPoints(double x) {
		points = x;
	}
	
	/**
	 * stores parameter to shootPercentage
	 * @param x of type double
	 */
	public void putShootPercentage(double x) {
		shootPercentage = x;
	}
}
