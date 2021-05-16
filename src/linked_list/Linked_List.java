package linked_list;

public class Linked_List {

	Node head = null; // head of list
	Node tail = null;

	// linked list node
	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	//insert in linked list
	public void insert(int new_data) {
		Node new_node = new Node(new_data);

		if (head == null) {
			head = new_node;
			return;
		}

		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = new_node;
	}

	// inserting data
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	// insert at the given position
	public void insertAfter(int new_data, int pos) {
		Node temp;

		temp = head;
		for (int i = 1; i < pos - 1; i++) {
			temp = temp.next;

		}

		Node new_node = new Node(new_data);
		new_node.next = temp.next;
		temp.next = new_node;

	}

	// insert end
	public void insertEnd(int new_data) {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		Node new_node = new Node(new_data);
		new_node.next = null;
		temp.next = new_node;
	}

	// searching data
	public void search(int item) {
		Node temp = head;
		int pos = 1;
		while (temp != null) {
			if (temp.data == item) {
				System.out.println(temp.data + " found at positon " + pos);
				return;
			}

			temp = temp.next;
			pos++;
		}
	}

	// delete from beginning
	public void deleteFirst() {

		if (head == null) {
			System.out.println("List is Empty");
			return;
		} else {
			if (head != tail) {
				head = head.next;
			} else {
				head = tail = null;
			}
		}
	}

	// delete from last
	public void deleteLast() {
		Node temp = head;
		while (temp.next.next != null) {

			temp = temp.next;
		}
		temp.next = null;
	}

	// delete from position
	public void deletePos(int pos) {
		Node temp = head;
		for (int i = 1; i < pos - 1; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
	}

	// reverse list
	public void reverseList() {
		Node prevNode, currentNode, nextNode;
		prevNode = null;
		currentNode = nextNode = head;
		while (nextNode!= null) {
			nextNode = nextNode.next;
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
		}
		head = prevNode;

	}

	public void makeCycle(Node root, int pos){
		Node temp = root;
		Node start = null;

		int count = 1;
		while(temp.next != null){
			if(count == pos){
				start = temp;
			}
			temp = temp.next;
			count++;
		}

		temp.next = start;
	}

	boolean detectCycle(Node root){
		Node slow = head;
		Node fast = head;

		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;

			if(fast == slow){
				return true;
			}
		}
		return false;
	}

	public void removeCycle(Node root){
		Node fast = head;
		Node slow = head;

		do {
			slow = slow.next;
			fast = fast.next.next;
		}while(slow != fast);

		fast = head;
		while(slow.next != fast.next){
			slow = slow.next;
			fast = fast.next;
		}

		slow.next = null;

	}

	// printing list
	public void printList() {
		Node temp = head;

		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Linked_List list = new Linked_List();
//		list.push(7);

		for (int i = 1; i <= 20; i++) {
			list.insert(i);
		}

//		list.insertAfter(78, 6);
//		list.printList();
		list.insertEnd(100);
//		
		System.out.println();
//		
//		list.deleteFirst();
		list.printList();
//		
//		System.out.println();
////		list.deleteLast();
////		list.printList();
//		System.out.println();
//		
//		list.deletePos(20);
//		list.printList();
//		
		System.out.println();
////
//		list.reverseList();
//		list.printList();

		list.makeCycle(list.head, 2);
//		list.printList();

		System.out.println("Detect Cycle: " + list.detectCycle(list.head));

		list.removeCycle(list.head);
		System.out.println("Cycle Exists or Not: " + list.detectCycle(list.head));
//
//		System.out.println();
//
//		list.search(20);

	}

}
