package org.DSA.linkedList.videoQuestions;

public class Add_Two_NUM_LL {
    public static void main(String[] args) {
        NodeLL l1 = new NodeLL(1);
        NodeLL n1 = new NodeLL(2);
        NodeLL n3 = new NodeLL(3);

        l1.next = n1;
        n1.next = n3;

        NodeLL l2 = new NodeLL(9);
        NodeLL n4 = new NodeLL(4);
        l2.next = n4;

        printLL(l1);
        printLL(l2);
        NodeLL ans = addTwoLL(l1,l2);
        printLL(ans);
    }

    static NodeLL addTwoLL(NodeLL n1, NodeLL n2) {
        NodeLL r1 = reverseLL(n1);
        NodeLL r2 = reverseLL(n2);

        int carry = 0;
        NodeLL ans = null;
        NodeLL temp = null;
        while (r1 != null || r2 != null || carry != 0) {
            int sum = carry;
            if(r1 != null) {
                sum += r1.val;
                r1 = r1.next;
            }
            if(r2 != null) {
                sum += r2.val;
                r2 = r2.next;
            }

            int digit  = sum % 10;
            carry = sum / 10;

            NodeLL newNode = new NodeLL(digit);
            if(ans == null) {
                ans = temp = newNode;
            }
            else {
                temp.next = newNode;
                temp = temp.next;
            }
        }
        return reverseLL(ans);
    }

    static NodeLL reverseLL(NodeLL head) {
        if(head == null || head.next == null) return head;

        NodeLL prev = head;
        NodeLL cur = head.next;
        head.next = null;

        while (cur != null) {
            NodeLL next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }

    static void printLL(NodeLL head) {
        while(head!=null) {
            System.out.print(head.val+" -> ");
            head = head.next;
        }
        System.out.println();
    }
}

class NodeLL {
    int val;
    NodeLL next;

    NodeLL(int val) {
        this.val = val;
        this.next = null;
    }
}

