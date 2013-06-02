import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;


public class goaltender extends Coach {

	public goaltender(String fname, String lname, boolean gender,
			double height, double weight, int month, int day, int year,
			int place, int mStatus) {
		super(fname, lname, gender, height, weight, month, day, year, place, mStatus);
	}
	
	public goaltender(BufferedReader br) throws IOException {
		load(br);
	}
	
	public goaltender() {
		prompt();
	}
	
	/**
	 * Loads the goaltender data from a text file into this goaltender object
	 * @author MK, AV, CH, PJ
	 * @throws IOException 
	 * @overrides load in Coach
	 */
	public void load(BufferedReader br) throws IOException {
		super.load(br); //loads coach fields
	}
	
	/**
	 * Saves statistics of a goaltender onto a text file
	 * @param pw of type PrintWriter
	 * @overrides save in Coach
	 */
	public void save(PrintWriter pw){
		super.save(pw);
	}
	
	/**
	 * Loads a goaltender's data through prompting the user
	 * @author MK, AV, CH, PJ
	 * @overrides prompt in Coach
	 */
	public void prompt() {
		super.prompt();
	}
	
	
}
