//import java.util.Scanner;
//
///**
// * Created by davidshuvli on 2016/8/6.
// */
//public class Main {
//    public  static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int A = 0, B = 0, C = 0, D = 0, E = 0, F = 0, P = 0;
//        while (sc.hasNextLine()) {
//            String input = sc.nextLine();
//            String[] inputs = input.split("~");
//
//            if (inputs.length < 2) {
//                F ++;
//                continue;
//            }
//
//            String ip = inputs[0];
//            String mask = inputs[1];
//
//            if (ip.length() ==0 || mask.length() == 0 || !checkIp(ip) || !checkMask(mask)) {
//                F ++;
//                continue;
//            }
//
//            StringBuffer sb = checkType(ip);
//            for (int i = 0; i < sb.length(); i ++) {
//                switch (sb.charAt(i)) {
//                    case 'A':
//                        A++;
//                        break;
//                    case 'B':
//                        B++;
//                        break;
//                    case 'C':
//                        C++;
//                        break;
//                    case 'D':
//                        D++;
//                        break;
//                    case 'E':
//                        E++;
//                        break;
//                    case 'P':
//                        P++;
//                        break;
//                }
//            }
//
//        }
//        System.out.println(A + " " + B + " " + C + " " + D + " " + E + " " + F + " " + P);
//    }
//
//    public static StringBuffer checkType (String ip) {
//        String[] ips = ip.split("\\.");
//        int first = Integer.parseInt(ips[0]);
//        int second = Integer.parseInt(ips[1]);
//        StringBuffer res = new StringBuffer();
//        if (first == 10) {
//            res.append('P');
//        }
//        if (first == 172 && (second >= 16 && second <= 31)) {
//            res.append('P');
//        }
//        if (first == 192 && second == 168) {
//            res.append('P');
//        }
//
//        if (first >= 1 && first <= 126) res.append('A');
//        if (first >= 128 && first <= 191) res.append('B');
//        if (first >= 192 && first <= 223) res.append('C');
//        if (first >= 224 && first <=239) res.append('D');
//        if (first >= 240 && first <= 255) res.append('E');
//
//        return res;
//    }
//
//    public static boolean checkMask (String mask) {
//        String[] masks = mask.split("\\.");
//
//
//        for (String eachMask : masks) {
//            if (Integer.parseInt(eachMask) > 255 || Integer.parseInt(eachMask) < 0) {
//                return false;
//            }
//        }
//
//        int tmp = Integer.parseInt(masks[0]);
//        for (int i = 1; i < 4; i ++) {
//            tmp = tmp << 8;
//            tmp += Integer.parseInt(masks[i]);
//        }
//
//        if ((tmp | (tmp -1)) != 0xffffffff || tmp == 0xffffffff) {
//            return false;
//        }
//        return true;
//    }
//
//    public static boolean checkIp (String ip) {
//        String[] ips = ip.split("\\.");
//        for (String eachIp : ips) {
//            if (eachIp.length() == 0) return false;
//            if (Integer.parseInt(eachIp) > 255 || Integer.parseInt(eachIp) < 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//}
