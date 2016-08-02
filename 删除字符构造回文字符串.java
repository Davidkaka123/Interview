import java.util.Scanner;

/**
 * Created by David on 2016/8/2.
 */
public class 删除字符构造回文字符串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String origin = sc.next();
            StringBuffer s = new StringBuffer(origin);
            StringBuffer rs = s.reverse();
            int n = origin.length();
            System.out.println(n - LCS(new StringBuffer(origin), rs));
        }
    }

    public  static int LCS (StringBuffer s1, StringBuffer s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n][m];
        dp[0][0] = s1.charAt(0) == s2.charAt(0) ? 1 : 0;
        for (int i = 1; i < n; i ++) {
            dp[i][0] = Math.max(dp[i - 1][0], s1.charAt(i) == s2.charAt(0) ? 1 : 0);
        }

        for (int j = 1; j < m; j ++) {
            dp[0][j] = Math.max(dp[0][j - 1], s1.charAt(0) == s2.charAt(j) ? 1 : 0);
        }

        for (int i = 1; i < n; i ++) {
            for (int j = 1; j < m; j ++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[n - 1][m - 1];
    }
}
