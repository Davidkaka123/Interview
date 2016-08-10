//import java.util.Scanner;
//
///**
// * Created by davidshuvli on 2016/8/10.
// */
//public class Main {
//    //public static char c[] = { '@', '#', '$', '&' };
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNextLine()) {
//            String input = sc.nextLine();
//
//            input = input.replace(" ", "");
//            char c[] = { '@', '#', '$', '&' };
//
//            for (int i = 0; i < c.length; i++) {
//                while (input.indexOf(c[i]) != -1) {
//                    input = HuoXing(input, c[i]);
//                }
//
//            }
//                System.out.println(input);
//
//
//        }
//    }
//
//        private static String compute(String string, char c) {
//        int x = 0, y = 0;
//        int a = string.indexOf(c);
//        char b[] = string.toCharArray();
//        for (int i = a + 1; i < b.length; i++) {
//            if (('@' != b[i]) && ('#' != b[i]) && ('$' != b[i])
//                    && ('&' != b[i])) {
//                x++;
//
//            } else if (('@' == b[i]) || ('#' == b[i]) || ('$' == b[i])
//                    || ('&' == b[i])) {
//                break;
//            }
//
//        }
//        for (int j = a - 1; j >= 0; j--) {
//            if (('@' != b[j]) && ('#' != b[j]) && ('$' != b[j])
//                    && ('&' != b[j])) {
//                y++;
//
//            } else if (('@' == b[j]) || ('#' == b[j]) || ('$' == b[j])
//                    || ('&' == b[j])) {
//                break;
//            }
//        }
//        String e = string.substring(a - y, a);//得到1@2#3的1
//        String f = string.substring(a + 1, a + 1 + x);//得到1@2#3的2
//        String g = string.substring(a - y, a + 1 + x);//得到1@2#3的1@2
//        int eInt = Integer.parseInt(e);
//        int fInt = Integer.parseInt(f);
//        int rInt = 0;
//        switch (c) {
//            case '@':
//                rInt = (eInt - 1) * (fInt + 1);
//                break;
//            case '#':
//                rInt = (2 * eInt + 5) * (3 * fInt + 60);
//                break;
//            case '$':
//                rInt = (eInt + 1) * (2 * eInt + 3) * (fInt - 1) * (2 * fInt - 3);
//                break;
//            case '&':
//                rInt = ((eInt + fInt + 1) * (fInt - 9) + (eInt + 7) / (fInt - 8));
//                break;
//            default:
//                break;
//        }
//        String rString = String.valueOf(rInt);
//        string = string.replace(g, rString);//1@2#3变成rString#3
//        return string;
//
//    }
//
//
//        private static String HuoXing(String input, char action) {
//        int first = 0;
//        int second = 0;
//        int basePos = input.indexOf(action);
//        char tmp[] = input.toCharArray();
//        for (int i = basePos + 1; i < tmp.length; i++) {
//            if (('@' != tmp[i]) && ('#' != tmp[i]) && ('$' != tmp[i])
//                    && ('&' != tmp[i])) {
//                first++;
//
//            } else if (('@' == tmp[i]) || ('#' == tmp[i]) || ('$' == tmp[i])
//                    || ('&' == tmp[i])) {
//                break;
//            }
//
//        }
//        for (int j = basePos - 1; j >= 0; j--) {
//            if (('@' != tmp[j]) && ('#' != tmp[j]) && ('$' != tmp[j])
//                    && ('&' != tmp[j])) {
//                second++;
//
//            } else if (('@' == tmp[j]) || ('#' == tmp[j]) || ('$' == tmp[j])
//                    || ('&' == tmp[j])) {
//                break;
//            }
//        }
//        String left = input.substring(basePos - second, basePos);//得到1@2#3的1
//        String right = input.substring(basePos + 1, basePos + 1 + first);//得到1@2#3的2
//        String all = input.substring(basePos - second, basePos + 1 + first);//得到1@2#3的1@2
//        int leftInt = Integer.parseInt(left);
//        int rightInt = Integer.parseInt(right);
//        int resultInt = 0;
//        switch (action) {
//            case '@':
//                resultInt = (leftInt - 1) * (rightInt + 1);
//                break;
//            case '#':
//                resultInt = (2 * leftInt + 5) * (3 * rightInt + 60);
//                break;
//            case '$':
//                resultInt = (leftInt + 1) * (2 * leftInt + 3) * (rightInt - 1) * (2 * rightInt - 3);
//                break;
//            case '&':
//                resultInt = ((leftInt + rightInt + 1) * (rightInt - 9) + (leftInt + 7) / (rightInt - 8));
//                break;
//            default:
//                break;
//        }
//        String resultString = String.valueOf(resultInt);
//        input = input.replace(all, resultString);//1@2#3变成rString#3
//        return input;
//
//    }
//}
