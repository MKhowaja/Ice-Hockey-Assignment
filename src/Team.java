public class Team {
	private String name; //Name of team
	/*
      1. New Jersey Devils
      2. New York Islanders
      3. New York Rangers
      4. Philadelphia Flyers
      5. Pittsburgh Penguins
      6. Boston Bruins
      7. Buffalo Sabres
      8. Montréal Canadiens
      9. Ottawa Senators
      10. Toronto Maple Leafs
      11. Carolina Hurricanes
      12. Florida Panthers
      13. Tampa Bay Lightning
      14. Washington Capitals
      15. Winnipeg Jets
      16. Chicago Blackhawks
      17. Columbus Blue Jackets
      18. Detroit Red Wings
      19. Nashville Predators
      20. St. Louis Blues
      21. Calgary Flames
      22. Edmonton Oilers
      23. Colorado Avalanche
      24. Minnesota Wild
      25. Vancouver Canucks
      26. Anaheim Ducks
      27. Dallas Stars
      28. Los Angeles Kings
      29. Phoenix Coyotes
      30. San Jose Sharks
	 */
	private String division; // that the division belongs to
	private String conference; // that the conference belongs to
	private Coach [] coachingstaff;  // coaches, assistants, trainers, etc.
	private Player [] players;  // a structure that will contain the maximum number of roster spots allowed for a team
	private double payroll;   //how much the team is paying its players currently for the season (in millions)
	private final double salarycap = 64.3;   // put by the league. It is the same for all teams (in millions)
	//Team stats (Don't know if this is enough)
	private int gp; //games played
	private int wins; //games won
	private int losses; //games lost
	private int goalsfor; //total goals scored (including power-play, short-handed and empty-net goals)
	private int goalsagainst; //total goals scored against (including power-play, short-handed and empty-net goals)
	private int ppo; //number of power play opportunities
	private int tsh; //number of times short handed
	private int ppgoals; //total number of powerplay goals
	private int shgoals; //total number of shorthanded goals
	private int ppgoalsA; //total number of powerplay goals against
	private int shgoalsA; //total number of shorthanded goals against
	private int shotsfor; //total shots
	private int shotsagainst; //total shots against
	private int saves; //total saves
	private double avgGPG; //average goals per game scored, calculated
	private double avgGAPG; //average goals per game against, calculated
	private double avgSPG; //average shots per game, calculated
	private double avgSAPG; //average shots per game against, calculated
	private double shPercent; //The total goals scored divided by the total number of shots taken, calculated
	private double savePercent; //The total saves divided by the total shots faced, calculated
	private double ppPercent; //Power play percent: Power-play goals divided by power-play opportunites or power-play goals allowed divided by times short-handed, calculated
	
	public Team(String name, String division, String conference, double payroll, int gpT,
			int wins, int losses, int goalsfor, int goalsagainst, int ppo,
			int tsh, int ppgoals, int shgoals, int ppgoalsA, int shgoalsA,
			int shotsfor, int shotsagainst, int saves) {
		super();
		this.name = name;
		this.division = division;
		this.conference = conference;
		this.payroll = payroll;
		this.gp = gpT;
		this.wins = wins;
		this.losses = losses;
		this.goalsfor = goalsfor;
		this.goalsagainst = goalsagainst;
		this.ppo = ppo;
		this.tsh = tsh;
		this.ppgoals = ppgoals;
		this.shgoals = shgoals;
		this.ppgoalsA = ppgoalsA;
		this.shgoalsA = shgoalsA;
		this.shotsfor = shotsfor;
		this.shotsagainst = shotsagainst;
		this.saves = saves;
	}

	/**
	 * Returns name of team
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Returns Division team belongs to
	 * @return the division
	 */
	public String getDivision() {
		return division;
	}
	
	/**
	 * Returns Conference team belongs to
	 * @return the conference
	 */
	public String getConference() {
		return conference;
	}

	/**
	 * Returns coaching staff
	 * @return the coachingstaff
	 */
	public Coach [] getCoachingstaff() {
		return coachingstaff;
	}

	/**
	 * Returns the players in the team
	 * @return the players
	 */
	public Player[] getPlayers() {
		return players;
	}

	/**
	 * Returns the total payroll of the team
	 * @return the payroll
	 */
	public double getPayroll() {
		return payroll;
	}

	/**
	 * Returns the salary cap for the team
	 * @return the salarycap
	 */
	public double getSalarycap() {
		return salarycap;
	}

	/**
	 * Returns total number of games played
	 * @return the gp
	 */
	public int getGP() {
		return gp;
	}
	
	/**
	 * Returns total number of games won
	 * @return the wins
	 */
	public int getWins() {
		return wins;
	}
	
	/**
	 * Returns total number of games lost
	 * @return the losses
	 */
	public int getLosses() {
		return losses;
	}

	/**
	 * Returns total goals scored by the team 
	 * @return the goalsfor
	 */
	public int getGoalsfor() {
		return goalsfor;
	}

	/**
	 * Return total goals scored against team
	 * @return the goalsagainst
	 */
	public int getGoalsagainst() {
		return goalsagainst;
	}

	/**
	 * Return total Power play opportunities
	 * @return the ppo
	 */
	public int getPpo() {
		return ppo;
	}
	
	/**
	 * Return times shorthanded
	 * @return the tsh
	 */
	public int getTsh() {
		return tsh;
	}
	
	/**
	 * Returns total powerplay goals scored
	 * @return the ppgoals
	 */
	public int getPpgoals() {
		return ppgoals;
	}

	/**
	 * Returns total short handed goals scored
	 * @return the shgoals
	 */
	public int getShgoals() {
		return shgoals;
	}

	/**
	 * Return total goals scored against during powerplay
	 * @return the ppgoalsA
	 */
	public int getPpgoalsA() {
		return ppgoalsA;
	}

	/**
	 * Returns total goals scored against during shorthanded play
	 * @return the shgoalsA
	 */
	public int getShgoalsA() {
		return shgoalsA;
	}
	
	/**
	 * Returns total shots 
	 * @return the shotsfor
	 */
	public int getShotsfor() {
		return shotsfor;
	}

	/**
	 * Return total shots against team
	 * @return the shotsagainst
	 */
	public int getShotsagainst() {
		return shotsagainst;
	}
	
	/**
	 * Returns total saves
	 * @return the saves
	 */
	public int getSaves() {
		return saves;
	}

	/**
	 * Returns average goals scored per game
	 * @return the avgGPG
	 */
	public double getAvgGPG() {
		updateAvgGPG();
		return avgGPG;
	}

	/**
	 * Returns average goals scored against per game
	 * @return the avgGAPG
	 */
	public double getAvgGAPG() {
		updateAvgGAPG();
		return avgGAPG;
	}

	/**
	 * Returns average shots per game
	 * @return the avgSPG
	 */
	public double getAvgSPG() {
		updateAvgSPG();
		return avgSPG;
	}

	/**
	 * Returns average shots against per game
	 * @return the avgSAPG
	 */
	public double getAvgSAPG() {
		updateAvgSAPG();
		return avgSAPG;
	}

	/**
	 * Returns the shooting percentage
	 * @return the shPercent
	 */
	public double getShPercent() {
		updateShPercent();
		return shPercent;
	}
	
	/**
	 * @return the savePercent
	 */
	public double getSavePercent() {
		updateSavePercent();
		return savePercent;
	}
	
	/**
	 * @return the power play Percent
	 */
	public double getPpPercent() {
		updatePpPercent();
		return ppPercent;
	}
	
	//Mutators
	
	/**
	 * Assigns the parameter to name
	 * @param name the name to put
	 */
	public void putName(String name) {
		this.name = name;
	}

	/**
	 * Assigns the parameter to division
	 * @param division the division to put
	 */
	public void putDivision(String division) {
		this.division = division;
	}

	/**
	 * Assigns the parameter to conference
	 * @param conference the conference to put
	 */
	public void putConference(String conference) {
		this.conference = conference;
	}

	/**
	 * Assigns the parameter to coachingstaff
	 * @param Coach [] x an array of coaches
	 */
	public void putCoachingstaff(Coach[] x) {
		coachingstaff = x;
	}

	/**
	 * Assigns the parameter to players
	 * @param Player [] x an array of players
	 */
	public void putPlayers(Player[] x) {
		players = x;
	}

	/**
	 * Assigns the parameter to payroll
	 * @param double x the payroll of the team
	 */
	public void putPayroll(double x) {
		payroll = x;
	}

	/**
	 * Assigns the parameter to gp
	 * @param int x the total games played
	 */
	public void putGp(int x) {
		gp = x;
	}

	/**
	 * Assigns the parameter to wins
	 * @param int x the total games won
	 */
	public void putWins(int x) {
		wins = x;
	}
	
	/**
	 * Assigns the parameter to losses
	 * @param int x the total games lost
	 */
	public void putLosses(int x) {
		losses = x;
	}
	/**
	 * Assigns the parameter to goalsfor
	 * @param int x representing total goals scored
	 */
	public void putGoalsfor(int x) {
		goalsfor = x;
	}

	/**
	 * Assigns the parameter to goalsagainst
	 * @param int x representing total goals scored against
	 */
	public void putGoalsagainst(int x) {
		goalsagainst = x;
	}
	
	/**
	 * Assigns the parameter to ppo
	 * @param int x representing power play opportunities
	 */
	public void putPpo(int x) {
		ppo = x;
	}
	
	/**
	 * Assigns the parameter to tsh
	 * @param int x representing times short handed
	 */
	public void putTsh(int x) {
		tsh = x;
	}

	/**
	 * Assigns the parameter to ppgoals
	 * @param int x representing power play goals scored
	 * 
	 */
	public void putPpgoals(int x) {
		ppgoals = x;
	}

	/**
	 * Assigns the parameter to shgoals
	 * @param int x representing short handed goals scored
	 */
	public void putShgoals(int x) {
		shgoals = x;
	}

	/**
	 * Assigns the parameter to ppgoalsA
	 * @param int x representing goals scored against during power play
	 */
	public void putPpgoalsA(int x) {
		ppgoalsA = x;
	}

	/**
	 * Assigns the parameter to shgoalsA
	 * @param int x representing short handed goals scored against
	 */
	public void putShgoalsA(int x) {
		shgoalsA = x;
	}

	/**
	 * Assigns the parameter to shotsfor
	 * @param int x representing total shots
	 */
	public void putShotsfor(int x) {
		shotsfor = x;
	}


	/**
	 * Assigns the parameter to shotsagainst
	 * @param int x representing total shots against
	 */
	public void putShotsagainst(int x) {
		shotsagainst = x;
	}
	
	/**
	 * Assigns parameter to saves
	 * @param int x representing total saves
	 */
	public void putSaves(int x) {
		saves = x;
	}
	
	/**
	 * Updates avgGPG
	 */
	public void updateAvgGPG() {
		avgGPG = goalsfor/gp;
	}

	/**
	 * Updates avgGAPG
	 */
	public void updateAvgGAPG() {
		avgGAPG = goalsagainst/gp;
	}

	/**
	 * Updates avgSPG
	 */
	public void updateAvgSPG() {
		avgSPG = shotsfor/gp;
	}

	/**
	 * Updates avgSAPG
	 */
	public void updateAvgSAPG() {
		avgSAPG = shotsagainst/gp;
	}

	/**
	 * Updates ShPercent
	 */
	public void updateShPercent() {
		shPercent = (goalsfor/shotsfor)*100;
	}
	
	/**
	 * Updates savePercent
	 */
	public void updateSavePercent() {
		savePercent = (saves/shotsagainst)*100;
	}
	
	/**
	 * Updates ppPercent
	 */
	public void updatePpPercent() {
		ppPercent = ppgoals - ppo;
	}
}
