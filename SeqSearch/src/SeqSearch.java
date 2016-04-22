import java.util.Scanner;


public class SeqSearch {

	public static int sequentialSearch(int[] values, int seek){
		int index = 0;
		boolean found = false;
		while ((found == false) && (index < values.length)){
			if (values[index] == seek){
				found = true;
			}else {
				index++;
			}
		}
		if (found == false){
			return -1;
		}else {
			return index;
		}
	}
	public static void main(String[] args) {
		int[] values = {4,7,3,1,8,9,14,5};
		Scanner sc = new Scanner(System.in);
		System.out.print("What number would you like to find? ");
		int seek; // this is the number the user wants to look for
		int foundAt;
		try{
			
			seek = Integer.parseInt(sc.nextLine());
			foundAt = sequentialSearch(values, seek);
			if (foundAt >= 0){
				System.out.println("The value was found at location " + foundAt + ".");
			} else {
				System.out.println("The value of was not found");
			}
		}catch (Exception e){
			System.out.println("That was not a number.");
		}
	}

}
