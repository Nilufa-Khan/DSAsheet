package array.search;
//Iterative approach
public class BinarySearch {
    public static void main(String[] args) {
    int[] arr = {12,45,55,67,88,90,99};

    int key = -55;
    int index = binarySearch(arr,0, arr.length-1, key);
    if (index == -1){
        System.out.println("Element not found");
    }else{

        System.out.println("index of key element  = " + index);
    }
    }
//    Time Complexity: O (log n)
//    Auxiliary Space: O (1)
    public static int binarySearch(int[] arr, int first, int last, int key){
        while(first <= last){
            int mid = (first + last)/2;
            if(arr[mid]==key){
                return mid;
            }else if(key > arr[mid]){
                first = mid + 1;
            }else{
                last = mid -1;
            }
        }
        return -1;
    }
}
