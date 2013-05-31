import java.io.BufferedReader;
import java.io.IOException;

public class assistant extends Coach{

	public assistant(String fname, String lname, boolean gender,
			double height, double weight, int month, int day, int year,
			int place, int mStatus) {
		super(fname, lname, gender, height, weight, month, day, year, place, mStatus);

	}

	/**
	 * Loads the assistant coach data from a text file into this assistant object
	 * @param String filepath
	 * @author MK, AV, CH, PJ
	 * @throws IOException 
	 * @overrides load in Coach
	 */
	public void load(String filepath, BufferedReader br) throws IOException {
		super.load(filepath, br); //loads coach fields
	}

}
