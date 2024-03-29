package org.DSA.linkedList.videoQuestions;

public class PalindromeLL {
    public static void main(String[] args) {
        Node head = new Node<>(1);
        Node n1 = new Node<>(2);
        Node n3 = new Node<>(2);
        Node n4 = new Node<>(1);

        head.next = n1;
        n1.next = n3;
        n3.next = n4;

        printLinkedList(head);
        System.out.println(isLLPalindrome(head));
    }

    static boolean isLLPalindrome(Node head) {
        Node middle = findMiddle(head);
        Node t2 = reverseLinkedList(middle);
        Node t1 = head;
        while(t2 != null) {
            if(t1.val != t2.val) {
                return false;
            }
            t1 = t1.next;
            t2 = t2.next;
        }
        return true;
    }

    static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
