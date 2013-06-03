import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Scanner;

class Person {
  	protected String fname; //First name
  	protected String lname; //Last name
	protected int age; //Age, calculated
	protected boolean gender; //True if male 
	protected double height; //Height in centimetres
	protected double weight; //Weight in kg
	protected int birthMonth; //Month of birth 
	protected int birthDay; //Day of birth
	protected int birthYear; //Year of birth
	protected int birthPlace; //Integer represents what country person is born from (based on IIHF's Top 20 International Mens Hockey Countries)
	protected int maritalStatus; //Single, Married, Divorced, Widowed etc.

	/**
	 * Constructor that creates an object of type person with parameters sent in
	 * @param String fname, String lname, int age, boolean gender, double height, double weight, int month, int day, int year, int place, int mStatus
	*/
	Person(String fname, String lname, boolean gender, double height, double weight, int month, int day, int year, int place, int mStatus) {
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.birthMonth = month;
		this.birthDay = day;
		this.birthYear = year;
		this.birthPlace = place;
		this.maritalStatus = mStatus;
		updateAge();
		convertBirthPlaceToString(birthPlace);
		convertMaritalStatusToString(maritalStatus);
	}
	
	/**
   	* Constructs an object of type Person by calling the load method
   	* @throws IOException
   	*/
	public Person(BufferedReader br) throws IOException {
		loadperson(br);
	}
	
	/**
   	* Constructs an object of type Person by prompting for each field
	* @throws IOException
	*/

	public Person() {
		prompt();
	}
	
	/**
	 * Loads a person's data through prompting the user
	 * @author MK, AV, CH, PJ
	 */
	public void prompt() {
		Scanner input3 = new Scanner(System.in);
		String tempGender;
		do {
			System.out.print("Enter the name of player: ");
			fname = input3.nextLine();
			input3.nextLine();
			System.out.print("Enter the last name of player: ");
			lname = input3.nextLine();
			input3.nextLine();
		} while (fname.equals("")&&lname.equals("")); //Ensures that something is entered

		do {
			System.out.print("Enter the age of "+fname+": ");
			age = input3.nextInt();
		} while (age <= 0); //Ensures age is greater than 0

		do {
			System.out.print("Enter the gender of "+fname+" (m/f): ");
			tempGender = input3.next();
		} while (!tempGender.equalsIgnoreCase("m") && !tempGender.equalsIgnoreCase("f"));
		if (tempGender.equalsIgnoreCase("m"))
			gender = true;
		else
			gender = false;

		do {
			System.out.print("Enter the height of "+fname+": ");
			height = input3.nextDouble();
		} while (height <= 0); //Ensures height is greater than 0

		do {
			System.out.print("Enter the weight of "+fname+": ");
			weight = input3.nextDouble();
		} while (weight <= 0); //Ensures weight is greater than 0
		
		do {
			System.out.print("Enter the birth month of "+fname+": ");
			birthMonth = input3.nextInt();
		} while (birthMonth <= 0 || birthMonth >12); //Ensures birth month is between January and December
		
		do {
			System.out.print("Enter the birth day of "+fname+": ");
			birthDay = input3.nextInt();
		} while (birthDay <= 0 || birthDay >31); //Ensures birth day is between 1 and 31
		
		do {
			System.out.print("Enter the birth year of "+fname+": ");
			birthYear = input3.nextInt();
		} while (birthYear <= 0); //Ensures birth month is greater than 0
		
		do {
			System.out.print("1. Austria\n2. Balarus\n3. Canada\n4. Czech Republic\n5. Denmark\n6. Finland\n"+
		"7. France\n8. Germany\n9. Hungary\n10. Italy\n11. Kazakhstan\n12. Latvia\n13. Norway\n14. Russia\n15. Slovakia\n16. Slovenia\n17. Sweden\n18. Switzerland\n19. Ukraine\n20. United States\n21. Other");
			System.out.println("Enter a number based on place of birth: ");
			birthPlace = input3.nextInt();
		} while (birthPlace <= 0 || birthPlace > 21); //Ensures birth place selection is in the list
		
		do {
			System.out.println("1. Divorced\n2. Married\n3. Single\n4. Widowed\n5. Other");
			System.out.print("Enter martial status based on list: "); 
			maritalStatus = input3.nextInt();
		} while (maritalStatus <= 0 || maritalStatus > 5); //Ensures martial status selection is in the list
		input3.close();
	}
	
	/**
	 * Loads person data from a text file into this object
	 * @param BufferedReader
	 * @author MK, AV, CH, PJ
	 * @throws IOException 
	 */
	public void loadperson(BufferedReader br) throws IOException {
		String x;
		//loads person fields
		x = br.readLine();
		fname = x.substring(x.indexOf(": ")+2,x.length());

		x = br.readLine();
		lname = x.substring(x.indexOf(": ")+2,x.length());

		x = br.readLine();
		age = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		x = x.substring(x.indexOf(": ")+2,x.length());
		if (x.equals("male"))
			gender = true;
		else
			gender = false;

		x = br.readLine();
		height = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		weight = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		birthMonth = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		birthDay = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		birthYear = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		birthPlace = Person.convertBirthPlaceToInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		maritalStatus = Person.convertMaritalStatusToInt(x.substring(x.indexOf(": ")+2,x.length()));
	}

	/**
	 * Saves all statistics of a person onto a text file
	 * @param pw of type PrintWriter
	 */
	public void save(PrintWriter pw) {
		pw.println("First Name: "+fname);
		pw.println("Last Name: "+lname);
		pw.println("Age: "+age);
		pw.println("Gender: "+gender);
		pw.println("Height: "+height);
		pw.println("Weight: "+weight);
		pw.println("Month of Birth: "+birthMonth);
		pw.println("Day of Birth: "+birthDay);
		pw.println("Year of Birth: "+birthYear);
		pw.println("Birthplace: "+birthPlace);
		pw.println("Martial Status: "+maritalStatus);
	}
	
	//Accessors
	
	/**
	 * Returns First name
	 * @return fname
	 */
	 public String getFName(){
	 	return fname;
	 	}

	/**
	* Returns Last name
	* @return lname
	*/

	public String getLName(){
		return lname;
	}

	/**
	 * Returns age
	 * @return age
	*/

	public int getAge(){
		updateAge();
		return age;
	}

	/**
	 * Returns gender
	 * <p>
	 * True if male and false if female.
	 * @return gender
	*/

	public boolean getGender(){
		return gender;
	}

	/**
	 * Returns height in centimetres
	 * @return height
	*/

	public double getHeight(){
		return height;
	}

	/**
	 * Returns weight in kg
	 * @return weight
	*/

	public double getWeight(){
		return weight;
	}

	/**
	 * Returns day of birth
	 * @return birthDay
	*/

	public int getBirthDay(){
		return birthDay;
	}

	/**
	 * Returns month of birth
	 * @return birthDay
	*/

	public int getBirthMonth(){
		return birthMonth;
	}

	/**
	 * Returns year of birth
	 * @return birthYear
	*/

	public int getBirthYear(){
		return birthYear;
	}

	/**
	 * Returns the country using field birthPlace based on IIHF's Top 20 International Men's Hockey Countries 
	 * @return nationality/country of birth
	 */
	public int getBirthPlace(){
		return birthPlace;
	}
	
	/**
	 * Returns Marital status
	 * <p>
	 * Single, Married, Divorced or Widowed.
	 * @return maritalStatus
	*/
	public int getMaritalStatus(){
		return maritalStatus;
	}

	//Mutators
	
	/**
	* Stores parameter to fname
	* @param x of type String
	*/

	public void putFName(String x){
		fname = x;
	}

	/**
	* Stores parameter to lname
	* @param x of type String
	*/

	public void putLName(String x){
	lname = x;
	}

	/**
	 * Stores parameter to gender
	 * @param x of type boolean
	*/

	public void putGender (boolean x){
		gender = x;
	} 

	/**
	 * Stores parameter to height
	 * @param x of type double
	*/

	public void putHeight (double x){
		height = x;
	}
	
	/**
	 * Stores parameter to weight
	 * @param x of type double
	*/

	public void putWeight (double x){
		weight = x;
	}

	/**
	 * Stores parameter to birthDay
	 * @param x of type int
	*/

	public void putBirthday (int x){
		birthDay = x;
	}

	/**
	 * Stores parameter to birthMonth
	 * @param x of type int
	 */

	public void putBirthMonth (int x){
		birthMonth = x;
	}

	/**
	 * Stores parameter to birthDay
	 * @param x of type int
	*/

	public void putBirthYear (int x){
		birthYear = x;
	}

	/**
	 * Stores parameter to birthPlace
	 * @param x of type String
	*/

	public void putBirthplace (int x){
		birthPlace = x;
	}

	/**
	 * Stores parameter to maritalStatus
	 * @param x of type String
	*/

	public void putMaritalStatus (int x){
		maritalStatus = x;
	}
	
	/**
	 * Converts a string representing coachType into an int, then returns it
	 * @return int birthPlace
	 */
	public static String convertBirthPlaceToString(int birthPlace){
		String x;//string that holds country or origin/birthplace
		switch(birthPlace){
			case 1:
				x = "Austria";
				break;
			case 2:
				x = "Balarus";
				break;
			case 3:
				x = "Canada";
				break;
			case 4:
				x = "Czech Republic";
				break;
			case 5:
				x = "Denmark";
				break;
			case 6:
				x = "Finland";
				break;
			case 7:
				x = "France";
				break;
			case 8:
				x = "Germany";
				break;
			case 9:
				x = "Hungary";
				break;
			case 10:
				x = "Italy";
				break;
			case 11:
				x = "Kazakhstan";
				break;
			case 12:
				x = "Latvia";
				break;
			case 13:
				x = "Norway";
				break;
			case 14:
				x = "Russia";
				break;
			case 15:
				x = "Slovakia";
				break;
			case 16:
				x = "Slovenia";
				break;
			case 17:
				x = "Sweden";
				break;
			case 18:
				x = "Switzerland";
				break;
			case 19:
				x = "Ukraine";
				break;
			case 20:
				x = "United States";
				break;
			default:
				x = "n/a"; //Unknown birthplace
				break;
		}
		return x;
	}
	
	/**
	 * Converts birthPlace into a meaningful string, then returns it
	 * @return String birthPlace
	 */
	public static int convertBirthPlaceToInt(String birthPlace){
		int x; // Represents option chosen by user
		if (birthPlace.equals("Austria"))
			x = 1;
		else if (birthPlace.equals("Balarus"))
			x = 2;
		else if (birthPlace.equals("Canada"))
			x = 3;
		else if (birthPlace.equals("Czech Republic"))
			x = 4;
		else if (birthPlace.equals("Denmark"))
			x = 5;
		else if (birthPlace.equals("Finland"))
			x = 6;
		else if (birthPlace.equals("France"))
			x = 7;
		else if (birthPlace.equals("Germany"))
			x = 8;
		else if (birthPlace.equals("Hungary"))
			x = 9;
		else if (birthPlace.equals("Italy"))
			x = 10;
		else if (birthPlace.equals("Kazakhstan"))
			x = 11;
		else if (birthPlace.equals("Latvia"))
			x = 12;
		else if (birthPlace.equals("Norway"))
			x = 13;
		else if (birthPlace.equals("Russia"))
			x = 14;
		else if (birthPlace.equals("Slovakia"))
			x = 15;
		else if (birthPlace.equals("Slovenia"))
			x = 16;
		else if (birthPlace.equals("Sweden"))
			x = 17;
		else if (birthPlace.equals("Switzerland"))
			x = 18;
		else if (birthPlace.equals("Ukraine"))
			x = 19;
		else if (birthPlace.equals("United States"))
			x = 20;
		else 
			x = 0;
		
		return x;
	}

	/**
	 * Converts a string representing maritalStatus into an int, then returns it
	 * @return int maritalStatus
	 */
	public static String convertMaritalStatusToString (int maritalStatus){
		String x; //String to hold marital status
		switch (maritalStatus) {
			case 1:
				x = "divorced";
				break;
			case 2:
				x = "married";
				break;
			case 3:
				x = "single";
				break;
			case 4:
				x = "widowed";
				break;
			default:
				x = "n/a";
				break;
		}
		return x;
	}
	
	/**
	 * Converts maritalStatus into a meaningful string, then returns it
	 * @return String maritalStatus
	 */
	public static int convertMaritalStatusToInt (String maritalStatus){
		int x; //Represents option for marital status chosen by user
		if (maritalStatus.equals("divorced"))
			x = 1;
		else if (maritalStatus.equals("married"))
			x = 2;
		else if (maritalStatus.equals("single"))
			x = 3;
		else if (maritalStatus.equals("widowed"))
			x = 3;
		else
			x = 0;
		return x;			
	}	
	
	/**
	 * Updates age based on birthday and current date
	 */
	public void updateAge() {
		Calendar now = Calendar.getInstance();
		age = now.get(Calendar.YEAR) - birthYear;
		if (now.get(Calendar.MONTH)<birthMonth) { //if birthday has not occurred yet, then subtract age by 1
			age -= 1;
		}
		else if (now.get(Calendar.MONTH)==birthMonth) {
			if (now.get(Calendar.DAY_OF_MONTH)<birthDay)
				age -= 1;
		}
	}
}
