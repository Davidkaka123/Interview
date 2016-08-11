//import jdk.internal.dynalink.beans.StaticClass;
//import sun.text.normalizer.RangeValueIterator;
//
///**
// * Created by davidshuvli on 2016/8/11.
// */
//public class Main {
//
//    public static void main(String[] args) {
//        String a = " ";
//        System.out.println(ReverseSentence(a));
//    }
//    public static String ReverseSentence(String str) {
//        if (str.trim().equals("")) return str;
//        StringBuffer sb = new StringBuffer();
//        String[] tmp = str.split(" +");
//        for (int i = tmp.length - 1; i >= 0; i --) {
//            sb.append(tmp[i] + " ");
//        }
//        return sb.toString().trim();
//    }
//}
