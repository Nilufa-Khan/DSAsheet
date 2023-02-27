package array.search.bs;

import java.util.Scanner;

//    find only integer part
//    ex== 27 = 5.2  ==> op = 5 ignore 0.2
//    search space => 0---------------27 my answer will lie
public class SquareRootUsingBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int sqrt = findSquareOfInteger(number);
        System.out.println("sqrt of the given number is = " + morePrecision(number,3,sqrt));
    }
    public static int findSquareOfInteger(int number) {
        int start = 0;
        int end = number;
        int ans = -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int sqrt = mid * mid;
            if(sqrt == number){
                return mid;
            }
            if (sqrt < number) {
                ans = mid;
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return ans;
    }
   public static float morePrecision (int number, int precision, int tempSol) {
        float factor = 1;
        float ans = tempSol;
        for(int i=0; i<precision; i++) {
            factor = factor/10;
            for (float j=ans; j*j<number ; j = j+factor ){
                ans = j;
            }
        }
        return ans;
    }

}
