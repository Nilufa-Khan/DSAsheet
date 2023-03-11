package recursion;

public class CheckPalindromeUsingRecursion {
    public static void main(String[] args) {
        String str = "Rabar";
        boolean isPalindrome = checkPalindrome(str,0,str.length()-1);
        if(isPalindrome){
            System.out.println("This is a palindrome");
        }else{
            System.out.println("This is not a palindrome");
        }

    }
    public static boolean checkPalindrome(String str, int i , int j){
        if(i > j){
            return true;
        }
        if(str.charAt(i) != str.charAt(j)){
            return false;
        }
        else {
            return checkPalindrome(str, i+1,j-1);
        }
    }
}
