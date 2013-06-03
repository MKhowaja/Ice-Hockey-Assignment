import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;


abstract class Coach extends Person { 
	
	/**
	 * Constructs an object of type coach
	 * @param fname, lname of type string and gender of type boolean and height, weight of type double and month, day, year, place, mStatus of type int
	 * @throws IOException
	 */
	public Coach(String fname, String lname, boolean gender,
			double height, double weight, int month, int day, int year,
			int place, int mStatus) {
		super(fname, lname, gender, height, weight, month, day, year, place, mStatus);
	}
	
	/**
	 * Runs load method in order to construct an object of type Coach
	 * @throws IOException
	 */
	public Coach(BufferedReader br) throws IOException {
		load(br);
	}
	
	/**
	 * Runs prompt method in order to prompt for all fields in Coach and then create an object of type Coach
	 * @throws IOException
	 */
	public Coach() {
		prompt();
	}
	
	/**
	 * Loads coach data from a text file into this object
	 * @author MK, AV, CH, PJ
	 * @throws IOException 
	 * @overrides load in Person
	 */
	public void load(BufferedReader br) throws IOException {
		super.load(br); //loads person fields
	}
	
	/**
	 * Saves statistics of a coach onto a text file
	 * @param pw of type PrintWriter
	 * @overrides save in Person
	 */
	public void save(PrintWriter pw){
		super.save(pw);
	}
	
	/**
	 * Loads a coach's data through prompting the user
	 * @author MK, AV, CH, PJ
	 * @overrides prompt in Person
	 */
	public void prompt() {
		super.prompt();
	}

}
