//import java.lang.reflect.Array;
//import java.util.ArrayList;
///**
// * 判断单链表是否相交同时求第一个公共节点：
// * 		常规（无环情况）：长链表先遍历，直到两个链表等长，然后同时遍历，然后逐个判断是否节点相同
// * 		改进（无环情况）：一个链表接到另一个链表尾部，判断是否有环，有环则相交
// * 		http://blog.csdn.net/kakabest123/article/details/47043993
// * */
//class Node{
//	int data;
//	Node next;
//	public Node(int data){
//		this.data = data;
//	}
//}
//
//public class Main {
//	//创建测试链表
//	public static  ArrayList createLinks(){
//
//		ArrayList ls = new ArrayList();
//		Node n1 = new Node(1);
//		Node n2 = new Node(2);
//		Node n3 = new Node(3);
//		Node n4 = new Node(4);
//		Node n5 = new Node(5);
//		Node n6 = new Node(6);
//		Node n7 = new Node(7);
//		Node n8 = new Node(8);
//		n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5; n5.next = n6;
//		n6.next = n7; n7.next = n3;
//		n8.next = n2;
//
//		ls.add(n1);
//		ls.add(n8);
//
//		return ls;
//	}
//	//判断是否有环
//	public static boolean HashRing(Node head){
//		Node fast = head;
//		Node slow = head;
//		while(fast != null && fast.next != null){
//			slow = slow.next;
//			fast = fast.next.next;
//			if(slow == fast) return true;
//		}
//		return false;
//	}
//	public static int GetListLength(Node head){
//		int lenth = 0;
//		while(head != null){
//			++lenth;
//			head = head.next;
//		}
//		return lenth;
//	}
//	//找到第一个
//	public static Node FindFirstCommonNode(Node head1, Node head2){
//		int len1 = GetListLength(head1);
//		int len2 = GetListLength(head2);
//		if(len1 < len2){//使1为较长的链表
//			Node tmp = head2;
//			head1 = head2;
//			head2 = tmp;
//		}
//		for(int i = 0; i<len1 - len2; ++i){
//			head1 = head1.next;
//		}
//		while(head1 != null && head1 != head2){
//			head1 = head1.next;
//			head2 = head2.next;
//		}
//		return head1;
//	}
//
//	public static void main(String[] args){
//		ArrayList ls = createLinks();
//		System.out.println(HashRing((Node)ls.get(0)));
//		System.out.println(HashRing((Node)ls.get(1)));
//	}
//
//
//
//}
