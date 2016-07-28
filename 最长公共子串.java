/**
 * Created by David on 2016/7/28.
 */
public class 最长公共子串 {
    public static void main(String[] args) {
        String a = "abc";
        String b = "a";
        System.out.println(longestCommonSubstring(a, b));
    }

    public static int longestCommonSubstring(String A, String B) {
        // write your code here
        int n = A.length();
        int m = B.length();
        int res = 0;
        if (n == 0 || m == 0) {
            return 0;
        }
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i ++) {
            if (A.charAt(i) == B.charAt(0)) {
                dp[i][0] = 1;
                res = 1;
            }
        }
        for (int j = 0; j < m; j ++) {
            if (B.charAt(j) == A.charAt(0)) {
                dp[0][j] = 1;
                res = 1;
            }
        }

        for (int i = 1; i < n; i ++) {
            for (int j = 1; j < m; j ++) {
                if (A.charAt(i) == B.charAt(j)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = 0;
                }
                res = Math.max(res, dp[i][j]);
            }
        }

        return res;
    }

}
