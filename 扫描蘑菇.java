//import java.util.*;
//
///**
// * Created by David on 2016/3/18.
// */
//public class É¨ÃèÄ¢¹½ {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()) {
//            int N = sc.nextInt();
//            int M = sc.nextInt();
//            int K = sc.nextInt();
//            int[][] mogu = new int[N + 1][M + 1];
//
//            for (int i = 0; i < K; i ++) {
//                int x = sc.nextInt();
//                int y = sc.nextInt();
//                mogu[x][y] += 1;
//            }
//            Set<Integer> set = new HashSet<Integer>();
//
//            for (int i = 0; i <= N - 3; i ++) {
//                for (int j = 0; j <= M - 3; j ++) {
//                    Map<String, Integer> map1 = cleanMush(i, j, mogu);
//                    for (int x = 0; x <= N - 3; x ++) {
//                        for (int y = 0; y <= M - 3; y ++) {
//                            Map<String, Integer> map2 = cleanMush(x, y, mogu);
//                            int count1 = map1.size();
//                            int count2 = map2.size();
//                            int duplicate = 0;
//                            for (String key : map2.keySet()) {
//                                int tmpx = Integer.parseInt(key.split("_")[0]);
//                                int tmpy = Integer.parseInt(key.split("_")[1]);
//                                if (map1.containsKey(key) && mogu[tmpx][tmpy] < 2) {
//                                    duplicate += 1;
//                                }
//                            }
//                            int total = count1 + count2 - duplicate;
//                            set.add(total);
//                        }
//                    }
//                }
//            }
//            int maxmush = 0;
//            for (Integer tmp : set) {
//                if (tmp > maxmush) {
//                    maxmush = tmp;
//                }
//            }
//            System.out.println(maxmush);
//        }
//    }
//    public static Map<String, Integer> cleanMush(int x, int y, int[][] mogu) {
//        Map<String, Integer> map = new HashMap<String, Integer>();
//        for (int i = x; i <= x + 3; i ++) {
//            for (int j = y; j <= y + 3; j ++) {
//                if (mogu[i][j] != 0) {
//                    String tmp = i + "_" + j;
//                    map.put(tmp, 1);
//                }
//            }
//        }
//        return map;
//    }
//}
