public class League {
  private final String name = "NHL";
	private Conference[] conference = new Conference[2];
	
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
