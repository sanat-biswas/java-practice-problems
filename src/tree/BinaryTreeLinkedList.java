package tree;

import java.util.LinkedList;
import java.util.Queue;


public class BinaryTreeLinkedList {

	class Node {
		int data;
		Node left;
		Node right;
	}

	public BinaryTreeLinkedList() {
		root = null;
	}

	Node root;

	public void insert(int value) {
		Node new_node = new Node();
		new_node.data = value;

		if (root == null) {
			root = new_node;
			System.out.println("Successfully inserted node at root.");
			return;
		}

		else {
			Queue<Node> queue = new LinkedList<>();

			queue.add(root);

			while (!queue.isEmpty()) {
				Node node = queue.remove();
				if (node.left == null) {
					node.left = new_node;
					queue.add(node.left);
					break;
				} else if (node.right == null) {
					node.right = new_node;
					queue.add(node.right);
					break;
				} else {
					queue.add(node.left);
					queue.add(node.right);
				}
			}
		}
	}

//	public void inorder() {
//		Stack<Node> s = new Stack<>();
//		Node temp = root;
//
//		while (temp != null || s.size() > 0) {
//			while (temp != null) {
//				s.push(temp);
//				temp = temp.left;
//			}
//
//			temp = s.pop();
//			System.out.print(temp.data + " ");
//			temp = temp.right;
//		}
//	}

	public void inorderTraversal(Node node) {
		if (node == null)
			return;
		inorderTraversal(node.left);
		System.out.print(node.data + " ");
		inorderTraversal(node.right);

	}

	public void preOrder(Node node) {
		if (node == null)
			return;
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	public void postOrder(Node node) {
		if (node == null)
			return;

		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + " ");
	}

	public void levelOrder(Node node) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			Node temp = queue.remove();
			System.out.print(temp.data + " ");
			if (temp.left != null)
				queue.add(temp.left);
			if (temp.right != null)
				queue.add(temp.right);
		}
	}

	public int treeHeight(Node node){

		if(node == null)
			return 0;

		Queue<Node> queue = new LinkedList<>();

		queue.add(node);

		int height = 0;

		while(true){
			int nodeCount = queue.size();

			if(nodeCount == 0)
				return height;

			height++;

			while(nodeCount > 0){
				Node newNode = queue.peek();
				queue.remove();

				if(newNode.left != null)
					queue.add(newNode.left);

				if(newNode.right != null)
					queue.add(newNode.right);

				nodeCount--;
			}
		}
	}

	public void search(int value) {

		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		if (root == null) {
			return;
		} else {
			while (!queue.isEmpty()) {
				Node temp = queue.remove();
				if (temp.data == value) {
					System.out.println(value + " found in the tree.");
					return;
				} else {
					if (temp.left != null) {
						queue.add(temp.left);
					}
					if (temp.right != null) {
						queue.add(temp.right);
					}
				}
			}
		}
		System.out.println(value + " not found.");
	}

	public void insertNew(int value) {
		Node new_node = new Node();
		new_node.data = value;

		if (root == null) {
			root = new_node;
			System.out.println("Successfully inserted value in the tree");
			return;
		} else {
			Queue<Node> queue = new LinkedList<>();
			queue.add(root);
			while (!queue.isEmpty()) {
				Node temp = queue.remove();
				if (temp.left == null) {
					temp.left = new_node;
					System.out.println("Successfully inserted " + temp.left.data + " at the left of " + temp.data);
					return;
				}

				else if (temp.right == null) {
					temp.right = new_node;
					System.out.println("Successfully inserted " + temp.right.data + " at the right of " + temp.data);
					return;
				} else {
					queue.add(temp.left);
					queue.add(temp.right);
				}
			}
		}
	}

	public Node getDeepestNode() {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		Node temp = null;
		while (!queue.isEmpty()) {
			temp = queue.remove();
			if (temp.left != null) {
				queue.add(temp.left);
			}

			if (temp.right != null) {
				queue.add(temp.right);
			}
		}
		System.out.println(temp.data);
		return temp;
	}

	public void deleteDeepestNode() {
		Queue<Node> queue = new LinkedList<>();

		queue.add(root);
		Node previous, present = null;
		while (!queue.isEmpty()) {
			previous = present;
			present = queue.remove();
			if (present.left == null) {
				present.right = null;
				return;
			} else if (present.right == null) {
				present.left = null;
				return;
			} else {
				queue.add(present.left);
				queue.add(present.right);
			}
		}
	}

	public void deleteNode(int value) {
		Queue<Node> queue = new LinkedList<>();

		queue.add(root);
//		Node new_node = new Node();

		while (!queue.isEmpty()) {
			Node temp = queue.remove();
			// if node is found then copy the deepest node here and delete deepest node
			if (temp.data == value) {
				temp.data = getDeepestNode().data;
				deleteDeepestNode();
				System.out.println("Deleted the node " + temp.data);
				return;
			} else {
				if (temp.left != null) {
					queue.add(temp.left);
				} else if (temp.right != null) {
					queue.add(temp.right);
				}
			}

		}
	}

	public static void main(String[] args) {
		BinaryTreeLinkedList binaryTree = new BinaryTreeLinkedList();
		for (int i = 1; i <= 10; i++) {

			binaryTree.insert(i * 10);

		}

//		System.out.println("\nInorder Traversal");
//		binaryTree.inorderTraversal(binaryTree.root);
//
//		System.out.println("\nPreOrder Traversal");
//		binaryTree.preOrder(binaryTree.root);
//
//		System.out.println("\nPostOrder Traversal");
//		binaryTree.postOrder(binaryTree.root);
//
//		System.out.println();
//
//		binaryTree.search(40);
//
//		System.out.println("\nAdding new Node in the tree --->");
//		binaryTree.insertNew(400);
//		binaryTree.insertNew(200);
//		binaryTree.insertNew(300);
//		binaryTree.insertNew(500);

		System.out.println("\nLevel Order Traversal");
		binaryTree.levelOrder(binaryTree.root);

		System.out.println("\nHeight of binary tree is: " + binaryTree.treeHeight(binaryTree.root));


//		System.out.println();
//		binaryTree.deleteNode(10);
//		
//		System.out.println("\nDeepest Node: ");
//		binaryTree.getDeepestNode();
		
	}

}
