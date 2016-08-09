import java.util.Scanner;

/**
 * Created by David on 2016/8/9.
 */
public class 字符串加密解密 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String toEncry = sc.next();

            String unEncry = sc.next();
            System.out.println(Encrypt(toEncry));
            System.out.println(unEncrypt(unEncry));

        }
    }

    public static String unEncrypt(String input) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < input.length(); i ++) {
            if (Character.isUpperCase(input.charAt(i))) {
                if (input.charAt(i) == 'A') sb.append('z');
                else {
                    char tmp = (char)(input.charAt(i) - 'A' + 'a' - 1);
                    sb.append(tmp);
                }
            }

            else if (Character.isLowerCase(input.charAt(i))) {
                if (input.charAt(i) == 'a') sb.append('Z');
                else {
                    char tmp = (char)(input.charAt(i) - 'a' + 'A' - 1);
                    sb.append(tmp);
                }
            }

            else if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                if (input.charAt(i) == '0') sb.append('9');
                else sb.append((char)(input.charAt(i) - 1));
            }

            else sb.append(input.charAt(i));
        }

        return sb.toString();
    }

    public static String Encrypt(String input) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < input.length(); i ++) {
            if (Character.isUpperCase(input.charAt(i))) {
                if (input.charAt(i) == 'Z') sb.append('a');
                else {
                    char tmp = (char)(input.charAt(i) - 'A' + 'a' + 1);
                    sb.append(tmp);
                }
            }

            else if (Character.isLowerCase(input.charAt(i))) {
                if (input.charAt(i) == 'z') sb.append('A');
                else {
                    char tmp = (char)(input.charAt(i) - 'a' + 'A' + 1);
                    sb.append(tmp);
                }
            }

            else if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                if (input.charAt(i) == '9') sb.append('0');
                else sb.append((char)(input.charAt(i) + 1));
            }

            else sb.append(input.charAt(i));
        }
        return sb.toString();
    }


}
