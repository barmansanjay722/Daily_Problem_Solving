package org.DSA.linkedList.videoQuestions;

public class RemoveDuplicates {
    public static void main(String[] args) {

        NodeLin head = new NodeLin(1);
        NodeLin n2 = new NodeLin(2);
        NodeLin n3 = new NodeLin(2);
        NodeLin n4 = new NodeLin(3);
        NodeLin n5 = new NodeLin(4);
        NodeLin n6 = new NodeLin(4);

        head.next = n2; n2.next = n3; n3.next = n4; n4.next = n5; n5.next = n6;
        printLinkedList(head);
        NodeLin newHead = removeDuplicatElements(head);
        printLinkedList(newHead);
    }

    static NodeLin removeDuplicatElements(NodeLin head) {
        NodeLin originalNode = head;
        NodeLin newNode = null;
        NodeLin temp = head;

        while(originalNode != null) {
            while (originalNode.next != null && originalNode.val == originalNode.next.val) {
                originalNode = originalNode.next;
            }
            if(newNode == null) {
                newNode = temp = originalNode;
            }
            else {
                temp.next = originalNode;
                temp = temp.next;
            }
            originalNode = originalNode.next;
        }
        return newNode;
    }

    static void printLinkedList(NodeLin temp) {
        while (temp != null) {
            System.out.print(temp.val+" ->");
            temp = temp.next;
        }
        System.out.println();
    }
}

class NodeLin {

    int val;

    NodeLin next;

    NodeLin(int val) {
        this.val = val;
        this.next = null;
    }
}
