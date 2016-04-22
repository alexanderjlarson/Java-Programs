import java.util.Random;

class Node{
	
	public int value;
	public Node next;
	public Node(){
		value = 0;
		next = null;
	}
	public Node(int val){
		value = val;
		next = null;
	}
	
}

public class FunWithLinkedList {

	static Node first;
	
	public static void buildList(int num){
		Random rnd = new Random();
		int val;
		Node toAdd;
		for (int i = 0; i < num; i++){
			val = rnd.nextInt(100);
			toAdd = new Node(val);
			toAdd.next = first;
			first = toAdd;
		}
	}
	
	public static void printList(){
		Node current;
		current = first;
		if (first == null){
			System.out.println("List is empty.");
		}
		else{
			while (current != null){
				System.out.println(current.value);
				current = current.next;
			}
		}
	}
	public static void addAtEnd(int val){
		Node n = new Node(val);
		Node current;
		if(first == null){
			first = n;
		}
		else{
			current = first;
			while(current.next != null){
				current = current.next;
			}
			current.next = n;
		}
	}
	public static void insertAt(int val, int pos){
		Node n = new Node(val);
		Node current = first;
		for (int i = 0; i < pos-1; i++){
			current = current.next;
		}
		n.next = current.next;
		current.next = n;
	}
	public static void clearList(){
		Node current;
		while(first != null){
			current = first;
			first = first.next;
			current = null;
		}
	}
	
	public static void main(String[] args) {
		first = null;
		//buildList(5);
		addAtEnd(7);
		addAtEnd(3);
		addAtEnd(18);
		insertAt(17,2);
		printList();
		clearList();
		printList();
	}

}
