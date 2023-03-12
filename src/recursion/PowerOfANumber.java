package recursion;
//2^4
public class PowerOfANumber {
    public static void main(String[] args) {

        System.out.println("Power = "+ powerOfANumber(2,5));
    }
    public static int powerOfANumber(int number, int power){
        if(power == 0){
            return 1;
        }
        if(power == 1){
            return number;
        }
        int ans = powerOfANumber(number,power/2);
        if(power%2 == 0){
            return ans * ans;
        }
        else{
            return  number * ans * ans;
        }
    }
}
