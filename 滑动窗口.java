import java.util.Scanner;

/**
 * Created by David on 2016/7/25.
 */
public class 滑动窗口 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();//N个犯人
            int t = sc.nextInt();//T为最大罪恶值
            int c = sc.nextInt();//连续C个人犯人：窗口大小
            int res = 0;
            int[] evil = new int[n];

            for (int i = 0; i < n; i ++) {
                evil[i] = sc.nextInt();
            }
            //滑动窗口机制
            int window = 0;

            for (int i = 0; i < c; i ++) {
                window += evil[i];
            }

            if (window <= t) {
                res ++;
            }

            for (int j = 1; j <= n - c; j ++) {
                window = window - evil[j - 1] + evil[j + c - 1];
                if (window <= t) {
                    res ++;
                }
            }

            System.out.println(res);


        }
    }
}
