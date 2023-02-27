package array.search;

public class FindTotalNoOfOccurrence {
    public static void main(String[] args) {
        int[] arr = {0,0,1,2,2,2,3,3,4,4,4,4,4,5};
        int key = 4;

        int index = firstOccurrence(arr,key);
        int index2 = lastOccurrence(arr,key);
        int totalNoOfOccurrence = (index2 -index) + 1;
        System.out.println("total No Of Occurrence of "+key +" = " + totalNoOfOccurrence);

    }
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
