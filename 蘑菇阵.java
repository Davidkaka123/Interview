import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by David on 2016/7/26.
 */
public class 蘑菇阵 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();
            double[][] map = new double[N + 1][M + 1];

            for (int i = 0; i <= N; i ++) {
                for (int j = 0; j <= M; j ++) {
                    if (i == 0 || j == 0) {
                        map[i][j] = 0.0;
                    } else {
                        map[i][j] = 1.0;
                    }
                }
            }


            for (int i = 0; i < K; i ++) {
                int X = sc.nextInt();
                int Y = sc.nextInt();
                map[X][Y] = 0.0;
            }

            for (int i = 1; i <= N; i ++) {
                for (int j = 1; j <= M; j ++) {
                    if (i == 1 && j == 1) {
                        continue;
                    }
                    if (Math.abs(map[i][j] - 0.0) < 1e-6) {
                        map[i][j] = 0.0;
                    } else {
                        if (i == N && j == M) {
                            map[i][j] = map[i - 1][j] + map[i][j - 1];
                        } else if (i == N) {
                            map[i][j] = map[i - 1][j] * 0.5 + map[i][j - 1];
                        } else if (j == M) {
                            map[i][j] = map[i - 1][j] + map[i][j - 1] * 0.5;
                        } else {
                            map[i][j] = map[i - 1][j] * 0.5 + map[i][j - 1] * 0.5;
                        }
                    }
                }
            }

            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println(df.format(map[N][M]).toString());

        }
    }
}
