/**
 * Created by David on 2016/8/15.
 */
public class 构建成绩数组 {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        multiply(A);
    }

    public static int[] multiply(int[] A) {
        int n = A.length;
        int[] forward = new int[n];
        int[] backward = new int[n];
        int[] res = new int[n];
        forward[0] = 1;
        backward[n - 1] = 1;
        for (int i = 1; i < n; i ++) {
            forward[i] = forward[i - 1] * A[i - 1];
        }
        for (int j = n - 1 - 1; j >= 0; j --) {
            backward[j] = backward[j + 1] * A[j + 1];
        }
        for (int k = 0; k < n; k ++) {
            res[k] = forward[k] * backward[k];
        }
        return res;

    }
}
