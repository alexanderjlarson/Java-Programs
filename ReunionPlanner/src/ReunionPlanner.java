import java.io.File;
import java.util.Scanner;


public class ReunionPlanner {
	
	// This is a basic function that just prints the screen a welcome message for the user.
	public static void welcomeUser(){
		
		System.out.println("Welcome to Reunion Planner, This program will help you organize");
		System.out.println("a reunion for your high school. Graduates can be grouped by decade.");
		System.out.println("Graduates of specific years can also be identified so that you can");
		System.out.println("recognize them in a particular way.");
		
	}
	
	/* This function prints out a menu of options to choose from and then
	 * returns the value the user enters as an integer back to where the
	 * function was called from.
	 */
	public static int showMenu(Scanner sc){
		String menuChoice;
		int result = 0;
		try{
		System.out.println("");
		System.out.println("What would you like to do?");
		System.out.println("1. See a list of graduates by decade.");
		System.out.println("2. See 10-Year Reunion Alumni");
		System.out.println("3. See 25-Year Reunion Alumni");
		System.out.println("4. See 40-Year Reunion Alumni");
		System.out.println("5. Quit");
		System.out.print("Please enter your choice: ");
		menuChoice = sc.nextLine();
		System.out.println("");
		result = Integer.parseInt(menuChoice);
		}catch(Exception e){
		}
		return result;
	}
	
	/* This function, when called, will print out the entire list of alumni
	 * by the decade they graduated in.
	 */
	public static void listAlumniByDecade(String[] names, int[] years){
		
		System.out.println("-- Alumni listed by decade --");
		System.out.println("-- 1960 - 1969 --");
		for(int i = 0; i < names.length; i++){
			if(years[i] >= 1960 && years[i] < 1970){
				System.out.println(names[i] + " (" + years[i] + ")");
			}
		}
		System.out.println("");
		System.out.println("-- 1970 - 1979 --");
		for(int j = 0; j < names.length; j++){
			if(years[j] >= 1970 && years[j] < 1980){
				System.out.println(names[j] + " (" + years[j] + ")");
			}
		}
		System.out.println("");
		System.out.println("-- 1980 - 1989 --");
		for(int k = 0; k < names.length; k++){
			if(years[k] >= 1980 && years[k] < 1990){
				System.out.println(names[k] + " (" + years[k] + ")");
			}
		}
		System.out.println("");
		System.out.println("-- 1990 - 1999 --");
		for(int l = 0; l < names.length; l++){
			if(years[l] >= 1990 && years[l] < 2000){
				System.out.println(names[l] + " (" + years[l] + ")");
			}
		}
		System.out.println("");
		System.out.println("-- 2000 - 2009 --");
		for(int m = 0; m < names.length; m++){
			if(years[m] >= 2000 && years[m] < 2010){
				System.out.println(names[m] + " (" + years[m] + ")");
			}
		}
	}
	
	/* This function, depending on what value was entered during the menu
	 * selection, will print out the desired event. Either 10 year reunion alumni, 
	 * the 25 year reunion alumni, or the 40 year reunion alumni.
	 */
	public static void listAlumniByYear(int menuChoice, String[] names, int[] years){
		
		final int CRNTYEAR = 2014;
		
		if(menuChoice == 2){
			System.out.println("Here are the alumni from " + (CRNTYEAR - 10) + ".");
			for(int i = 0; i < names.length; i++){
				if((CRNTYEAR - 10) == years[i]){
					System.out.println(names[i]);
				}
			}
		}
		if(menuChoice == 3){
			System.out.println("Here are the alumni from " + (CRNTYEAR - 25) + ".");
			for(int i = 0; i < names.length; i++){
				if((CRNTYEAR - 25) == years[i]){
					System.out.println(names[i]);
				}
			}
		}
		if(menuChoice == 4){
			System.out.println("Here are the alumni from " + (CRNTYEAR - 40) + ".");
			for(int i = 0; i < names.length; i++){
				if((CRNTYEAR - 40) == years[i]){
					System.out.println(names[i]);
				}
			}
		}
		if(menuChoice > 5 || menuChoice < 1){
			System.out.println("Incorrect choice. You need to choose a number from the menu.");
		}
	}
	
	// Start of the main program.
	public static void main(String[] args) {
		
		final int CAP = 200;
		Scanner sc = new Scanner(System.in);
		Scanner fsc;
		String fname;
		int menuChoice;
		String line;
		String[] parts;
		String[] names = new String[CAP];
		int[] years = new int[CAP];
		int count = 0;
		//calling of the welcomeUser function.
		welcomeUser();
		
		try{
		System.out.println("");
		System.out.print("Enter the name of the alumni database: ");
		fname = sc.nextLine();
		fsc = new Scanner(new File(fname));
		/* Handles the splitting of the contents in the file accessed into
		 * various arrays for use in other areas of the program.
		 */
		while(fsc.hasNextLine()){
			
			line = fsc.nextLine();
			parts = line.split(" ");
			names[count] = parts[0] + " " + parts[1];
			years[count] = Integer.parseInt(parts[2]);
			
			count++;
		}
		}catch(Exception e){
			System.out.println("File does not exist");
		}
		
		do{
			/* Sets menuChoice equal to the value that is entered
			 * in the showMenu function. The scanner sc is passed into
			 * the function to avoid redeclaring it with in the function.
			 */
			menuChoice = showMenu(sc);
			
			if(menuChoice == 1){
				/* This function takes in the names and years arrays
				 * to be printed out, but only if the user enters in
				 * the values of 1. Otherwise this function will not be
				 * called.
				 */
				listAlumniByDecade(names, years);
			}
			else{
				/* This function takes in three values. The menuChoice
				 * so the function can do the appropriate task. Also the
				 * names and years arrays so within the function they
				 * can be printed out depending on what menuChoice is.
				 */
				listAlumniByYear(menuChoice, names, years);
			}
		}while(menuChoice != 5);
		
		System.out.println("");
		System.out.println("Thank you for using this program.");
		
	}

}
