
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

}
