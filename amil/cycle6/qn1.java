import java.io.*;
import java.util.*;

class DoublyLinkedList {

    class Node {
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        Node head, tail = null;

        public void addNodeEnd(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = tail = newNode;
                head.previous = null;
                tail.next = null;
            } else {
                tail.next = newNode;
                newNode.previous = tail;
                tail = newNode;
                tail.next = null;
            }
        }

        public void addNodefront(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = tail = newNode;
                head.previous = null;
                tail.next = null;
            } else {
                head.previous = newNode;
                newNode.next = head;
                head = newNode;
            }
        }

        public void display() {
            Node current = head;
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            System.out.println("Nodes of doubly linked list: ");
            while (current != null) {

                System.out.print(current.data + " ");
                current = current.next;
            }
        }

}

class qn1 {
    public static void main(String[] args) 
    {

        Scanner obj = new Scanner(System.in);
        DoublyLinkedList dList = new DoublyLinkedList();

        int choice;
        while (true) {
            System.out.println("1.Insert at front");
            System.out.println("2.Insert after a certain index");
            System.out.println("3.Delete at front");
            System.out.println("4.Delete after a certain index");
            System.out.println("5.Diplay the Doubly linked list");
            System.out.println("6.Exit");
            choice = obj.nextInt();
            if (choice == 1) {
                int val;
                System.out.println("Enter the value to insert:");
                val = obj.nextInt();
                dList.addNodefront(val);
            }
        }
        dList.display();
    }
}
}