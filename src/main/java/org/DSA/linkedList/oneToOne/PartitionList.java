package org.DSA.linkedList.oneToOne;

public class PartitionList {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n1 = new Node(4);
        Node n2 = new Node(3);
        Node n3 = new Node(2);
        Node n4 = new Node(5);
        Node n5 = new Node(2);

        head.next = n1; n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5;
        printLL(head);
        Node ans = partitionList(head, 3);
        printLL(ans);
    }

    static Node partitionList(Node head, int target) {
        if(head == null || head.next == null) return head;

        Node sHead = new Node(-1);
        Node lHead = new Node(-1);

        Node sTail = sHead;
        Node lTail = lHead;

        Node cur = head;

        while(cur != null) {
            if(cur.val < target) {
                sTail.next = cur;
                sTail = sTail.next;
            }
            else {
                lTail.next = cur;
                lTail = cur;
            }
            cur = cur.next;
        }
        sTail.next = lHead.next;
        lTail.next = null;
        return sHead.next;
    }

    static void printLL(Node head) {
        while (head != null) {
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


