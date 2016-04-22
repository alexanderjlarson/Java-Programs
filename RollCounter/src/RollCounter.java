import java.util.Random;
import java.util.Scanner;


public class RollCounter {

	public static void main(String[] args) {
		int rollCount;
		int max, maxPos;
		int[] outcomes = {0, 0, 0, 0, 0, 0};
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		System.out.println("How many rolls do you want? ");
		try{
			rollCount = sc.nextInt();
		} catch(NumberFormatException e){
			System.out.println("Entered wrong number");
			rollCount= 100;
		}
		if (rollCount <= 0){
			System.out.println("There will be 100 rolls");
			rollCount = 100;
		}
		for (int i = 0; i < rollCount; i++){
			 outcomes[rnd.nextInt(6)]++;
		}
		for (int i = 0; i < outcomes.length; i++){
			System.out.printf("%d\t%d\n", i+1, outcomes[i]);
		}
		maxPos = 0;
		max = outcomes[0];
		for (int i = 1; i < outcomes.length; i++){
			if (outcomes[i] > max){
				max = outcomes[i];
				maxPos = i;
			}
		}
		System.out.printf("The most popular roll was %d, ",maxPos+1);
		System.out.printf("It had %d rolls.", max);
		sc.close();
	}

}
