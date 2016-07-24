import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by David on 2016/7/21.
 */
public class 日志过滤 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            StringBuffer sb = new StringBuffer(sc.nextLine());
            StringBuffer res = new StringBuffer();
            Set<Character> s = new HashSet<Character>();
            for (int i = 0; i < sb.length(); i ++) {
                if (s.contains(sb.charAt(i))) {
                    continue;
                } else {
                    s.add(sb.charAt(i));
                    res.append(sb.charAt(i));
                }
            }
            System.out.println(res);
        }
    }
}
