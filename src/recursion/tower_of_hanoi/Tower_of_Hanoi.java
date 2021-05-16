package recursion.tower_of_hanoi;

//import java.util.Stack;

public class Tower_of_Hanoi {

	class Stack {
		int capacity;
		int top;
		int[] array;
	}

	Stack createStack(int capacity) {
		Stack stack = new Stack();
		stack.capacity = capacity;
		stack.top = -1;
		stack.array = new int[capacity];
		return stack;
	}

	boolean isFull(Stack stack) {
		return (stack.top == stack.capacity - 1);
	}

	boolean isEmpty(Stack stack) {
		return (stack.top == -1);
	}

	void push(Stack stack, int item) {
		if (isFull(stack))
			return;
		stack.array[++stack.top] = item;
	}

	int pop(Stack stack) {
		if (isEmpty(stack))
			return Integer.MIN_VALUE;
		return stack.array[stack.top--];
	}

	void moveDisk(char from, char to, int disk) {
		System.out.println("Move the disk: " + disk + " from " + from + " to " + to);
	}

	void moveDiskBetweenPoles(Stack src, Stack des, char s, char d) {
		int pole1TopDisk = pop(src);
		int pole2TopDisk = pop(des);

		if (pole1TopDisk == Integer.MIN_VALUE) {
			push(src, pole2TopDisk);
			moveDisk(d, s, pole2TopDisk);
		} else if (pole2TopDisk == Integer.MIN_VALUE) {
			push(des, pole1TopDisk);
			moveDisk(s, d, pole1TopDisk);
		} else if (pole1TopDisk > pole2TopDisk) {
			push(src, pole1TopDisk);
			push(src, pole2TopDisk);
			moveDisk(d, s, pole2TopDisk);
		} else {
			push(des, pole2TopDisk);
			push(des, pole1TopDisk);
			moveDisk(s, d, pole1TopDisk);
		}
	}

	public void tohIterative(int num_of_disks, Stack src, Stack aux, Stack des) {
		int i, total_no_moves;
		char s = 'S', a = 'A', d = 'D';
		if (num_of_disks % 2 == 0) {
			char temp = d;
			d = a;
			a = temp;
		}
		total_no_moves = (int) (Math.pow(2, num_of_disks) - 1);

		for (i = num_of_disks; i >= 1; i--)
			push(src, i);
		for (i = 1; i <= total_no_moves; i++) {
			if (i % 3 == 1)
				moveDiskBetweenPoles(src, des, s, d);
			else if (i % 3 == 2)
				moveDiskBetweenPoles(src, aux, s, a);
			else if (i % 3 == 0)
				moveDiskBetweenPoles(aux, des, a, d);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 70;
		Tower_of_Hanoi th = new Tower_of_Hanoi();
		Stack src, des, temp;
		src = th.createStack(n);
		des = th.createStack(n);
		temp = th.createStack(n);
		
		th.tohIterative(n, src, temp, des);
	}

}
