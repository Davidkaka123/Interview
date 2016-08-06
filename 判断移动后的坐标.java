//import javax.swing.*;
//import java.util.Scanner;
//import java.util.zip.CheckedInputStream;
//
///**
// * Created by davidshuvli on 2016/8/6.
// */
//public class Main {
//    public static void main (String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            String input = sc.nextLine();
//            String[] options = input.split(";");
//            int x = 0, y = 0;
//            for (String s : options) {
//                if (s.length() == 0) {
//                    continue;
//                } else if (checkInput(s)) {
//                    int dist = Integer.parseInt(s.substring(1));
//                    switch (s.charAt(0)) {
//                        case 'A' : x -= dist; break;
//                        case 'D' : x += dist; break;
//                        case 'W' : y += dist; break;
//                        case 'S' : y -= dist; break;
//                        default: break;
//                    }
//                }
//
//
//            }
//            System.out.println(x + "," + y);
//        }
//    }
//
//    public static boolean checkInput(String s) {
//        return s.matches("[ADWS]\\d+");
//    }
//}
