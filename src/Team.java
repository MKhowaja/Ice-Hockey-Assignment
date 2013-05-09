
public class Team {
	protected String name; //Name of team (Documenting required)
	protected String division; // that the division belongs to
	protected String conference; // that the conference belongs to
	protected Coach [] coachingstaff;  // coaches, assistants, trainers, etc.
	protected Player [] players;  // a structure that will contain the maximum number of roster spots allowed for a team
	protected double payroll;   //how much the team is paying its players currently for the season (in millions)
	protected final double salarycap = 64.3;   // set by the league. It is the same for all teams (in millions)
	//Team stats here (research required)
		
	/**
	 * Returns name
	 * @return the name
	 * @author MK, AV, CH, PJ
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns coaching staff
	 * @return the coachingstaff
	 * @author MK, AV, CH, PJ
	 */
	public Coach [] getCoachingstaff() {
		return coachingstaff;
	}

	/**
	 * Returns the players in the team
	 * @return the players
	 * @author MK, AV, CH, PJ
	 */
	public Player[] getPlayers() {
		return players;
	}

	/**
	 * Returns the total payroll of the team
	 * @return the payroll
	 * @author MK, AV, CH, PJ
	 */
	public double getPayroll() {
		return payroll;
	}

	/**
	 * Assigns the field name the name of the team
	 * @param x the name of the team
	 * @author MK, AV, CH, PJ
	 */
	public void putName(String x) {
		name = x;
	}

	/**
	 * Assigns the field coachingstaff with the array of coaches
	 * @param x an array of coaches to set
	 * @author MK, AV, CH, PJ
	 */
	public void putCoachingstaff(Coach [] x) {
		coachingstaff = x;
	}

	/**
	 * Assigns the field players with the array of players
	 * @param x an array of coaches to set
	 * @author MK, AV, CH, PJ
	 */
	public void putPlayers(Player [] x) {
		players = x;
	}

	/**
	 * Assigns payroll with the amount of expenses the team 
	 * incurres annually (in millions)
	 * @param x of type double, the amount of payroll for the team (in millions)
	 */
	public void putPayroll(double x) {
		payroll = x;
	}

	public void putDivision (String name){
		
	}
	
	public void putConference (int division){
		
	}

}
