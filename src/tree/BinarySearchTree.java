package tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

	class Node {
		Node left;
		Node right;
		int data;
		
		Node(int data){
			this.data = data;
			left = null;
			right = null;
		}

	}

	Node root;
	
	public Node insert(Node node, int value) {
		if(root == null) {
			node = new Node(value);
			node.left = null;
			node.right = null;
		}else if(value < node.data) {
			node.left = new Node(value);
		}else if(value > node.data) {
			node.right = new Node(value);
		}else {
			System.out.println("Duplicate key.........\n");
		}
		
		return node;
	}

	public void inorder(Node node) {
		if(node == null)
			return;

		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);
		
	}

	public void levelOrder() {
		Queue<Node> queue = new LinkedList<>();

		queue.add(root);

		System.out.println("Printing level order traversal: ");
//		if (root == null) {
//			System.out.println("No tree exists....");
//			return;
//		}

		while (!queue.isEmpty()) {
			Node temp = queue.remove();
			System.out.print(temp.data + " ");
			if (temp.left != null) {
				queue.add(temp.left);
			}
			if (temp.right != null) {
				queue.add(temp.right);
			}
		}
	}

	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(bst.root, 32);
		bst.insert(bst.root, 50);
		bst.insert(bst.root, 30);
		bst.insert(bst.root, 60);
		bst.insert(bst.root, 38);
		bst.insert(bst.root, 35);
//		bst.insert(55);
//		bst.insert(22);
//		bst.insert(59);
//		bst.insert(94);
//		bst.insert(13);
//		bst.insert(98);
		
		bst.inorder(bst.root);

		bst.levelOrder();

	}

}
