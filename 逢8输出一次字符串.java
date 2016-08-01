import java.util.Scanner;

/**
 * Created by David on 2016/8/1.
 */
public class 逢8输出一次字符串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            StringBuffer sb1 = new StringBuffer(sc.next());
            StringBuffer sb2 = new StringBuffer(sc.next());
            change(sb1);
            change(sb2);
            printSb(sb1);
            printSb(sb2);


        }
    }

    public static void printSb (StringBuffer sb) {
        for (int i = 0; i < sb.length(); i += 8) {
            System.out.println(sb.substring(i, i + 8));
        }
    }

    public static void change(StringBuffer sb) {
        if (sb.length() % 8 != 0) {
            int n = 8 - sb.length() % 8;
            while (n != 0) {
                sb.append("0");
                n --;
            }
        }
    }
}
