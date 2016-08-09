//import java.util.Scanner;
//
///**
// * Created by davidshuvli on 2016/8/4.
// */
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNextLine()) {
//            String input = sc.nextLine();
//
//            char[] inChar = input.toCharArray();
//
//            int begin = 0;
//            int end = 0;
//            doreverse(inChar, 0, inChar.length - 1);
//
//            for (int i = 0; i < inChar.length; i ++) {
//                if (inChar[i] == ' ') {
//                    end = i - 1;
//                    doreverse(inChar, begin, end);
//                    begin = end + 2;
//                }
//            }
//
//            doreverse(inChar, begin, inChar.length - 1);
//
//            System.out.println(new String(inChar));
//        }
//    }
//
//    public static void doreverse(char[] c, int begin, int end) {
//        for (int i = begin; i < end; i ++) {
//            char tmp = c[i];
//            c[i] = c[end];
//            c[end] = tmp;
//            end --;
//        }
//    }
//}
