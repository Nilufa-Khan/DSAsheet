package linkedlist2;

import java.util.LinkedList;

public class LLDEMO {
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    // insert at head
    public void insertAtHead(int data){
        //new node create
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }
    // insert at tail
    public void insertAtTail(int data){
        Node temp = new Node(data);
        if(head== null){
            head = temp;
            return;
        }
       Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = temp;
    }
    // insert at specific position
    public void insertAtPosition(int position, int data){
        if(position == 1){
            insertAtHead(data);
            return;
        }
        Node temp = head;
        int count = 1;
        while (count < position-1){
            temp = temp.next;
            count++;
        }
        Node nodeToInsert = new Node(data);
        nodeToInsert.next = temp.next;

        temp.next = nodeToInsert;
        // updating last element as a tail in linked list
        // without below snippet code runs fine
//        if(temp.next == null){
//            insertAtTail(data);
//            return;
//        }
    }
    // print list
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LLDEMO lldemo = new LLDEMO();
        lldemo.insertAtHead(12);
        lldemo.insertAtHead(10);
        lldemo.insertAtHead(89);
        lldemo.insertAtHead(34);
        lldemo.printList();
        System.out.println("======After insert at tail======");
        lldemo.insertAtTail(45);
        lldemo.printList();
        System.out.println("Insert at specific position");
        lldemo.insertAtPosition(6,22);
        lldemo.printList();
        System.out.println("Head ==>> "+ lldemo.head.data);
       Node temp = lldemo.head;
       while (temp.next != null){
           temp = temp.next;
       }
        System.out.println("Tail ==>> "+ temp.data);

    }
}
