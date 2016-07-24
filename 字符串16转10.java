import java.util.Scanner;

/**
 * Created by David on 2016/7/20.
 */
public class 字符串16转10 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            String tmp = input.substring(2);
            int result = Integer.parseInt(tmp, 16);
            System.out.println(result);
//            StringBuffer sb = new StringBuffer(sc.next());
//            int n = sb.length();
//            int result = 0;
//            for (int i = 2; i <= n - 1; i ++) {
//                if (sb.charAt(i) >= '0' && sb.charAt(i) <= '9') result = result * 16 + sb.charAt(i) - '0';
//                else result = result * 16 + sb.charAt(i) - 'A' + 10;
//            }
//            System.out.println(result);
        }
    }
}
