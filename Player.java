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

	//Comments here
	public Player(String name, int age, boolean gender, double height, double weight, int month, int day, int year, String place, String mStatus) {//+more 
		super(name, age, gender, height, weight, month, day, year, place, mStatus);
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
	
	//Person accessor and mutator methods
	String getName(){
		return name;
	}
	
	int getAge(){
		return age;
	}
	
	boolean getGender(){
		return gender;
	}
	
	double getHeight(){
		return height;
	}
	
	double getWeight(){
		return weight;
	}
	
	int getBirthDay(){
		return birthDay;
	}
	
	int getBirthMonth(){
		return birthMonth;
	}
	
	int getBrithYear(){
		return birthYear;
	}
	
	int getBirthYear() {
		return birthYear;
	}
	
	String getBirthPlace(){
		return birthPlace;
	}
	
	String getMaritalStatus(){
		return maritalStatus;
	}
	
	protected void setBirthPlace(){
		switch(Integer.parseInt(birthPlace)){
		case 1:
			birthPlace="Austria";
			break;
		case 2:
			birthPlace="Balarus";
			break;
		case 3:
			birthPlace="Canada";
			break;
		case 4:
			birthPlace="Czeck Republic";
			break;
		case 5:
			birthPlace="Denmark";
			break;
		case 6:
			birthPlace="Finland";
			break;
		case 7:
			birthPlace="France";
			break;
		case 8:
			birthPlace="Germany";
			break;
		case 9:
			birthPlace="Hungary";
			break;
		case 10:
			birthPlace="Italy";
			break;
		case 11:
			birthPlace="Kazakhstan";
			break;
		case 12:
			birthPlace="Latvia";
			break;
		case 13:
			birthPlace="Norway";
			break;
		case 14:
			birthPlace="Russia";
			break;
		case 15:
			birthPlace="Slovakia";
			break;
		case 16:
			birthPlace="Slovenia";
			break;
		case 17:
			birthPlace="Sweden";
			break;
		case 18:
			birthPlace="Switzerland";
			break;
		case 19:
			birthPlace="Ukraine";
			break;
		case 20:
			birthPlace="United States";
			break;
		default:
			birthPlace="X"; //Unknown birthplace
			break;
		}
	}
	
	protected void setMaritalStatus (){
		switch (Integer.parseInt(maritalStatus)){
		case 1:
			maritalStatus="Divorced";
			break;
		case 2:
			maritalStatus="Married";
			break;
		case 3:
			maritalStatus="Single";
			break;
		case 4:
			maritalStatus="Widowed";
			break;
		default:
			maritalStatus="x";
			break;
		}
	}
	
	protected void putName(String x){
		name = x;
	}
	
	protected void putAge(int x){
		age = x;
	}
	
	protected void putGender (boolean x){
		gender = x;
	}
	
	protected void putHeight (double x){
		height = x;
	}
	
	protected void putWeight (double x){
		weight = x;
	}
	
	protected void putBirthday (int x){
		birthDay = x;
	}
	
	protected void putBirthMonth (int x){
		birthMonth = x;
	}
	
	protected void putBirthYear (int x){
		birthYear = x;
	}
	
	protected void putBirthplace (String x){
		birthPlace = x;
	}
	
	protected void putMaritalStatus (String x){
		maritalStatus = x;
	}
}
