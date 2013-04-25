import java.io.*;

public class testloadsave {

  /**
	 * Loads the data from a text file onto the array of the team in the program
	 * @param String filepath
	 * @param Array of type Person
	 * @throws FileNotFoundException 
	 * @author MK, AV, CH, PJ
	 */
	//s.substring(s.indexOf("30/")+3, s.length())
	public static void load(String file, Person[] team) throws IOException{
		String x;
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		int c = 0;
		String classType;
		while ((x=br.readLine()) != null) {
			classType = x;
			
			x = br.readLine(); //name
			team[c].name = x.substring(x.indexOf("Name: "+6,x.length()));
			
			
		}
		
		
		
	}
	
	public static void save() {
		
	}
	public static void main(String[] args) {


	}

}
