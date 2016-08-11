///**
// * Created by davidshuvli on 2016/8/11.
// */
//public class Main {
//    public static void main(String[] args) {
//        System.out.println(StrToInt("1a33"));
//    }
//
//    public static int StrToInt(String str) {
//        if (str.length() == 0) return 0;
//        boolean flag = true;
//        int index = 0;
//        int res = 0;
//        if (str.charAt(0) == '+' || str.charAt(0) == '-') {
//            index = 1;
//            flag = str.charAt(0) == '+' ? true : false;
//        }
//        for (int i = index; i < str.length(); i ++) {
//            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
//                res *= 10;
//                res += (str.charAt(i) - '0');
//            } else {
//                return 0;
//            }
//        }
//        if (!flag) res = 0- res;
//        return res;
//    }
//}
