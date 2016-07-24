import java.util.Scanner;

/**
 * Created by David on 2016/7/9.
 */
public class 完全平方数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; ; i ++) {
            if (i * i > n) break;

            count ++;
        }
        System.out.print(count);
    }
}
