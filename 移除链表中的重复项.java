import java.util.HashMap;

	class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }

	public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ListNode newhead = new ListNode(0);
		ListNode start = newhead;
		newhead.next = head;
		while(head != null){
			if(!map.containsKey(head.val)){
				map.put(head.val, 1);
				newhead = newhead.next;
				head = head.next;
			}else{
				newhead.next = head.next;
				head = head.next;
			}
		}
		return start.next;
		
    }

}
