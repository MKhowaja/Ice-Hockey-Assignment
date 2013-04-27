public class Player extends Person {
  private double salaryPY; //Salary per year
	private int contractR; //# of years remaining of contract 
	private double tSalary; //Total salary over entire contract length
	private int rating; //Temp for something awesome
	private int gp; //Games played
	private double penaltyT; //Time spent in penalties
	private int penaltyN; //Number of penalties
	private boolean arm; //Shooting arm: True if right arm
	private int number; //Jersey number
	
	public Player(String name, int age, boolean gender, double height, double weight, int month, int day, int year, String place, String mStatus) {//+more 
		super(name, age, gender, height, weight, month, day, year, place, mStatus);
	}
	
	//Accessors
	
	/**
	 * Returns salary per year
	 * @return salaryPY
	 * @author MK, AV, CH, PJ
	*/
	
	public double getSalaryPY(){
		return salaryPY;
	}
	
	/**
	 * Returns remaining years in contract
	 * @return contractR
	 * @author MK, AV, CH, PJ
	*/
	
	public int getcontractR(){
		return contractR;
	}
	
	/**
	 * Returns total salary over entire contract length
	 * @return tSalary
	 * @author MK, AV, CH, PJ
	*/
	
	public double getTSalary(){
		return tSalary;
	}
	
	/**
	 * Returns rating
	 * @return rating
	 * @author MK, AV, CH, PJ
	*/
	
	public int getRating(){
		return rating;
	}
	
	/**
	 * Returns games played
	 * @return gp
	 * @author MK, AV, CH, PJ
	*/
	
	public int getGP(){
		return gp;
	}
	
	/**
	 * Returns time spent in penalties in minutes
	 * @return penaltyT
	 * @author MK, AV, CH, PJ
	*/
	
	public double getPenaltyT (){
		return penaltyT;
	}
	//Mutators
	
	/**
	 * Stores parameter to age
	 * @param x of type int 
	 * @author MK, AV, CH, PJ
	*/
	
	public void putAge(int x){
		//age = x;
	}

	
	
	/*
	Forward
	•	+/- (int)
	•	Goal Percentage per season (double)
	•	Average goals per season (double)
	•	Average shots taken per season (double)
	•	Standard deviation of goal percentage (double)
	•	Average assists per season (double)
	•	Average penalty minutes per season (double)
	•	Average power play goals per season (double)
	•	Average shootout goals per season (double)
	•	
	Defense
	•	+/-
	•	Goal Percentage per season
	•	Average goals per season
	•	Average shots taken per season 
	•	Standard deviation of goal percentage
	•	Average assists per season
	•	Average penalty minutes per season
	•	Average power play goals per season (double)
	•	Average shootout goals per season (double)
	•	
	Goalie
	•	Games played (int)
	•	Wins (int)
	•	Losses (int)
	•	Ties (int)
	•	Overtime (int)
	•	
	Coach
	•	

	
	*/
	
	
	
	
	
}