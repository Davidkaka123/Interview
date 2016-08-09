import java.util.Scanner;

/**
* Created by David on 2016/8/4.
*/
public class 字符串排序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < 26; i ++) {
                char tmp = (char)('a' + i);
                for (int j = 0; j < input.length(); j ++) {
                    if (tmp == input.charAt(j) || tmp == input.charAt(j) - 'A' + 'a') {
                        sb.append(input.charAt(j));
                    }
                }
            }

            for (int i = 0; i < input.length(); i ++) {
                char c = input.charAt(i);
                if (!(c >= 'a' && c <= 'z') && !(c >= 'A' && c <= 'Z') ) {
                    sb.insert(i, input.charAt(i));
                }
            }

            System.out.println(sb.toString());

        }

    }
}
