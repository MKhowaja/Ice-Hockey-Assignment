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
	 * Returns the conference name
	 * @return conference
	 */
	public Conference [] getdConference() {
		return conference;
	}

	//Mutator Methods

	/**
	 * Stores parameter to conference[]
	 * @param x of type Conference
	 */

	public void putConference(Conference[] x) {
		conference = x;
	}


}
