import java.util.Scanner;

/**
 * Created by David on 2016/8/2.
 */
public class 网易test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] field = new int[n][m];
            int minMax = 0;
            for (int i = 0; i < n; i ++) {
                for (int j = 0; j < m; j ++) {
                    field[i][j] = sc.nextInt();
                    if (i == 0 && j == 0) {
                        minMax = field[i][j];
                    } else {
                        minMax = minMax > field[i][j] ? field[i][j] : minMax;
                    }
                }
            }

            System.out.println(minMax);
        }
    }
}
