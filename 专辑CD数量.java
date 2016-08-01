import java.util.Scanner;

/**
 * Created by David on 2016/8/1.
 */
public class 专辑CD数量 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int L = sc.nextInt();
            if (n > 100) return;
            if (L > 10000 || L < s)  return;

            int count = 0;
            for (int i = 1; i <= n; i ++) {
                if (L >= i * s + (i - 1) * 1 && L <= (i + 1) * s + i * 1) {
                    count = i;
                    break;
                }
            }

            if (count % 13 == 0) {
                count --;
            }

            double result = (double)n / count;
            System.out.println((int)Math.ceil(result));

//            int count = 0;
//            int res = 0;
//            int left = L;
//
//            while (n > 0) {
//                if (left >= s + 1) {
//                    left = left - s - 1;//当前专辑剩余空间
//                    n --;
//                    if (n == 0) {
//                        res ++;
//                    }
//                    count ++; //一张专辑存歌数量
//                } else {
//                    if (count % 13 == 0) {
//                        n ++;
//                    }
//
//                    res ++;
//                    left = L;
//                    count = 0;
//                }
//            }
//
//            System.out.println(res);
        }
    }
}
