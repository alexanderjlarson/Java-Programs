import java.util.Scanner;

public class FibRecursive {
	
	public static int fib(int n){
		
		
		if (n == 0){
			return 0;
		}
		else if(n == 1){
			return 1;
		}
		else{
			return fib(n-1) + fib(n-2);
		}
	}

	public static void main(String[] args) {
		
		int n;
		int val;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the term number");
		n = Integer.parseInt(sc.nextLine());
		val = fib(n);
		System.out.println("That term is " + val + ".");

	}

}
