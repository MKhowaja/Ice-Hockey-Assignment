public class Player extends Person {
	protected double salaryPY; //Salary per year
	protected int contractR; //# of years remaining of contract 
	protected double tSalary; //Total salary over entire contract length
	protected int rating; //Temp for something awesome
	protected int gp; //Games played
	protected double penaltyT; //Time spent in penalties
	protected int penaltyN; //Number of penalties
	protected boolean arm; //Shooting arm: True if right arm
	protected int number; //Jersey number

	public Player(String name, int age, boolean gender, double height, double weight, int month, int day, int year, int place, int mStatus,//person fields
			double salaryPY, int contractR, double tSalary, int rating, int gp, double penaltyT, int penaltyN, boolean arm, int number) {//player fields
		super(name, age, gender, height, weight, month, day, year, place, mStatus);
		this.salaryPY = salaryPY;
		this.contractR = contractR;
		this.tSalary = tSalary;
		this.rating = rating;
		this.gp = gp;
		this.penaltyT = penaltyT;
		this.penaltyN = penaltyN;
		this.arm = arm;
		this.number = number;
	}

	//Accessors

	/**
	 * Returns salary per year
	 * @return salaryPY
	 * @author MK, AV, CH, PJ
	*/

	public double getSalaryPY(){
		return salaryPY;
	}

	/**
	 * Returns remaining years in contract
	 * @return contractR
	 * @author MK, AV, CH, PJ
	*/

	public int getcontractR(){
		return contractR;
	}

	/**
	 * Returns total salary over entire contract length
	 * @return tSalary
	 * @author MK, AV, CH, PJ
	*/

	public double getTSalary(){
		return tSalary;
	}

	/**
	 * Returns rating
	 * @return rating
	 * @author MK, AV, CH, PJ
	*/

	public int getRating(){
		return rating;
	}

	/**
	 * Returns games played
	 * @return gp
	 * @author MK, AV, CH, PJ
	*/

	public int getGP(){
		return gp;
	}

	/**
	 * Returns time spent in penalties in minutes
	 * @return penaltyT
	 * @author MK, AV, CH, PJ
	*/

	public double getPenaltyT (){
		return penaltyT;
	}

	/**
	 * Returns number of penalties
	 * @return the penaltyN
	 * @author MK, AV, CH, PJ
	 */
	public int getPenaltyN() {
		return penaltyN;
	}

	/**
	 * Returns true if right shooter and false if left shooter
	 * @return arm of type boolean
	 * @author MK, AV, CH, PJ
	 */
	public boolean getArm() {
		return arm;
	}

	/**
	 * Returns Jersey number
	 * @return the number
	 * @author MK, AV, CH, PJ
	 */
	public int getNumber() {
		return number;
	}

	//Mutators

	/**
	 * Stores salary per year
	 * @param x of type double
	 * @author MK, AV, CH, PJ
	*/

	public void putSalaryPY(double x){
		salaryPY = x;
	}

	/**
	 * Stores years in contract
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	*/

	public void putcontractR(int x){
		contractR = x;
	}

	/**
	 * Stores total salary over entire contract length
	 * @param x of type double
	 * @author MK, AV, CH, PJ
	*/

	public void putTSalary(double x){
		tSalary = x;
	}

	/**
	 * Stores rating
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	*/

	public void putRating(int x){
		rating = x;
	}

	/**
	 * Stores games played
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	*/

	public void putGP(int x){
		gp = x;
	}

	/**
	 * Stores time spent in penalties 
	 * @param x of type double
	 * @author MK, AV, CH, PJ
	 */
	public void putPenaltyT(double x) {
		penaltyT = x;
	}

	/**
	 * Stores number of penalties
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	 */
	public void putPenaltyN(int x) {
		penaltyN = x;
	}

	/**
	 * Stores true in arm if right arm is the shooting arm
	 * and false if left arm is shooting arm
	 * @param x of type boolean
	 * @author MK, AV, CH, PJ
	 */
	public void putArm(boolean x) {
		arm = x;
	}

	/**
	 * Assigns number the value of x, representing jersey number
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	 */
	public void putNumber(int x) {
		number = x;
	}
}
