import java.util.Scanner;


public class FunWithFormatting {

	public static void main(String[] args) {
		
		System.out.println("PI = " + Math.PI);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a double: ");
		double x;
		x = sc.nextDouble();
		System.out.printf("The value of x is %7.3f.\n", x);
		
		String str = String.format("The value of x is %.3f.", x);
		System.out.println(str);
		
		double xsquared;
		xsquared = Math.pow(x, 2);
		System.out.printf("x squared is %, .3f\n", xsquared);

	}

}
