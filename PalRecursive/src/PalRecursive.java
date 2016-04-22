import java.util.Scanner;


public class PalRecursive {

	public static boolean isPal(String str, int pos){
		if(pos >= str.length()/2){
			return true;
		}
		else if (str.charAt(pos) != str.charAt(str.length()-1-pos)){
			return false;
		}
		else{
			return isPal(str,pos+1);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a phrase ");
		String phrase = sc.nextLine().toUpperCase();
		if(isPal(phrase,0)){
			System.out.println("Yes it is.");
		}
		else {
			System.out.println("No");
		}
		
	}

}
