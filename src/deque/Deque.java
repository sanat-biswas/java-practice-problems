package deque;

public class Deque {

	public static int front = -1;
	public static int rear = -1;
	public static int[] arr = new int[10];

	// inserting at front
	public static void insert_front(int item) {
		if(front == 0 && rear == arr.length - 1 || (front == rear + 1)) {
			System.out.println("Queue Overflow");
			return;
		}
		if(front == -1) {
			front = rear = 0;
		}
		else if(front == 0)
			front = arr.length - 1;
		else 
			front = front - 1;
		arr[front] = item;
	}

	// inserting at rear
	public static void insert_rear(int item) {
		if (front == -1) {
			front = rear = 0;
		} else if (rear == arr.length - 1) {
			rear = 0;
		} else {
			arr[++rear] = item;
		}
	}

	public static int delete_rear() {
		int item;

		item = arr[rear];
		if (front == rear) {
			front = -1;
			rear = -1;
		} else if (rear == 0) {
			rear = arr.length - 1;
		}else {
			rear--;
		}
		return item;
	}
	
	public static int delete_front() {
		int item;
		
		item = arr[front];
		if(front == rear) {
			front = rear = -1;
		}
		if(front == arr.length - 1)
			front = 0;
		else
			front++;
		
		return item;
	}

	public static void display() {
		
		if(front == -1) {
			System.out.println("Queue is Empty");
			return;
		}
		int i = front;
		if(front <= rear) {
			while(i <= rear)
				System.out.print(arr[i++] + " ");
			
		}else {
			while(i <= arr.length - 1)
				System.out.print(arr[i++] + " ");
			i = 0;
			while(i <= rear)
				System.out.print(arr[i++] +" ");
		}
		System.out.println();
		System.out.println("Rear: " + arr[rear]);
		System.out.println("Front: " + arr[front]);
	}

	public static void main(String[] args) {

		System.out.println("Inserting at rear :");
		
		insert_front(20);
		insert_front(40);
		insert_rear(10);
		insert_rear(14);

		System.out.println("Elements: ");
		display();

		System.out.println();

		System.out.println("After deleting from rear: ");
//		delete_rear();
		delete_front();
		display();
	}

}
