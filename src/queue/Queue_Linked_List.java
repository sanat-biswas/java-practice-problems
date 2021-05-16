package queue;

public class Queue_Linked_List {

	class Node {
		int data;
		Node next;
	}

	Node front = null;
	Node rear = null;

	public void insert(int item) {
		Node new_node = new Node();
		new_node.data = item;
		new_node.next = null;

		if (front == null) {
			front = new_node;
		} else {
			rear.next = new_node;
		}
		rear = new_node;
	}

	public void delete() {
		front = front.next;
	}
	
	public int peek() {
		return front.data;
	}

	public void display() {
		Node temp = front;
		if (front == null || rear == null) {
			System.out.println("Queue Empty");
			return;
		}

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		Queue_Linked_List qll = new Queue_Linked_List();

		for (int i = 0; i <= 10; i++) {
			qll.insert(i);
		}
		qll.delete();
		System.out.println(qll.peek());
		qll.display();
	}

}
