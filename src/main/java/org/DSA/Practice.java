package org.DSA;

import java.util.Locale;

public class Practice {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        Node n5 = new Node(6);

        head.next = n1; n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5;
        printLL(head);
//        Node revLL = reverseLL(head);
//        printLL(revLL);
        reverseKGroup(head,3);
    }

    static void reverseKGroup(Node head, int k) {
        Node temp = head;
        Node ans = new Node(-1);
        int count = 0;
        while(count != 3) {
            System.out.print(temp.val + " -> ");
            ans.next = temp;
            temp = temp.next;
            count++;
        }
    }

    static Node reverseLL(Node head) {
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


    static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
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
