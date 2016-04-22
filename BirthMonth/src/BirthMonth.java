import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class BirthMonth {
	
	public static String[] listNames(String month, String[] names, String[] months, int count){
		String[] results = new String[count];
		for(int i = 0; i < count; i++){
			results[i] = "";
		}
		int pos = 0;
		month = month.toUpperCase();
		for (int i = 0; i < count; i++){
			if (months[i].equals(month)){
				results[pos] = names[i];
			}
			pos++;
		}
		Arrays.sort(results);
		return results;
	}
	private static void listNamesByMonth(String month, String[] names, String[] months, int count) {
		month = month.toUpperCase();
		for (int i = 0; i < count; i++){
			if (months[i].equals(month)){
				System.out.println(names[i]);
			}
		}
		
	}

	public static void main(String[] args) {
		final int CAP = 20;
		String[] names = new String[CAP];
		String[] months = new String[CAP];
		String fname;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of the data file: ");
		fname = sc.nextLine();
		Scanner fsc;
		String line;
		String[] parts;
		int count = 0; //how many names/ months read so far
		String doAgain;
		String month;
		String[] nameList;
		try{
			fsc = new Scanner(new File(fname));
			while(fsc.hasNextLine()){
				line = fsc.nextLine();
				parts = line.split(" ");
				names[count] = parts[0];
				months[count] = parts[1].toUpperCase();
				count++;
			}
			fsc.close();
			
			do{
				System.out.println("Enter the month: ");
				month = sc.nextLine().toUpperCase();
				//listNamesByMonth(month, names, months, count);
				nameList = listNames(month, names, months, count);
				for(int i = 0; i < nameList.length; i++){
					if (!(nameList[i].equals(""))){
						System.out.println(nameList[i]);
					}
				}
				System.out.println("Try another (Y or N)?");
				doAgain = sc.nextLine();
				
			}while(doAgain.equalsIgnoreCase("Y"));
		}catch(Exception e){
			System.out.println("The file was not found.");
		}
		System.out.println("Thanks. Have a good day.");
		

	}

}
