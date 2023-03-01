package recursion;

public class PowerOfN {
    public static void main(String[] args) {
        int number = 2;
        int power = 3;
        int result = powerOfN(number,power);
        System.out.println("Power of "+ number +" ^ " + power +" = "+ result);
    }
    public static int powerOfN(int number, int power){
        if(power==0){
            return 1;
        }else{
           return (number * powerOfN(number,power-1));
        }


    }
}
