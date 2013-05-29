public class League {
	private final String name = "NHL"; //name of the league (preset to National Hockey League) 
	private Conference[] conference = new Conference [2]; //an array of type conference (to hold Eastern and Western Conferences) 

	public League(){
		for (int i = 0; i <conference.length; i++){
			conference[i] = new Conference(i);
		}
	}
	//Accessor Methods
	/**
	 * Returns the League Name
	 * @return name
	 */
	public String name() {
		return name;
	}

	/**
	 * Returns the conference at location i 
	 * @param int i the index in the array
	 * @return conference
	 */
	public Conference getConference(int i) {
		return conference[i];
	}

	//Mutator Methods

	/**
	 * Stores parameter to conference[]
	 * @param x of type Conference
	 */

	public void putConference(Conference[] x) {
		conference = x;
	}
	public void addTeam(Team x){
		int conf = x.confNum();
		int div = x.divNum();
		this.getConference(conf).getdivisions(div).addTeam(x);
	}

}
