package org.DSA.linkedList.videoQuestions;

public class MiddleNode_LinkedList {
    public static void main(String[] args) {

        Nodee head = new Nodee(1);
        Nodee n1 = new Nodee(2);
        Nodee n2 = new Nodee(3);
        Nodee n3 = new Nodee(4);
        Nodee n4 = new Nodee(5);

        head.next = n1; n1.next = n2; n2.next = n3; n3.next = n4;

        Nodee midle = findMidlle(head);
        System.out.println(midle.val);
    }

    static Nodee findMidlle(Nodee head) {
        Nodee slow = head;
        Nodee fast = head;
        while(fast!= null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}

class Nodee {
    int val;

    Nodee next;

    Nodee(int val) {
        this.val = val;
        this.next = null;
    }
}
