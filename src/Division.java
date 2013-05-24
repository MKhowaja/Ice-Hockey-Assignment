public class Division{
  	protected String divName;
	protected String conference;
	protected Team team[];
	
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
	public void putDivName(int x) {
		if (x>=1 && x<=5)
			divName="Alantic";
		else if (x>=6 && x<=10)
			divName="Northeast";
		else if (x>=11 && x<=15)
			divName="Southeast";
		else if (x>=16 && x<=20)
			divName="Central";
		else if (x>=21 && x<=25)
			divName="Northwest";
		else if (x>=26 && x<=30)
			divName="Southeast";
	}
	
	/*
	how about this for putDivName:
	
	public void putDivName(int x) {
		if (x>=26 && x<=30)
			divName="Southeast";
		else if (x>=21)
			divName="Northwest";
		else if (x>=16)
			divName="Central";
		else if (x>=11)
			divName="Southeast";
		else if (x>=6)
			divName="Northeast";
		else if (x>=1)
			divName="Alantic";
	}
	
	i remember mr. chen saying how he doesnt like this kind of selection in the very beginning of the course
	*/
	
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
