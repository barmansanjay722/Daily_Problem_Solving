package org.DSA.linkedList.videoQuestions;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node head = new Node<>(1);
        Node n1 = new Node<>(2);
        Node n3 = new Node<>(5);
        Node n4 = new Node<>(8);

        head.next = n1;
        n1.prev = head;

        n1.next = n3;
        n3.prev = n1;

        n3.next = n4;
        n4.prev = n3;

        printLinkedList(head);
        Node newNode = reverseLinkedList(head);
        printLinkedList(newNode);
    }

    static Node reverseLinkedList(Node head) {

        if(head == null || head.next == null) return head;

        Node prev = head;
        Node cur = head.next;
        head.next = null;

        while (cur != null) {
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }

    static void printLinkedList(Node temp) {
        while (temp != null) {
            System.out.print(temp.val+" ->");
            temp = temp.next;
        }
        System.out.println();
    }
}
