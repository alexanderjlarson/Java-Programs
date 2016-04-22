import java.util.Scanner;

public class Circle {
	
	public static void main (String[] args) {
		
		System.out.println("Enter the radius");
		Scanner sc = new Scanner(System.in);
		double radius;
		double area;
		double circumference;
		radius = sc.nextDouble();
		
		area = Math.PI * radius * radius; // or Math.pow(radius,2); raises radius to the 2nd power
		circumference = 2 * Math.PI * radius;
		System.out.printf("The area is %.2f.\n", area);
		System.out.printf("The circumference is %.2f.", circumference);
	}

}
