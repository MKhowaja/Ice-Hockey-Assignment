public class sortingMethods {
	public static int compareInt(int x, int y) {
		if (x>y)
			return 1;
		else if (x<y)
			return -1;
		else
			return 0;
	}
	
	public static int compareDouble(double x, double y) {
		if (x>y)
			return 1;
		else if (x<y)
			return -1;
		else
			return 0;
	}
	
	public static int compareString(String x, String y) {
		if (x.compareTo(y)<0)
			return 1; //returns 1 when x precedes y
		else if (x.compareTo(y)>0)
			return -1;
		else
			return 0;
	}
	
	/**
	 * sorts jumbo according to age in descending order
	 * @param jumbo
	 */
	public static void sortAgeD(Person[] jumbo) {
		boolean swap;
		Person temp;
		do {
			swap = false;
			for (int i = 0;i<jumbo.length-1;i++) {
				if (compareInt(jumbo[i].getAge(),jumbo[i+1].getAge())==-1) {
					temp = jumbo[i];
					jumbo[i] = jumbo[i+1];
					jumbo[i+1] = temp;
					swap = true;
				}
			}
		} while(swap==true);
	}
	/**
	 * sorts jumbo according to age in ascending order
	 * @param jumbo
	 */
	public static void sortAgeA(Person[] jumbo) {
		boolean swap;
		Person temp;
		do {
			swap = false;
			for (int i = 0;i<jumbo.length-1;i++) {
				if (compareInt(jumbo[i].getAge(),jumbo[i+1].getAge())==1) {
					temp = jumbo[i];
					jumbo[i] = jumbo[i+1];
					jumbo[i+1] = temp;
					swap = true;
				}
			}
		} while(swap==true);
	}
	/**
	 * sorts jumbo according to first name from (Z-A)
	 * @param jumbo
	 */
	public static void sortFNameA(Person[] jumbo) {
		boolean swap;
		Person temp;
		do {
			swap = false;
			for (int i = 0;i<jumbo.length-1;i++) {
				if (compareString(jumbo[i].getFName(),jumbo[i+1].getFName())==1) {
					temp = jumbo[i];
					jumbo[i] = jumbo[i+1];
					jumbo[i+1] = temp;
					swap = true;
				}
			}
		} while(swap==true);
	}
	/**
	 * sorts jumbo according to first name from (A-Z)
	 * @param jumbo
	 */
	public static void sortFNameD(Person[] jumbo) {
		boolean swap;
		Person temp;
		do {
			swap = false;
			for (int i = 0;i<jumbo.length-1;i++) {
				if (compareString(jumbo[i].getFName(),jumbo[i+1].getFName())==-1) {
					temp = jumbo[i];
					jumbo[i] = jumbo[i+1];
					jumbo[i+1] = temp;
					swap = true;
				}
			}
		} while(swap==true);
	}
	/**
	 * sorts jumbo according to last name from (Z-A)
	 * @param jumbo
	 */
	public static void sortLNameA(Person[] jumbo) {
		boolean swap;
		Person temp;
		do {
			swap = false;
			for (int i = 0;i<jumbo.length-1;i++) {
				if (compareString(jumbo[i].getLName(),jumbo[i+1].getLName())==1) {
					temp = jumbo[i];
					jumbo[i] = jumbo[i+1];
					jumbo[i+1] = temp;
					swap = true;
				}
			}
		} while(swap==true);
	}
	/**
	 * sorts jumbo according to last name from (A-Z)
	 * @param jumbo
	 */
	public static void sortLNameD(Person[] jumbo) {
		boolean swap;
		Person temp;
		do {
			swap = false;
			for (int i = 0;i<jumbo.length-1;i++) {
				if (compareString(jumbo[i].getLName(),jumbo[i+1].getLName())==1) {
					temp = jumbo[i];
					jumbo[i] = jumbo[i+1];
					jumbo[i+1] = temp;
					swap = true;
				}
			}
		} while(swap==true);
	}
	/**
	 * sorts jumbo according to height in descending order
	 * @param jumbo
	 */
	public static void sortHeightD(Person[] jumbo) {
		boolean swap;
		Person temp;
		do {
			swap = false;
			for (int i = 0;i<jumbo.length-1;i++) {
				if (compareDouble(jumbo[i].getHeight(),jumbo[i+1].getHeight())==-1) {
					temp = jumbo[i];
					jumbo[i] = jumbo[i+1];
					jumbo[i+1] = temp;
					swap = true;
				}
			}
		} while(swap==true);
	}
	/**
	 * sorts jumbo according to height in ascending order
	 * @param jumbo
	 */
	public static void sortHeightA(Person[] jumbo) {
		boolean swap;
		Person temp;
		do {
			swap = false;
			for (int i = 0;i<jumbo.length-1;i++) {
				if (compareDouble(jumbo[i].getHeight(),jumbo[i+1].getHeight())==1) {
					temp = jumbo[i];
					jumbo[i] = jumbo[i+1];
					jumbo[i+1] = temp;
					swap = true;
				}
			}
		} while(swap==true);
	}
	/**
	 * sorts jumbo according to weight in descending order
	 * @param jumbo
	 */
	public static void sortWeightD(Person[] jumbo) {
		boolean swap;
		Person temp;
		do {
			swap = false;
			for (int i = 0;i<jumbo.length-1;i++) {
				if (compareDouble(jumbo[i].getWeight(),jumbo[i+1].getWeight())==-1) {
					temp = jumbo[i];
					jumbo[i] = jumbo[i+1];
					jumbo[i+1] = temp;
					swap = true;
				}
			}
		} while(swap==true);
	}
	/**
	 * sorts jumbo according to weight in ascending order
	 * @param jumbo
	 */
	public static void sortWeightA(Person[] jumbo) {
		boolean swap;
		Person temp;
		do {
			swap = false;
			for (int i = 0;i<jumbo.length-1;i++) {
				if (compareDouble(jumbo[i].getWeight(),jumbo[i+1].getWeight())==1) {
					temp = jumbo[i];
					jumbo[i] = jumbo[i+1];
					jumbo[i+1] = temp;
					swap = true;
				}
			}
		} while(swap==true);
	}
	/**
	 * sorts jumbo according to salary per year in ascending order
	 * @param jumbo
	 */
	public static void sortSalaryPYA(Person[] jumbo) {
		boolean swap;
		Person temp;
		do {
			swap = false;
			for (int i = 0;i<jumbo.length-1;i++) {
				if (compareDouble(((Player)jumbo[i]).getSalaryPY(),((Player)jumbo[i+1]).getSalaryPY())==1) {
					temp = jumbo[i];
					jumbo[i] = jumbo[i+1];
					jumbo[i+1] = temp;
					swap = true;
				}
			}
		} while(swap==true);
	}
	/**
	 * sorts jumbo according to salary per year in descending order
	 * @param jumbo
	 */
	public static void sortSalaryPYD(Person[] jumbo) {
		boolean swap;
		Person temp;
		do {
			swap = false;
			for (int i = 0;i<jumbo.length-1;i++) {
				if (compareDouble(((Player)jumbo[i]).getSalaryPY(),((Player)jumbo[i+1]).getSalaryPY())==-1) {
					temp = jumbo[i];
					jumbo[i] = jumbo[i+1];
					jumbo[i+1] = temp;
					swap = true;
				}
			}
		} while(swap==true);
	}
	/**
	 * sorts jumbo according to number of years remaining on contract in ascending order
	 * @param jumbo
	 */
	public static void sortContractRA(Person[] jumbo) {
		boolean swap;
		Person temp;
		do {
			swap = false;
			for (int i = 0;i<jumbo.length-1;i++) {
				if (compareDouble(((Player)jumbo[i]).getcontractR(),((Player)jumbo[i+1]).getcontractR())==1) {
					temp = jumbo[i];
					jumbo[i] = jumbo[i+1];
					jumbo[i+1] = temp;
					swap = true;
				}
			}
		} while(swap==true);
	}
	
	/**
	 * sorts jumbo according to number of years remaining on contract in descending order
	 * @param jumbo
	 */
	public static void sortContractRD(Person[] jumbo) {
		boolean swap;
		Person temp;
		do {
			swap = false;
			for (int i = 0;i<jumbo.length-1;i++) {
				if (compareDouble(((Player)jumbo[i]).getcontractR(),((Player)jumbo[i+1]).getcontractR())==-1) {
					temp = jumbo[i];
					jumbo[i] = jumbo[i+1];
					jumbo[i+1] = temp;
					swap = true;
				}
			}
		} while(swap==true);
	}
	
	/**
	 * sorts jumbo according to rating in ascending order
	 * @param jumbo
	 */
	public static void sortRatingA(Person[] jumbo) {
		boolean swap;
		Person temp;
		do {
			swap = false;
			for (int i = 0;i<jumbo.length-1;i++) {
				if (compareDouble(((Player)jumbo[i]).getRating(),((Player)jumbo[i+1]).getRating())==1) {
					temp = jumbo[i];
					jumbo[i] = jumbo[i+1];
					jumbo[i+1] = temp;
					swap = true;
				}
			}
		} while(swap==true);
	}
	
	/**
	 * sorts jumbo according to rating in descending order
	 * @param jumbo
	 */
	public static void sortRatingD(Person[] jumbo) {
		boolean swap;
		Person temp;
		do {
			swap = false;
			for (int i = 0;i<jumbo.length-1;i++) {
				if (compareDouble(((Player)jumbo[i]).getRating(),((Player)jumbo[i+1]).getRating())==-1) {
					temp = jumbo[i];
					jumbo[i] = jumbo[i+1];
					jumbo[i+1] = temp;
					swap = true;
				}
			}
		} while(swap==true);
	}
}
