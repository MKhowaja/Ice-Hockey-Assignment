import java.io.BufferedReader;
import java.io.IOException;


abstract class Coach extends Person { 
	
	public Coach(String fname, String lname, boolean gender,
			double height, double weight, int month, int day, int year,
			int place, int mStatus) {
		super(fname, lname, gender, height, weight, month, day, year, place, mStatus);
	}
	
	/**
	 * Loads coach data from a text file into this object
	 * @param String filepath
	 * @author MK, AV, CH, PJ
	 * @throws IOException 
	 * @overrides load in Person
	 */
	public void load(String filepath, BufferedReader br) throws IOException {
		super.load(filepath, br); //loads person fields
	}

}
