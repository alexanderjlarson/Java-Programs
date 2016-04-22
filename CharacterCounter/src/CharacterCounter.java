import java.util.Scanner;


public class CharacterCounter {
	
	/*This function will create the bar graph by putting a * for every letter in
	 * the text entered by the user. The * will be placed next to the letter it
	 * is counted for.*/
	public static void plotLetters(int[] counts){
		
		System.out.println("Here is a bar chart showing the letter frequencies");
		for(int i = 0; i < counts.length; i++){
			System.out.printf("%s", (char)(i+65));
			for (int j = 0; j < counts[i]; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/*This function will find the order in which the letters rank in frequency
	 * of the letter in the text inputed by the user.*/
	public static int[] rankLetters(int[] counts, int numToRank){
		int[] results = new int[numToRank];
		int max;
		int maxPos;
		for (int i = 0; i < numToRank; i++){
			max = counts[0];
			maxPos = 0;
			for (int j = 1; j < counts.length; j++){
				if (counts[j] > max){
					max = counts[j];
					maxPos = j;
				}
			}
			results[i] = maxPos;
			counts[maxPos] = -counts[maxPos];
		}
		/* Reseting the values at the maximum positions to their original state */
		for (int i = 0; i < results.length; i++){
			counts[results[i]] = - counts[results[i]];
		}
		return results;
	}

	public static void main(String[] args) {
		
		int[] counts = new int[26];
		String str;
		String choice;
		String[] text;
		char ch;
		int[] topFive;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("This program analyzes text entered by the user to see which");
		System.out.println("characters appear most frequently. It prints a list of");
		System.out.println("the five most frequently occuring letters in the text.");
		System.out.println();
		
		do{
			/*Initializes the values in the counts array */
			for(int i = 0; i < counts.length; i++){
				counts[i] = 0;
			}
			
			System.out.println("Enter a line of text to analyze:");
			str = sc.nextLine().toUpperCase();
			text = str.split(" ");
			System.out.println();
			
			/*Adds one to the location currently at in the counts array. This 
			 * keeps track of how many of each letter there is in the text 
			 * entered by the user.*/
			for (int i = 0; i < text.length; i++){
				for (int j = 0; j < text[i].length(); j++){
					ch = text[i].charAt(j);
					counts[ch - 65]++;	
				}
			}
			
			topFive = rankLetters(counts, 5);/*Calls the rankLetters function and sets the value returned to topFive*/
			System.out.println("The five most popular characters were: ");
			for (int i = 0; i < topFive.length; i++){
				System.out.println((i+1) + ". " + (char)(topFive[i]+65) + " (" + counts[topFive[i]] + " occurrences)");
			}
			System.out.println();
			
			plotLetters(counts);/*Calls the plotLetters function to print out the bar chart of the letters.*/
			
			System.out.println();
			System.out.print("Try again (Y or N)? ");
			choice = sc.nextLine().toUpperCase();
			System.out.println();
		
		}while(choice.equals("Y"));
		
		System.out.println("Thank you for using this program.");
		

	}

}
