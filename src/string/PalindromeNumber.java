package string;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 121;
        //1*10 + 1
        int revNumber = 0;
        while(number != 0){
            int rem = number % 10;
            revNumber = revNumber * 10 + rem;
            number = number /10;
        }

        if(revNumber == number){
            System.out.println("is palindrome");
        }
        System.out.println("is not palindrome");
    }
}
