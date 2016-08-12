///**
// * Created by David on 2016/8/12.
// */
//class tNode {
//    int num;
//    tNode next;
//    public tNode(int num) {
//        this.num = num;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        System.out.println(LastRemaining_Solution(5, 3));
//    }
//
//    public static int LastRemaining_Solution(int n, int m) {
//        if (0 == n) return -1;
//        tNode head = new tNode(0);
//        tNode p = head;
//        tNode tmp = null;
//        for (int i = 1; i < n; i ++) {
//            tmp = new tNode(i);
//            p.next = tmp;
//            p = tmp;
//        }
//        p.next = head;
//
//        for (int i = 0; i < n - 1; i ++) {
//            for (int j = 0; j < m - 1; j ++) {
//                p = p.next;
//            }
//            //System.out.println("删除了" + p.next.num);
//            p.next = p.next.next;
//        }
//
//        return p.num;
//
//    }
//}
