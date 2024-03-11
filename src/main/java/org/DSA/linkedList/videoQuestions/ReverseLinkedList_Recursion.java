package org.DSA.linkedList.videoQuestions;

public class ReverseLinkedList_Recursion {
    public static void main(String[] args) {
        Node head = new Node<>(1);
        Node n1 = new Node<>(2);
        Node n3 = new Node<>(3);
        Node n4 = new Node<>(8);

        head.next = n1;
        n1.prev = head;

        n1.next = n3;
        n3.prev = n1;

        n3.next = n4;
        n4.prev = n3;
        printLinkedList(head);
        Node newNode = reverseLLRecursive(head);
        printLinkedList(newNode);
    }

    static Node reverseLLRecursive(Node head) {
        if(head == null || head.next == null) return head;

        Node headOfSubProblem = reverseLLRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return headOfSubProblem;
    }

    static void printLinkedList(Node temp) {
        while (temp != null) {
            System.out.print(temp.val+" ->");
            temp = temp.next;
        }
        System.out.println();
    }

}
