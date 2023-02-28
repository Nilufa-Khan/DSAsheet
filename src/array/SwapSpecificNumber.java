package array;

import java.util.Collections;
import java.util.Vector;

public class SwapSpecificNumber {
    public static void main(String[] args) {
        Vector<Integer> integerVector = new Vector<>();
        integerVector.add(10);
        integerVector.add(12);
        integerVector.add(30);
        integerVector.add(32);
        integerVector.add(40);
        integerVector.add(42);
        Collections.swap(integerVector,0,5);
        System.out.println(integerVector);
    }
}
