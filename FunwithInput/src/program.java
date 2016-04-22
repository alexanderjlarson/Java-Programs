import java.util.Scanner;

public class program {
	
	public static void main(String[] args){
		
		int age;
		String fullName;
		String[] names;
		String lastFirst;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your first and last name: ");
		fullName = sc.nextLine();
		System.out.print("Please enter your age: ");
		age = sc.nextInt();
		
		if (age < 40) {
		System.out.println("you are lucky.");
		}
		else{
		System.out.println("you are old");
		}
		names = fullName.split(" ");
		lastFirst = names[1] + ", " + names[0];
		System.out.println("Your name in last, first format is " + lastFirst + ".");
		
		System.out.printf("Your name in last, first format is %10s, %10s.", names[1], names[0]);
	}

}
