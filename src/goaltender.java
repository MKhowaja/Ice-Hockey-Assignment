import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;


public class goaltender extends Coach {

	/**
  	* Constructs an object of type goaltender
	* @param  fname, lname of type string and gender of type boolean and height, weight of type double and month, day, year, place, mStatus of type int
	* @throws IOException
	*/
	public goaltender(String fname, String lname, boolean gender,
			double height, double weight, int month, int day, int year,
			int place, int mStatus) {
		super(fname, lname, gender, height, weight, month, day, year, place, mStatus);
	}
	
	/**
   	* Constructs an object of type goaltender by calling the load method
	* @throws IOException
	*/
	public goaltender(BufferedReader br) throws IOException {
		super(br);
	}
	
	/**
   	* Constructs an object of type goaltender by prompting for each field
	* @throws IOException
	*/
	public goaltender() {
		super();
	}
	
	/**
	 * Saves statistics of a goaltender onto a text file
	 * @param pw of type PrintWriter
	 * @overrides save in Coach
	 */
	public void save(PrintWriter pw){
		super.save(pw);
	}
}
