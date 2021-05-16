//package queue;
//
//public class Circular_Queue {
//
//	 int size;
//	public  int front;
//	public  int rear;
//	public  int[] arr;
//
//	public Circular_Queue(int size) {
//		this.size = size;
//		this.arr = new int[size];
//		this.rear = -1;
//		this.front = -1;
//	}
//
//	public  void insert(int item) {
//		if (((rear + 1) % size) == front)
//			System.out.println("Queue is full");
//		else if (rear == front && front == -1) {
//			front = 0;
//		}
//		rear = (rear + 1) % size;
//		arr[++rear] = item;
//	}
//
//	public  int deQueue() {
//
//		int item;
//		item = arr[front];
//		if (front == rear) {
//			front = -1;
//			rear = -1;
//		} else if (front == arr.length - 1)
//			front = 0;
//		else
//			front = (front + 1);
//		return item;
//	}
//
//	public  void display() {
//		if (front == -1) {
//			System.out.println("Queue is Empty");
//			return;
//		} else {
//			int i = front;
//			if (front <= rear) {
//				while (i <= rear)
//					System.out.print(arr[i] + " ");
//			} else {
//				while (i <= arr.length - 1)
//					System.out.print(arr[i] + " ");
//				i = 0;
//				while (i <= rear)
//					System.out.print(arr[i] + " ");
//			}
//		}
//	}
//
//	public static void main(String[] args) {
//		int[] arr = new int[size];
//		
//		Circular_Queue cq = new Circular_Queue(size);
////		for (int i = 0; i <= arr.length; i++) {
////			insert(i);
////		}
//		insert(90);
//		display();
////		deQueue();
////		display();
//	}
//
//}
