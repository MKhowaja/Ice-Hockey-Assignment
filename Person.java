public abstract class Person {
  	protected String fname; //First name
  	protected String lname; //Last name
	protected int age; //Age
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
	 * @param 
	 * @author MK, AV, CH, PJ
	*/
	Person(String fname, String lname, int age, boolean gender, double height, double weight, int month, int day, int year, int place, int mStatus) {
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.birthMonth = month;
		this.birthDay = day;
		this.birthYear = year;
		this.birthPlace = place;
		this.maritalStatus = mStatus;
	}

	//Accessors
	
	/**
	 * Returns First name
	 * @return fname
	 * @author MK, AV, CH, PJ
	 */
	 public String getFName(){
	 	return fname;
	 	}

	/**
	* Returns Last name
	* @return lname
	* @author MK, AV, CH, PJ
	*/

	public String getLName(){
		return lname;
	}

	/**
	 * Returns age
	 * @return age
	 * @author MK, AV, CH, PJ
	*/

	public int getAge(){
		return age;
	}

	/**
	 * Returns gender
	 * <p>
	 * True if male and false if female.
	 * @return gender
	 * @author MK, AV, CH, PJ
	*/

	public boolean getGender(){
		return gender;
	}

	/**
	 * Returns height in centimetres
	 * @return height
	 * @author MK, AV, CH, PJ
	*/

	public double getHeight(){
		return height;
	}

	/**
	 * Returns weight in kg
	 * @return weight
	 * @author MK, AV, CH, PJ
	*/

	public double getWeight(){
		return weight;
	}

	/**
	 * Returns day of birth
	 * @return birthDay
	 * @author MK, AV, CH, PJ
	*/

	public int getBirthDay(){
		return birthDay;
	}

	/**
	 * Returns month of birth
	 * @return birthDay
	 * @author MK, AV, CH, PJ
	*/

	public int getBirthMonth(){
		return birthMonth;
	}

	/**
	 * Returns year of birth
	 * @return birthYear
	 * @author MK, AV, CH, PJ
	*/

	public int getBrithYear(){
		return birthYear;
	}

	/**
	 * Returns the country using field birthPlace based on IIHF's Top 20 International Men's Hockey Countries 
	 * @return nationality/country of birth
	 * @author MK, AV, CH, PJ
	 */
	public int getBirthPlace(){
		return birthPlace;
	}
	
	/**
	 * Returns Marital status
	 * <p>
	 * Single, Married, Divorced or Widowed.
	 * @return maritalStatus
	 * @author MK, AV, CH, PJ
	*/
	public int getMaritalStatus(){
		return maritalStatus;
	}

	//Mutators
	
	/**
	* Stores parameter to fname
	* @param x of type String
	* @author MK, AV, CH, PJ
	*/

	public void putFName(String x){
		fname = x;
	}

	/**
	* Stores parameter to lname
	* @param x of type String
	* @author MK, AV, CH, PJ
	*/

	public void putLName(String x){
	lname = x;
	}

	/**
	 * Stores parameter to age
	 * @param x of type int 
	 * @author MK, AV, CH, PJ
	*/

	public void putAge(int x){
		age = x;
	}

	/**
	 * Stores parameter to gender
	 * @param x of type boolean
	 * @author MK, AV, CH, PJ
	*/

	public void putGender (boolean x){
		gender = x;
	} 

	/**
	 * Stores parameter to height
	 * @param x of type double
	 * @author MK, AV, CH, PJ
	*/

	public void putHeight (double x){
		height = x;
	}
	
	/**
	 * Stores parameter to weight
	 * @param x of type double
	 * @author MK, AV, CH, PJ
	*/

	public void putWeight (double x){
		weight = x;
	}

	/**
	 * Stores parameter to birthDay
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	*/

	public void putBirthday (int x){
		birthDay = x;
	}

	/**
	 * Stores parameter to birthMonth
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	*/

	public void putBirthMonth (int x){
		birthMonth = x;
	}

	/**
	 * Stores parameter to birthDay
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	*/

	public void putBirthYear (int x){
		birthYear = x;
	}

	/**
	 * Stores parameter to birthPlace
	 * @param x of type String
	 * @author MK, AV, CH, PJ
	*/

	public void putBirthplace (int x){
		birthPlace = x;
	}

	/**
	 * Stores parameter to maritalStatus
	 * @param x of type String
	 * @author MK, AV, CH, PJ
	*/

	public void putMaritalStatus (int x){
		maritalStatus = x;
	}
	
	public String convertBirthPlace(int birthPlace){
		String x;
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
				x = "Czeck Republic";
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

	public String convertMaritalStatus (int maritalStatus){
		String x;
		switch (maritalStatus) {
			case 1:
				x = "Divorced";
				break;
			case 2:
				x = "Married";
				break;
			case 3:
				x = "Single";
				break;
			case 4:
				x = "Widowed";
				break;
			default:
				x = "n/a";
				break;
		}
		return x;
	}
}
