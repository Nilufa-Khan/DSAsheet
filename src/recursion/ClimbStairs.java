package recursion;
//condition either user can take one step or 2 step at a time
public class ClimbStairs {
    public static void main(String[] args) {
        int nStairs = 5;
        System.out.println("Number of steps = "+ climbStair(nStairs));
    }
    public static int climbStair(int nStairs){
        if(nStairs == 0){
            return 1;
        }
        if(nStairs < 0){
            return 0;
        }
        return climbStair(nStairs -1) + climbStair(nStairs -2);
    }
}
