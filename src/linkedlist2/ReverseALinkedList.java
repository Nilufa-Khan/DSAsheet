package linkedlist2;

public class ReverseALinkedList {
  Node head;


    ReverseALinkedList() {
    }

    //    Node class
    static class Node {

       int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void reverseIterate() {


    }

    public static void main(String[] args) {
        Node node1 = new Node(20);
        System.out.println(node1.data);
        System.out.println(node1.next);
    }
    }
