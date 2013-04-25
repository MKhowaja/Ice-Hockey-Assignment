import java.util.Scanner;



public class leMain {
  public static void main(String []args) {
		Person[] person = new Person[46]; //one roster is 23 players
		int c = 0; //tracks the index of the person in being added into the array
		int option; //specifies the option that the user selects from the menu
		Scanner in = new Scanner(System.in);
		String type;
		
		//temporary fields for person
		String name; //Name
		int age; //Age
		String tempGender;
		boolean gender; //True if male 
		double height; //Height in centimetres
		double weight; //Weight in kg
		int birthMonth; //Month of birth 
		int birthDay; //Day of birth
		int birthYear; //Year of birth
		String birthPlace; //City, Province/State of birth; Province/State in short notation
		String maritalStatus; //Single, Married, Divorced, Widowed etc.
		
		//temporary fields for player
		
		//temporary fields for coach
		
		//temporary fields for goalie
		
		//temporary fields for defense
		
		//temporary fields for forward
		do {
			do {
				//outputs menu and prompts for an option
				System.out.println("1 - Add a person.");
				System.out.println("2 - Save data."); //saves a full object
				System.out.println("3 - Load data."); //loads an empty object with data
				System.out.println("4 - Terminate the program.");
				System.out.println("Select an option: ");
				option = in.nextInt();
			} while (option < 0 || option > 4);
			if (option == 1) {
				//prompt for all person fields
				do {
					System.out.println("Enter name: ");
					name = in.nextLine();
					in.nextLine();
				} while (name.equals("")); //ensures that something is entered
				
				do {
					System.out.println("Enter age: ");
					age = in.nextInt();
				} while (age <= 0); //ensures age is greater than 0
				
				do {
					System.out.println("Enter gender (m/f): ");
					tempGender = in.next();
				} while (!tempGender.equals('m') && !tempGender.equals('f'));
				if (tempGender.equals('m'))
					gender = true;
				else
					gender = false;
				
				do {
					System.out.println("Enter height: ");
					height = in.nextDouble();
				} while (height <= 0); //ensures height is greater than 0
				
				do {
					System.out.println("Enter weight: ");
					weight = in.nextDouble();
				} while (weight <= 0); //ensures weight is greater than 0
				
				do {
				
					//prompt for coach/player
					do {
						System.out.println("Select whether person is a coach or player (c/p): ");
						type = in.next();
						if (type == "p") {
							//prompt for player stuff
							System.out.println("Enter player's shooting arm: ");
						}
						else if (type == "c") {
							person[c] = (Coach)person[c];
							//prompt for coach fields
						} 
					} while (!type.equals("p") && !type.equals("c"));
				} while (true);
			}
			else if (option == 2) {
				
			}
			else if (option == 3) {
				
			}
			else {
				
			}
		} while (option != 4);
		
	}
}
