package linkedlist2;

import java.util.LinkedList;

public class LLCollectionFramework {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addLast("List");
        System.out.println(list);
        list.addFirst("This");
        System.out.println(list);
        list.add("Hello"); // by default it will add in last index
        System.out.println(list);
        System.out.println("Size of list = " + list.size());
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+ " -> ");
        }
        System.out.println("NULL");
        list.removeLast();
        System.out.println(list);
    }

}
