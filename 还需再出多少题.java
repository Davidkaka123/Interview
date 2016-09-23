import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by David on 2016/9/21.
 */
public class 还需再出多少题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = ((n / 3) + 1 ) * 3;
            int[] input = new int[n];
            for (int i = 0; i < n; i ++) {
                input[i] = sc.nextInt();
            }

            Arrays.sort(input);

            int count = 0;

            for (int i = 0; i < n - 1; i ++) {
                if ((input[i + 1] - input[i]) > 10) {
                    if ((i + 1) % 3 != 0) {
                        count += (input[i + 1] - input[i]) / 10;
                    }
                }
            }

            for (int i = 0; i < 100; i ++) {
                if (m + 3 * i - n >= count ) {
                    System.out.println(m + 3 * i - n);
                    return;
                }
            }

            System.out.print(0);
        }

    }
}
