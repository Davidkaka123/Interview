//
///**
// * 给定一个单链表，将其进行逆序：
// * 		递归算法主要分两个步骤：
// * 			①递归阶段：从头结点开始，每次将一个当前头结点从链表上拆下来，并保存，便于回溯
// * 			②回溯阶段：将当前待回溯子链表逆序，逐层回溯，直到整个单链表完成逆序
// * */
//
//
//class Node{
//	int data;
//	Node next;
//	public Node(int i){
//		data = i;
//	}
//}
//
//public class ListHandle {
//	public static void main(String[] args){
//		Node n1 = new Node(1);
//		Node n2 = new Node(2);
//		Node n3 = new Node(3);
//		Node n4 = new Node(4);
//		n1.next = n2;
//		n2.next = n3;
//		n3.next = n4;
//		n4.next = null;
//		listNode(n1);
//		System.out.println("=============");
//		listNode(reverse(n1));
//
//	}
//	//遍历单链表
//	public static void listNode(Node nhead){
//		while(nhead.next != null){
//			System.out.println("当前节点："+ nhead.data);
//			nhead = nhead.next;
//		}
//		System.out.println("当前节点："+ nhead.data);
//	}
//
//	public static Node reverse(Node head){
//		Node newhead;
//		if(head == null || head.next == null){
//			return head;
//		}
//
//		newhead = reverse(head.next);
//		head.next.next = head;
//		head.next = null;
//		return newhead;
//	}
//}
