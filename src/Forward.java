import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Forward extends Player {
  
	protected int plusMinus; //Holds +/- for each player
	protected double avgGoalsPG; //Average goals per game, calculated
	protected double avgShotsPG; //Average shots taken per game, calculated
	protected double avgAssistsPG; //Average assists per game, calculated
	protected double avgNShifts; //Average number of shifts per game
	protected int gwGoals; //Number of game-winning goals
	protected int ppGoals; //Number of power play goals
	protected int otGoals; //Number of overtime goals
	protected double points; //Points (Goals + Assists)
	protected double faceoffPercentage; //Face off win percentage
	protected double shootPercentage; //Shooting Percentage, calculated
	protected int goals; //total number of goals scored per season
	protected int shots; //total number of shots taken per season
	protected int assists; //total number of assists per season
	
	/**
	 * Constructs an object of type Forward
	 */
	public Forward(String fname, String lname, boolean gender, double height, double weight, int month, int day, int year, int place, int mStatus,//person fields
			double salaryPY, int contractR, double tSalary, int gp, double penaltyT, int penaltyN, boolean arm, int number, //player fields
			double numMin, boolean rookie, //more player fields
			int plusMinus, double avgGoalsPG, double avgShotsPG, double avgAssistsPG, //forward fields
			double avgNShifts, int gwGoals, int ppGoals,//more forward fields
			int otGoals, /*points taken care of in constructor,*/double faceoffPercentage, double shootPercentage, int goals, int shots, int assists) {//more forward fields
		
		super(fname, lname, gender, height, weight, month, day, year, place, mStatus,//person fields
				salaryPY, contractR, tSalary, gp, penaltyT, penaltyN, arm, number, //player fields
				numMin, rookie); //more player fields
		
		this.plusMinus = plusMinus;
		this.avgGoalsPG = avgGoalsPG;
		this.avgShotsPG = avgShotsPG;
		this.avgAssistsPG = avgAssistsPG;
		this.avgNShifts = avgNShifts;
		this.gwGoals = gwGoals;
		this.ppGoals = ppGoals;
		this.otGoals = otGoals;
		this.points = avgGoalsPG + avgAssistsPG; //calculates points
		this.faceoffPercentage = faceoffPercentage;
		this.shootPercentage = shootPercentage;
		this.goals = goals;
		this.shots = shots;
		this.assists = assists;
	}
	
	/**
	 * Constructs an object of type Forward by calling the load method
	 * @throws IOException
	 */
	public Forward(BufferedReader br) throws IOException {
		super(br);
		loadforward(br);
	}
	
	/**
	 * Constructs an object of type Forward by prompting for each field
	 * @throws IOException
	 */
	public Forward() {
		super();
		prompt();
	}
	
	/**
	 * Loads forward data from a text file into this object
	 * @author MK, AV, CH, PJ
	 * @throws IOException 
	 * @overrides load in Player
	 */
	public void loadforward(BufferedReader br) throws IOException {
		//loads forward fields
		String x;
		x = br.readLine();
		plusMinus = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		avgGoalsPG = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		avgShotsPG = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		avgAssistsPG = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		avgNShifts = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		gwGoals = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		ppGoals = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		otGoals = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		points = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		faceoffPercentage = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		shootPercentage = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));
		
		x = br.readLine();
		goals = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
		
		x = br.readLine();
		shots = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
		
		x = br.readLine();
		assists = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
		
		calculateRating();
		//TODO
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
		pw.println("Average goals per game: "+avgGoalsPG);
		pw.println("Average shots taken per game: "+avgShotsPG);
		pw.println("Average assists per game: "+avgAssistsPG);
		pw.println("Average number of shifts per game: "+avgNShifts);
		pw.println("Number of game-winning goals: "+gwGoals);
		pw.println("Number of power play goals: "+ppGoals);
		pw.println("Number of overtime goals: "+otGoals);
		pw.println("Points: "+points);
		pw.println("Faceoff win percentage: "+faceoffPercentage);
		pw.println("Shooting percentage: "+shootPercentage);
		pw.println("Total Goals per Season: "+goals);
		pw.println("Total Shots per Season: "+shots);
	}
	
	/**
	 * Loads a forward's data through prompting the user
	 * @author MK, AV, CH, PJ
	 * @overrides prompt in Player
	 */
	public void prompt() {
		Scanner in = new Scanner(System.in);
		do {
			System.out.print("Enter the plus/minus of "+fname+": ");
			plusMinus=in.nextInt();
		} while (plusMinus<0); //Ensure the player doesn't have negative plus/minus
		
		do {
			System.out.print("Enter the average goals per game by "+fname+": ");
			avgGoalsPG=in.nextDouble();
		} while (avgGoalsPG<0); //Ensure the player doesn't have negative average goals per game
		
		do {
			System.out.print("Enter the average shots per game by "+fname+": ");
			avgShotsPG=in.nextDouble();
		} while (avgShotsPG<0); //Ensure the player doesn't have negative average shots per game
		
		do {
			System.out.print("Enter the average assists per game by "+fname+": ");
			avgAssistsPG=in.nextDouble();
		} while (avgAssistsPG<0); //Ensure the player doesn't have negative average assists per game
		
		do {
			System.out.print("Enter the average number of shifts per game by "+fname+": ");
			avgNShifts=in.nextDouble();
		} while (avgNShifts<0); //Ensure the player doesn't have negative average number of shifts per game
		
		do {
			System.out.print("Enter the number of game-winning goals by "+fname+": ");
			gwGoals=in.nextInt();
		} while (gwGoals<0); //Ensure the player doesn't have negative game-winning goals
		
		do {
			System.out.print("Enter the number of power-play goals by "+fname+": ");
			ppGoals=in.nextInt();
		} while (ppGoals<0); //Ensure the player doesn't have negative power-play goals
		
		do {
			System.out.print("Enter the number of overtime goals by "+fname+": ");
			otGoals=in.nextInt();
		} while (otGoals<0); //Ensure the player doesn't have negative overtime goals
		
		do {
			System.out.print("Enter the face off percentage by "+fname+": ");
			faceoffPercentage=in.nextDouble();
		} while (faceoffPercentage<0); //Ensure the player doesn't have negative face off percentage
		
		do {
			System.out.print("Enter the shooting percentage by "+fname+": ");
			shootPercentage=in.nextDouble();
		} while (shootPercentage<0); //Ensure the player doesn't have negative shooting percentage
		
		do {
			System.out.print("Enter total number of goals scored per season by "+fname+": ");
			goals=in.nextInt();
		} while (goals<0); //Ensure the player doesn't have negative goals scored per season
		
		do {
			System.out.print("Enter total number of shots taken per season by "+fname+": ");
			shots=in.nextInt();
		} while (shots<0); //Ensure the player doesn't have negative shots taken per season
		
		do {
			System.out.print("Enter the total number of assists per season by "+fname+": ");
			assists=in.nextInt();
		} while (assists<0); //Ensure the player doesn't have negative total number of assists per season
		
		this.points = avgGoalsPG + avgAssistsPG; //calculates points
		in.close();
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
	 * Returns average goals per game of a player
	 * @return avgGoalsPG
	 */
	public double getavgGoalsPG() {
		return avgGoalsPG;
	}
	
	/**
	 * Returns average number of shots per game of a player
	 * @return avgShotsPG
	 */
	public double getavgShotsPG() {
		return avgShotsPG;
	}
	
	/**
	 * Returns average assists per game of a player
	 * @return avgAssistsPG
	 */
	public double getavgAssistsPG() {
		return avgAssistsPG;
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
	
	/**
	 * Returns the total number of goals
	 * @return goals
	 */
	public int getGoals() {
		return goals;
	}
	
	/**
	 * @return the shots
	 */
	public int getShots() {
		return shots;
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
	 * stores parameter to avgGoalsPG
	 * @param x of type double
	 */
	public void putavgGoalsPG(double x) {
		avgGoalsPG = x;
	}
	
	/**
	 * stores parameter to avgShotsPG
	 * @param x of type double
	 */
	public void putavgShotsPG(double x) {
		avgShotsPG = x;
	}
	
	/**
	 * stores parameter to avgAssistsPG
	 * @param x of type double
	 */
	public void putavgAssistsPG(double x) {
		avgAssistsPG = x;
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
	
	/**
	 * stores parameter to goals
	 * @param x of type double
	 */
	public void putGoals(int goals) {
		this.goals = goals;
	}

	/**
	 * @param shots the shots to set
	 */
	public void putShots(int shots) {
		this.shots = shots;
	}
	
	//CALCULATION METHODS
	
	/**
	 * calculates the rating of a forward
	 */
	public void calculateRating() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * calculates the shootPercentage
	 */
	public void calculateShootPercentage() {
		shootPercentage = avgGoalsPG/avgShotsPG;
	}
}

