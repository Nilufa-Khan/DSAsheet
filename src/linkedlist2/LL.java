package linkedlist2;


public class LL {
    Node head;
    private int size;
    LL(){}
    LL(int size){
        this.size = 0;
    }
    //    Node class
    class Node{

        String data;
        Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
        size++;
    }
    }
    // add - first position
    public void addFirst(String data){
//        create a new node
        Node newNode = new Node(data);
        if(head== null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head== null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
           currentNode.next = newNode;
    }
    // print list
    public void  printList(){
        Node currentNode = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        while(currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }
    // delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }
    // delete last
    public void deleteLast(){

        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secLast = secLast.next;
        }
        secLast.next = null;
    }
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("List");
        list.printList();
        list.addFirst("This");
        list.printList();
        System.out.println("==================");
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println("Size of list is = " + list.getSize());
    }
}
