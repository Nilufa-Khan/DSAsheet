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
            System.out.print(number + " ");
            printNumber(number -1);
        }
    }
}
