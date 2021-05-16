package stack;

public class Stack_Linked_List {

	Node top = null;

	class Node {
		int data;
		Node next;
	}

	public void push(int item) {
		Node new_node = new Node();

		new_node.data = item;
		new_node.next = top;
		top = new_node;
	}

	public Node pop() {
		return (top = top.next);
	}

	public void peek() {
		System.out.println(top.data);
	}

	public void display() {
		Node temp = top;
		if (top == null) {
			System.out.println("Stack is Empty");
			return;
		}

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Stack_Linked_List sll = new Stack_Linked_List();

		for (int i = 0; i <= 10; i++) {
			sll.push(i);
		}
		sll.pop();
		System.out.println("Peek element: ");
		sll.peek();
		sll.display();
		System.out.println();
		
	}

}
