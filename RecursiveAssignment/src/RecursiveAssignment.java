import java.util.Scanner;


public class RecursiveAssignment {
	
	/*This function will compute the value of x to the power of y.*/
	public static int recPow(int x, int y){
		
		if (y == 1){
			return x;
		}
		else {
			return (x * recPow(x, y-1));
		}
	}
	/*This function will compute the value of x multiplied by y.*/
	public static int recMult(int x, int y){
		
		if (y == 0){
			return 0;
		}
		else if (y == 1){
			return x;
		}
		else{
			return (x + recMult(x, y-1));
		}
	}
	/*This function will find the greatest common divisor of the values
	 * x and y. 
	 */
	public static int gdc(int x, int y){
		
		if(y <= x && (x % y) == 0){
			return y;
		}
		else if(x < y){
			return gdc(y, x);
		}
		else{
			return gdc(y, x % y);
		}
	}
	/*This function will reverse a string that is set to the function as
	 * a character array.
	 */
	public static String reverseString(char[] letters, int pos){
		
		String str;
		char j;
		
		if(pos >= letters.length/2){
			return new String(letters);
		}
		else{
			j = letters[pos];
			letters[pos] = letters[letters.length - 1 - pos];
			letters[letters.length - 1 - pos] = j;
			return reverseString(letters, pos + 1);
		}
	}
	/*This function is made to create a welcome message for this program*/
	public static void welcome(){
		System.out.println("This program features four recursive functions. You can choose which");
		System.out.println("one you want to user by choosing it's number from a menu. Each function");
		System.out.println("uses recursion instead of iteration to perform it's task.");
	}
	
	/*Function that prints out the menu for the program*/
	public static int menu(Scanner sc){
		int choice;
		
		System.out.println();
		System.out.println("Here are your choices:");
		System.out.println("1. Compute x raised to the y power");
		System.out.println("2. Compute the product of x and y");
		System.out.println("3. Compute the greatest common divisor of x and y");
		System.out.println("4. Reverse the characters in a string");
		System.out.println("5. Quit");
		System.out.print("Please enter your choice: ");
		choice = Integer.parseInt(sc.nextLine());
		System.out.println();
		
		return choice;
	}
	/*Start of the main program*/
	public static void main(String[] args) {
		int choice;
		int x,y;
		int value;
		String nums;
		String[] numArray;
		String str, strRev;
		char[] letters;
		Scanner sc = new Scanner(System.in);
		
		//Calls the welcome function to print out a welcome message
		welcome();
		
		do{
			choice = menu(sc);
			switch (choice){
			case 1:
				System.out.print("Enter x, the base, and y, the exponent, where y is greater than 0: ");
				nums = sc.nextLine();
				numArray = nums.split(" ");
				x = Integer.parseInt(numArray[0]);
				y = Integer.parseInt(numArray[1]);
				value = recPow(x, y);
				System.out.println("The value of " + x + "^" + y + " is " + value);
				break;
			case 2:
				System.out.print("Enter the two numbers to multiply together: ");
				nums = sc.nextLine();
				numArray = nums.split(" ");
				x = Integer.parseInt(numArray[0]);
				y= Integer.parseInt(numArray[1]);
				value = recMult(x, y);
				System.out.println("The value of " + x + " * " + y + " is " + value);
				break;
			case 3:
				System.out.print("Enter the two numbers for which you want to find the GDC: ");
				nums = sc.nextLine();
				numArray = nums.split(" ");
				x = Integer.parseInt(numArray[0]);
				y= Integer.parseInt(numArray[1]);
				value = gdc(x, y);
				System.out.println("The GDC of " + x + " and " + y + " is " + value);
				break;
			case 4:
				System.out.print("Enter a string, and I will reverse it: ");
				str = sc.nextLine();
				letters = str.toCharArray();
				strRev = reverseString(letters, 0);
				System.out.println("The reverse of " + str + " is " + strRev);
			}
			
		}while(choice != 5);
		System.out.println("Goodbye");
	}

}
