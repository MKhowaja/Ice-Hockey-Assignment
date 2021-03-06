public class Conference {
	private String name; //name of the conference (Eastern or Western)
	private Division [] divisions = new Division [3]; //A group of divisions
	
	/**
	 * Constructs object of type Conference
	 * @param i of type int which classifies the conference as either Eastern or Western
	 */
	public Conference (int i){
		if (i == 0){
			putName("Eastern");
			for (int j = 0; j <divisions.length; j++){
				divisions[j] = new Division(i, j);
			}
		}
		else{
			putName("Western");
			for (int j = 0; j <divisions.length; j++){
				divisions[j] = new Division(i, j);
			}
		}
	}
	
	//Accessor Methods
	/**
	 * Returns the conference name 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the division at location i
	 * @param int i the index of the array
	 * @return divisions
	 */
	public Division getdivisions(int i) {
		return divisions[i];
	}

	//Mutator Methods
	/**
	 * Stores parameter to conference
	 * @param x of type String
	 */
	public void putName(String x) {
		name = x;
	}
	
	/**
	 * Stores parameter to divisions[]
	 * @param x of type Division
	 */
	
	public void putdivisions(Division[] x) {
		divisions = x;
	}

}
