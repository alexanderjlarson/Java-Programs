import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Hangman {

	public static void main(String[] args) {
		
		final int CAPACITY = 20;
		Scanner sc = new Scanner(System.in);
		Scanner filesc;
		String fname;
		String[] words = new String[CAPACITY];
		int wordCount = 0;
		System.out.print("What is the name of the words file? ");
		fname = sc.nextLine();
		try{
			filesc = new Scanner(new File(fname));
			while (filesc.hasNextLine()){
				words[wordCount] = filesc.nextLine();
				wordCount++;
			}
			filesc.close();
			//for (int i = 0; i < wordCount; i++){
			//	System.out.println(words[i]);
			//}
		} catch(FileNotFoundException e){
			System.out.println("File not found.");
		}
		

	}

}
