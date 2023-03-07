package recursion;


import java.util.Collections;

public class StringReverse {
    public static void main(String[] args) {
        String str = "welcome to dsa sheet practice";
        reverseString(str);
    }
    //recursive function to reverse a string
   public static void reverseString(String string)
    {
        if ((string==null)||(string.length() <= 1))
            System.out.println(string);
        else
        {
            System.out.print(string.charAt(string.length()-1));
            reverseString(string.substring(0,string.length()-1));
        }
    }
}
