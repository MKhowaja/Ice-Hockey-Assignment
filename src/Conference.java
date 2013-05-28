public class Conference {
	private String name; //name of the confernce (Easter or Western)
	private Division [] divisions; //A group of divisions
	
	//Accessor Methods
		/**
		 * Returns the conference name 
		 * @return confname
		 */
		public String getname() {
			return name;
		}

		/**
		 * Returns the division name
		 * @return divisions
		 */
		public Division [] getdivisions() {
			return divisions;
		}

	//Mutator Methods
		/**
		 * Stores parameter to conference
		 * @param x of type Integer
		 */

		public void putname(int x) {
			if (x>=4 && x<=6)
				name = "Western";
			else if (x>=1)
				name = "Eastern";
		}
		
		/**
		 * Stores parameter to divisions[]
		 * @param x of type Division
		 */
		
		public void putdivisions(Division[] x) {
			divisions = x;
		}
	
}
