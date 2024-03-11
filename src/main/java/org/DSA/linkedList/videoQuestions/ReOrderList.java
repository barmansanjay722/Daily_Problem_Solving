package org.DSA.linkedList.videoQuestions;

public class ReOrderList {
    public static void main(String[] args) {

        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);

        head.next = n1; n1.next = n2; n2.next = n3;
        printLL(head);
        Node ans = reOrderLL(head);
        printLL(ans);
    }

    static Node reOrderLL(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node l2 = reverseLL(slow);
        Node l1 = head;

        while (l1 != l2) {
            if(l1 == l2) {
                l1.next = null;
                break;
            }
            Node l1next = l1.next;
            Node l2next = l2.next;
            l1.next = l2;
            l2.next = l1next;
            l1 = l1next;
            l2 = l2next;
        }

        return head;
    }



    static Node reverseLL(Node head) {
        if(head == null || head.next == null) return head;

        Node prev = head;
        Node cur = head.next;

        while(cur != null) {
            Node next = cur.next;
            prev = cur;
            cur = next;
        }

        return prev;
    }

    static void printLL(Node head) {
        while(head != null) {
            System.out.print(head.val+ " -> ");
            head = head.next;
        }
        System.out.println();
    }
}
