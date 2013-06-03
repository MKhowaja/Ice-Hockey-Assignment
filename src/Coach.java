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
		super(br);
	}
	
	/**
	 * Runs prompt method in order to prompt for all fields in Coach and then create an object of type Coach
	 * @throws IOException
	 */
	public Coach() {
		super();
	}
		
	/**
	 * Saves statistics of a coach onto a text file
	 * @param pw of type PrintWriter
	 * @overrides save in Person
	 */
	public void save(PrintWriter pw){
		super.save(pw);
	}

}
