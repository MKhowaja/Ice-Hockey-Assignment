public class Coach extends Person{
	protected int winS; //Regular season wins
	protected int loseS; //Regular season losses
	protected int gameCS; //Regular season games coached
	protected double pointPS; //Regular season Points percentage (number of points team earned divided by total possible points)
	protected int winP; //Playoff wins
	protected int loseP; //Playoff loses
	protected int gameCP; //Playoff games coached
	protected int stanleyN; //Number of Stanley Cups
	protected int coachType; //The type of coach (1 - head, 2 - assistant or 3 - goaltender)
	protected int totalGamesCoached; //Total number of games coached

	public Coach(String fname, String lname, boolean gender, double height, double weight, int month, int day, int year, int place, int mStatus,//person fields
			int winS, int loseS, int gameCS, double pointPS, int winP, int loseP, int gameCP, int stanleyN, int coachType) {//coach fields
		super(fname, lname, gender, height, weight, month, day, year, place, mStatus);
		
		this.winS = winS;
		this.loseS = loseS;
		this.gameCS = gameCS;
		this.pointPS = pointPS;
		this.winP = winP;
		this.loseP = loseP;
		this.gameCP = gameCP;
		this.stanleyN = stanleyN;
		this.coachType = coachType;
		updatetotalGamesCoached();
	}
	
	
	//Accessor Methods
	/**
	 * Returns regular season wins
	 * @return winS
	 */
	public int getWinS(){
		return winS;
	}

	/**
	 * Returns regular season loses
	 * @return loseS
	 */
	public int getloseS(){
		return loseS;
	}

	/**
	 * Returns regular season games coached
	 * @return gameCS
	 */
	public int getGameCS(){
		return gameCS;
	}

	/**
	 * Returns regular season point percentage
	 * <p>
	 * Number of points team earned divided by total possible points
	 * @return pointPS
	 */
	public double getPointPS(){
		return pointPS;
	}

	/**
	 * Returns playoff wins
	 * @return winP
	 */
	public int getWinP(){
		return winP;
	}

	/**
	 * Returns playoff loses
	 * @return loseP
	 */
	public int getLoseP(){
		return loseP;
	}

	/**
	 * Returns playoff games coached
	 * @return gameCP
	 */
	public int getGameCP(){
		return gameCP;
	}

	/**
	 * Returns number of Stanley Cups won
	 * @return stanleyN
	 */
	public int getStanleyN(){
		return stanleyN;
	}

	/**
	 * Returns what type of coach it is (head, assistant or goaltender)
	 * @return type of coach
	 */
	public int getcoachType(){
		return coachType;
	}
	
	/**
	 * Returns total games coached
	 * @return totalGamesCoached
	 */
	public int gettotalGamesCoached() {
		return totalGamesCoached;
	}

	//Mutator Methods
	/**
	 * Stores parameter to winS
	 * @param x of type int
	 */
	public void putWinS(int x){
		winS=x;
	}

	/**
	 * Stores parameter to loseS
	 * @param x of type int
	 */
	public void putLoseS(int x){
		loseS=x;
	}

	/**
	 * Stores parameter to gameCS
	 * @param x of type int
	 */
	public void putGameCS(int x){
		gameCS=x;
	}

	/**
	 * Stores parameter to pointPS
	 * @param x of type double
	 */
	public void putPointPS(double x){
		pointPS=x;
	}

	/**
	 * Stores parameter to winP
	 * @param x of type int
	 */
	public void putWinP(int x){
		winP=x;
	}

	/**
	 * Stores parameter to loseP
	 * @param x of type int
	 */
	public void putLoseP(int x){
		loseP=x;
	}

	/**
	 * Stores parameter to gameCP
	 * @param x of type int
	 */
	public void putGameCP(int x){
		gameCP=x;
	}

	/**
	 * Stores parameter to StanleyN
	 * @param x of type int
	 */
	public void putStanleyN(int x){
		stanleyN=x;
	}
	
	/**
	 * Converts coachType to a meaningful string then returns it
	 * @return String coach type
	 */
	public static String convertCoachTypeToString(int coachType) {
		String x; //temporary variable to hold the name of the coach type
		switch (coachType) {
			case 1:
				x = "head";
				break;
			case 2:
				x = "assistant";
				break;
			case 3:
				x = "goaltender";
				break;
			default:
				x = "n/a";
		}
		return x;
	}
	
	/**
	 * Converts a string representing coachType into an int, then returns it
	 * @return int coach type
	 */
	public static int convertCoachTypeToInt(String coachType) {
		int x;
		if (coachType.equals("head"))
			x = 1;
		else if (coachType.equals("assistant"))
			x = 2;
		else if (coachType.equals("goaltender"))
			x = 3;
		else 
			x = 0;
		return x;
	}
	
	//Update Methods
	/**
	 * updates totalGames Coached
	 */
	public void updatetotalGamesCoached() {
		totalGamesCoached = gameCP + gameCS;
	}
	
}
