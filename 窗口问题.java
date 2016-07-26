import sun.awt.windows.WingDings;

import java.util.Scanner;

/**
 * Created by David on 2016/7/25.
 */
public class 窗口问题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int t = sc.nextInt();
            int c = sc.nextInt();
            int[] evil = new int[n];

            for (int i = 0; i < n; i ++) {
                evil[i] = sc.nextInt();
            }

            int window = 0;
            int res = 0;
            for (int j = 0; j < c; j ++) {
                window += evil[j];
            }

            if (window <= t) {
                res ++;
            }

            for (int k = 1; k <= n - c; k ++) {
                window = window - evil[k - 1] + evil[k + c - 1];
                if (window <= t) {
                    res ++;
                }
            }

            System.out.println(res);

        }

    }
}
