package recursion;

public class IsSortedArray {
    public static void main(String[] args) {
        int[] arr = {12,3,5,6,7,8,9};
        boolean ans = isSorted(arr, arr.length);
       if(ans){
           System.out.println("Sorted");
       }else{
           System.out.println("Not sorted");
       }

    }
    public static boolean isSorted(int[] arr, int size){
        if( size == 0 || size == 1){
            return true;
        }
        if(arr[0] > arr[1]){
            return false;
        }
       return isSorted(arr,size-1);

    }
}
