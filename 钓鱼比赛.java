import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by David on 2016/7/26.
 */
public class 钓鱼比赛 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int t = sc.nextInt();

            float total = 0;
            float[][] matrix = new float[n][m];

            for (int i = 0; i < n; i ++) {
                for (int j = 0; j < m; j ++) {
                    matrix[i][j] = sc.nextFloat();
                    total += matrix[i][j];
                }
            }

            float cc = matrix[x - 1][y - 1];
            float ss = total / (n * m);

            double resCC = 1 - Math.pow(1 - cc, t);
            double resSS = 1 - Math.pow(1 - ss, t);
            DecimalFormat df = new DecimalFormat("0.00");

            if (Math.abs(resCC - resSS) <= 1e-8) {
                System.out.println("equal");
                System.out.println(df.format(resCC));
            } else if (resCC > resSS) {
                System.out.println("cc");
                System.out.println(df.format(resCC));
            } else {
                System.out.println("ss");
                System.out.println(df.format(resSS).toString());
            }
        }
    }
}
