package queue;

public class Queues {

	public static int front = -1;
	public static int rear = -1;

	public static int[] arr = new int[10];

	public static void insert(int item) {
		if (front == -1)
			front = 0;
		rear = rear + 1;
		arr[rear] = item;
	}

	public static int delete() {
		int item;
		item = arr[front];
		front = front + 1;
		return item;
	}

	public static int peek() {
		return arr[front];
	}

	public static void display() {
		if (front == -1 || front == rear - 1) {
			System.out.println("Queue is Empty");
			return;
		}

		for (int i = front; i <= rear; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Rear: " + arr[rear]);
		System.out.println("Rear: " + arr[front]);
	}

	public static void main(String[] args) {
		for (int i = 0; i < arr.length; i++) {
			insert(i);
		}

		delete();
		System.out.println("Peek element " + peek());
		display();
	}

}
