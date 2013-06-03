import java.io.BufferedReader;
import java.io.IOException;

public class assistant extends Coach{

	/**
   	* Constructs an object of type assistant
	* @param  fname, lname of type string and gender of type boolean and height, weight of type double and month, day, year, place, mStatus of type int
	* @throws IOException
	*/
	public assistant(String fname, String lname, boolean gender,
			double height, double weight, int month, int day, int year,
			int place, int mStatus) {
		super(fname, lname, gender, height, weight, month, day, year, place, mStatus);

	}

	/**
   	* Constructs an object of type assistant by calling the load method
	* @throws IOException
	*/
	public assistant(BufferedReader br) throws IOException {
		super(br);
	}
	
	/**
   	* Constructs an object of type assistant by prompting for each field
	* @throws IOException
	*/
	public assistant() {
		super();
	}
	
	/**
	 * Loads a assistant's data through prompting the user
	 * @author MK, AV, CH, PJ
	 * @overrides prompt in Coach
	 */
	public void prompt() {
		super.prompt();
	}

}
