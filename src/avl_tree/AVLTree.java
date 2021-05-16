package avl_tree;

import java.util.LinkedList;
import java.util.Queue;

public class AVLTree {

	class Node {
		Node left;
		Node right;
		int data;
		int height;

		Node(int data) {
			this.data = data;
			height = 1;
		}
	}

	public AVLTree() {
		root = null;
	}

	Node root;

	// get height of tree
	int height(Node node) {
		if (node == null)
			return 0;

		return node.height;
	}

	int max(int a, int b) {
		return (a > b) ? a : b;
	}

	// get balance factor of node
	int getBalance(Node node) {
		if (node == null)
			return 0;
		return height(node.left) - height(node.right);
	}

	// right Rotate
	public Node rightRotate(Node node) {
		Node temp = node.left;
		Node v = temp.right;

		temp.right = node;
		node.left = v;

		node.height = max(height(node.left), height(node.right)) + 1;
		temp.height = max(height(temp.left), height(temp.right)) + 1;

		return temp;
	}

	// rotate left
	public Node rotateLeft(Node node) {
		Node temp = node.right;

		Node v = temp.left;
		temp.left = node;
		node.right = v;

		node.height = max(height(node.left), height(node.right)) + 1;
		temp.height = max(height(temp.left), height(temp.right)) + 1;

		return temp;
	}

	void insert(int value) {
		root = insert(root, value);
	}

	public Node insert(Node node, int value) {
		if (node == null) {
			return (new Node(value));
		}
		if (value < node.data) {
			node.left = insert(node.left, value);
		}

		else if (value > node.data) {
			node.right = insert(node.right, value);
		} else { // duplicate nodes not allowed
			return node;
		}

		// update height of the ancestor node
		node.height = 1 + max(height(node.left), height(node.right));

		// get the balance factor
		int balance = getBalance(node);

		// left-left case
		if (balance > 1 && value < node.left.data)
			return rightRotate(node);

		// right-right case
		if (balance < -1 && value > node.right.data)
			return rotateLeft(node);

		// left-right case
		if (balance > 1 && value > node.left.data) {
			node.left = rotateLeft(node.left);
			return rightRotate(node);
		}

		// right-left case
		if (balance < -1 && value < node.right.data) {
			node.right = rightRotate(node.right);
			return rotateLeft(node);
		}

		return node;
	}

	public void levelOrder() {

		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		System.out.println("Printing level order of a tree");
		if (root == null) {
			System.out.println("Tree is empty");
			return;
		}

		while (!queue.isEmpty()) {
			Node temp = queue.remove();
			System.out.print(temp.data + " ");
			if (temp.left != null)
				queue.add(temp.left);

			if (temp.right != null)
				queue.add(temp.right);

		}
	}

	// get the minimum value in the tree
	public Node minValueNode(Node node) {
		Node current = root;

		while (current != null)
			current = current.left;

		return current;
	}

	public Node deleteNode(Node node, int value) {

		if (root == null) {
			return root;
		}

		if (value < node.data)
			node.left = deleteNode(node.left, value);

		else if (value > node.data)
			node.right = deleteNode(node.right, value);
		else {

			// node with only one child or no child
			if ((node.left == null) || (node.right == null)) {
				Node temp = null;
				if (temp == node.left)
					temp = node.right;
				else
					temp = node.left;

				// no child case
				if (temp == null) {
					temp = node;
					node = null;
				} else {
					node = temp;
				}
			} else {
				Node temp = minValueNode(node.right);

				node.data = temp.data;

				// delete the in-order successor
				node.right = deleteNode(node.right, temp.data);
			}
		}

		if (node == null)
			return node;

		// update the height of the current node
		node.height = max(height(node.left), height(node.right)) + 1;

		// get the balance factor (to check if this node becomes unbalanced)
		int balance = getBalance(node);

		// LL case
		if (balance > 1 && getBalance(node.left) >= 0)
			return rightRotate(node);

		// LR case
		if (balance > 1 && getBalance(root.left) < 0) {
			root.left = rotateLeft(node.left);
			return rightRotate(node);
		}
		
		//RR case
		if(balance < -1 && getBalance(root.right) <= 0)
			return rotateLeft(node);
		
		//RL case
		if(balance < -1 && getBalance(root.right) > 0) {
			root.right = rightRotate(node.right);
			return rotateLeft(node);
		}
		return node;
	}

	public void preOrder(Node node) {
		if (node != null) {
			System.out.print(node.data + " ");
			preOrder(node.left);
			preOrder(node.right);
		}
	}

	public void inOrder(Node node) {
		if (node != null) {
			inOrder(node.left);
			System.out.print(node.data + " ");
			inOrder(node.right);
		}
	}

	public static void main(String[] args) {

		AVLTree avl = new AVLTree();
//		avl.createAvl();

		avl.insert(9);
		avl.insert(5);
		avl.insert(10);
		avl.insert(0);
		avl.insert(6);
		avl.insert(11);
		avl.insert(-1);
		avl.insert(1);
		avl.insert(2);
//		avl.levelOrder();
		
		avl.preOrder(avl.root);

		System.out.println();
		
		avl.root = avl.deleteNode(avl.root, 10);

		avl.preOrder(avl.root); 

	}

}
