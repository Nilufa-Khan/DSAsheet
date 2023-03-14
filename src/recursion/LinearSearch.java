package recursion;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {10,2,13,1,6,7,4,5,9};
        int key = 1;
        int index = linearSearchUsingRecursion(arr, arr.length,key);
        if(index == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("index of search element = " + index);
        }

    }
    public static int linearSearchUsingRecursion(int[] arr,int size, int key){
        if(size == 0){
            return -1;
        }

        if(key == arr[0]){
            return arr[0];
        }else {
           return linearSearchUsingRecursion(arr,size-1,key);

        }


    }
}
