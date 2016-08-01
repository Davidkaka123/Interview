import java.util.Scanner;

/**
 * Created by David on 2016/8/1.
 */
public class 计算字符个数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String sb = sc.next().toLowerCase();
            String dest = sc.next().toLowerCase();
            int res = 0;
            for (int i = 0; i < sb.length(); i ++) {
                if (sb.charAt(i) == dest.charAt(0)) {
                    res ++;
                }
            }
            System.out.println(res);

        }
    }
}

