public class Person {
  protected String name; //Name
	protected int age; //Age
	protected boolean gender; //True if male 
	protected double height; //Height in centimetres
	protected double weight; //Weight in kg
	protected String birthDate; //Date of Birth Format: yyyy/mm/dd
	protected String birthPlace; //Integer represents what country person is born from (based on IIHF's Top 20 International Mens Hockey Countries)
	protected String maritalStatus; //Single, Married, Divorced, Widowed etc.
	
	
	//Accessors
	/**
	 * Returns name
	 * @return name
	 * @author MK, AV, CH, PJ
	*/
	
	public String getName(){
		return name;
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
	
	public boolean getGender (){
		return gender;
	}
	
	/**
	 * Returns height in centimetres
	 * @return height
	 * @author MK, AV, CH, PJ
	*/
	
	public double getHeight (){
		return height;
	}
	
	/**
	 * Returns weight in kg
	 * @return weight
	 * @author MK, AV, CH, PJ
	*/
	
	public double getWeight (){
		return weight;
	}
	
	/**
	 * Returns birthdate in format (yyyy/mm/dd)
	 * @return birthDate
	 * @author MK, AV, CH, PJ
	*/
	
	public String getBirthdate (){
		return birthDate;
	}
	
	/**
	 * Returns the country using field birthPlace based on IIHF's Top 20 International Men's Hockey Countries 
	 * @return nationality/country of birth
	 * @author MK, AV, CH, PJ
	 */
	public void getBirthPlace(){
		switch(Integer.parseInt(birthPlace)){
		case 1:
			birthPlace="Austria";
			break;
		case 2:
			birthPlace="Balarus";
			break;
		case 3:
			birthPlace="Canada";
			break;
		case 4:
			birthPlace="Czeck Republic";
			break;
		case 5:
			birthPlace="Denmark";
			break;
		case 6:
			birthPlace="Finland";
			break;
		case 7:
			birthPlace="France";
			break;
		case 8:
			birthPlace="Germany";
			break;
		case 9:
			birthPlace="Hungary";
			break;
		case 10:
			birthPlace="Italy";
			break;
		case 11:
			birthPlace="Kazakhstan";
			break;
		case 12:
			birthPlace="Latvia";
			break;
		case 13:
			birthPlace="Norway";
			break;
		case 14:
			birthPlace="Russia";
			break;
		case 15:
			birthPlace="Slovakia";
			break;
		case 16:
			birthPlace="Slovenia";
			break;
		case 17:
			birthPlace="Sweden";
			break;
		case 18:
			birthPlace="Switzerland";
			break;
		case 19:
			birthPlace="Ukraine";
			break;
		case 20:
			birthPlace="United States";
			break;
		default:
			birthPlace="X";
			break;
		}
	}
	
	/**
	 * Returns Marital status
	 * <p>
	 * Single, Married, Divorced or Widowed.
	 * @return maritalStatus
	 * @author MK, AV, CH, PJ
	*/
	public void getMaritalStatus (){
		switch (Integer.parseInt(maritalStatus)){
		case 1:
			maritalStatus="Divorced";
			break;
		case 2:
			maritalStatus="Married";
			break;
		case 3:
			maritalStatus="Single";
			break;
		case 4:
			maritalStatus="Widowed";
			break;
		default:
			maritalStatus="x";
			break;
		}
	}
	
	//Mutators
	
	/**
	 * Stores parameter to name
	 * @param x of type String 
	 * @author MK, AV, CH, PJ
	*/
	
	public void putName(String x){
		name = x;
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
	 * Stores parameter to birthDate
	 * @param x of type String
	 * @author MK, AV, CH, PJ
	*/
	
	public void putBirthdate (String x){
		birthDate = x;
	}
	
	/**
	 * Stores parameter to maritalStatus
	 * @param x of type String
	 * @author MK, AV, CH, PJ
	*/
	
	public void putMaritalStatus (String x){
		maritalStatus = x;
	}

}
