import java.awt.print.PrinterGraphics;
import java.util.Scanner;

/**
 * Created by David on 2016/8/24.
 */
public class 进制和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i ++) {
            int n = sc.nextInt();
            int res = 0;
            for (int j = 1; j <= n; j ++) {
                if (f(j) == g(j)) {
                    res ++;
                }
            }
            System.out.println(res);
        }
    }

    public static int f(int x) {
        int res = 0;
        while (x != 0) {
            int cur = x % 10;
            res += cur;
            x = x / 10;
        }
        return res;
    }

    public static int g(int x) {
        int res = 0;
        String s = Integer.toBinaryString(x);
        for (int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) == '1') {
                res ++;
            }
        }
        return res;
    }
}
