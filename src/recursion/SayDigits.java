package recursion;
// ip = 123
//op = one two three
public class SayDigits {
    public static void main(String[] args) {
        int number = 456;
        String[] strArr = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        sayDigits(number,strArr);
    }
    public static void sayDigits(int number, String[] strArr){

        if(number == 0){
            return;
        }

            int digit = number % 10;
            number = number /10;
            sayDigits(number,strArr);
            System.out.print(strArr[digit] + "  ");


    }
}
