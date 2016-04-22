import java.util.Scanner;

public class BinarySearch {
	
	public static int binSearch(int[] numbers, int target){
		
		int result = -1;
		int lo = 0;
		int hi = numbers.length - 1;
		int mid = (lo + hi) / 2;
		while((result == -1) && (lo <= hi)){
			if (target < numbers[mid]){
				hi = mid - 1;
			}
			else if (target > numbers[mid]){
				lo = mid + 1;
			}
			else{
				result = mid;
			}
			mid = (lo + hi) / 2;
		}
		
		return result;
	}
	
	public static int recBinSearch(int lo, int hi, int[] values, int target){
		
		int mid;
		
		if(lo > hi){
			return -1;
		}
		else {
			mid = (lo + hi) / 2;
			if (values[mid] == target){
				return mid;
			}
			else if(target < values[mid]){
				return recBinSearch(lo, mid-1, values, target);
			}
			else {
				return recBinSearch(mid+1, hi, values, target);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] numbers = {1, 2, 4, 7, 8, 13, 15, 17, 21};
		int target;
		System.out.print("What number do you want to search for? ");
		target = Integer.parseInt(sc.nextLine());
		int foundAt;
		foundAt = binSearch(numbers, target);
		if (foundAt == -1){
			System.out.println("The number was not found.");
		}
		else{
			System.out.println("it was found at position " + foundAt);
		}
	}

}
