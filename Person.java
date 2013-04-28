abstract class Person {
  	protected String name; //Name
	protected int age; //Age
	protected boolean gender; //True if male 
	protected double height; //Height in centimetres
	protected double weight; //Weight in kg
	protected int birthMonth; //Month of birth 
	protected int birthDay; //Day of birth
	protected int birthYear; //Year of birth
	protected String birthPlace; //Integer represents what country person is born from (based on IIHF's Top 20 International Mens Hockey Countries)
	protected String maritalStatus; //Single, Married, Divorced, Widowed etc.

	/**
	 * Constructor that creates an object of type person with parameters sent in
	 * @param 
	 * @author MK, AV, CH, PJ
	*/
	Person(String name, int age, boolean gender, double height, double weight, int month, int day, int year, String place, String mStatus) {
		this.name = name;
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
	 * Returns name
	 * @return name
	 * @author MK, AV, CH, PJ
	*/

	abstract String getName();

	/**
	 * Returns age
	 * @return age
	 * @author MK, AV, CH, PJ
	*/

	abstract int getAge();

	/**
	 * Returns gender
	 * <p>
	 * True if male and false if female.
	 * @return gender
	 * @author MK, AV, CH, PJ
	*/

	abstract boolean getGender ();

	/**
	 * Returns height in centimetres
	 * @return height
	 * @author MK, AV, CH, PJ
	*/

	abstract double getHeight ();

	/**
	 * Returns weight in kg
	 * @return weight
	 * @author MK, AV, CH, PJ
	*/

	abstract double getWeight ();

	/**
	 * Returns day of birth
	 * @return birthDay
	 * @author MK, AV, CH, PJ
	*/

	abstract int getBirthDay ();

	/**
	 * Returns month of birth
	 * @return birthDay
	 * @author MK, AV, CH, PJ
	*/

	abstract int getBirthMonth ();

	/**
	 * Returns year of birth
	 * @return birthYear
	 * @author MK, AV, CH, PJ
	*/

	abstract int getBirthYear ();

	/**
	 * Returns the country using field birthPlace based on IIHF's Top 20 International Men's Hockey Countries 
	 * @return nationality/country of birth
	 * @author MK, AV, CH, PJ
	 */
	abstract String getBirthPlace();
	
	/**
	 * Returns Marital status
	 * <p>
	 * Single, Married, Divorced or Widowed.
	 * @return maritalStatus
	 * @author MK, AV, CH, PJ
	*/
	abstract String getMaritalStatus();
	
	protected abstract void setBirthPlace();

	protected abstract void setMaritalStatus ();

	//Mutators

	/**
	 * Stores parameter to name
	 * @param x of type String 
	 * @author MK, AV, CH, PJ
	*/

	protected abstract void putName(String x);

	/**
	 * Stores parameter to age
	 * @param x of type int 
	 * @author MK, AV, CH, PJ
	*/

	protected abstract void putAge(int x);

	/**
	 * Stores parameter to gender
	 * @param x of type boolean
	 * @author MK, AV, CH, PJ
	*/

	protected abstract void putGender (boolean x);

	/**
	 * Stores parameter to height
	 * @param x of type double
	 * @author MK, AV, CH, PJ
	*/

	protected abstract void putHeight (double x);

	/**
	 * Stores parameter to weight
	 * @param x of type double
	 * @author MK, AV, CH, PJ
	*/

	protected abstract void putWeight (double x);

	/**
	 * Stores parameter to birthDay
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	*/

	protected abstract void putBirthday (int x);

	/**
	 * Stores parameter to birthMonth
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	*/

	protected abstract void putBirthMonth (int x);

	/**
	 * Stores parameter to birthDay
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	*/

	protected abstract void putBirthYear (int x);

	/**
	 * Stores parameter to birthPlace
	 * @param x of type String
	 * @author MK, AV, CH, PJ
	*/

	protected abstract void putBirthplace (String x);

	/**
	 * Stores parameter to maritalStatus
	 * @param x of type String
	 * @author MK, AV, CH, PJ
	*/

	protected abstract void putMaritalStatus (String x);

}
