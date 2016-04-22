import java.util.Scanner;


public class Palindrone {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str, choice;
		String toUpper;
		int left, right;
		do{
			System.out.println("Enter string and i will test it. ");
			str = sc.nextLine();
			left = 0;
			right = str.length() - 1;
			while((left < right) && (str.charAt(left) == str.charAt(right))){
				left++;
				right--;
				
			}
			if (left < right){
				System.out.println("Not a palindrome");
			} else {
				System.out.println("Is a palindrome");
			}
			System.out.print("Would you like to run the program again? (Y or N) ");
			choice = sc.nextLine();
			toUpper = choice.toUpperCase();
		}while(toUpper.equals("Y"));
		System.out.println("End of program");
	}

}
