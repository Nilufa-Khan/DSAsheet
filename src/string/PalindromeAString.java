package string;

public class PalindromeAString {
    public static void main(String[] args) {
        String str = "Radar";
        String revString = "";
        for(int i = str.length()-1;i >= 0;i--){
            revString = revString + str.charAt(i);
        }
        System.out.println(revString);
        if(str.toLowerCase().equals(revString.toLowerCase())){
            System.out.println(" ' " + str + " ' " + " ==> is palindrome");
        }else{
            System.out.println(" ' " + str + " ' " + " ==> is not palindrome");
        }
    }
}
