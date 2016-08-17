import java.util.Scanner;

/**
 * Created by David on 2016/8/17.
 */
public class 洗牌 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); //T组数据
        for (int i = 0; i < T; i ++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] input = new int[2 * n];
            for (int j = 0; j < 2 * n; j ++) {
                input[j] = sc.nextInt();
            }
            int[] res = input;
            for (int count = 0; count < k; count ++) {
                res = xipai(res);
            }
            StringBuffer sb = new StringBuffer();
            for (int in = 0; in < 2 * n - 1; in ++) {
                sb.append(res[in] + " ");
            }
            sb.append(res[2 * n - 1]);
            System.out.println(sb.toString());
        }
    }

    public static int[] xipai(int[] input) {
        int n = input.length;
        int[] first = new int[n / 2];
        int[] second = new int[n / 2];
        int[] res = new int[n];
        for (int i = 0; i < (n / 2); i ++) {
            first[i] = input[i];
        }
        for (int i = (n / 2); i < n; i ++) {
            second[i - n / 2] = input[i];
        }
        int j = n - 1;
        for (; j >= 0; j --) {
            if (j % 2 == 0) {
                res[j] = first[j / 2];
            } else {
                res[j] = second[j / 2];
            }
        }
        return res;
    }
}
