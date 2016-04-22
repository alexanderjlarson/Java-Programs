import java.util.Scanner;


public class WordStart {

	public static void main(String[] args) {
		int[] counts = new int[26];
		String str;
		String[] words;
		char ch;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < counts.length; i++){
			counts[i] = 0;
		}
		System.out.println("Enter a phrase");
		str = sc.nextLine().toUpperCase();
		words = str.split(" ");
		for (int i = 0; i < words.length; i++){
			ch = words[i].charAt(0);
			counts[ch-65]++;
		}
		for (int i = 0; i < counts.length; i++){
			System.out.printf("%s\t%d\n", (char)(i+65),counts[i]);
			//System.out.println(counts[i]);
			
		}
		System.out.println("Done");

	}

}
