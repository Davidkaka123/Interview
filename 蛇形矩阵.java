//import java.util.Scanner;
//
///**
// * Created by davidshuvli on 2016/8/9.
// */
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNextInt()) {
//            int n = sc.nextInt();
//            int[][] res = new int[n][n];
//            int num = 1;
//            for (int i = 0; i < n; i ++) {
//                for (int j = i; j >= 0; j --) {
//                    int k = i - j;
//                    res[j][k] = num;
//                    num ++;
//                }
//            }
//
//            for (int i = 0; i < n; i ++) {
//                for (int j = 0; j < n - i - 1; j ++) {
//                    System.out.print(res[i][j] + " ");
//                }
//                System.out.print(res[i][n - i - 1]);
//                System.out.println();
//
//            }
//        }
//    }
//}
