public class Player extends Person {
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

	public Player(String fname, String lname, boolean gender, double height, double weight, int month, int day, int year, int place, int mStatus,//person fields
			double salaryPY, int contractR, double tSalary, int gp, double penaltyT, int penaltyN, boolean arm, int number, double numMin,
			boolean rookie) {//player fields
		
		super(fname, lname, gender, height, weight, month, day, year, place, mStatus);
		this.salaryPY = salaryPY;
		this.contractR = contractR;
		this.tSalary = tSalary;
		this.rating = rating;
		this.gp = gp;
		this.penaltyT = penaltyT;
		this.penaltyN = penaltyN;
		this.arm = arm;
		this.number = number;
		this.numMin = numMin;
		this.rookie = rookie;
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
