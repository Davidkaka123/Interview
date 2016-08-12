//import java.util.Scanner;
//
///**
// * Created by davidshuvli on 2016/8/8.
// */
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNextDouble()) {
//            double height = sc.nextDouble();
//            double[] res = getRes(height);
//            System.out.println(res[0]);
//            System.out.println(res[1]);
//
//        }
//    }
//
//    public static double[] getRes(double height) {
//        int limit = 5;
//        double distance = height;
//
//        for (int i = 1; i < limit; i ++) {
//            height = height / 2.0;
//            distance += height * 2.0;
//        }
//
//        double[] res = new double[2];
//        res[0] = distance;
//        res[1] = height / 2.0;
//        return res;
//    }
//}
