package array.search.bs;

public class FindPivot {
    public static void main(String[] args) {
        int[] arr = {3,8,10,17,1};
        int indexOfPivot = findPivotElement(arr);
        System.out.println("Index Of Pivot element = " + indexOfPivot);
    }
    public static int findPivotElement(int[] arr){
        int start = 0, end = arr.length-1;
        while (start < end){
            int mid = (start + end)/2;
            if(arr[mid] >= arr[0]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return end;
    }
}
