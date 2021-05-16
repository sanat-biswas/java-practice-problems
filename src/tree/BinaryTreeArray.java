package tree;

public class BinaryTreeArray {

	int[] arr;
	int lastUsedIndex;

	// create empty node
	public BinaryTreeArray(int size) {
		arr = new int[size+1];
		lastUsedIndex = 0;

		System.out.println("Blank Tree of " + size + " is created");
	}

	boolean isTreeFull() {
        return arr.length - 1 == lastUsedIndex;
	}

	// insert node in binary tree
	public void insert(int value) {
		if (!isTreeFull()) {

			arr[lastUsedIndex] = value;
			lastUsedIndex++;

			System.out.println(value + " inserted in the tree");
		} else {
			System.out.println("could not insert node in the tree as it is full");
		}
	}

	public int search(int value) {
		for (int i = 0; i <= lastUsedIndex; i++) {
			if (arr[i] == value) {
				System.out.println(value + " found at index " + i);
				return i;
			}
		}

		System.out.println(value + " not found ");
		return -1;
	}

	// in order display
	public void treeInorder(int index) {
		if (index > lastUsedIndex) {
			return;
		} else {
			treeInorder(index * 2);
			System.out.print(arr[index] + " ");
			treeInorder(index * 2 + 1);
		}
	}

	public void treePreorder(int index) {
		if (index > lastUsedIndex)
			return;
		else {
			System.out.print(arr[index] + " ");
			treePreorder(index * 2);
			treePreorder(index * 2 + 1);
		}
	}

	public void postOrder(int index) {
		if (index > lastUsedIndex) {
			return;
		} else {
			postOrder(index * 2);
			postOrder(index * 2 + 1);
			System.out.print(arr[index] + " ");
		}
	}

	public void levelOrder() {
		for(int i = 1; i <= lastUsedIndex; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void delete(int value) {
		int location = search(value);
		if(location == -1) {
			return;
		}else {
			arr[location] = arr[lastUsedIndex];
			lastUsedIndex--;
			System.out.println("Successfully deleted " + value + " fron the tree.");
		}
	}
	public static void main(String[] args) {

		BinaryTreeArray btn = new BinaryTreeArray(10);
		for (int i = 1; i <= 10; i++) {
			btn.insert(i * 10);
		}

//		btn.display();
		System.out.println();
		System.out.println("Inorder traversal");
		btn.treeInorder(1);

		System.out.println("\nPre order traversal");
		btn.treePreorder(1);

		System.out.println("\nPost Order traversal");
		btn.postOrder(1);
		
		System.out.println("\nLevel Order traversal");
		btn.levelOrder();
		
		System.out.println();
		btn.delete(50);
		
		btn.levelOrder();
	}

}
