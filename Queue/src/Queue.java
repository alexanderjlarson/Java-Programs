import java.util.Scanner;


public class Queue {
	static int[] queue;
	static int front;
	static int rear;
	static final int CAP = 20;
	
	public static void enqueue(int val){
		queue[rear] = val;
		rear++;
	}
	
	public static int first(){
		return queue[front];
	}
	
	public static int dequeue(){
		int val;
		val = queue[front];
		front++;
		return val;
	}
	public static boolean empty(){
		return(front == rear);
	}
	public static boolean full(){
		return(rear == CAP);
	}
	public static void showMenu(){
		System.out.println("Enter 1 to add, 2 to look, 3 to remove, 4 to quit");
	}

	public static void main(String[] args) {
		queue = new int[CAP];
		front = rear = 0;
		int choice = 0;
		int val;
		Scanner sc = new Scanner(System.in);
		do{
			showMenu();
			choice = Integer.parseInt(sc.nextLine());
			switch (choice){
			case 1:
				if(!full()){
					System.out.println("What value? ");
					val = Integer.parseInt(sc.nextLine());
					enqueue(val);
				}
				else{
					System.out.println("Full");
				}
				break;
			case 2:
				if(!empty()){
					System.out.println("first is " + first());
				}
				else{
					System.out.println("Empty");
				}
				break;
			case 3:
				if(!empty()){
					System.out.println("Removed " + dequeue());
				}
				else{
					System.out.println("Empty");
				}
			}
		}while (choice != 4);
	}

}
