//import java.util.Scanner;
//
///**
// * Created by davidshuvli on 2016/8/7.
// */
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            String input = sc.next();
//            StringBuffer sb = new StringBuffer();
//            for (int i = 0; i < input.length(); i ++) {
//                char cur = input.charAt(i);
//                if (cur >= 'A' && cur < 'Z') {
//                    cur = (char)('a' + 1 + cur - 'A');
//                } else if (cur == 'Z') {
//                    cur = 'a';
//                }
//
//                else if (cur >= 'a' && cur <= 'z') {
//                    if (cur >= 'a' && cur <= 'c') {
//                        cur = '2';
//                    } else if (cur >= 'd' && cur <= 'f') cur = '3';
//                    else if (cur >= 'g' && cur <= 'i') cur = '4';
//                    else if (cur >= 'j' && cur <= 'l') cur = '5';
//                    else if (cur >= 'm' && cur <= 'o') cur = '6';
//                    else if (cur >= 'p' && cur <= 's') cur = '7';
//                    else if (cur >= 't' && cur <= 'v') cur = '8';
//                    else if (cur >= 'w' && cur <= 'z') cur = '9';
//                }
//
//                sb.append(cur);
//            }
//            System.out.println(sb.toString());
//        }
//    }
//}
