//import java.util.Scanner;
//import java.util.TreeMap;
//
///**
// * Created by davidshuvli on 2016/8/3.
// */
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNextInt()) {
//            int n = sc.nextInt();
//            TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
//            for (int i = 0; i < n; i ++) {
//                int key = sc.nextInt();
//                int value = sc.nextInt();
//                if (map.containsKey(key)) {
//                    int tmp = map.get(key);
//                    map.put(key, tmp + value);
//                } else {
//                    map.put(key, value);
//                }
//            }
//
//            for (Integer key : map.keySet()) {
//                System.out.println(key + " " + map.get(key));
//            }
//        }
//    }
//}
