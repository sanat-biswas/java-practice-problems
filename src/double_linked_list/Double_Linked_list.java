package double_linked_list;

public class Double_Linked_list {

	Node head;
	Node tail;

	class Node {
		int data;
		Node prev;
		Node next;

		Node(int data) {
			this.data = data;
			prev = null;
			next = null;
		}
	}

	// create list
	public void createDll(int new_data) {
		Node new_node = new Node(new_data);
		if (head == null) {
			head = new_node;
			tail = new_node;
			return;
		} else {
			tail.next = new_node;
			new_node.prev = null;
			tail = new_node;
			tail.next = null;
		}
	}

	// insert at first position
	public void insertFirst(int new_data) {
		Node new_node = new Node(new_data);

		new_node.prev = null;
		head.prev = new_node;
		new_node.next = head;
		head = new_node;

	}

	// insert last
	public void insertLast(int new_data) {
		Node new_node = new Node(new_data);
		Node temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}
		new_node.prev = temp;
		temp.next = new_node;
		new_node.next = null;
	}

	// insert at position
	public void insertPos(int new_data, int pos) {
		Node new_node = new Node(new_data);
		Node temp = head;
		if (pos == 1) {
			System.out.println("Cannot insert at position 1");
			return;
		}
		for (int i = 1; i < pos - 1; i++) {
			temp = temp.next;
		}

		new_node.prev = temp;
		new_node.next = temp.next;
		temp.next = new_node;
	}

	// delete from first
	public void deleteFirst() {
		if (head == null) {
			System.out.println("List is Empty");
			return;
		}

		Node temp = head;
		head = temp.next;
		head.prev = null;
	}

	// delete last
	public void deleteLast() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}

		temp.next = null;
	}

	// delete from position
	public void deletePos(int pos) {
		Node temp = head;
		for (int i = 1; i < pos - 1; i++) {
			temp = temp.next;
		}

		temp.next = temp.next.next;
	}

	// search the node
	public void search(int item) {
		Node temp = head;
		int pos = 1;
		while (temp != null) {
			if (temp.data == item) {
				System.out.println(temp.data + " found at position " + pos);
				return;
			}

			temp = temp.next;
			pos++;
		}
	}

	// reverse the linked list
	public void reverseList() {
		Node current = head;
		Node next_node = current.next;
		current.next = null;
		current.prev = next_node;
		while (next_node != null) {
			next_node.prev = next_node.next;
			next_node.next = current;
			current = next_node;
			next_node = next_node.prev;
		}

		head = current;

	}

	// sorting
	public void sort_list() {
		Node p, q;
		p = head;
		int temp;

		for (p = head; p.next != null; p = p.next) {
			for (q = p.next; q != null; q = q.next) {
				if (p.data > q.data) {
					temp = p.data;
					p.data = q.data;
					q.data = temp;
				}
			}
		}

	}

	// display
	public void display() {
		if (head == null) {
			System.out.println("List is Empty");
			return;
		}

		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Double_Linked_list dll = new Double_Linked_list();

//		for (int i = 1; i <= 10; i++) {
//			dll.createDll(i);
//		}

		dll.createDll(20);
		dll.createDll(1);
		dll.createDll(99);
		dll.createDll(90);
		dll.createDll(10);
		dll.createDll(23);
		dll.createDll(34);

//		dll.display();
//		System.out.println();

//		dll.insertFirst(30);
//		dll.display();
//
//		System.out.println();
//		
//		dll.insertLast(40);
//		dll.insertLast(46540);
//		dll.display();

//		dll.insertPos(200, 10);
//		dll.display();

//		System.out.println();

//		dll.deleteFirst();
//		dll.display();
//		
//		System.out.println();
//		
//		dll.deleteLast();
//		dll.display();

//		dll.deletePos(8);
//		dll.display();
//		System.out.println();
//		dll.search(200);

//		System.out.println();
//		dll.reverseList();
//		dll.display();

		dll.sort_list();
		dll.display();
	}
}


//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//
//public class Solution {
//
//    static class DoublyLinkedListNode {
//        public int data;
//        public DoublyLinkedListNode next;
//        public DoublyLinkedListNode prev;
//
//        public DoublyLinkedListNode(int nodeData) {
//            this.data = nodeData;
//            this.next = null;
//            this.prev = null;
//        }
//    }
//
//    static class DoublyLinkedList {
//        public DoublyLinkedListNode head;
//        public DoublyLinkedListNode tail;
//
//        public DoublyLinkedList() {
//            this.head = null;
//            this.tail = null;
//        }
//
//        public void insertNode(int nodeData) {
//            DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);
//
//            if (this.head == null) {
//                this.head = node;
//            } else {
//                this.tail.next = node;
//                node.prev = this.tail;
//            }
//
//            this.tail = node;
//        }
//    }
//
//    public static void printDoublyLinkedList(DoublyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
//        while (node != null) {
//            bufferedWriter.write(String.valueOf(node.data));
//
//            node = node.next;
//
//            if (node != null) {
//                bufferedWriter.write(sep);
//            }
//        }
//    }
//
//    // Complete the sortedInsert function below.
//
//    /*
//     * For your reference:
//     *
//     * DoublyLinkedListNode {
//     *     int data;
//     *     DoublyLinkedListNode next;
//     *     DoublyLinkedListNode prev;
//     * }
//     *
//     */
//    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
//        DoublyLinkedListNode node = new DoublyLinkedListNode (data);
//        DoublyLinkedListNode temp = head;
//
//
//        if(head == null || head.data > data){
//            node.next = head;
//            head.prev = node;
//            head = node;
//        }else{
//            while(temp.next != null){
//                if(temp.next.data < data){
//                    temp = temp.next;
//                }else{
//                    node.prev = temp;
//                    node.next = temp.next;
//                    temp.prev = node;
//                    temp.next = node;
//                    return head;
//                }
//
//
//            }
//
//            temp.next = node;
//            node.prev = temp;
//            node.next = null;
//        }
//
//        return head;
//
//
//
//    }
//
//    private static final Scanner scanner = new Scanner(System.in);
