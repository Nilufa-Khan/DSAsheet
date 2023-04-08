package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1,4,3,2);
        List<Integer> result = revArray(array);
        System.out.println(result);
    }
    public static List<Integer> revArray(List<Integer> array){
        List<Integer> revArr = new ArrayList<>();
        for(Integer i = array.size(); i > 0; i--){

            revArr.add(array.get(i-1));
            System.out.println(revArr);
        }
        return revArr;
    }
}
