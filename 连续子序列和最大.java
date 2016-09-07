import java.util.Scanner;

/**
 * Created by David on 2016/9/6.
 */
public class 连续子序列和最大 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println(0);
        }
        int[] input = new int[n];
        for (int i = 0; i < n; i ++) {
            input[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int cur = 0;
        for (int i = 0; i < n; i ++) {
            if (cur <= 0) {
                cur = input[i];
            } else {
                cur = cur + input[i];
            }
            if (max < cur) {
                max = cur;
            }

        }

        System.out.println(max);


    }
}
