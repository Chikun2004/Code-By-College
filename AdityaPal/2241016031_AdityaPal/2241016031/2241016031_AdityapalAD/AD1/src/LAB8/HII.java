package LAB8;

import java.util.Scanner;

class HII {
	class Node{
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class HII {
    Node head;

    HII() {
        this.head = null;
    }

    void create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of nodes you want to add: ");
        int count = scanner.nextInt();

        System.out.println("Enter the data for each node: ");
        for (int i = 0; i < count; i++) {
            int data = scanner.nextInt();
            if (i == 0) {
                head = new Node(data);
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = new Node(data);
            }
        }
    }

    void insert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the data of the new node: ");
        int data = scanner.nextInt();

        System.out.println("Enter the position where you want to insert the new node (1-based index): ");
        int position = scanner.nextInt();

        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 1; i < position - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the position of the node you want to delete (1-based index): ");
        int position = scanner.nextInt();

        if (position == 1) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 1; i < position - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
    }

    void traversal() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
}

public class HII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        int choice;
        do {
            System.out.println("\n1. Create\n2. Insert\n3. Delete\n4. Traversal\n5. Reverse\n6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    singlyLinkedList.create();
                    break;
                case 2:
                    singlyLinkedList.insert();
                    break;
                case 3:
                    singlyLinkedList.delete();
                    break;
                case 4:
                    singlyLinkedList.traversal();
                    break;
                case 5:
                    singlyLinkedList.reverse();
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
    }
}