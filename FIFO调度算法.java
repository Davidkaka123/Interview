import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by David on 2016/7/24.
 */
public class FIFO调度算法 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt(); //cache大小
            int m = sc.nextInt(); //请求数量
            int result = 0;
            int[] dataIn = new int[m];

            for (int i = 0; i < m; i ++) {
                dataIn[i] = sc.nextInt();
            }

            LinkedList<Integer> cache = new LinkedList<Integer>();

            for (int j = 0; j < m; j ++) {
                if (cache.contains(dataIn[j])) { //命中
                    continue;
                } else { //缺页
                    if (cache.size() < n) {
                        cache.addLast(dataIn[j]);
                        result ++;
                    } else {
                        cache.removeFirst();
                        cache.addLast(dataIn[j]);
                        result ++;
                    }
                }
            }

            System.out.println(result);
        }
    }
}

