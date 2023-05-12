package all_ll;

public class LinkedListDemo {
    Node head;
//    Node class------>>
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    // Add a node at front
    public void addNodeInFront(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    // Add a node after a given node
// 2 , 4,  5, 3, 6
    public void addNodeAfterSomeNode(Node prev_node, int data){

        /* 1. Check if the given Node is null */
        if(prev_node == null){
            System.out.println("The previous node can not be null");
            return;
        }
           /* 2. Allocate the Node &
        3. Put in the data*/
        Node newNode = new Node(data);

        /* 4. Make next of new Node as next of prev_node */
        newNode.next = prev_node.next;
        /* 5. make next of prev_node as new_node */
        prev_node.next = newNode;

    }
    public void addNodeAtEnd(int data){
           /* 2. Allocate the Node &
                3. Put in the data*/

             Node newNode = new Node(data);
                /* 4. If the Linked List is empty, then make the
                 new node as head */
             if(head == null){
                 head = newNode;
                 return;
             }
             /* 4. This new node is going to be the last node, so
         make next of it as null */
                 newNode.next = null;
            /* 5. Else traverse till the last node */
            Node last = head;
            while (last.next != null)
                last = last.next;

            /* 6. Change the next of last node */
            last.next = newNode;
            return;

    }
// print linked list

    public static void main(String[] args) {
        LinkedListDemo linkedListDemo = new LinkedListDemo();

    }
}
