import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Defense extends Player{

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


	/**
	 * Constructs an object of type Defense
	 * @param  fname, lname of type string and gender of type boolean and height, weight of type double and month, day, year, place, mStatus of type int
	 * salaryPY of type double, contractR of type int, tSalary of type double, gp of type int, penaltyT of type double, penaltyN of type int, arm of type boolean, number of type int,
	 * numMin of type double, rookie of type boolean, plusMinus of type int, avgGoalsPS of type double, avgGoalPercentagePS of type double, avgShotsPS of type double, zsGoalPercentage of type double, avgAssistsPS of type double,	 * double avgPenaltyPS, double avgPPGoalsPS, double avgSOGoalsPS, double avgNShifts, int gwGoals, int ppGoals, int soGoals,//more defense fields
	 * otGoals of type int
	 * @throws IOException
	 */
	public Defense(String fname, String lname, boolean gender, double height, double weight, int month, int day, int year, int place, int mStatus,//person fields
			double salaryPY, int contractR, double tSalary, int gp, double penaltyT, int penaltyN, boolean arm, int number, //player fields
			double numMin, boolean rookie, //more player fields
			int plusMinus, double avgGoalsPS, double avgGoalPercentagePS, double avgShotsPS, double zsGoalPercentage, double avgAssistsPS, //defense fields
			double avgPenaltyPS, double avgPPGoalsPS, double avgSOGoalsPS, double avgNShifts, int gwGoals, int ppGoals, int soGoals,//more defense fields
			int otGoals, /*points taken care of in constructor,*/double faceoffPercentage, double shootPercentage) {//more defense fields

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

	/**
	 * Constructs an object of type Defense by calling the load method
	 * @throws IOException
	 */
	public Defense(BufferedReader br) throws IOException {
		super(br);
		loaddefense(br);
	}

	/**
	 * Constructs an object of type Defense by prompting for each field
	 * @throws IOException
	 */
	public Defense() {
		super(); //prompts for person/player fields
		prompt(); //prompts for defense fields
	}

	/**
	 * Saves all statistics of a defense onto a text file
	 * @param pw of type PrintWriter
	 * @overrides save in Player
	 */
	public void save(PrintWriter pw) {
		super.save(pw);
		//Writes all defense fields onto text file
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
	 * Loads defense data from a text file into this object
	 * @throws IOException 
	 * @overrides load in Player
	 */
	public void loaddefense(BufferedReader br) throws IOException {
		//load defense fields into object
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
	 * Loads a defense's data through prompting the user
	 * @overrides prompt in Player
	 * @author MK, AV, CH, PJ
	 */
	
	public void prompt() {
		Scanner input2 = new Scanner(System.in);
		do{
			System.out.print("Enter the plus/minus of "+fname+": ");
			plusMinus=input2.nextInt();
		}while (plusMinus<0); //Ensure the player doesn't have negative plus/minus

		do{
			System.out.print("Enter the average goals per season by "+fname+": ");
			avgGoalsPS=input2.nextDouble();
		}while (avgGoalsPS<0); //Ensure the player doesn't have negative average goals per season

		do{
			System.out.print("Enter the average goal percentage per season by "+fname+": ");
			avgGoalPercentagePS=input2.nextDouble();
		}while (avgGoalPercentagePS<0); //Ensure the player doesn't have negative average goal percentage per season

		do{
			System.out.print("Enter the average shots per season by "+fname+": ");
			avgShotsPS=input2.nextDouble();
		}while (avgShotsPS<0); //Ensure the player doesn't have negative average shots per season

		do{
			System.out.print("Enter the Z-score of goal percentage by "+fname+": ");
			zsGoalPercentage=input2.nextDouble();
		}while (zsGoalPercentage<0); //Ensure the player doesn't have negative Z-score of goal percentage

		do{
			System.out.print("Enter the average assists per season by "+fname+": ");
			avgAssistsPS=input2.nextDouble();
		}while (avgAssistsPS<0); //Ensure the player doesn't have negative average assists per season

		do{
			System.out.print("Enter the average penalty minutrs per season by "+fname+": ");
			avgPenaltyPS=input2.nextDouble();
		}while (avgPenaltyPS<0); //Ensure the player doesn't have negative average penalty minutes per season

		do{
			System.out.print("Enter the average power-play goals per season by "+fname+": ");
			avgPPGoalsPS=input2.nextDouble();
		}while (avgPPGoalsPS<0); //Ensure the player doesn't have negative power-play goals per season

		do{
			System.out.print("Enter the average shoot-out goals per season by "+fname+": ");
			avgSOGoalsPS=input2.nextDouble();
		}while (avgSOGoalsPS<0); //Ensure the player doesn't have negative shoot-out goals per season

		do{
			System.out.print("Enter the average number of shifts per game by "+fname+": ");
			avgNShifts=input2.nextDouble();
		}while (avgNShifts<0); //Ensure the player doesn't have negative average number of shifts per game

		do{
			System.out.print("Enter the number of game-winning goals by "+fname+": ");
			gwGoals=input2.nextInt();
		}while (gwGoals<0); //Ensure the player doesn't have negative game-winning goals

		do{
			System.out.print("Enter the number of power-play goals by "+fname+": ");
			ppGoals=input2.nextInt();
		}while (ppGoals<0); //Ensure the player doesn't have negative power-play goals

		do{
			System.out.print("Enter the number of shootout goals by "+fname+": ");
			soGoals=input2.nextInt();
		}while (soGoals<0); //Ensure the player doesn't have negative shootout goals

		do{
			System.out.print("Enter the number of overtime goals by "+fname+": ");
			otGoals=input2.nextInt();
		}while (otGoals<0); //Ensure the player doesn't have negative overtime goals

		do{
			System.out.print("Enter the face off percentage by "+fname+": ");
			faceoffPercentage=input2.nextDouble();
		}while (faceoffPercentage<0); //Ensure the player doesn't have negative face off percentage

		do{
			System.out.print("Enter the shooting percentage by "+fname+": ");
			shootPercentage=input2.nextDouble();
		}while (shootPercentage<0); //Ensure the player doesn't have negative shooting percentage
		input2.close();
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
