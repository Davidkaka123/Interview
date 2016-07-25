import java.util.*;
/**
 * Created by David on 2016/7/9.
 */
public class 及格线 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] scores = new int[n];
        while (n > 0) {
            scores[n - 1] = sc.nextInt();
            n --;
        }

        Arrays.sort(scores);

        if (scores[0] >= 60) System.out.println(60);
        else System.out.println((scores[4] / 10 % 10) * 10);
    }
}
