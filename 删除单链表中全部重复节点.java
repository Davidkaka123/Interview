//import java.util.HashSet;
//import java.util.IntSummaryStatistics;
//import java.util.Set;
//
///**
// * Created by davidshuvli on 2016/8/22.
// */
//
//
// class ListNode {
//    int val;
//    ListNode next = null;
//
//    ListNode(int val) {
//        this.val = val;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        ListNode n1 = new ListNode(1);
//        ListNode n2 = new ListNode(2);
//        ListNode n3 = new ListNode(3);
//        ListNode n4 = new ListNode(3);
//        ListNode n5 = new ListNode(4);
//        ListNode n6 = new ListNode(5);
//        ListNode n7 = new ListNode(5);
//        n1.next = n2;
//        n2.next = n3;
//        n3.next = n4;
//        n4.next = n5;
//        n5.next = n6;
//        n6.next = n7;
//
//        ListNode head = deleteDuplication(n1);
//        while (head != null) {
//            System.out.println(head.val);
//            head = head.next;
//        }
//
//    }
//    public static ListNode deleteDuplication(ListNode pHead)
//    {
//        Set<Integer> set = new HashSet<Integer>();
//        Set<Integer> res = new HashSet<>();
//        ListNode tmp = pHead;
//        while (tmp != null) {
//            if (set.contains(tmp.val)) {
//                res.add(tmp.val);
//            } else {
//                set.add(tmp.val);
//            }
//            tmp = tmp.next;
//        }
//
//        ListNode preHead = new ListNode(0);
//        preHead.next = pHead;
//        ListNode head = pHead;
//        ListNode pre = preHead;
//        ListNode cur = preHead.next;
//
//        while (cur != null) {
//            if (res.contains(cur.val)) {
//                pre.next = cur.next;
//                cur = cur.next;
//            } else {
//                pre = cur;
//                cur = cur.next;
//            }
//        }
//
//        return preHead.next;
//
//    }
//}
