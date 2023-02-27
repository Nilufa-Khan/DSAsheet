package array.search;

public class FindPeakMountainArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,8,11};
        int indexOfPeakElement = peakElement(arr);
        System.out.println("index Of Peak Element = " + indexOfPeakElement);
    }
    public static int peakElement(int[] arr){
        int start = 0, end = arr.length-1;
        int mid = (start + end)/2;
        while(start < end){

            if(arr[mid] < arr[mid +1]){
                start = mid +1;
            }else{
                end = mid;
            }
            mid = (start + end)/2;
        }
        return mid;
    }
}
