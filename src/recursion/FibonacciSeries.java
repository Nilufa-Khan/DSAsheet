package recursion;

public class FibonacciSeries {
    public static void main(String[] args) {
        int term = 8;
        for (int i = 0; i <= term; i++) {
            System.out.print(fibonacci(i) + " ");
        }


    }
    public static int fibonacci(int term){
        if(term == 0){
            return 0;
        }
        if(term ==1){
            return 1;
        }
        else{

           return fibonacci(term -2) + fibonacci(term -1);
        }
    }
}
