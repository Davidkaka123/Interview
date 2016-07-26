import java.util.Scanner;

/**
 * Created by David on 2016/7/26.
 */
public class 裁剪最小正方形 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int minX = 0, maxX = 0, minY = 0, maxY = 0;
            for (int i = 0; i < n; i ++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                minX = x > minX ? minX : x;
                maxX = x > maxX ? x : maxX;
                minY = y > minY ? minY : y;
                maxY = y > maxY ? y : maxY;
            }

            int dist = Math.max(Math.abs(maxX - minX), Math.abs(maxY - minY));

            System.out.println(dist * dist);
        }
    }
}
