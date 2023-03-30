package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr= {23,45,67,88,99,789};
        int index = binarySearch(arr,0,arr.length-1,67);
        if(index == -1){
            System.out.println("element not found");
        }else{
            System.out.println("element found at index position = "+ index);
        }

    }
    public static int binarySearch(int[] arr, int first, int last, int key){
        while(first <= last){
            int mid = (first + last)/2;
            if(arr[mid] == key){
                return  mid;
            }else if(key > arr[mid]){
                return binarySearch(arr,mid + 1, last, key);
            }else{
                return  binarySearch(arr, first, mid-1,key);
            }
        }
        return -1;
    }
}
