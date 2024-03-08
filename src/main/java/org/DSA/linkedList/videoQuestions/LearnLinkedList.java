package org.DSA.linkedList.videoQuestions;

public class LearnLinkedList {
    public static void main(String[] args) {

        // LinkedList and doubly linkedList

        Node<Integer> head = new Node<>(1);
        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n3 = new Node<>(5);
        Node<Integer> n4 = new Node<>(8);

        head.next = n1;
        n1.prev = head;

        n1.next = n3;
        n3.prev = n1;

        n3.next = n4;
        n4.prev = n3;

        printLinkedList(head);
//        Node<Integer> newList = insertInLinkedList(2,3,head);
        Node<Integer> newList = deleteFormLinkedList(2, head);
        System.out.println();
        printLinkedList(head);
    }

    public static void printLinkedList(Node<Integer> head) {
        Node<Integer> temp = head;
        while(temp != null) {
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
    }

    public static Node<Integer> deleteFormLinkedList(int pos, Node<Integer> head) {

        Node<Integer> temp = head;
        if(pos == 0) {
            return head.next;
        }

        for(int i=0;i<pos-1;i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;
    }

    public static Node<Integer> insertInLinkedList(int pos, int data, Node<Integer> head) {

        Node<Integer> newNode = new Node<>(data);
        if(pos == 0) {
            newNode.next = head;
            head.prev = newNode;
            return newNode;
        }

        Node<Integer> temp = head;
        for(int i=0;i<pos-1;i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }
}

class Node<T> {
     T val;
    Node<T> next;

    Node<T> prev;

    public Node(T val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
