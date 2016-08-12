import java.util.HashSet;

/**
 * Created by David on 2016/8/12.
 */
public class 找出数组中重复的数 {

    public static void main(String[] args) {
        int[] result = new int[2];
        int[] input = {};
        System.out.println(duplicate(input, 0, result));
        System.out.println(result[0]);
    }

    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        if(length < 2 || numbers==null){
            duplication[0] =-1;
            return false;
        }
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < length; i ++) {
            if (set.contains(numbers[i])) {
                duplication[0] = numbers[i];
                return true;
            } else {
                set.add(numbers[i]);
            }
        }
        return false;
    }
}
