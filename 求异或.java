import java.util.Scanner;

/**
 * Created by David on 2016/9/9.
 * 由于依赖关系有明显的前驱后置的关系，所以用选择链表确定
 */
public class 求异或 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (n <= 0 || n > 100000 || m <= 0 || m > 100000) {
                System.out.println(0);
                return;
            }
            int[] items = new int[n];
            for (int i = 0; i < n; i ++) {
                items[i] = sc.nextInt();
            }

            int res = 0;

            for (int i = 0; i < n; i ++) {
                for (int j = i + 1; j < n; j ++) {
                    int tmp = items[i] ^ items[j];
                    if (tmp > m) res ++;
                }
            }

            System.out.println(res);
        }
    }
}
