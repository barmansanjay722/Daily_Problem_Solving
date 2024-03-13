package org.DSA.linkedList.oneToOne;

public class Longest_Palindrome_List {              // O(n^2)
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(2);

        head.next = n1; n1.next = n2; n2.next = n3;

        System.out.println(longestPalindrome(head));
    }

    static int longestPalindrome(Node head) {
        if(head ==  null) return 0;
        if(head.next == null) return 1;

        Node cur = head;
        Node prev = null;
        int ans =0;

        while (cur != null) {
            Node next = cur.next;
            cur.next = prev;
            int commonIfCurIsExactCenter = countCommon(prev, next);
            int lengthFromExactCenter = 2 * commonIfCurIsExactCenter + 1;

            int commonIfcurNoteExactCenter = countCommon(cur, next);
            int lengthFromNoteExactCenter = 2 * commonIfcurNoteExactCenter;
            int largerTheseTwolength = Math.max(lengthFromNoteExactCenter,lengthFromExactCenter);
            ans = Math.max(ans, largerTheseTwolength);

            prev = cur;
            cur = next;
        }
        return ans;
    }

    static int countCommon(Node a, Node b) {
        int count = 0;
        while (a != null && b != null) {
            if(a.val == b.val) {
                count++;
                a = a.next;
                b = b.next;
            }
            else break;
        }
        return count;
    }
}
