import java.util.Scanner;


public class Factorial {
	
	public static int iterativeFactorial(int num){
		
		int result = 1;
		
		for(int i = num; i > 0; i--){
			result = result * i;
		}
		
		return result;
		
	}
	public static int refFac(int num){
		
		if(num == 0){
			return 1;
		}
		else {
			return num * refFac(num -1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Please enter a small integer: ");
		num = Integer.parseInt(sc.nextLine());
		int result;
		result = refFac(num);
		System.out.println("The factorial is " + result + ".");

	}

}
