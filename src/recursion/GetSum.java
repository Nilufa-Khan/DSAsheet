package recursion;

public class GetSum {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int ans = getSum(arr,arr.length);
        System.out.println("Sum of The array element = "+ ans);

    }
    public static int getSum(int[] arr, int size){
        if(size == 0){
            return 0;
        }
        if(size == 1){
            return arr[0];
        }
        int remainingPart = getSum(arr,size-1) ;
        return arr[size-1] + remainingPart;
    }
}
