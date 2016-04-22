import java.util.Scanner;


public class SortedArray {

	public static int addValueSorted(int val, int count, int[] numbers){
		int pos = 0;
		while((val > numbers[pos]) && (pos < count)){
			pos++;
		}
		for(int i = count; i > pos; i--){
			numbers[i] = numbers[i-1];
		}
		numbers[pos] = val;
		return count+1;
	}
	
	public static void printList(int[] numbers, int count){
		for (int i = 0; i < count; i++){
			System.out.println(numbers[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int CAP = 10;
		int[] numbers = new int[CAP];
		int count = 0;
		String choice;
		int val;
		
		do{
			System.out.println("Enter a number: ");
			val = Integer.parseInt(sc.nextLine());
			if(count < CAP){
				count = addValueSorted(val, count, numbers);
				printList(numbers,count);
			}
			else{
				System.out.println("It's full. Can't add.");
			}
			
			System.out.println("Wnat to enter another? ");
			choice = sc.nextLine().toUpperCase();
		}while(choice.equals("Y"));
	}

}
