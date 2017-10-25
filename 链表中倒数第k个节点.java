/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
import java.util.Stack;
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        Stack<ListNode> stack = new Stack<>();
        if(k <= 0 || head == null) {
            return null;
        }
        while(head != null) {
            stack.push(head);
            head = head.next;
        }
        if(k > stack.size()) {
            return null;
        }
        while(k > 1) {
            stack.pop();
            k--;
        }
		return stack.pop();
    }
}
