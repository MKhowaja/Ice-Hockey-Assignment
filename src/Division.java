import java.util.Stack;

public class Division{
  	protected String name; //name of the division
	protected String conference; // name of the conference (Eastern or Western) 
	protected Stack <Team> team = new Stack <Team> (); //A group of teams specific to each division 
	
	public Division (int i, int j){
		if (i == 0){
			putConference("Eastern");
			if (j ==0){
				putName("Atlantic Division");
			}
			else if (j==1){
				putName("Northeast Division");
			}
			else{
				putName("Southeast Division");
			}
		}
		else{
			putConference("Western");
			if (j ==0){
				putName("Central Division");
			}
			else if (j==1){
				putName("Northwest Division");
			}
			else{
				putName("Pacific Division");
			}
		}
	}
	
	//Accessor Methods
	/**
	 * Returns the division name 
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Returns the conference name
	 * @return conference
	 */
	public String getConference() {
		return conference;
	}
	
	/**
	 * Returns the stack of teams in the division
	 * @return team
	 */
	public Stack<Team> getTeam() {
		return team;
	}
	
	//Mutator Methods
	/**
	 * Stores parameter to name
	 * @param x of type String
	 */

	
	public void putName(String x) {
		name = x;
	}
	
	/**
	 * Stores parameter to conference
	 * @param x of type String
	 */

	public void putConference(String x) {
		conference = x;
	}
		
	/**
	 * Stores parameter to team
	 * @param x of type Team
	 */
	public void addTeam(Team t) {
		team.push(t);
	}

}
