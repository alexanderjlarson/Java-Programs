import java.util.Scanner;


public class DivideTwoNumbers {

	public static void main(String[] args) {
		int num1, num2;
		float quotient;
		try{
			System.out.println("Enter first number");
			Scanner sc = new Scanner(System.in);
			num1 = sc.nextInt();
			System.out.println("Enter second number");
			num2 = sc.nextInt();
			quotient = (float)num1 / num2;
			System.out.printf("The quotient is %.2f.", quotient);
		}
		catch(Exception ex){
			System.out.println("There was an error in your input");
		}

	}

}
