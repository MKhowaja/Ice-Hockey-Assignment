public class Division{
  	protected String name;
	protected String conference;
	protected Team team[];
	
	//Accessor Methods
	/**
	 * Returns the division name 
	 * @return name
	 * @author MK, AV, CH, PJ
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Returns the conference name
	 * @return conference
	 * @author MK, AV, CH, PJ
	 */
	public String getConference() {
		return conference;
	}
	
	/**
	 * Returns the array of teams in the division
	 * @return team
	 * @author MK, AV, CH, PJ
	 */
	public Team[] getTeam() {
		return team;
	}
	
	//Mutator Methods
	/**
	 * Stores parameter to name
	 * @param x of type Integer
	 * @author MK, AV, CH, PJ
	 */
	
	public void putName(int x) {
		if (x>=26 && x<=30)
			name="Southeast";
		else if (x>=21)
			name="Northwest";
		else if (x>=16)
			name="Central";
		else if (x>=11)
			name="Southeast";
		else if (x>=6)
			name="Northeast";
		else if (x>=1)
			name="Atlantic";
	}
	
	/**
	 * Stores parameter to conference
	 * @param x of type Integer
	 * @author MK, AV, CH, PJ
	 */

	public void putConference(int x) {
		if (x>=4 && x<=6)
			conference = "Western";
		else if (x>=1)
			conference="Eastern";
	}
		
	/**
	 * Stores parameter to team[]
	 * @param x of type Team
	 * @author MK, AV, CH, PJ
	 */
	public void putTeam(Team[] x) {
		team = x;
	}
	
	
	
}
