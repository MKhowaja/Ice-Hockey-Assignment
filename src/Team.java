
public abstract class Team {
  protected String name; //Name of team (Documenting required)
	protected String division; // that the division belongs to
	protected String conference; // that the conference belongs to
	protected String [] coachingstaff;  // coaches, assistants, trainers, etc.
	protected String [] players;  // a structure that will contain the maximum number of roster spots allowed for a team
	protected double payroll;   //how much the team is paying its players currently for the season
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
	public String[] getCoachingstaff() {
		return coachingstaff;
	}

	/**
	 * Returns the players in the team
	 * @return the players
	 * @author MK, AV, CH, PJ
	 */
	public String[] getPlayers() {
		return players;
	}

	/**
	 * @return the payroll
	 * @author MK, AV, CH, PJ
	 */
	public double getPayroll() {
		return payroll;
	}

	/**
	 * @param name the name to set
	 * @author MK, AV, CH, PJ
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param coachingstaff the coachingstaff to set
	 */
	public void setCoachingstaff(String[] coachingstaff) {
		this.coachingstaff = coachingstaff;
	}

	/**
	 * @param players the players to set
	 */
	public void setPlayers(String[] players) {
		this.players = players;
	}

	/**
	 * @param payroll the payroll to set
	 */
	public void setPayroll(double payroll) {
		this.payroll = payroll;
	}

	abstract void putDivision (String name);
	
	abstract void putConference (int division);

}
