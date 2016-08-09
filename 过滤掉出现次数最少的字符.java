//import javax.print.DocFlavor;
//import java.util.HashMap;
//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.Scanner;
//
///**
// * Created by davidshuvli on 2016/8/8.
// */
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            int  min = 21;
//            String input = sc.nextLine();
//            Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
//            for (int i = 0; i < input.length(); i ++) {
//                if (map.containsKey(input.charAt(i))) {
//                    int tmp = map.get(input.charAt(i));
//                    map.put(input.charAt(i), tmp + 1);
//                    if (tmp < min) {
//                        min = tmp;
//                    }
//                } else {
//                    map.put(input.charAt(i), 1);
//                    min = 1;
//                }
//            }
//
//            StringBuffer sb = new StringBuffer();
//            for (int i = 0; i < input.length(); i ++) {
//                if (map.get(input.charAt(i)) > min) {
//                    sb.append(input.charAt(i));
//                }
//            }
//
//            System.out.println(sb.toString());
//
//        }
//    }
//}
