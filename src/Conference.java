public class Conference {
	private String confName;
	private Division [] divisions; //A group of divisions
	
	//Accessor Methods
		/**
		 * Returns the conference name 
		 * @return divName
		 */
		public String getconfName() {
			return confName;
		}

		/**
		 * Returns the division name
		 * @return conference
		 */
		public Division [] getdivisions() {
			return divisions;
		}

	//Mutator Methods
		/**
		 * Stores parameter to conference
		 * @param x of type Integer
		 */

		public void putconfName(int x) {
			if (x>=4 && x<=6)
				confName = "Western";
			else if (x>=1)
				confName = "Eastern";
		}
		
		/**
		 * Stores parameter to divisions[]
		 * @param x of type Division
		 */
		
		public void putdivisions(Division[] x) {
			divisions = x;
		}
	
}
