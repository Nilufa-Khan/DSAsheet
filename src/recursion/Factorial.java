package recursion;

public class Factorial {
    public static void main(String[] args) {
        int number = -1;
        int factorial = fact(number);
        System.out.println("factorial of "+ number +" = " + factorial);
    }
    public static int fact(int number){
        if(number < 0){
            System.out.println("Please provide a positive number");
            return -1;
        }
        if(number == 0){
            return 1;
        }
        else{
            return (number * fact(number -1));
        }

    }
}
