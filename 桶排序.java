import java.util.Scanner;

/**
 * Created by David on 2016/7/20.
 */
public class 桶排序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] tmp = new int[1001];
            for (int i = 0; i < n; i++) {
                int index = sc.nextInt();
                tmp[index] = 1;
            }

            for (int i = 1; i <= 1000; i++) {
                if (tmp[i] == 1) System.out.println(i);
            }
        }
    }
}
