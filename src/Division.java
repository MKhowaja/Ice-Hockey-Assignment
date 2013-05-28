public class Division{
  	protected String divName; //name of the division
	protected String conference; // name of the conference (Eastern or Western) 
	protected Team team[] = new Team [1]; //A group of teams specific to each division 
	
	public Division (int i, int j){
		if (i == 0){
			putConference("Eastern");
			if (j ==0){
				putDivName("Atlantic Division");
			}
			else if (j==1){
				putDivName("Northeast Division");
			}
			else{
				putDivName("Southeast Division");
			}
		}
		else{
			putConference("Western");
			if (j ==0){
				putDivName("Central Division");
			}
			else if (j==1){
				putDivName("Northwest Division");
			}
			else{
				putDivName("Pacific Division");
			}
		}
	}
	
	//Accessor Methods
	/**
	 * Returns the division name 
	 * @return divName
	 * @author MK, AV, CH, PJ
	 */
	public String getDivName() {
		return divName;
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
	 * Stores parameter to divName
	 * @param x of type String
	 * @author MK, AV, CH, PJ
	 */
	
	public void putDivName(String x) {
		divName = x;
	}
	
	/**
	 * Stores parameter to conference
	 * @param x of type String
	 * @author MK, AV, CH, PJ
	 */

	public void putConference(String x) {
		conference = x;
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
