import java.util.Scanner;

/**
 * Created by David on 2016/8/1.
 */
public class 得到质数因子 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLong()) {
            Long tmp = sc.nextLong();
            getResult(tmp);
        }
    }

    public static void getResult(long ulDataInput) {
        while (ulDataInput != 0) {
            for (int i = 2; i <= ulDataInput; i ++) {
                if (ulDataInput % i == 0) {
                    ulDataInput /= i;
                    System.out.print(i + " ");
                    break;
                }
            }
        }
    }
}
