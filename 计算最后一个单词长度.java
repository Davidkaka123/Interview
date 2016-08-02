import java.util.Scanner;

/**
 * Created by David on 2016/8/1.
 */
public class 计算最后一个单词长度 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            StringBuffer sb = new StringBuffer(sc.nextLine());
            int count = 0;
            for (int i = sb.length() - 1; i >= 0; i --) {
                if (sb.charAt(i) != ' ') {
                    count ++;
                } else break;
            }
            System.out.println(count);
        }
    }
}
