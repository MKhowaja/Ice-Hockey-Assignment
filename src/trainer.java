import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;


public class trainer extends Coach {
	
	/**
   	* Constructs an object of type trainer
	* @param  fname, lname of type string and gender of type boolean and height, weight of type double and month, day, year, place, mStatus of type int
	* @throws IOException
	*/
	public trainer(String fname, String lname, boolean gender,
			double height, double weight, int month, int day, int year,
			int place, int mStatus) {
		super(fname, lname, gender, height, weight, month, day, year, place, mStatus);
	}
	
	/**
   	* Constructs an object of type trainer by calling the load method
	* @throws IOException
	*/
	public trainer(BufferedReader br) throws IOException {
		load(br);
	}
	
	/**
   	* Constructs an object of type trainer by prompting for each field
	* @throws IOException
	*/
	public trainer() {
		prompt();
	}
	
	/**
	 * Loads the trainer data from a text file into this trainer object
	 * @author MK, AV, CH, PJ
	 * @throws IOException 
	 * @overrides load in Coach
	 */
	public void load(BufferedReader br) throws IOException {
		super.load(br); //loads coach fields
	}
	/**
	 * Saves statistics of a trainer onto a text file
	 * @param pw of type PrintWriter
	 * @overrides save in Coach
	 */
	public void save(PrintWriter pw){
		super.save(pw);
	}
	/**
	 * Loads a trainer's data through prompting the user
	 * @author MK, AV, CH, PJ
	 * @overrides prompt in Coach
	 */
	public void prompt() {
		super.prompt();
	}

}
