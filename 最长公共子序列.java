/**
 * Created by David on 2016/7/27.
 */
public class 最长公共子序列 {
    public static void main(String[] args) {
        String a = "ABCD";
        String b = "EDCA";
        System.out.println(longestCommonSubsequence(a, b));
    }

    public static String reverseString(String s) {
        StringBuffer sb = new StringBuffer(s);
        return (sb.reverse()).toString();
    }

    public static int longestCommonSubsequence(String A, String B) {
        // write your code here
        int n = A.length();
        int m = B.length();
        if (n == 0 || m == 0) {
            return 0;
        }
        int[][] dp = new int[n][m];
        dp[0][0] = A.charAt(0) == B.charAt(0) ? 1 : 0;
        for (int i = 1; i < n; i ++) {
            dp[i][0] = Math.max(dp[i - 1][0], A.charAt(i) == B.charAt(0) ? 1 : 0);
        }

        for (int j = 1; j < m; j ++) {
            dp[0][j] = Math.max(dp[0][j - 1], A.charAt(0) == B.charAt(j) ? 1 : 0);
        }

        for (int i = 1; i < n; i ++) {
            for (int j = 1; j < m; j ++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                if (A.charAt(i) == B.charAt(j)) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + 1);
                }
            }
        }

        return dp[n - 1][m - 1];

    }


}
