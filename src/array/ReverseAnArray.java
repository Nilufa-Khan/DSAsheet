package array;

import java.util.Collections;
import java.util.Vector;



public class ReverseAnArray {

    public static void main(String[] args) {

        Vector<Integer> integerVector = new Vector<>();
        integerVector.add(10);
        integerVector.add(12);
        integerVector.add(30);
        integerVector.add(32);
        integerVector.add(40);
        integerVector.add(42);
        System.out.println(integerVector);
        Vector<Integer> ans = reverseArray(integerVector);
        System.out.println("Reverse array ");
        System.out.println(ans);
    }
    public static Vector<Integer> reverseArray(Vector<Integer> vector){
        int start = 0;
        int end = vector.size()-1;
        while (start <= end){
            Collections.swap(vector, start,end);
            start++;
            end--;
        }
        return vector;
    }

}
