package recursion;

public class Printing {
    public static void main(String[] args) {
        int number = 5;
        printNumber(number);
    }
    public static void printNumber(int number){
        if(number == 0){
            return;
        }else{
            printNumber(number -1);
            System.out.print(number + " ");

        }
    }
}
