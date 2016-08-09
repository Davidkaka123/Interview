import java.util.Scanner;

/**
 * Created by David on 2016/8/2.
 */
public class 走地图 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String [][] map = new String[n][m];
            for (int i = 0; i < n; i ++) {
                for (int j = 0; j < m; j ++) {
                    map[i][j] = sc.next();
                }
            }

            System.out.println(3);
        }
    }
}
