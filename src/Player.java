import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

abstract class Player extends Person {
	protected double salaryPY; //Salary per year
	protected int contractR; //# of years remaining of contract 
	protected double tSalary; //Total salary over entire contract length
	protected int rating; //Temp for something awesome
	protected int gp; //Games played
	protected double penaltyT; //Time spent in penalties in minutes
	protected int penaltyN; //Number of penalties
	protected boolean arm; //Shooting arm: True if right arm
	protected int number; //Jersey number
	protected double numMin; //Total number of minutes the player has been on ice
	protected boolean rookie; //If the player is a rookie (true if he/she is)

	/**
   	* Constructs an object of type Player
   	* @param  fname, lname of type string and gender of type boolean and height, weight of type double and month, day, year, place, mStatus of type int
	* salaryPY of type double, contractR of type int, tSalary of type double, gp of type int, penaltyT of type double, penaltyN of type int, arm of type boolean, number of type int,
	* numMin of type double, rookie of type boolean,
	* @throws IOException
	*/
	public Player(String fname, String lname, boolean gender, double height, double weight, int month, int day, int year, int place, int mStatus,//person fields
			double salaryPY, int contractR, double tSalary, int gp, double penaltyT, int penaltyN, boolean arm, int number, double numMin,
			boolean rookie) {//player fields

		super(fname, lname, gender, height, weight, month, day, year, place, mStatus);
		this.salaryPY = salaryPY;
		this.contractR = contractR;
		this.tSalary = tSalary;
		this.gp = gp;
		this.penaltyT = penaltyT;
		this.penaltyN = penaltyN;
		this.arm = arm;
		this.number = number;
		this.numMin = numMin;
		this.rookie = rookie;
	}

	/**
   	* Constructs an object of type Player by calling the load method
	* @throws IOException
	*/
	public Player(BufferedReader br) throws IOException {
		load(br);
	}
	
	/**
   	* Constructs an object of type Player by prompting for each field
	* @throws IOException
	*/
	public Player() {
		prompt();
	}
	
	/**
	 * Loads player data from a text file into this object
	 * @author MK, AV, CH, PJ
	 * @throws IOException 
	 * @overrides load in Person
	 */
	public void load(BufferedReader br) throws IOException {
		//loads person fields
		super.load(br);
		//loads player fields
		String x;

		x = br.readLine();
		salaryPY = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		contractR = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		tSalary = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		rating = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		gp = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		penaltyT = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		penaltyN = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		x = x.substring(x.indexOf(": ")+2,x.length());
		if (x.equals("right arm"))
			arm = true;
		else
			arm = false;

		x = br.readLine();
		number = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		numMin = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		x = x.substring(x.indexOf(": ")+2,x.length());
		if (x.equals("true")) 
			rookie = true;
		else
			rookie = false;

	}

	/**
	 * Saves all statistics of a player onto a text file
	 * @param pw of type PrintWriter
	 * @overrides save in Person
	 */
	public void save(PrintWriter pw) {
		super.save(pw);
		pw.println("Salary per year: "+salaryPY);
		pw.println("Contract: "+contractR);
		pw.println("Total salary: "+tSalary);
		pw.println("Rating: "+rating);
		pw.println("Games played: "+gp);
		pw.println("Penalty Minutes: "+penaltyT);
		pw.println("Number of penalties: "+penaltyN);
		if (arm==true)
			pw.println("Arm: right arm");
		else
			pw.println("Arm: left arm");
		pw.println("Jersey number: "+number);
		pw.println("Total number of minutes on ice: "+numMin);
		pw.println("Rookie: "+rookie);
	}

	/**
	 * Loads a player's data through prompting the user
	 * @author MK, AV, CH, PJ
	 */
	public void prompt() {
		Scanner in = new Scanner(System.in);
		String tempArm;
		String tempRookie;
		do {
			System.out.print("Enter the player's salary per year: ");
			salaryPY=in.nextDouble();
		} while (salaryPY<0); //Ensures the player does have a salary per year

		do {
			System.out.print("Enter the number of years "+fname+" has left in their contract: ");
			contractR=in.nextInt();
		} while (contractR<0); //Ensures the player has number of years in the contract

		do {
			System.out.print("Enter "+fname+"'s total salary over the contract's length: ");
			tSalary=in.nextDouble();
		} while (tSalary<0); //Ensures the player has number of years in the contract

		do {
			System.out.print("Enter number of games "+fname+" has played: ");
			gp=in.nextInt();
		} while (gp<0); //Ensures the player has at least player 0 games

		do {
			System.out.print("Enter the number of seconds "+fname+" has spent in the penalty box: ");
			penaltyT=in.nextDouble();
		} while (penaltyT<0); //Ensures the player has at least spent 0 seconds in the penalty box

		do {
			System.out.print("Enter the number of times "+fname+" has gone to the penalty box: ");
			penaltyN=in.nextInt();
		} while (penaltyN<0); //Ensures the player has at least been in the penalty box once

		do {
			System.out.print("Enter "+fname+"'s shooting arm (R/L): ");
			tempArm = in.next();
		} while (!tempArm.equalsIgnoreCase("R") && !tempArm.equalsIgnoreCase("L"));
		if (tempArm.equalsIgnoreCase("R"))
			arm=true;
		else
			arm=false;

		do {
			System.out.print("Enter "+fname+"'s jersey number: ");
			number=in.nextInt();
		} while (number<0); //Ensures the player doesn't have a negative jersey number

		do {
			System.out.print("Enter the number of minutes "+fname+" has been on the ice: ");
			numMin=in.nextInt();
		} while (numMin<0); //Ensures the player has had minutes on the ice

		do {
			System.out.print("Enter if "+fname+" is a rookie (Y/N): ");
			tempRookie=in.next();
		} while (!tempRookie.equalsIgnoreCase("y")||!tempRookie.equalsIgnoreCase("n")); //Ensures the player is a rookie or not
		if (tempRookie.equalsIgnoreCase("n"))
			rookie=true;
		else if (tempRookie.equalsIgnoreCase("n"))
			rookie=false;
	}

	//Accessors

	/**
	 * Returns salary per year
	 * @return salaryPY
	 */

	public double getSalaryPY(){
		return salaryPY;
	}

	/**
	 * Returns remaining years in contract
	 * @return contractR
	 */

	public int getcontractR(){
		return contractR;
	}

	/**
	 * Returns total salary over entire contract length
	 * @return tSalary
	 */

	public double getTSalary(){
		return tSalary;
	}

	/**
	 * Returns rating
	 * @return rating
	 */

	public int getRating(){
		return rating;
	}

	/**
	 * Returns games played
	 * @return gp
	 */

	public int getGP(){
		return gp;
	}

	/**
	 * Returns time spent in penalties in minutes
	 * @return penaltyT
	 */

	public double getPenaltyT (){
		return penaltyT;
	}

	/**
	 * Returns number of penalties
	 * @return the penaltyN
	 */
	public int getPenaltyN() {
		return penaltyN;
	}

	/**
	 * Returns true if right shooter and false if left shooter
	 * @return arm of type boolean
	 */
	public boolean getArm() {
		return arm;
	}

	/**
	 * Returns jersey number
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * Returns total number of minutes the player has been on ice
	 * @return the number of minutes
	 */
	public double getNumMin(){
		return numMin;
	}

	/**
	 * Returns if the player is rookie or not
	 * @return rookie
	 */
	public boolean getRookie() {
		return rookie;
	}

	//Mutators

	/**
	 * Stores salary per year
	 * @param x of type double
	 */

	public void putSalaryPY(double x){
		salaryPY = x;
	}

	/**
	 * Stores years in contract
	 * @param x of type int
	 */

	public void putcontractR(int x){
		contractR = x;
	}

	/**
	 * Stores total salary over entire contract length
	 * @param x of type double
	 */

	public void putTSalary(double x){
		tSalary = x;
	}

	/**
	 * Stores rating
	 * @param x of type int
	 */

	public void putRating(int x){
		rating = x;
	}

	/**
	 * Stores games played
	 * @param x of type int
	 */

	public void putGP(int x){
		gp = x;
	}

	/**
	 * Stores time spent in penalties 
	 * @param x of type double
	 */
	public void putPenaltyT(double x) {
		penaltyT = x;
	}

	/**
	 * Stores number of penalties
	 * @param x of type int
	 */
	public void putPenaltyN(int x) {
		penaltyN = x;
	}

	/**
	 * Stores true in arm if right arm is the shooting arm
	 * and false if left arm is shooting arm
	 * @param x of type boolean
	 */
	public void putArm(boolean x) {
		arm = x;
	}

	/**
	 * Assigns number the value of x, representing jersey number
	 * @param x of type int
	 */
	public void putNumber(int x) {
		number = x;
	}

	/**
	 * Assigns number the value of x, representing the total number of minutes the player has been on ice
	 * @param x of type double
	 */
	public void putNumMin(double x){
		numMin=x;
	}

	/**
	 * Assigns number the value of x, representing if the player is a rookie
	 * @param x of type boolean
	 */
	public void putRookie(boolean x) {
		rookie = x;
	}
}
