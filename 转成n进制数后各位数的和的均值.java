import java.util.Scanner;

/**
 * Created by David on 2016/9/5.
 */
public class 转成n进制数后各位数的和的均值 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int res = 0;
            for (int i = 2; i < n; i ++) {
                res += transform(n, i);
            }
            int common = gcd(res, (n - 1));
            System.out.println(common);
            System.out.println((res/common) + "/" + (n - 2)/common);
        }
    }

    public static int transform(int num, int n) {
        int array[] = new int [100];
        int location = 0;
        while (num != 0) {
            int remainder = num % n;
            num = num / n;
            array[location] = remainder;
            location ++;
        }
        int res = 0;
        for (int i = 0; i < location; i ++) {
            res += array[i];
        }
        return res;
    }

    public static int gcd (int x, int y) {
        if (x < y) {
            int temp = x;
            x = y;
            y = temp;
        }
        while (x % y != 0) {
            int temp = x % y;
            x = y;
            y = temp;
        }
        return y;
    }
}
