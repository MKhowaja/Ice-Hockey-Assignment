import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Defense extends Player{

	protected int plusMinus; //Holds +/- for each player
	protected double goalsPG; //Goals per game, calculated
	protected double shotsPG; //Shots taken per game, calculated
	protected double assistsPG; //Assists per game, calculated
	protected double shiftsPG; //Number of shifts per game
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
	 * Constructs an object of type Defense
	 */
	public Defense(String fname, String lname, boolean gender, double height, double weight, int month, int day, int year, int place, int mStatus,//person fields
			double salaryPY, int contractR, double tSalary, int gp, double penaltyT, int penaltyN, boolean arm, int number, //player fields
			double numMin, boolean rookie, //more player fields
			int plusMinus, double goalsPG, double shotsPG, double assistsPG, //forward fields
			double shiftsPG, int gwGoals, int ppGoals, //more defense fields
			int otGoals, /*points taken care of in constructor,*/double faceoffPercentage, double shootPercentage, int goals, int shots, int assists) {//more defense fields

		super(fname, lname, gender, height, weight, month, day, year, place, mStatus,//person fields
				salaryPY, contractR, tSalary, gp, penaltyT, arm, number, //player fields
				numMin, rookie); //more player fields

		this.plusMinus = plusMinus;
		this.goalsPG = goalsPG;
		this.shotsPG = shotsPG;
		this.assistsPG = assistsPG;
		this.shiftsPG = shiftsPG;
		this.gwGoals = gwGoals;
		this.ppGoals = ppGoals;
		this.otGoals = otGoals;
		this.points = getPoints(); //calculates points
		this.faceoffPercentage = faceoffPercentage;
		this.shootPercentage = getShootPercentage();
		this.goals = goals;
		this.shots = shots;
		this.assists = assists;
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
		pw.println("Goals per game: "+ getgoalsPG());
		pw.println("Shots taken per game: "+ getshotsPG());
		pw.println("Assists per game: "+ getassistsPG());
		pw.println("Number of shifts per game: "+ shiftsPG);
		pw.println("Number of game-winning goals: "+gwGoals);
		pw.println("Number of power play goals: "+ppGoals);
		pw.println("Number of overtime goals: "+otGoals);
		pw.println("Points: "+ getPoints());
		pw.println("Faceoff win percentage: "+faceoffPercentage);
		pw.println("Shooting percentage: "+getShootPercentage());
		pw.println("Total Goals per Season: "+goals);
		pw.println("Total Shots per Season: "+shots);
		pw.println("Total Assists per Season: "+assists);
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
		goalsPG = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		shotsPG = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		assistsPG = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		shiftsPG = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

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
	 * Loads a defense's data through prompting the user
	 * @overrides prompt in Player
	 * @author MK, AV, CH, PJ
	 */
	
	public void prompt() {
		Scanner in = new Scanner(System.in);
		do {
			System.out.print("Enter the plus/minus of "+fname+": ");
			plusMinus=in.nextInt();
		} while (plusMinus<0); //Ensure the player doesn't have negative plus/minus
		
		do {
			System.out.print("Enter the number of shifts per game by "+fname+": ");
			shiftsPG=in.nextDouble();
		} while (shiftsPG<0); //Ensure the player doesn't have negative average number of shifts per game
		
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
			System.out.print("Enter the face-off percentage by "+fname+": ");
			faceoffPercentage=in.nextDouble();
		} while (faceoffPercentage<0); //Ensure the player doesn't have negative face off percentage
		
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
		
		goalsPG = getgoalsPG();
		shotsPG = getshotsPG();
		assistsPG = getassistsPG();
		shootPercentage = getShootPercentage();
		points = getPoints(); //calculates points
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
	 * Returns goals per game of a player
	 * @return goalsPG
	 */
	public double getgoalsPG() {
		calculategoalsPG();
		return goalsPG;
	}
	
	/**
	 * Returns number of shots per game of a player
	 * @return shotsPG
	 */
	public double getshotsPG() {
		calculateshotsPG();
		return shotsPG;
	}
	
	/**
	 * Returns assists per game of a player
	 * @return assistsPG
	 */
	public double getassistsPG() {
		calculateassistsPG();
		return assistsPG;
	}
	
	/**
	 * Returns the number of shifts per game
	 * @return shiftsPG
	 */
	public double getshiftsPG() {
		return shiftsPG;
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
		calculatePoints();
		return points;
	}

	/**
	 * Returns shooting percentage
	 * @return shootPercentage
	 */
	public double getShootPercentage() {
		calculateShootPercentage();
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
	 * stores parameter to shiftsPG
	 * @param x of type double
	 */
	public void putshiftsPG(int x){
		shiftsPG = x;
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
	 * calculates the rating of a defense
	 */
	public void calculateRating() {
		// TODO Auto-generated method stub
	}	
	
	/**
	 * calculates the shootPercentage
	 */
	public void calculateShootPercentage() {
		shootPercentage = goalsPG/shotsPG;
	}
	
	/**
	 * calculates points
	 */
	public void calculatePoints() {
		points = goals + assists;
	}

	/**
	 * calculates the goals per game
	 */
	public void calculategoalsPG() {
		goalsPG = goals/gp;
	}
	
	/**
	 * calculates the shots per game
	 */
	public void calculateshotsPG() {
		shotsPG = shots/gp;
	}
	
	/**
	 * calculates the assists per game
	 */
	public void calculateassistsPG() {
		assistsPG = assists/gp;
	}
}
