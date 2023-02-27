package array.search.bs;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
       int[] arr = {0,0,1,2,2,2,3,3,4,4,4,5};

       int key = 1;

       int index = firstOccurrence(arr,key);
        System.out.println(" first  Occurrence of " +key +" = " + index);
        int index2 = lastOccurrence(arr,key);
        System.out.println(" last Occurrence of " +key +" = "  + index2);
        System.out.println();
        int[] arr2 = {0,5,5,6,6,6};
        int key2 = 3;
        System.out.println("Another test case");
        System.out.println();
        int index3 = firstOccurrence(arr2,key2);
        System.out.println(" first  Occurrence of " +key2 +" = " + index3);
        int index4 = lastOccurrence(arr2,key2);
        System.out.println(" last Occurrence of " +key2 +" = "  + index4);
    }
//    Find first and last position of a sorted array, array may contain duplicate values

//    first occurrence------>>
    public static int firstOccurrence(int[] arr,int key){
        int start = 0, end = arr.length-1;
        int ans = -1;
        while (start <= end){
            int mid = (start + end)/2;
            if(arr[mid]==key){
                ans = mid;
                end = mid -1;


            }else if(key > arr[mid]){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return ans;
    }
// last occurrence---->>>
    public static int lastOccurrence(int[] arr,int key){
        int start = 0, end = arr.length-1;
        int ans = -1;
        while (start <= end){
            int mid = (start + end)/2;
            if(arr[mid]==key){
                ans = mid;
                start = mid + 1;


            }else if(key > arr[mid]){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return ans;
    }
}
