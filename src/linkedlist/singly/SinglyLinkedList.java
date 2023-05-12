package linkedlist.singly;

//in linked list every single box is known as a node
// last node points to null
// we can't directly access index
//head point to first node.
public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;
    public SinglyLinkedList(){
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
