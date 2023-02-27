package array.search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10,2,13,1,6,7,4,5,9};
        int key = 1;

        int index = linearSearch(arr,key);
        if(index == -1){
            System.out.println("Element not present");
        }else{
            System.out.println("index of key element = " + index);
        }


    }
    public static  int linearSearch(int[] arr, int key){
        for (int i = 0; i <arr.length; i++) {
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
