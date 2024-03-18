package org.DSA;

import java.util.Locale;

public class Practice {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(6);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        head.next = n1; n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5;n5.next = n6;
        printLL(head);
        Node res = removeElements(head, 6);
        printLL(res);
    }

    static Node removeElements(Node head, int val) {

        if(head == null || head.next == null) return null;

        Node temp = head;
        Node newNode = null;

        while(temp != null) {
            if(temp.val == val) {
                newNode = temp = head.next;
            }
            else {
                newNode = temp = head;
                newNode = newNode.next;
            }
            temp = temp.next;
        }
        return newNode;
    }


    static void printLL(Node head) {
        while(head != null) {
            System.out.print(head.val+" -> ");
            head = head.next;
        }
        System.out.println();
    }
}

class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
        this.next = null;
    }
}
