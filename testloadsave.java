import java.io.*;

public class testloadsave {

  /**
	 * Loads the data from a text file onto an object of type person in the program
	 * @param String filepath
	 * @param Object of type person
	 * @author MK, AV, CH, PJ
	 */
	
	public static void load(String file, Person person) throws IOException{
		String x;
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String classType;
		while ((x=br.readLine()) != null) {
			classType = x;

			x = br.readLine(); //name
			person.fname = x.substring(x.indexOf(": ")+2,x.length());


		}



	}

	public static void save(String file) throws IOException {
		FileWriter fw = new FileWriter(file);    //FileWriter 
		PrintWriter pw = new PrintWriter (fw);     //PrintWriter

		pw.println("231231");    // 3) Write to file
		pw.println("world2");
		pw.close();     
	}
	public static void main(String[] args) {


	}

}
