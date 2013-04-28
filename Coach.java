public class Coach extends Person{
	protected int winS; //Regular season wins
	protected int loseS; //Regular season loses
	protected int gameCS; //Regular season games coached
	protected double pointPS; //Regular season Points percentage (number of points team earned divided by total possible points)
	protected int winP; //Playoff wins
	protected int loseP; //Playoff loses
	protected int gameCP; //Playoff games coached
	protected int stanleyN; //Number of Stanley Cups
	protected String coachType; //The type of coach (head, assistant or goaltender)

	public Coach(String name, int age, boolean gender, double height, double weight, int month, int day, int year, String place, String mStatus) {//+more 
		super(name, age, gender, height, weight, month, day, year, place, mStatus);
	}
	//Accessor Methods
	/**
	 * Returns regular season wins
	 * @return winS
	 * @author MK, AV, CH, PJ
	 */
	public int getWinS(){
		return winS;
	}

	/**
	 * Returns regular season loses
	 * @return loseS
	 * @author MK, AV, CH, PJ
	 */
	public int getloseS(){
		return loseS;
	}

	/**
	 * Returns regular season games coached
	 * @return gameCS
	 * @author MK, AV, CH, PJ
	 */
	public int getGameCS(){
		return gameCS;
	}

	/**
	 * Returns regular season point percentage
	 * <p>
	 * Number of points team earned divided by total possible points
	 * @return pointPS
	 * @author MK, AV, CH, PJ
	 */
	public double getPointPS(){
		return pointPS;
	}

	/**
	 * Returns playoff wins
	 * @return winP
	 * @author MK, AV, CH, PJ
	 */
	public int getWinP(){
		return winP;
	}

	/**
	 * Returns playoff loses
	 * @return loseP
	 * @author MK, AV, CH, PJ
	 */
	public int getLoseP(){
		return loseP;
	}

	/**
	 * Returns playoff games coached
	 * @return gameCP
	 * @author MK, AV, CH, PJ
	 */
	public int getGameCP(){
		return gameCP;
	}

	/**
	 * Returns number of Stanley Cups won
	 * @return stanleyN
	 * @author MK, AV, CH, PJ
	 */
	public int getStanleyN(){
		return stanleyN;
	}

	/**
	 * Returns what type of coach it is (head, assistant or goaltender)
	 * @return type of coach
	 * @author MK, AV, CH, PJ
	 */
	public String getCoach(){
		switch(Integer.parseInt(coachType)){
		case 1:
			return "head";
		case 2:
			return "assistant";
		case 3:
			return "goaltender";
		default:
			return "x";
		}
	}

	//Mutator Methods
	/**
	 * Stores parameter to winS
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	 */
	public void putWinS(int x){
		winS=x;
	}

	/**
	 * Stores parameter to loseS
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	 */
	public void putLoseS(int x){
		loseS=x;
	}

	/**
	 * Stores parameter to gameCS
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	 */
	public void putGameCS(int x){
		gameCS=x;
	}

	/**
	 * Stores parameter to pointPS
	 * @param x of type double
	 * @author MK, AV, CH, PJ
	 */
	public void putPointPS(double x){
		pointPS=x;
	}

	/**
	 * Stores parameter to winP
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	 */
	public void putWinP(int x){
		winP=x;
	}

	/**
	 * Stores parameter to loseP
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	 */
	public void putLoseP(int x){
		loseP=x;
	}

	/**
	 * Stores parameter to gameCP
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	 */
	public void putGameCP(int x){
		gameCP=x;
	}

	/**
	 * Stores parameter to StanleyN
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	 */
	public void putStanleyN(int x){
		stanleyN=x;
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
