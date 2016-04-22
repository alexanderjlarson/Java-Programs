import java.util.Scanner;

public class Stack {

	static int[] stack;
	static int top;

	public static void showMenu() {

			System.out.println("What would you like to do? ");
			System.out.println("1. Add a new value.");
			System.out.println("2. Remove the top value.");
			System.out.println("3. See what the top value is.");
			System.out.println("4. Report how many values there are. ");
			System.out.println("5. Report if the stack is empty.");
			System.out.println("6. Clear the stack.");
			System.out.println("7. Exit");
			System.out.println("What would you like to do? ");
	}

	public static void push(int num) {

		stack[top] = num;
		top++;
	}

	public static boolean full(){
		return(top == 20);
		
	}
	
	public static int pop() {
		if (top > 0) {
			top = top-1;
			return stack[top];
		} else {
			return -999;
		}
	}

	public static int peek() {
		if (top > 0) {
			return stack[top-1];
		} else {
			return -999;
		}
	}

	public static int size() {
		return top;
	}

	public static boolean isEmpty() {
		return (top == 0);
	}
	
	public static void clear(){
		while(!isEmpty()){
			System.out.println("Value removed: " + pop());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack = new int[20];
		top = 0;
		int choice;
		int val;
		Scanner sc = new Scanner(System.in);
		do {
			showMenu();
			choice = Integer.parseInt(sc.nextLine());
			if (choice == 1) {
				System.out.print("Type the value to add: ");
				val = Integer.parseInt(sc.nextLine());
				push(val);
			} else if (choice == 2) {
				System.out.println("This value was removed: " + pop() + ".");
			} else if (choice == 3) {
				System.out.println("This is the value at the top of the stack: " + peek() + ".");
			} else if (choice == 4) {
				System.out.println("This is the size of the stack: " + size() + ".");
			} else if (choice == 5) {
				if (isEmpty()) {
					System.out.println("Empty");
				} else {
					System.out.println("Not empty.");
				}
			}
			else if (choice == 6){
			clear();	
			}
		} while (choice != 7);
	}
}