package circular_linked_list;

public class Circular_Linked_List {

	Node head = null;
	Node tail = null;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	// create circular linked list
	public void create(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = null;

		if (head == null) {
			head = new_node;
			tail = new_node;
		} else {
			tail.next = new_node;
			tail = new_node;
			tail.next = head;
		}
	}

	// insert at beginning
	public void insertFirst(int new_data) {
		Node new_node = new Node(new_data);

		new_node.next = head;
		head = new_node;
		tail.next = new_node;

	}

	// insert at end
	public void insertEnd(int new_data) {
		Node new_node = new Node(new_data);

		tail.next = new_node;
		tail = new_node;
		new_node.next = head;
	}

	// insert at given position
	public void insertAt(int new_data, int pos) {
		Node temp = head;
		for (int i = 1; i < pos - 1; i++) {
			temp = temp.next;
		}
		Node new_node = new Node(new_data);
		new_node.next = temp.next;
		temp.next = new_node;
	}

	// delete from first
	public void deleteFirst() {
		head = head.next;
		tail.next = head;
	}

	// delete from last
	public void deleteLast() {
		Node temp = head;
		while (temp.next != tail) {
			temp = temp.next;
		}
		temp.next = head;

	}

	// delete from last
	public void deletePos(int pos) {
		Node temp = head;
		for (int i = 1; i < pos - 1; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
	}

	// search
	public void searchNode(int item) {
		Node temp = tail.next;
		int pos = 1;
		do {
			if (temp.data == item) {
				System.out.println(temp.data + " found at position " + pos);
				return;
			}

			temp = temp.next;
			pos++;
		} while (temp != tail.next);
	}
	
	//reverse
	public void reverse() {
		Node current, next_node, prev;
		current = tail.next;
		next_node = current.next;
		prev = null;
		
		do {
			prev = current;
			current = next_node;
			next_node = current.next;
			current.next = prev;
		}while(current != tail);
		
		next_node.next = tail;
		tail = next_node;
		System.out.println(tail.data);
	}
	

	// display
	public void display() {
		Node temp = head;
		if (head == null) {
			System.out.println("List empty");
			return;
		}

		do {
			System.out.print(temp.data + " ");
			temp = temp.next;
		} while (temp != head);
	}

	public static void main(String[] args) {
		Circular_Linked_List cll = new Circular_Linked_List();
		for (int i = 1; i <= 10; i++) {
			cll.create(i);
		}

		cll.display();
//		System.out.println();
////		cll.insertEnd(34);
////		cll.insertFirst(45);
//		cll.display();

//		System.out.println();
//
//		cll.insertAt(20, 5);
//		cll.display();

//		System.out.println();

//		cll.deleteFirst();
//		cll.display();

//		System.out.println();
//		cll.deleteLast();
//		cll.display();
//		
//		System.out.println();
//		cll.deletePos(10);
//		cll.display();

		System.out.println();
//		cll.searchNode(1);

		for (int i = 0; i <= 10; i++) {
			cll.searchNode(i);
		}
		
		System.out.println();
		cll.reverse();
		cll.display();
	}

}
