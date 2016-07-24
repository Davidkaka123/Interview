import java.awt.*;
import java.util.Scanner;

/**
 * Created by David on 2016/7/21.
 */
public class 约瑟夫环 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int index = 0;
            for (int i = 2; i <= n; i ++) {
                index = (index + 3) % i;
            }

            System.out.println(index);
        }
    }
}
