import java.util.Scanner;

/**
 * Created by David on 2016/8/2.
 */
public class 按大小写顺序输出字符串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            StringBuffer sb = new StringBuffer(sc.next());
            StringBuffer res = new StringBuffer();
            int len = sb.length();
            for (int i = 0; i < len; i ++) {
                if (! checkUpCase(sb.charAt(i))) {
                    res.append(sb.charAt(i));
                }
            }
            for (int i = 0; i < len; i ++) {
                if (checkUpCase(sb.charAt(i))) {
                    res.append(sb.charAt(i));
                }
            }

            System.out.println(res);

        }
    }

    public  static  boolean checkUpCase(char test) {
        if (test >= 'A' && test <= 'Z') {
            return true;
        } else
            return false;
    }
}
