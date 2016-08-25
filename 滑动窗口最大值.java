import java.util.ArrayList;

/**
 * Created by davidshuvli on 2016/8/25.
 */
public class Main {
    public static void main(String[] args) {
        int[] num = {2,3,4,2,6,2,5,1};
        maxInWindows(num, 3);
    }

    public static ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (size == 0) return res;
        for (int i = 0; i <= num.length - size; i ++) {
            int  max = num[i];
            for (int j = i + 1; j <= i + size - 1; j ++) {
                max = num[j] > max ? num[j] : max;
            }
            res.add(max);
        }
        return res;
    }
}
