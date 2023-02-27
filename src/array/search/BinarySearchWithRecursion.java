package array.search;

public class BinarySearchWithRecursion {
    public static void main(String[] args) {
        int[] arr = {12,45,55,67,88,90,99};
        int key = -90;
        int index = binarySearchRecursion(arr,0, arr.length-1, key);
        if (index == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("index of key element  = " + index);
        }
    }
            //Recursive approach (The recursive method follows the divide and conquer approach)
            //Time Complexity: O(log n)
            //Auxiliary Space: O(log n)
    public static int binarySearchRecursion(int[] arr , int first, int last, int key){
        while(first <= last){
            int mid = (first + last)/2;
            if(arr[mid] == key){
                return mid;
            }else if(key > arr[mid]){
                return binarySearchRecursion(arr,mid +1,last,key);
            }else{
                return binarySearchRecursion(arr,first,mid-1,key);
            }
        }
        return -1;
    }

}
