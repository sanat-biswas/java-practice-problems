package stack;

public class Stacks {

	private static int top = -1;
	private static final int[] arr = new int[10];

	public static void push(int item) {
		if (top == arr.length - 1) {
			System.out.println("Stack is full");
			return;
		} else {
			arr[++top] = item;
		}
	}

	public static int pop() {
		int item;
		if (top == -1) {
			System.out.println("Stack is empty");
			return 0;
		} else {
			item = arr[top];
			top--;
			return item;
		}
	}

	public static int peek() {
		if (top == -1) {
			System.out.println("Stack is Empty");
			return 0;
		}
		return arr[top];

	}

	public static void display() {
		if (top == -1) {
			System.out.println("Stack is Empty");
			return;
		}

		for (int i = top; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		for (int i = 0; i < arr.length; i++) {
			push(i);
		}
		pop();
		System.out.println("peek element " + peek());
		display();
	}
}
