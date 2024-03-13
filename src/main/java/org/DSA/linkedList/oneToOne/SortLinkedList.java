package org.DSA.linkedList.oneToOne;

public class SortLinkedList {
    public static void main(String[] args) {
        Node head = new Node(2);
        Node n1 = new Node(1);
        Node n2 = new Node(3);
        Node n3 = new Node(5);
        Node n4 = new Node(4);

        head.next = n1; n1.next = n2; n2.next = n3; n3.next = n4;
        printLinkedList(head);

    }

    static Node sortLL(Node head) {
        Node prev = null;
        Node cur = head;

        Node ans = null;

        while(cur != null) {

        }
        return null;
    }

    static void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.val+ " -> ");
            head = head.next;
        }
        System.out.println();
    }
}
